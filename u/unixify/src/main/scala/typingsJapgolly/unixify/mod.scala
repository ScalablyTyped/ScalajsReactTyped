package typingsJapgolly.unixify

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(path: String, stripTrailing: Boolean): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], stripTrailing.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("unixify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
