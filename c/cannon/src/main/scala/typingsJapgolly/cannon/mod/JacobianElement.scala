package typingsJapgolly.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "JacobianElement")
@js.native
open class JacobianElement ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.JacobianElement {
  
  /* CompleteClass */
  override def multiplyElement(element: typingsJapgolly.cannon.CANNON.JacobianElement): Double = js.native
  
  /* CompleteClass */
  override def multiplyVectors(spacial: typingsJapgolly.cannon.CANNON.Vec3, rotational: typingsJapgolly.cannon.CANNON.Vec3): Double = js.native
  
  /* CompleteClass */
  var rotational: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var spatial: typingsJapgolly.cannon.CANNON.Vec3 = js.native
}
