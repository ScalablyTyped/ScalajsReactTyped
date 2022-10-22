package typingsJapgolly.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ResResources")
@js.native
open class ResResources ()
  extends StObject
     with typingsJapgolly.sharepoint.SP.ResResources
object ResResources {
  
  @JSGlobal("SP.ResResources")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getString(resourceId: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getString")(resourceId.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
}
