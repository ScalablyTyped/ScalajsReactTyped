package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCorePowMod {
  
  @JSImport("vectorious/dist/core/pow", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(exponent: Double): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(exponent.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  
  inline def pow(x: ArrayLike[Any], exponent: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[NDArray]
  inline def pow(x: NDArray, exponent: Double): NDArray = (^.asInstanceOf[js.Dynamic].applyDynamic("pow")(x.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[NDArray]
}
