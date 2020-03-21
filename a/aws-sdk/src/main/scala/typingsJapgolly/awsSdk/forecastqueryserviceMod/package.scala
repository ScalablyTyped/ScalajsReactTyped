package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object forecastqueryserviceMod {
  type Arn = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.forecastqueryserviceMod.ClientApiVersions
  type DateTime = java.lang.String
  type Double = scala.Double
  type Filters = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.forecastqueryserviceMod.AttributeValue]
  type NextToken = java.lang.String
  type Predictions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.forecastqueryserviceMod.TimeSeries]
  type Statistic = java.lang.String
  type TimeSeries = js.Array[typingsJapgolly.awsSdk.forecastqueryserviceMod.DataPoint]
  type Timestamp = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-06-26`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.forecastqueryserviceMod._apiVersion | java.lang.String
}
