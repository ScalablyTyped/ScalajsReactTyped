package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Certificate Manager (ACM) certificate. Required when Protocols is set to FTPS. To request a new public certificate, see Request a public certificate in the Certificate Manager User Guide. To import an existing certificate into ACM, see Importing certificates into ACM in the Certificate Manager User Guide. To request a private certificate to use FTPS through private IP addresses, see Request a private certificate in the Certificate Manager User Guide. Certificates with the following cryptographic algorithms and key sizes are supported:   2048-bit RSA (RSA_2048)   4096-bit RSA (RSA_4096)   Elliptic Prime Curve 256 bit (EC_prime256v1)   Elliptic Prime Curve 384 bit (EC_secp384r1)   Elliptic Prime Curve 521 bit (EC_secp521r1)    The certificate must be a valid SSL/TLS X.509 version 3 certificate with FQDN or IP address specified and information about the issuer. 
    */
  var Certificate: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.Certificate] = js.undefined
  
  /**
    * The domain of the storage system that is used for file transfers. There are two domains available: Amazon Simple Storage Service (Amazon S3) and Amazon Elastic File System (Amazon EFS). The default value is S3.  After the server is created, the domain cannot be changed. 
    */
  var Domain: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.Domain] = js.undefined
  
  /**
    * The virtual private cloud (VPC) endpoint settings that are configured for your server. When you host your endpoint within your VPC, you can make your endpoint accessible only to resources within your VPC, or you can attach Elastic IP addresses and make your endpoint accessible to clients over the internet. Your VPC's default security groups are automatically assigned to your endpoint.
    */
  var EndpointDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.EndpointDetails] = js.undefined
  
  /**
    * The type of endpoint that you want your server to use. You can choose to make your server's endpoint publicly accessible (PUBLIC) or host it inside your VPC. With an endpoint that is hosted in a VPC, you can restrict access to your server and resources only within your VPC or choose to make it internet facing by attaching Elastic IP addresses directly to it.   After May 19, 2021, you won't be able to create a server using EndpointType=VPC_ENDPOINT in your Amazon Web Services account if your account hasn't already done so before May 19, 2021. If you have already created servers with EndpointType=VPC_ENDPOINT in your Amazon Web Services account on or before May 19, 2021, you will not be affected. After this date, use EndpointType=VPC. For more information, see https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#deprecate-vpc-endpoint. It is recommended that you use VPC as the EndpointType. With this endpoint type, you have the option to directly associate up to three Elastic IPv4 addresses (BYO IP included) with your server's endpoint and use VPC security groups to restrict traffic by the client's public IP address. This is not possible with EndpointType set to VPC_ENDPOINT. 
    */
  var EndpointType: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.EndpointType] = js.undefined
  
  /**
    * The RSA, ECDSA, or ED25519 private key to use for your SFTP-enabled server. You can add multiple host keys, in case you want to rotate keys, or have a set of active keys that use different algorithms. Use the following command to generate an RSA 2048 bit key with no passphrase:  ssh-keygen -t rsa -b 2048 -N "" -m PEM -f my-new-server-key. Use a minimum value of 2048 for the -b option. You can create a stronger key by using 3072 or 4096. Use the following command to generate an ECDSA 256 bit key with no passphrase:  ssh-keygen -t ecdsa -b 256 -N "" -m PEM -f my-new-server-key. Valid values for the -b option for ECDSA are 256, 384, and 521. Use the following command to generate an ED25519 key with no passphrase:  ssh-keygen -t ed25519 -N "" -f my-new-server-key. For all of these commands, you can replace my-new-server-key with a string of your choice.  If you aren't planning to migrate existing users from an existing SFTP-enabled server to a new server, don't update the host key. Accidentally changing a server's host key can be disruptive.  For more information, see Update host keys for your SFTP-enabled server in the Transfer Family User Guide.
    */
  var HostKey: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.HostKey] = js.undefined
  
  /**
    * Required when IdentityProviderType is set to AWS_DIRECTORY_SERVICE or API_GATEWAY. Accepts an array containing all of the information required to use a directory in AWS_DIRECTORY_SERVICE or invoke a customer-supplied authentication API, including the API Gateway URL. Not required when IdentityProviderType is set to SERVICE_MANAGED.
    */
  var IdentityProviderDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.IdentityProviderDetails] = js.undefined
  
  /**
    * The mode of authentication for a server. The default value is SERVICE_MANAGED, which allows you to store and access user credentials within the Transfer Family service. Use AWS_DIRECTORY_SERVICE to provide access to Active Directory groups in Directory Service for Microsoft Active Directory or Microsoft Active Directory in your on-premises environment or in Amazon Web Services using AD Connector. This option also requires you to provide a Directory ID by using the IdentityProviderDetails parameter. Use the API_GATEWAY value to integrate with an identity provider of your choosing. The API_GATEWAY setting requires you to provide an Amazon API Gateway endpoint URL to call for authentication by using the IdentityProviderDetails parameter. Use the AWS_LAMBDA value to directly use an Lambda function as your identity provider. If you choose this value, you must specify the ARN for the Lambda function in the Function parameter or the IdentityProviderDetails data type.
    */
  var IdentityProviderType: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.IdentityProviderType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Identity and Access Management (IAM) role that allows a server to turn on Amazon CloudWatch logging for Amazon S3 or Amazon EFSevents. When set, you can view user activity in your CloudWatch logs.
    */
  var LoggingRole: js.UndefOr[Role] = js.undefined
  
  /**
    * Specifies a string to display when users connect to a server. This string is displayed after the user authenticates.  The SFTP protocol does not support post-authentication display banners. 
    */
  var PostAuthenticationLoginBanner: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.PostAuthenticationLoginBanner] = js.undefined
  
  /**
    * Specifies a string to display when users connect to a server. This string is displayed before the user authenticates. For example, the following banner displays details about using the system:  This system is for the use of authorized users only. Individuals using this computer system without authority, or in excess of their authority, are subject to having all of their activities on this system monitored and recorded by system personnel. 
    */
  var PreAuthenticationLoginBanner: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.PreAuthenticationLoginBanner] = js.undefined
  
  /**
    * The protocol settings that are configured for your server.    To indicate passive mode (for FTP and FTPS protocols), use the PassiveIp parameter. Enter a single dotted-quad IPv4 address, such as the external IP address of a firewall, router, or load balancer.    To ignore the error that is generated when the client attempts to use the SETSTAT command on a file that you are uploading to an Amazon S3 bucket, use the SetStatOption parameter. To have the Transfer Family server ignore the SETSTAT command and upload files without needing to make any changes to your SFTP client, set the value to ENABLE_NO_OP. If you set the SetStatOption parameter to ENABLE_NO_OP, Transfer Family generates a log entry to Amazon CloudWatch Logs, so that you can determine when the client is making a SETSTAT call.   To determine whether your Transfer Family server resumes recent, negotiated sessions through a unique session ID, use the TlsSessionResumptionMode parameter.    As2Transports indicates the transport method for the AS2 messages. Currently, only HTTP is supported.  
    */
  var ProtocolDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.ProtocolDetails] = js.undefined
  
  /**
    * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. The available protocols are:    SFTP (Secure Shell (SSH) File Transfer Protocol): File transfer over SSH    FTPS (File Transfer Protocol Secure): File transfer with TLS encryption    FTP (File Transfer Protocol): Unencrypted file transfer    AS2 (Applicability Statement 2): used for transporting structured business-to-business data      If you select FTPS, you must choose a certificate stored in Certificate Manager (ACM) which is used to identify your server when clients connect to it over FTPS.   If Protocol includes either FTP or FTPS, then the EndpointType must be VPC and the IdentityProviderType must be AWS_DIRECTORY_SERVICE or API_GATEWAY.   If Protocol includes FTP, then AddressAllocationIds cannot be associated.   If Protocol is set only to SFTP, the EndpointType can be set to PUBLIC and the IdentityProviderType can be set to SERVICE_MANAGED.   If Protocol includes AS2, then the EndpointType must be VPC, and domain must be Amazon S3.   
    */
  var Protocols: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.Protocols] = js.undefined
  
  /**
    * Specifies the name of the security policy that is attached to the server.
    */
  var SecurityPolicyName: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.SecurityPolicyName] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for servers.
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.Tags] = js.undefined
  
  /**
    * Specifies the workflow ID for the workflow to assign and the execution role that's used for executing the workflow. In additon to a workflow to execute when a file is uploaded completely, WorkflowDeatails can also contain a workflow ID (and execution role) for a workflow to execute on partial upload. A partial upload occurs when a file is open when the session disconnects.
    */
  var WorkflowDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsTransferMod.WorkflowDetails] = js.undefined
}
object CreateServerRequest {
  
  inline def apply(): CreateServerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServerRequest]
  }
  
  extension [Self <: CreateServerRequest](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setEndpointDetails(value: EndpointDetails): Self = StObject.set(x, "EndpointDetails", value.asInstanceOf[js.Any])
    
    inline def setEndpointDetailsUndefined: Self = StObject.set(x, "EndpointDetails", js.undefined)
    
    inline def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setHostKey(value: HostKey): Self = StObject.set(x, "HostKey", value.asInstanceOf[js.Any])
    
    inline def setHostKeyUndefined: Self = StObject.set(x, "HostKey", js.undefined)
    
    inline def setIdentityProviderDetails(value: IdentityProviderDetails): Self = StObject.set(x, "IdentityProviderDetails", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderDetailsUndefined: Self = StObject.set(x, "IdentityProviderDetails", js.undefined)
    
    inline def setIdentityProviderType(value: IdentityProviderType): Self = StObject.set(x, "IdentityProviderType", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderTypeUndefined: Self = StObject.set(x, "IdentityProviderType", js.undefined)
    
    inline def setLoggingRole(value: Role): Self = StObject.set(x, "LoggingRole", value.asInstanceOf[js.Any])
    
    inline def setLoggingRoleUndefined: Self = StObject.set(x, "LoggingRole", js.undefined)
    
    inline def setPostAuthenticationLoginBanner(value: PostAuthenticationLoginBanner): Self = StObject.set(x, "PostAuthenticationLoginBanner", value.asInstanceOf[js.Any])
    
    inline def setPostAuthenticationLoginBannerUndefined: Self = StObject.set(x, "PostAuthenticationLoginBanner", js.undefined)
    
    inline def setPreAuthenticationLoginBanner(value: PreAuthenticationLoginBanner): Self = StObject.set(x, "PreAuthenticationLoginBanner", value.asInstanceOf[js.Any])
    
    inline def setPreAuthenticationLoginBannerUndefined: Self = StObject.set(x, "PreAuthenticationLoginBanner", js.undefined)
    
    inline def setProtocolDetails(value: ProtocolDetails): Self = StObject.set(x, "ProtocolDetails", value.asInstanceOf[js.Any])
    
    inline def setProtocolDetailsUndefined: Self = StObject.set(x, "ProtocolDetails", js.undefined)
    
    inline def setProtocols(value: Protocols): Self = StObject.set(x, "Protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "Protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "Protocols", js.Array(value*))
    
    inline def setSecurityPolicyName(value: SecurityPolicyName): Self = StObject.set(x, "SecurityPolicyName", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyNameUndefined: Self = StObject.set(x, "SecurityPolicyName", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setWorkflowDetails(value: WorkflowDetails): Self = StObject.set(x, "WorkflowDetails", value.asInstanceOf[js.Any])
    
    inline def setWorkflowDetailsUndefined: Self = StObject.set(x, "WorkflowDetails", js.undefined)
  }
}
