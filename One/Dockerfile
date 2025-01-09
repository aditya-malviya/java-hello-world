# Use an official Python runtime as a parent image
FROM python:3.8-slim

# Set the working directory in the container
WORKDIR /app

# Copy the requirements.txt to the container
COPY requirements.txt /app/

# Install the dependencies
RUN pip install --no-cache-dir -r requirements.txt

# Copy the Python script into the container
COPY one.py /app/

# Expose port 5000 for the application
EXPOSE 5000

# Command to run the application
CMD ["python3", "one.py"]
