Tolendi Arsen SE-2512


In this project, we successfully simulated a banking environment by strategically applying different Abstract Data Types (ADTs) and Physical Data Structures. Each structure was chosen based on its specific strengths to handle real-world banking workflows.
1. Dynamic Account Management (LinkedList)
The core of the system uses a LinkedList to store active BankAccount objects. This choice allows the "database" to be dynamic, meaning we can add or remove accounts efficiently without the memory constraints of a fixed-size structure. It serves as our primary storage for all approved users.
2. Transaction History & Undo Logic (Stack - LIFO)
To manage transaction logs, we implemented a Stack. Following the Last-In, First-Out (LIFO) principle, the stack allows the system to:
Peek: View the most recent transaction.
Pop (Undo): Revert or remove the very last action performed, which is essential for error correction in financial applications.
3. Service Queues (Queue - FIFO)
We utilized Queues to manage two critical workflows based on the First-In, First-Out (FIFO) principle:
Account Opening: New requests are held in a staging queue. This simulates an administrative review process where the first person to apply is the first to be processed and moved into the main LinkedList.
Bill Payments: Automated or manual bill requests are handled in the order they were received, ensuring fair and organized processing.
4. Physical Data Structures (Arrays)
In contrast to the dynamic LinkedList, we implemented a Fixed Array (BankAccount[3]) to demonstrate physical data storage. This highlighted the difference between:
Dynamic structures: Flexible and memory-efficient for growing data.
Static structures: Faster access via index but restricted by a predefined size and contiguous memory requirements.
5. Modular System Design
By organizing the program into Bank, ATM, and Admin menus, we demonstrated how different users interact with the same data. The Bank Menu acts as the user interface for requests, the ATM Menu provides quick access to active accounts, and the Admin Menu serves as the controller that processes the queues.

<img width="1919" height="1074" alt="Снимок экрана 2026-04-12 165145" src="https://github.com/user-attachments/assets/df8ca5d3-5abf-487a-9dea-3586b9f1dc52" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 164738" src="https://github.com/user-attachments/assets/68aaa2d4-0a6f-40f2-bfac-61dcf8d61a88" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 164538" src="https://github.com/user-attachments/assets/3d68a4f0-7c9a-4bc2-851e-055ff30cca39" />
<img width="1919" height="1078" alt="Снимок экрана 2026-04-12 165422" src="https://github.com/user-attachments/assets/aa1b9a11-82f0-4d0f-b0b1-3475d5055b8e" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 165403" src="https://github.com/user-attachments/assets/649a476f-f2c3-45d2-9da8-d91b20557dee" />
<img width="1919" height="1077" alt="Снимок экрана 2026-04-12 165341" src="https://github.com/user-attachments/assets/44fe73f6-a80e-4a66-b45f-54e57aa09bdb" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 165254" src="https://github.com/user-attachments/assets/78b38e90-bd3b-4065-b29a-0dbecadeb1cc" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 165239" src="https://github.com/user-attachments/assets/51132d7b-ed3e-4667-8df9-af9d279a87e7" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 170017" src="https://github.com/user-attachments/assets/6db6671b-5dab-44d1-a0e3-09c1383b71ba" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 170010" src="https://github.com/user-attachments/assets/bbbcf91b-c9db-48ba-a4c9-cd26ce3b26aa" />
<img width="1919" height="1079" alt="Снимок экрана 2026-04-12 165525" src="https://github.com/user-attachments/assets/fc4835ce-f4f4-4e2c-95ff-e7c411b0e985" />
<img width="1919" height="1076" alt="Снимок экрана 2026-04-12 170023" src="https://github.com/user-attachments/assets/5ba49a13-72a3-42f9-9061-119ca7f84341" />
