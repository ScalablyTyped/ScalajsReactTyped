package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object marketplacemeteringMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.marketplacemeteringMod.ClientApiVersions
  type CustomerIdentifier = java.lang.String
  type NonEmptyString = java.lang.String
  type Nonce = java.lang.String
  type ProductCode = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  type UsageDimension = java.lang.String
  type UsageQuantity = scala.Double
  type UsageRecordList = js.Array[typingsJapgolly.awsSdk.marketplacemeteringMod.UsageRecord]
  type UsageRecordResultList = js.Array[typingsJapgolly.awsSdk.marketplacemeteringMod.UsageRecordResult]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.CustomerNotSubscribed
    - typingsJapgolly.awsSdk.awsSdkStrings.DuplicateRecord
    - java.lang.String
  */
  type UsageRecordResultStatus = typingsJapgolly.awsSdk.marketplacemeteringMod._UsageRecordResultStatus | java.lang.String
  type VersionInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-01-14`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.marketplacemeteringMod._apiVersion | java.lang.String
}
