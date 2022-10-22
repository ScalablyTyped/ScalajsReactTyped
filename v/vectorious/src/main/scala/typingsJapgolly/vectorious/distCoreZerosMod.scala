package typingsJapgolly.vectorious

import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreZerosMod {
  
  @JSImport("vectorious/dist/core/zeros", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def zeros(shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
}
