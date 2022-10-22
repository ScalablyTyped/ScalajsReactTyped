package typingsJapgolly.linkifyjs

import typingsJapgolly.linkifyjs.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("linkifyjs/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(str: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
