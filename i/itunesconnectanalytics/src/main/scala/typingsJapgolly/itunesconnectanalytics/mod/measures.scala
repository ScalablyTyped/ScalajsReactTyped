package typingsJapgolly.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait measures extends StObject
@JSImport("itunesconnectanalytics", "measures")
@js.native
object measures extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[measures & String] = js.native
  
  @js.native
  sealed trait activeDevices
    extends StObject
       with measures
  /* "activeDevices" */ val activeDevices: typingsJapgolly.itunesconnectanalytics.mod.measures.activeDevices & String = js.native
  
  @js.native
  sealed trait activeLast30days
    extends StObject
       with measures
  /* "rollingActiveDevices" */ val activeLast30days: typingsJapgolly.itunesconnectanalytics.mod.measures.activeLast30days & String = js.native
  
  @js.native
  sealed trait crashes
    extends StObject
       with measures
  /* "crashes" */ val crashes: typingsJapgolly.itunesconnectanalytics.mod.measures.crashes & String = js.native
  
  @js.native
  sealed trait iap
    extends StObject
       with measures
  /* "iap" */ val iap: typingsJapgolly.itunesconnectanalytics.mod.measures.iap & String = js.native
  
  @js.native
  sealed trait impressions
    extends StObject
       with measures
  /* "impressionsTotal" */ val impressions: typingsJapgolly.itunesconnectanalytics.mod.measures.impressions & String = js.native
  
  @js.native
  sealed trait impressionsUnique
    extends StObject
       with measures
  /* "impressionsTotalUnique" */ val impressionsUnique: typingsJapgolly.itunesconnectanalytics.mod.measures.impressionsUnique & String = js.native
  
  @js.native
  sealed trait installs
    extends StObject
       with measures
  /* "installs" */ val installs: typingsJapgolly.itunesconnectanalytics.mod.measures.installs & String = js.native
  
  @js.native
  sealed trait pageViewUnique
    extends StObject
       with measures
  /* "pageViewUnique" */ val pageViewUnique: typingsJapgolly.itunesconnectanalytics.mod.measures.pageViewUnique & String = js.native
  
  @js.native
  sealed trait pageViews
    extends StObject
       with measures
  /* "pageViewCount" */ val pageViews: typingsJapgolly.itunesconnectanalytics.mod.measures.pageViews & String = js.native
  
  @js.native
  sealed trait payingUsers
    extends StObject
       with measures
  /* "payingUsers" */ val payingUsers: typingsJapgolly.itunesconnectanalytics.mod.measures.payingUsers & String = js.native
  
  @js.native
  sealed trait sales
    extends StObject
       with measures
  /* "sales" */ val sales: typingsJapgolly.itunesconnectanalytics.mod.measures.sales & String = js.native
  
  @js.native
  sealed trait sessions
    extends StObject
       with measures
  /* "sessions" */ val sessions: typingsJapgolly.itunesconnectanalytics.mod.measures.sessions & String = js.native
  
  @js.native
  sealed trait uninstalls
    extends StObject
       with measures
  /* "uninstalls" */ val uninstalls: typingsJapgolly.itunesconnectanalytics.mod.measures.uninstalls & String = js.native
  
  @js.native
  sealed trait units
    extends StObject
       with measures
  /* "units" */ val units: typingsJapgolly.itunesconnectanalytics.mod.measures.units & String = js.native
}
