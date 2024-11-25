### README for Kata 4: Email Histogram

# Kata 4: Email Histogram

## Problem Description

This project creates an application to process a list of email addresses and generate a histogram of domain frequencies. The program reads email data from a file, processes it to extract domains, builds a histogram, and displays the results using a bar chart.

The exercise combines file handling, data processing, and visualization, emphasizing modular design with a clean separation between the model, view, and control.

---

## Functionalities

1. **Read and Process Emails**  
   - The program reads a list of email addresses from a file (`emails.txt`).
   - Extracts and counts the frequency of email domains.

2. **Build a Histogram**  
   - Constructs a histogram representing domain frequencies using a generic `Histogram` class.

3. **Visualize the Data**  
   - Displays the histogram as a bar chart using the JFreeChart library.

---

## Scope

This project demonstrates:
- **File Handling**: Reading and processing data from text files.
- **Histogram Building**: Generic data structures and frequency counting.
- **Data Visualization**: Integrating Java with external libraries like JFreeChart for charting.
- **Modular Design**: Using model-view-controller (MVC) principles for clear separation of responsibilities.
