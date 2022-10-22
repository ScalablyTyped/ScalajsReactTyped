package typingsJapgolly.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait dimensionFilterKey extends StObject
@JSImport("itunesconnectanalytics", "dimensionFilterKey")
@js.native
object dimensionFilterKey extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[dimensionFilterKey & String] = js.native
  
  @js.native
  sealed trait appPurchaseWeek
    extends StObject
       with dimensionFilterKey
  /* "apppurchaseWeek" */ val appPurchaseWeek: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.appPurchaseWeek & String = js.native
  
  @js.native
  sealed trait appVersion
    extends StObject
       with dimensionFilterKey
  /* "appVersion" */ val appVersion: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.appVersion & String = js.native
  
  @js.native
  sealed trait apppurchaseDay
    extends StObject
       with dimensionFilterKey
  /* "apppurchaseDay" */ val apppurchaseDay: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.apppurchaseDay & String = js.native
  
  @js.native
  sealed trait apppurchaseMonth
    extends StObject
       with dimensionFilterKey
  /* "apppurchaseMonth" */ val apppurchaseMonth: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.apppurchaseMonth & String = js.native
  
  @js.native
  sealed trait campaigns
    extends StObject
       with dimensionFilterKey
  /* "campaignId" */ val campaigns: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.campaigns & String = js.native
  
  @js.native
  sealed trait device
    extends StObject
       with dimensionFilterKey
  /* "platform" */ val device: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.device & String = js.native
  
  @js.native
  sealed trait platformVersion
    extends StObject
       with dimensionFilterKey
  /* "platformVersion" */ val platformVersion: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.platformVersion & String = js.native
  
  @js.native
  sealed trait region
    extends StObject
       with dimensionFilterKey
  /* "region" */ val region: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.region & String = js.native
  
  @js.native
  sealed trait territory
    extends StObject
       with dimensionFilterKey
  /* "storefront" */ val territory: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.territory & String = js.native
  
  @js.native
  sealed trait websites
    extends StObject
       with dimensionFilterKey
  /* "domainReferrer" */ val websites: typingsJapgolly.itunesconnectanalytics.mod.dimensionFilterKey.websites & String = js.native
}
