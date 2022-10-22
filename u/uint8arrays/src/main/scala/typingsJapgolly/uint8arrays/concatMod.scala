package typingsJapgolly.uint8arrays

import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object concatMod {
  
  @JSImport("uint8arrays/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concat(arrays: js.Array[ArrayLike[Double]]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arrays.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def concat(arrays: js.Array[ArrayLike[Double]], length: Double): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(arrays.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
