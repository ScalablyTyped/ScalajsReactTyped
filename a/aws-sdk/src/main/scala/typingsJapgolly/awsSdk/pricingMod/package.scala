package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pricingMod {
  type AttributeNameList = js.Array[typingsJapgolly.awsSdk.pricingMod.String]
  type AttributeValueList = js.Array[typingsJapgolly.awsSdk.pricingMod.AttributeValue]
  type BoxedInteger = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.pricingMod.ClientApiVersions
  type FilterType = typingsJapgolly.awsSdk.awsSdkStrings.TERM_MATCH | java.lang.String
  type Filters = js.Array[typingsJapgolly.awsSdk.pricingMod.Filter]
  type PriceList = js.Array[typingsJapgolly.awsSdk.pricingMod.PriceListItemJSON]
  type PriceListItemJSON = java.lang.String
  type ServiceList = js.Array[typingsJapgolly.awsSdk.pricingMod.Service]
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.pricingMod._apiVersion | java.lang.String
}
