package typingsJapgolly.styleToJs

import typingsJapgolly.std.Record
import typingsJapgolly.styleToJs.cjsUtilitiesMod.CamelCaseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsMod {
  
  @JSImport("style-to-js/cjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(style: String): StyleObject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any]).asInstanceOf[StyleObject]
  inline def default(style: String, options: StyleToJSOptions): StyleObject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StyleObject]
  
  type StyleObject = Record[String, String]
  
  type StyleToJSOptions = CamelCaseOptions
}
