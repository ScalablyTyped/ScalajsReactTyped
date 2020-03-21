package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediatailorMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mediatailorMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_PERIOD
    - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_PERIOD
    - java.lang.String
  */
  type OriginManifestType = typingsJapgolly.awsSdk.mediatailorMod._OriginManifestType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-04-23`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mediatailorMod._apiVersion | java.lang.String
  type integer = scala.Double
  type integerMin1 = scala.Double
  type integerMin1Max100 = scala.Double
  type listOfPlaybackConfigurations = js.Array[typingsJapgolly.awsSdk.mediatailorMod.PlaybackConfiguration]
  type listOfString = js.Array[typingsJapgolly.awsSdk.mediatailorMod.string]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.mediatailorMod.string]
  type string = java.lang.String
}
