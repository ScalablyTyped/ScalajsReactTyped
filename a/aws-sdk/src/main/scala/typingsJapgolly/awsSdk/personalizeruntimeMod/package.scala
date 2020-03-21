package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object personalizeruntimeMod {
  type Arn = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.personalizeruntimeMod.ClientApiVersions
  type Context = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.personalizeruntimeMod.AttributeValue]
  type InputList = js.Array[typingsJapgolly.awsSdk.personalizeruntimeMod.ItemID]
  type ItemID = java.lang.String
  type ItemList = js.Array[typingsJapgolly.awsSdk.personalizeruntimeMod.PredictedItem]
  type NumResults = scala.Double
  type UserID = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-05-22`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.personalizeruntimeMod._apiVersion | java.lang.String
}
