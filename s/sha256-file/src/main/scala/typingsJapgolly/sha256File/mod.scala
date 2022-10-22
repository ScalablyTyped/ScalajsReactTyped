package typingsJapgolly.sha256File

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(filename: String): String = ^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(filename: String, callback: CallbackFunction): Unit = (^.asInstanceOf[js.Dynamic].apply(filename.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sha256-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CallbackFunction = js.Function2[/* error */ js.Error | Null, /* sum */ String | Null, Unit]
}
