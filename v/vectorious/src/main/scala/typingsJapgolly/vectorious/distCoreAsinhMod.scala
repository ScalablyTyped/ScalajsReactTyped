package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreAsinhMod {
  
  @JSImport("vectorious/dist/core/asinh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def asinh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def asinh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("asinh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
