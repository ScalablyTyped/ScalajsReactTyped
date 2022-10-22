package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreAtanhMod {
  
  @JSImport("vectorious/dist/core/atanh", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def atanh(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def atanh(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("atanh")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
