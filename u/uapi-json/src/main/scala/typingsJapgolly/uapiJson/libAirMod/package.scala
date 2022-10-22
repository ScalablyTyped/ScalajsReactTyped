package typingsJapgolly.uapiJson.libAirMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uapiJson.anon.AddSegments
import typingsJapgolly.uapiJson.libAirMod.^
import typingsJapgolly.uapiJson.libSettingsMod.Settings
import typingsJapgolly.uapiJson.uapiJsonStrings.Business
import typingsJapgolly.uapiJson.uapiJsonStrings.Economy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def createAirService(settings: Settings): AddSegments = ^.asInstanceOf[js.Dynamic].applyDynamic("createAirService")(settings.asInstanceOf[js.Any]).asInstanceOf[AddSegments]

type Cabins = (js.Array[Economy | Business]) | (js.Tuple2[Economy, Business])

type GetUniversalRecordByPNRParams = GetBookingParams

type GetUniversalRecordParams = GetBookingParams

type SearchPassengers = StringDictionary[Double]
