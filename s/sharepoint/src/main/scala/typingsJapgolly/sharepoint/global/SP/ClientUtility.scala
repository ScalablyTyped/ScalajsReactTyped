package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientUtility")
@js.native
open class ClientUtility ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ClientUtility
object ClientUtility {
  
  @JSGlobal("SP.ClientUtility")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getOrCreateObjectPathForConstructor(context: typingsJapgolly.sharepoint.SP.ClientRuntimeContext, typeId: String, args: js.Array[Any]): typingsJapgolly.sharepoint.SP.ObjectPath = (^.asInstanceOf[js.Dynamic].applyDynamic("getOrCreateObjectPathForConstructor")(context.asInstanceOf[js.Any], typeId.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.ObjectPath]
  
  /* static member */
  inline def urlPathEncodeForXmlHttpRequest(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlPathEncodeForXmlHttpRequest")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
