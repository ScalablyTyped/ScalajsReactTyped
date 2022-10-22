package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AppCatalog")
@js.native
open class AppCatalog ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.AppCatalog
object AppCatalog {
  
  @JSGlobal("SP.AppCatalog")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getAppInstances(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    web: typingsJapgolly.sharepoint.SP.Web
  ): typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.AppInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAppInstances")(context.asInstanceOf[js.Any], web.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.AppInstance]]
  
  /* static member */
  inline def getDeveloperSiteAppInstancesByIds(
    context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext,
    site: typingsJapgolly.sharepoint.SP.Site,
    appInstanceIds: js.Array[typingsJapgolly.sharepoint.SP.Guid]
  ): typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.AppInstance] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeveloperSiteAppInstancesByIds")(context.asInstanceOf[js.Any], site.asInstanceOf[js.Any], appInstanceIds.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.AppInstance]]
  
  /* static member */
  inline def isAppSideloadingEnabled(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.BooleanResult = ^.asInstanceOf[js.Dynamic].applyDynamic("isAppSideloadingEnabled")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.BooleanResult]
}
