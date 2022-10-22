package typingsJapgolly.reactSketchapp

import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleUtilsPickMod {
  
  @JSImport("react-sketchapp/lib/module/utils/pick", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pick[T, K /* <: /* keyof T */ String */](obj: T, keys: js.Array[K]): Pick[T, K] = (^.asInstanceOf[js.Dynamic].applyDynamic("pick")(obj.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Pick[T, K]]
}
