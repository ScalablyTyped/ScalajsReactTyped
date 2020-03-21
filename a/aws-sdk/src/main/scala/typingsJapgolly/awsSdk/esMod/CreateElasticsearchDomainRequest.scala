package typingsJapgolly.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElasticsearchDomainRequest extends js.Object {
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.native
  /**
    *  Option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.AdvancedOptions] = js.native
  /**
    * Specifies advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.native
  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.CognitoOptions] = js.native
  /**
    * Options to specify configuration that will be applied to the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.DomainEndpointOptions] = js.native
  /**
    * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typingsJapgolly.awsSdk.esMod.DomainName = js.native
  /**
    * Options to enable, disable and specify the type and size of EBS storage volumes. 
    */
  var EBSOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.EBSOptions] = js.native
  /**
    * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the domain cluster. 
    */
  var ElasticsearchClusterConfig: js.UndefOr[typingsJapgolly.awsSdk.esMod.ElasticsearchClusterConfig] = js.native
  /**
    * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  /**
    * Specifies the Encryption At Rest Options.
    */
  var EncryptionAtRestOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.EncryptionAtRestOptions] = js.native
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
    */
  var LogPublishingOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.LogPublishingOptions] = js.native
  /**
    * Specifies the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.NodeToNodeEncryptionOptions] = js.native
  /**
    * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.SnapshotOptions] = js.native
  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
    */
  var VPCOptions: js.UndefOr[typingsJapgolly.awsSdk.esMod.VPCOptions] = js.native
}

object CreateElasticsearchDomainRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AccessPolicies: PolicyDocument = null,
    AdvancedOptions: AdvancedOptions = null,
    AdvancedSecurityOptions: AdvancedSecurityOptionsInput = null,
    CognitoOptions: CognitoOptions = null,
    DomainEndpointOptions: DomainEndpointOptions = null,
    EBSOptions: EBSOptions = null,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig = null,
    ElasticsearchVersion: ElasticsearchVersionString = null,
    EncryptionAtRestOptions: EncryptionAtRestOptions = null,
    LogPublishingOptions: LogPublishingOptions = null,
    NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptions = null,
    SnapshotOptions: SnapshotOptions = null,
    VPCOptions: VPCOptions = null
  ): CreateElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies.asInstanceOf[js.Any])
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions.asInstanceOf[js.Any])
    if (AdvancedSecurityOptions != null) __obj.updateDynamic("AdvancedSecurityOptions")(AdvancedSecurityOptions.asInstanceOf[js.Any])
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions.asInstanceOf[js.Any])
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions.asInstanceOf[js.Any])
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions.asInstanceOf[js.Any])
    if (ElasticsearchClusterConfig != null) __obj.updateDynamic("ElasticsearchClusterConfig")(ElasticsearchClusterConfig.asInstanceOf[js.Any])
    if (ElasticsearchVersion != null) __obj.updateDynamic("ElasticsearchVersion")(ElasticsearchVersion.asInstanceOf[js.Any])
    if (EncryptionAtRestOptions != null) __obj.updateDynamic("EncryptionAtRestOptions")(EncryptionAtRestOptions.asInstanceOf[js.Any])
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions.asInstanceOf[js.Any])
    if (NodeToNodeEncryptionOptions != null) __obj.updateDynamic("NodeToNodeEncryptionOptions")(NodeToNodeEncryptionOptions.asInstanceOf[js.Any])
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions.asInstanceOf[js.Any])
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateElasticsearchDomainRequest]
  }
}

