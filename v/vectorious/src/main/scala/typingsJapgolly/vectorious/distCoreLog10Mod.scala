package typingsJapgolly.vectorious

import typingsJapgolly.std.ArrayLike
import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreLog10Mod {
  
  @JSImport("vectorious/dist/core/log10", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[NDArray]
  
  inline def log10(x: ArrayLike[Any]): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
  inline def log10(x: NDArray): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("log10")(x.asInstanceOf[js.Any]).asInstanceOf[NDArray]
}
