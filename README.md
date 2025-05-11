# aws-autoscaling-comparison

## Comparison of AI and Rule Based Auto Scaling Solutions on Amazon Web Services
The object of the project is to compare the performance of different auto scaling solutions provided by the amazon web services on a simple microservices based application. 

The different methods to compare are as follows:
- Rule Based Scaling VMs
- AI Based Scaling of VMs
- Rule Based Scaling of Containers
- AI Based Scaling of Containers

A simple microservices project will be built using Java SpringBoot to be able to conduct the experiment. To generate load on the microservices Apache JMeter will be used. 

The deployment and scaling options to be used for VMs are as follows:
1. EC2 for deployment.
2. Amazon EC2 Auto Scaling Groups (ASG) for rule-based scaling.
3. AWS CloudWatch for AI-based scaling.

The deployment and scaling options to be used for Containers are as follows:
1. ECS for deployment.
2. ECS Service Auto Scaling for rule-based scaling.
3. AWS Forecast for AI-based scaling.

The metrics for comparison will be gathered under 3 dimensions; ___performance___, ___scalability___ and ___cost___. Measures for ___performance___ are __average response time__ and __request per second__. Measures for ______scalability______ are __time to scale__ and __cpu and memory utilization__. Measures for ___cost___ is __total AWS cost per approach__. To gather the measurements __AWS Cloudwatch__ will be used.
