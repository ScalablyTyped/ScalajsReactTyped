package typingsJapgolly.forgeViewer.global.THREE

import typingsJapgolly.forgeViewer.THREE.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("THREE.Curve")
@js.native
open class Curve[T /* <: Vector */] ()
  extends StObject
     with typingsJapgolly.forgeViewer.THREE.Curve[T]
object Curve {
  
  @JSGlobal("THREE.Curve")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(constructorFunc: Any, getPointFunc: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(constructorFunc.asInstanceOf[js.Any], getPointFunc.asInstanceOf[js.Any])).asInstanceOf[Any]
}
