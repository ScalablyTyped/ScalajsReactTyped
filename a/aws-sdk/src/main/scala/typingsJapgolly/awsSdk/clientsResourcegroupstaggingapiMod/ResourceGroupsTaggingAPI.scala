package typingsJapgolly.awsSdk.clientsResourcegroupstaggingapiMod

import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase
import typingsJapgolly.awsSdk.libErrorMod.AWSError
import typingsJapgolly.awsSdk.libRequestMod.Request
import typingsJapgolly.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceGroupsTaggingAPI extends Service {
  
  @JSName("config")
  var config_ResourceGroupsTaggingAPI: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Describes the status of the StartReportCreation operation.  You can call this operation only from the organization's management account and from the us-east-1 Region.
    */
  def describeReportCreation(): Request[DescribeReportCreationOutput, AWSError] = js.native
  def describeReportCreation(callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportCreationOutput, Unit]): Request[DescribeReportCreationOutput, AWSError] = js.native
  /**
    * Describes the status of the StartReportCreation operation.  You can call this operation only from the organization's management account and from the us-east-1 Region.
    */
  def describeReportCreation(params: DescribeReportCreationInput): Request[DescribeReportCreationOutput, AWSError] = js.native
  def describeReportCreation(
    params: DescribeReportCreationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeReportCreationOutput, Unit]
  ): Request[DescribeReportCreationOutput, AWSError] = js.native
  
  /**
    * Returns a table that shows counts of resources that are noncompliant with their tag policies. For more information on tag policies, see Tag Policies in the Organizations User Guide.  You can call this operation only from the organization's management account and from the us-east-1 Region. This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getComplianceSummary(): Request[GetComplianceSummaryOutput, AWSError] = js.native
  def getComplianceSummary(callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryOutput, Unit]): Request[GetComplianceSummaryOutput, AWSError] = js.native
  /**
    * Returns a table that shows counts of resources that are noncompliant with their tag policies. For more information on tag policies, see Tag Policies in the Organizations User Guide.  You can call this operation only from the organization's management account and from the us-east-1 Region. This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getComplianceSummary(params: GetComplianceSummaryInput): Request[GetComplianceSummaryOutput, AWSError] = js.native
  def getComplianceSummary(
    params: GetComplianceSummaryInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetComplianceSummaryOutput, Unit]
  ): Request[GetComplianceSummaryOutput, AWSError] = js.native
  
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified Amazon Web Services Region for the account. Depending on what information you want returned, you can also specify the following:    Filters that specify what tags and resource types you want returned. The response includes all tags that are associated with the requested resources.   Information about compliance with the account's effective tag policy. For more information on tag policies, see Tag Policies in the Organizations User Guide.    This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getResources(): Request[GetResourcesOutput, AWSError] = js.native
  def getResources(callback: js.Function2[/* err */ AWSError, /* data */ GetResourcesOutput, Unit]): Request[GetResourcesOutput, AWSError] = js.native
  /**
    * Returns all the tagged or previously tagged resources that are located in the specified Amazon Web Services Region for the account. Depending on what information you want returned, you can also specify the following:    Filters that specify what tags and resource types you want returned. The response includes all tags that are associated with the requested resources.   Information about compliance with the account's effective tag policy. For more information on tag policies, see Tag Policies in the Organizations User Guide.    This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getResources(params: GetResourcesInput): Request[GetResourcesOutput, AWSError] = js.native
  def getResources(
    params: GetResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourcesOutput, Unit]
  ): Request[GetResourcesOutput, AWSError] = js.native
  
  /**
    * Returns all tag keys currently in use in the specified Amazon Web Services Region for the calling account. This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getTagKeys(): Request[GetTagKeysOutput, AWSError] = js.native
  def getTagKeys(callback: js.Function2[/* err */ AWSError, /* data */ GetTagKeysOutput, Unit]): Request[GetTagKeysOutput, AWSError] = js.native
  /**
    * Returns all tag keys currently in use in the specified Amazon Web Services Region for the calling account. This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getTagKeys(params: GetTagKeysInput): Request[GetTagKeysOutput, AWSError] = js.native
  def getTagKeys(
    params: GetTagKeysInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagKeysOutput, Unit]
  ): Request[GetTagKeysOutput, AWSError] = js.native
  
  /**
    * Returns all tag values for the specified key that are used in the specified Amazon Web Services Region for the calling account. This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getTagValues(): Request[GetTagValuesOutput, AWSError] = js.native
  def getTagValues(callback: js.Function2[/* err */ AWSError, /* data */ GetTagValuesOutput, Unit]): Request[GetTagValuesOutput, AWSError] = js.native
  /**
    * Returns all tag values for the specified key that are used in the specified Amazon Web Services Region for the calling account. This operation supports pagination, where the response can be sent in multiple pages. You should check the PaginationToken response parameter to determine if there are additional results available to return. Repeat the query, passing the PaginationToken response parameter value as an input to the next request until you recieve a null value. A null value for PaginationToken indicates that there are no more results waiting to be returned.
    */
  def getTagValues(params: GetTagValuesInput): Request[GetTagValuesOutput, AWSError] = js.native
  def getTagValues(
    params: GetTagValuesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTagValuesOutput, Unit]
  ): Request[GetTagValuesOutput, AWSError] = js.native
  
  /**
    * Generates a report that lists all tagged resources in the accounts across your organization and tells whether each resource is compliant with the effective tag policy. Compliance data is refreshed daily. The report is generated asynchronously. The generated report is saved to the following location:  s3://example-bucket/AwsTagPolicies/o-exampleorgid/YYYY-MM-ddTHH:mm:ssZ/report.csv  You can call this operation only from the organization's management account and from the us-east-1 Region.
    */
  def startReportCreation(): Request[StartReportCreationOutput, AWSError] = js.native
  def startReportCreation(callback: js.Function2[/* err */ AWSError, /* data */ StartReportCreationOutput, Unit]): Request[StartReportCreationOutput, AWSError] = js.native
  /**
    * Generates a report that lists all tagged resources in the accounts across your organization and tells whether each resource is compliant with the effective tag policy. Compliance data is refreshed daily. The report is generated asynchronously. The generated report is saved to the following location:  s3://example-bucket/AwsTagPolicies/o-exampleorgid/YYYY-MM-ddTHH:mm:ssZ/report.csv  You can call this operation only from the organization's management account and from the us-east-1 Region.
    */
  def startReportCreation(params: StartReportCreationInput): Request[StartReportCreationOutput, AWSError] = js.native
  def startReportCreation(
    params: StartReportCreationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ StartReportCreationOutput, Unit]
  ): Request[StartReportCreationOutput, AWSError] = js.native
  
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of services with resources that support tagging using this operation, see Services that support the Resource Groups Tagging API. If the resource doesn't yet support this operation, the resource's service might support tagging using its own API operations. For more information, refer to the documentation for that service.   Each resource can have up to 50 tags. For other limits, see Tag Naming and Usage Conventions in the Amazon Web Services General Reference.    You can only tag resources that are located in the specified Amazon Web Services Region for the Amazon Web Services account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see the documentation for each service.    Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use tags to provide you with billing and administration services. Tags are not intended to be used for private or sensitive data.   Minimum permissions  In addition to the tag:TagResources permission required by this operation, you must also have the tagging permission defined by the service that created the resource. For example, to tag an Amazon EC2 instance using the TagResources operation, you must have both of the following permissions:    tag:TagResource     ec2:CreateTags   
    */
  def tagResources(): Request[TagResourcesOutput, AWSError] = js.native
  def tagResources(callback: js.Function2[/* err */ AWSError, /* data */ TagResourcesOutput, Unit]): Request[TagResourcesOutput, AWSError] = js.native
  /**
    * Applies one or more tags to the specified resources. Note the following:   Not all resources can have tags. For a list of services with resources that support tagging using this operation, see Services that support the Resource Groups Tagging API. If the resource doesn't yet support this operation, the resource's service might support tagging using its own API operations. For more information, refer to the documentation for that service.   Each resource can have up to 50 tags. For other limits, see Tag Naming and Usage Conventions in the Amazon Web Services General Reference.    You can only tag resources that are located in the specified Amazon Web Services Region for the Amazon Web Services account.   To add tags to a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for adding tags. For more information, see the documentation for each service.    Do not store personally identifiable information (PII) or other confidential or sensitive information in tags. We use tags to provide you with billing and administration services. Tags are not intended to be used for private or sensitive data.   Minimum permissions  In addition to the tag:TagResources permission required by this operation, you must also have the tagging permission defined by the service that created the resource. For example, to tag an Amazon EC2 instance using the TagResources operation, you must have both of the following permissions:    tag:TagResource     ec2:CreateTags   
    */
  def tagResources(params: TagResourcesInput): Request[TagResourcesOutput, AWSError] = js.native
  def tagResources(
    params: TagResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourcesOutput, Unit]
  ): Request[TagResourcesOutput, AWSError] = js.native
  
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see the documentation for the service whose resource you want to untag.   You can only tag resources that are located in the specified Amazon Web Services Region for the calling Amazon Web Services account.    Minimum permissions  In addition to the tag:UntagResources permission required by this operation, you must also have the remove tags permission defined by the service that created the resource. For example, to remove the tags from an Amazon EC2 instance using the UntagResources operation, you must have both of the following permissions:    tag:UntagResource     ec2:DeleteTags   
    */
  def untagResources(): Request[UntagResourcesOutput, AWSError] = js.native
  def untagResources(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourcesOutput, Unit]): Request[UntagResourcesOutput, AWSError] = js.native
  /**
    * Removes the specified tags from the specified resources. When you specify a tag key, the action removes both that key and its associated value. The operation succeeds even if you attempt to remove tags from a resource that were already removed. Note the following:   To remove tags from a resource, you need the necessary permissions for the service that the resource belongs to as well as permissions for removing tags. For more information, see the documentation for the service whose resource you want to untag.   You can only tag resources that are located in the specified Amazon Web Services Region for the calling Amazon Web Services account.    Minimum permissions  In addition to the tag:UntagResources permission required by this operation, you must also have the remove tags permission defined by the service that created the resource. For example, to remove the tags from an Amazon EC2 instance using the UntagResources operation, you must have both of the following permissions:    tag:UntagResource     ec2:DeleteTags   
    */
  def untagResources(params: UntagResourcesInput): Request[UntagResourcesOutput, AWSError] = js.native
  def untagResources(
    params: UntagResourcesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourcesOutput, Unit]
  ): Request[UntagResourcesOutput, AWSError] = js.native
}
