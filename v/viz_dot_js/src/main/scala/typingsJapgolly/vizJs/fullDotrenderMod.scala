package typingsJapgolly.vizJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object fullDotrenderMod {
  
  @JSImport("viz.js/full.render", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("viz.js/full.render", "Module")
  @js.native
  val Module: typingsJapgolly.vizJs.Module = js.native
  
  inline def render(instance: typingsJapgolly.vizJs.Module, src: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(instance.asInstanceOf[js.Any], src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
