package typingsJapgolly.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDimensionValuesResponse extends StObject {
  
  /**
    * The filters that you used to filter your request. Some dimensions are available only for a specific context. If you set the context to COST_AND_USAGE, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   DATABASE_ENGINE - The Amazon Relational Database Service database. Examples are Aurora or MySQL.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   LEGAL_ENTITY_NAME - The name of the organization that sells you Amazon Web Services services, such as Amazon Web Services.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the Amazon Web Services ID of the member account.   OPERATING_SYSTEM - The operating system. Examples are Windows or Linux.   OPERATION - The action performed. Examples include RunInstance and CreateBucket.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   PURCHASE_TYPE - The reservation type of the purchase to which this usage is related. Examples include On-Demand Instances and Standard Reserved Instances.   SERVICE - The Amazon Web Services service such as Amazon DynamoDB.   USAGE_TYPE - The type of usage. An example is DataTransfer-In-Bytes. The response for the GetDimensionValues operation includes a unit attribute. Examples include GB and Hrs.   USAGE_TYPE_GROUP - The grouping of common usage types. An example is Amazon EC2: CloudWatch – Alarms. The response for this operation includes a unit attribute.   RECORD_TYPE - The different types of charges such as RI fees, usage costs, tax refunds, and credits.   RESOURCE_ID - The unique identifier of the resource. ResourceId is an opt-in feature only available for last 14 days for EC2-Compute Service. You can opt-in by enabling Hourly and Resource Level Data in Cost Management Console preferences.   If you set the context to RESERVATIONS, you can use the following dimensions for searching:   AZ - The Availability Zone. An example is us-east-1a.   CACHE_ENGINE - The Amazon ElastiCache operating system. Examples are Windows or Linux.   DEPLOYMENT_OPTION - The scope of Amazon Relational Database Service deployments. Valid values are SingleAZ and MultiAZ.   INSTANCE_TYPE - The type of Amazon EC2 instance. An example is m4.xlarge.   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the Amazon Web Services ID of the member account.   PLATFORM - The Amazon EC2 operating system. Examples are Windows or Linux.   REGION - The Amazon Web Services Region.   SCOPE (Utilization only) - The scope of a Reserved Instance (RI). Values are regional or a single Availability Zone.   TAG (Coverage only) - The tags that are associated with a Reserved Instance (RI).   TENANCY - The tenancy of a resource. Examples are shared or dedicated.   If you set the context to SAVINGS_PLANS, you can use the following dimensions for searching:   SAVINGS_PLANS_TYPE - Type of Savings Plans (EC2 Instance or Compute)   PAYMENT_OPTION - Payment option for the given Savings Plans (for example, All Upfront)   REGION - The Amazon Web Services Region.   INSTANCE_TYPE_FAMILY - The family of instances (For example, m5)   LINKED_ACCOUNT - The description in the attribute map that includes the full name of the member account. The value field contains the Amazon Web Services ID of the member account.   SAVINGS_PLAN_ARN - The unique identifier for your Savings Plan  
    */
  var DimensionValues: DimensionValuesWithAttributesList
  
  /**
    * The token for the next set of retrievable results. Amazon Web Services provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCostexplorerMod.NextPageToken] = js.undefined
  
  /**
    * The number of results that Amazon Web Services returned at one time.
    */
  var ReturnSize: PageSize
  
  /**
    * The total number of search results.
    */
  var TotalSize: PageSize
}
object GetDimensionValuesResponse {
  
  inline def apply(DimensionValues: DimensionValuesWithAttributesList, ReturnSize: PageSize, TotalSize: PageSize): GetDimensionValuesResponse = {
    val __obj = js.Dynamic.literal(DimensionValues = DimensionValues.asInstanceOf[js.Any], ReturnSize = ReturnSize.asInstanceOf[js.Any], TotalSize = TotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDimensionValuesResponse]
  }
  
  extension [Self <: GetDimensionValuesResponse](x: Self) {
    
    inline def setDimensionValues(value: DimensionValuesWithAttributesList): Self = StObject.set(x, "DimensionValues", value.asInstanceOf[js.Any])
    
    inline def setDimensionValuesVarargs(value: DimensionValuesWithAttributes*): Self = StObject.set(x, "DimensionValues", js.Array(value*))
    
    inline def setNextPageToken(value: NextPageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setReturnSize(value: PageSize): Self = StObject.set(x, "ReturnSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSize(value: PageSize): Self = StObject.set(x, "TotalSize", value.asInstanceOf[js.Any])
  }
}
