package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.AppContextSite")
@js.native
open class AppContextSite protected ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.AppContextSite {
  def this(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, siteUrl: String) = this()
}
object AppContextSite {
  
  @JSGlobal("SP.AppContextSite")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def newObject(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, siteUrl: String): typingsJapgolly.sharepoint.SP.AppContextSite = (^.asInstanceOf[js.Dynamic].applyDynamic("newObject")(context.asInstanceOf[js.Any], siteUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.AppContextSite]
}
