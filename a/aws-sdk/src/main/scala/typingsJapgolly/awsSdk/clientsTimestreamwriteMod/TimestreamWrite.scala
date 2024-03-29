package typingsJapgolly.awsSdk.clientsTimestreamwriteMod

import typingsJapgolly.awsSdk.libConfigBaseMod.ConfigBase
import typingsJapgolly.awsSdk.libErrorMod.AWSError
import typingsJapgolly.awsSdk.libRequestMod.Request
import typingsJapgolly.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimestreamWrite extends Service {
  
  @JSName("config")
  var config_TimestreamWrite: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a new Timestream database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account. Refer to Amazon Web Services managed KMS keys for more info. Service quotas apply. See code sample for details. 
    */
  def createDatabase(): Request[CreateDatabaseResponse, AWSError] = js.native
  def createDatabase(callback: js.Function2[/* err */ AWSError, /* data */ CreateDatabaseResponse, Unit]): Request[CreateDatabaseResponse, AWSError] = js.native
  /**
    * Creates a new Timestream database. If the KMS key is not specified, the database will be encrypted with a Timestream managed KMS key located in your account. Refer to Amazon Web Services managed KMS keys for more info. Service quotas apply. See code sample for details. 
    */
  def createDatabase(params: CreateDatabaseRequest): Request[CreateDatabaseResponse, AWSError] = js.native
  def createDatabase(
    params: CreateDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDatabaseResponse, Unit]
  ): Request[CreateDatabaseResponse, AWSError] = js.native
  
  /**
    * The CreateTable operation adds a new table to an existing database in your account. In an Amazon Web Services account, table names must be at least unique within each Region if they are in the same database. You may have identical table names in the same Region if the tables are in separate databases. While creating the table, you must specify the table name, database name, and the retention properties. Service quotas apply. See code sample for details. 
    */
  def createTable(): Request[CreateTableResponse, AWSError] = js.native
  def createTable(callback: js.Function2[/* err */ AWSError, /* data */ CreateTableResponse, Unit]): Request[CreateTableResponse, AWSError] = js.native
  /**
    * The CreateTable operation adds a new table to an existing database in your account. In an Amazon Web Services account, table names must be at least unique within each Region if they are in the same database. You may have identical table names in the same Region if the tables are in separate databases. While creating the table, you must specify the table name, database name, and the retention properties. Service quotas apply. See code sample for details. 
    */
  def createTable(params: CreateTableRequest): Request[CreateTableResponse, AWSError] = js.native
  def createTable(
    params: CreateTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTableResponse, Unit]
  ): Request[CreateTableResponse, AWSError] = js.native
  
  /**
    * Deletes a given Timestream database. This is an irreversible operation. After a database is deleted, the time series data from its tables cannot be recovered.   All tables in the database must be deleted first, or a ValidationException error will be thrown.  Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException. Clients should consider them equivalent.  See code sample for details.
    */
  def deleteDatabase(): Request[js.Object, AWSError] = js.native
  def deleteDatabase(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a given Timestream database. This is an irreversible operation. After a database is deleted, the time series data from its tables cannot be recovered.   All tables in the database must be deleted first, or a ValidationException error will be thrown.  Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException. Clients should consider them equivalent.  See code sample for details.
    */
  def deleteDatabase(params: DeleteDatabaseRequest): Request[js.Object, AWSError] = js.native
  def deleteDatabase(
    params: DeleteDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a given Timestream table. This is an irreversible operation. After a Timestream database table is deleted, the time series data stored in the table cannot be recovered.   Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException. Clients should consider them equivalent.  See code sample for details.
    */
  def deleteTable(): Request[js.Object, AWSError] = js.native
  def deleteTable(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a given Timestream table. This is an irreversible operation. After a Timestream database table is deleted, the time series data stored in the table cannot be recovered.   Due to the nature of distributed retries, the operation can return either success or a ResourceNotFoundException. Clients should consider them equivalent.  See code sample for details.
    */
  def deleteTable(params: DeleteTableRequest): Request[js.Object, AWSError] = js.native
  def deleteTable(params: DeleteTableRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Returns information about the database, including the database name, time that the database was created, and the total number of tables found within the database. Service quotas apply. See code sample for details.
    */
  def describeDatabase(): Request[DescribeDatabaseResponse, AWSError] = js.native
  def describeDatabase(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatabaseResponse, Unit]): Request[DescribeDatabaseResponse, AWSError] = js.native
  /**
    * Returns information about the database, including the database name, time that the database was created, and the total number of tables found within the database. Service quotas apply. See code sample for details.
    */
  def describeDatabase(params: DescribeDatabaseRequest): Request[DescribeDatabaseResponse, AWSError] = js.native
  def describeDatabase(
    params: DescribeDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDatabaseResponse, Unit]
  ): Request[DescribeDatabaseResponse, AWSError] = js.native
  
  /**
    * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is available through both Write and Query. Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the management and mapping of the service endpoints, it is not recommended that you use this API unless:   You are using VPC endpoints (Amazon Web Services PrivateLink) with Timestream    Your application uses a programming language that does not yet have SDK support   You require better control over the client-side implementation   For detailed information on how and when to use and implement DescribeEndpoints, see The Endpoint Discovery Pattern.
    */
  def describeEndpoints(): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]): Request[DescribeEndpointsResponse, AWSError] = js.native
  /**
    * DescribeEndpoints returns a list of available endpoints to make Timestream API calls against. This API is available through both Write and Query. Because the Timestream SDKs are designed to transparently work with the service’s architecture, including the management and mapping of the service endpoints, it is not recommended that you use this API unless:   You are using VPC endpoints (Amazon Web Services PrivateLink) with Timestream    Your application uses a programming language that does not yet have SDK support   You require better control over the client-side implementation   For detailed information on how and when to use and implement DescribeEndpoints, see The Endpoint Discovery Pattern.
    */
  def describeEndpoints(params: DescribeEndpointsRequest): Request[DescribeEndpointsResponse, AWSError] = js.native
  def describeEndpoints(
    params: DescribeEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEndpointsResponse, Unit]
  ): Request[DescribeEndpointsResponse, AWSError] = js.native
  
  /**
    * Returns information about the table, including the table name, database name, retention duration of the memory store and the magnetic store. Service quotas apply. See code sample for details. 
    */
  def describeTable(): Request[DescribeTableResponse, AWSError] = js.native
  def describeTable(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableResponse, Unit]): Request[DescribeTableResponse, AWSError] = js.native
  /**
    * Returns information about the table, including the table name, database name, retention duration of the memory store and the magnetic store. Service quotas apply. See code sample for details. 
    */
  def describeTable(params: DescribeTableRequest): Request[DescribeTableResponse, AWSError] = js.native
  def describeTable(
    params: DescribeTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTableResponse, Unit]
  ): Request[DescribeTableResponse, AWSError] = js.native
  
  /**
    * Returns a list of your Timestream databases. Service quotas apply. See code sample for details. 
    */
  def listDatabases(): Request[ListDatabasesResponse, AWSError] = js.native
  def listDatabases(callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesResponse, Unit]): Request[ListDatabasesResponse, AWSError] = js.native
  /**
    * Returns a list of your Timestream databases. Service quotas apply. See code sample for details. 
    */
  def listDatabases(params: ListDatabasesRequest): Request[ListDatabasesResponse, AWSError] = js.native
  def listDatabases(
    params: ListDatabasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDatabasesResponse, Unit]
  ): Request[ListDatabasesResponse, AWSError] = js.native
  
  /**
    * A list of tables, along with the name, status and retention properties of each table. See code sample for details. 
    */
  def listTables(): Request[ListTablesResponse, AWSError] = js.native
  def listTables(callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResponse, Unit]): Request[ListTablesResponse, AWSError] = js.native
  /**
    * A list of tables, along with the name, status and retention properties of each table. See code sample for details. 
    */
  def listTables(params: ListTablesRequest): Request[ListTablesResponse, AWSError] = js.native
  def listTables(
    params: ListTablesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTablesResponse, Unit]
  ): Request[ListTablesResponse, AWSError] = js.native
  
  /**
    *  List all tags on a Timestream resource. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    *  List all tags on a Timestream resource. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    *  Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. 
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    *  Associate a set of tags with a Timestream resource. You can then activate these user-defined tags so that they appear on the Billing and Cost Management console for cost allocation tracking. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    *  Removes the association of tags from a Timestream resource. 
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    *  Removes the association of tags from a Timestream resource. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    *  Modifies the KMS key for an existing database. While updating the database, you must specify the database name and the identifier of the new KMS key to be used (KmsKeyId). If there are any concurrent UpdateDatabase requests, first writer wins.  See code sample for details.
    */
  def updateDatabase(): Request[UpdateDatabaseResponse, AWSError] = js.native
  def updateDatabase(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatabaseResponse, Unit]): Request[UpdateDatabaseResponse, AWSError] = js.native
  /**
    *  Modifies the KMS key for an existing database. While updating the database, you must specify the database name and the identifier of the new KMS key to be used (KmsKeyId). If there are any concurrent UpdateDatabase requests, first writer wins.  See code sample for details.
    */
  def updateDatabase(params: UpdateDatabaseRequest): Request[UpdateDatabaseResponse, AWSError] = js.native
  def updateDatabase(
    params: UpdateDatabaseRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDatabaseResponse, Unit]
  ): Request[UpdateDatabaseResponse, AWSError] = js.native
  
  /**
    * Modifies the retention duration of the memory store and magnetic store for your Timestream table. Note that the change in retention duration takes effect immediately. For example, if the retention period of the memory store was initially set to 2 hours and then changed to 24 hours, the memory store will be capable of holding 24 hours of data, but will be populated with 24 hours of data 22 hours after this change was made. Timestream does not retrieve data from the magnetic store to populate the memory store.  See code sample for details.
    */
  def updateTable(): Request[UpdateTableResponse, AWSError] = js.native
  def updateTable(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableResponse, Unit]): Request[UpdateTableResponse, AWSError] = js.native
  /**
    * Modifies the retention duration of the memory store and magnetic store for your Timestream table. Note that the change in retention duration takes effect immediately. For example, if the retention period of the memory store was initially set to 2 hours and then changed to 24 hours, the memory store will be capable of holding 24 hours of data, but will be populated with 24 hours of data 22 hours after this change was made. Timestream does not retrieve data from the magnetic store to populate the memory store.  See code sample for details.
    */
  def updateTable(params: UpdateTableRequest): Request[UpdateTableResponse, AWSError] = js.native
  def updateTable(
    params: UpdateTableRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTableResponse, Unit]
  ): Request[UpdateTableResponse, AWSError] = js.native
  
  /**
    * The WriteRecords operation enables you to write your time series data into Timestream. You can specify a single data point or a batch of data points to be inserted into the system. Timestream offers you with a flexible schema that auto detects the column names and data types for your Timestream tables based on the dimension names and data types of the data points you specify when invoking writes into the database. Timestream support eventual consistency read semantics. This means that when you query data immediately after writing a batch of data into Timestream, the query results might not reflect the results of a recently completed write operation. The results may also include some stale data. If you repeat the query request after a short time, the results should return the latest data. Service quotas apply.  See code sample for details.  Upserts  You can use the Version parameter in a WriteRecords request to update data points. Timestream tracks a version number with each record. Version defaults to 1 when not specified for the record in the request. Timestream will update an existing record’s measure value along with its Version upon receiving a write request with a higher Version number for that record. Upon receiving an update request where the measure value is the same as that of the existing record, Timestream still updates Version, if it is greater than the existing value of Version. You can update a data point as many times as desired, as long as the value of Version continuously increases.   For example, suppose you write a new record without indicating Version in the request. Timestream will store this record, and set Version to 1. Now, suppose you try to update this record with a WriteRecords request of the same record with a different measure value but, like before, do not provide Version. In this case, Timestream will reject this update with a RejectedRecordsException since the updated record’s version is not greater than the existing value of Version. However, if you were to resend the update request with Version set to 2, Timestream would then succeed in updating the record’s value, and the Version would be set to 2. Next, suppose you sent a WriteRecords request with this same record and an identical measure value, but with Version set to 3. In this case, Timestream would only update Version to 3. Any further updates would need to send a version number greater than 3, or the update requests would receive a RejectedRecordsException. 
    */
  def writeRecords(): Request[WriteRecordsResponse, AWSError] = js.native
  def writeRecords(callback: js.Function2[/* err */ AWSError, /* data */ WriteRecordsResponse, Unit]): Request[WriteRecordsResponse, AWSError] = js.native
  /**
    * The WriteRecords operation enables you to write your time series data into Timestream. You can specify a single data point or a batch of data points to be inserted into the system. Timestream offers you with a flexible schema that auto detects the column names and data types for your Timestream tables based on the dimension names and data types of the data points you specify when invoking writes into the database. Timestream support eventual consistency read semantics. This means that when you query data immediately after writing a batch of data into Timestream, the query results might not reflect the results of a recently completed write operation. The results may also include some stale data. If you repeat the query request after a short time, the results should return the latest data. Service quotas apply.  See code sample for details.  Upserts  You can use the Version parameter in a WriteRecords request to update data points. Timestream tracks a version number with each record. Version defaults to 1 when not specified for the record in the request. Timestream will update an existing record’s measure value along with its Version upon receiving a write request with a higher Version number for that record. Upon receiving an update request where the measure value is the same as that of the existing record, Timestream still updates Version, if it is greater than the existing value of Version. You can update a data point as many times as desired, as long as the value of Version continuously increases.   For example, suppose you write a new record without indicating Version in the request. Timestream will store this record, and set Version to 1. Now, suppose you try to update this record with a WriteRecords request of the same record with a different measure value but, like before, do not provide Version. In this case, Timestream will reject this update with a RejectedRecordsException since the updated record’s version is not greater than the existing value of Version. However, if you were to resend the update request with Version set to 2, Timestream would then succeed in updating the record’s value, and the Version would be set to 2. Next, suppose you sent a WriteRecords request with this same record and an identical measure value, but with Version set to 3. In this case, Timestream would only update Version to 3. Any further updates would need to send a version number greater than 3, or the update requests would receive a RejectedRecordsException. 
    */
  def writeRecords(params: WriteRecordsRequest): Request[WriteRecordsResponse, AWSError] = js.native
  def writeRecords(
    params: WriteRecordsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ WriteRecordsResponse, Unit]
  ): Request[WriteRecordsResponse, AWSError] = js.native
}
