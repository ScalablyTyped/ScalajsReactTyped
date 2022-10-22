package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ServerSettings")
@js.native
open class ServerSettings ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ServerSettings
object ServerSettings {
  
  @JSGlobal("SP.ServerSettings")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getAlternateUrls(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext): typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.AlternateUrl] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlternateUrls")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.ClientObjectList[typingsJapgolly.sharepoint.SP.AlternateUrl]]
  
  /* static member */
  inline def getGlobalInstalledLanguages(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, compatibilityLevel: Double): js.Array[typingsJapgolly.sharepoint.SP.Language] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGlobalInstalledLanguages")(context.asInstanceOf[js.Any], compatibilityLevel.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.sharepoint.SP.Language]]
}
