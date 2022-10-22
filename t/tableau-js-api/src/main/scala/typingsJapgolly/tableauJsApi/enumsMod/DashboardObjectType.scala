package typingsJapgolly.tableauJsApi.enumsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DashboardObjectType extends StObject
@JSImport("tableau-js-api/enums", "DashboardObjectType")
@js.native
object DashboardObjectType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DashboardObjectType & String] = js.native
  
  @js.native
  sealed trait ADDIN
    extends StObject
       with DashboardObjectType
  /* "addIn" */ val ADDIN: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.ADDIN & String = js.native
  
  @js.native
  sealed trait BLANK
    extends StObject
       with DashboardObjectType
  /* "blank" */ val BLANK: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.BLANK & String = js.native
  
  @js.native
  sealed trait IMAGE
    extends StObject
       with DashboardObjectType
  /* "image" */ val IMAGE: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.IMAGE & String = js.native
  
  @js.native
  sealed trait LEGEND
    extends StObject
       with DashboardObjectType
  /* "legend" */ val LEGEND: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.LEGEND & String = js.native
  
  @js.native
  sealed trait PAGE_FILTER
    extends StObject
       with DashboardObjectType
  /* "pageFilter" */ val PAGE_FILTER: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.PAGE_FILTER & String = js.native
  
  @js.native
  sealed trait PARAMETER_CONTROL
    extends StObject
       with DashboardObjectType
  /* "parameterControl" */ val PARAMETER_CONTROL: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.PARAMETER_CONTROL & String = js.native
  
  @js.native
  sealed trait QUICK_FILTER
    extends StObject
       with DashboardObjectType
  /* "quickFilter" */ val QUICK_FILTER: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.QUICK_FILTER & String = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with DashboardObjectType
  /* "text" */ val TEXT: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.TEXT & String = js.native
  
  @js.native
  sealed trait TITLE
    extends StObject
       with DashboardObjectType
  /* "title" */ val TITLE: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.TITLE & String = js.native
  
  @js.native
  sealed trait WEB_PAGE
    extends StObject
       with DashboardObjectType
  /* "webPage" */ val WEB_PAGE: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.WEB_PAGE & String = js.native
  
  @js.native
  sealed trait WORKSHEET
    extends StObject
       with DashboardObjectType
  /* "worksheet" */ val WORKSHEET: typingsJapgolly.tableauJsApi.enumsMod.DashboardObjectType.WORKSHEET & String = js.native
}
