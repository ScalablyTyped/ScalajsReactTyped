package typingsJapgolly.three.mod

import typingsJapgolly.three.srcMathVector2Mod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Curve")
@js.native
open class Curve[T /* <: Vector */] ()
  extends typingsJapgolly.three.srcThreeMod.Curve[T]
/* static members */
object Curve {
  
  @JSImport("three", "Curve")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @deprecated since r84.
    */
  inline def create(constructorFunc: js.Function0[Unit], getPointFunc: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(constructorFunc.asInstanceOf[js.Any], getPointFunc.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
}
