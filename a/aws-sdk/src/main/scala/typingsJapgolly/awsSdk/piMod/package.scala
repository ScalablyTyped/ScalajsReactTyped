package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object piMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.piMod.ClientApiVersions
  type DataPointsList = js.Array[typingsJapgolly.awsSdk.piMod.DataPoint]
  type DimensionKeyDescriptionList = js.Array[typingsJapgolly.awsSdk.piMod.DimensionKeyDescription]
  type DimensionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.piMod.String]
  type Double = scala.Double
  type ISOTimestamp = js.Date
  type Integer = scala.Double
  type Limit = scala.Double
  type MaxResults = scala.Double
  type MetricKeyDataPointsList = js.Array[typingsJapgolly.awsSdk.piMod.MetricKeyDataPoints]
  type MetricQueryFilterMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.piMod.String]
  type MetricQueryList = js.Array[typingsJapgolly.awsSdk.piMod.MetricQuery]
  type MetricValuesList = js.Array[typingsJapgolly.awsSdk.piMod.Double]
  type ResponsePartitionKeyList = js.Array[typingsJapgolly.awsSdk.piMod.ResponsePartitionKey]
  type ServiceType = typingsJapgolly.awsSdk.awsSdkStrings.RDS | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.piMod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-02-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.piMod._apiVersion | java.lang.String
}
