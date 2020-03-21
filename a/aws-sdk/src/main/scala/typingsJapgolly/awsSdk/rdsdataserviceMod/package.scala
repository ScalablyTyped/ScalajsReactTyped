package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdsdataserviceMod {
  type Arn = java.lang.String
  type ArrayOfArray = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.ArrayValue]
  type ArrayValueList = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.Value]
  type Boolean = scala.Boolean
  type BooleanArray = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.BoxedBoolean]
  type BoxedBoolean = scala.Boolean
  type BoxedDouble = scala.Double
  type BoxedFloat = scala.Double
  type BoxedInteger = scala.Double
  type BoxedLong = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.rdsdataserviceMod.ClientApiVersions
  type DbName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE_OR_LONG
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING
    - java.lang.String
  */
  type DecimalReturnType = typingsJapgolly.awsSdk.rdsdataserviceMod._DecimalReturnType | java.lang.String
  type DoubleArray = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.BoxedDouble]
  type FieldList = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.Field]
  type Id = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type LongArray = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.BoxedLong]
  type Metadata = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.ColumnMetadata]
  type ParameterName = java.lang.String
  type Records = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.Record]
  type RecordsUpdated = scala.Double
  type Row = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.Value]
  type SqlParameterSets = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.SqlParametersList]
  type SqlParametersList = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.SqlParameter]
  type SqlRecords = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.FieldList]
  type SqlStatement = java.lang.String
  type SqlStatementResults = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.SqlStatementResult]
  type String = java.lang.String
  type StringArray = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.String]
  type TransactionStatus = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DATE
    - typingsJapgolly.awsSdk.awsSdkStrings.DECIMAL
    - typingsJapgolly.awsSdk.awsSdkStrings.TIME
    - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type TypeHint = typingsJapgolly.awsSdk.rdsdataserviceMod._TypeHint | java.lang.String
  type UpdateResults = js.Array[typingsJapgolly.awsSdk.rdsdataserviceMod.UpdateResult]
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.rdsdataserviceMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-08-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.rdsdataserviceMod._apiVersion | java.lang.String
}
