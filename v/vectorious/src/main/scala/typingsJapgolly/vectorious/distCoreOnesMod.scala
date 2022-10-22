package typingsJapgolly.vectorious

import typingsJapgolly.vectorious.distCoreMod.NDArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreOnesMod {
  
  @JSImport("vectorious/dist/core/ones", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ones(shape: Double*): NDArray = ^.asInstanceOf[js.Dynamic].applyDynamic("ones")(shape.asInstanceOf[Seq[js.Any]]*).asInstanceOf[NDArray]
}
