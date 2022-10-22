package typingsJapgolly.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Ray")
@js.native
open class Ray ()
  extends StObject
     with typingsJapgolly.cannon.CANNON.Ray {
  def this(from: typingsJapgolly.cannon.CANNON.Vec3) = this()
  def this(from: Unit, to: typingsJapgolly.cannon.CANNON.Vec3) = this()
  def this(from: typingsJapgolly.cannon.CANNON.Vec3, to: typingsJapgolly.cannon.CANNON.Vec3) = this()
  
  /* CompleteClass */
  var checkCollisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var from: typingsJapgolly.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  override def getAABB(result: typingsJapgolly.cannon.CANNON.RaycastResult): Unit = js.native
  
  /* CompleteClass */
  var precision: Double = js.native
  
  /* CompleteClass */
  var to: typingsJapgolly.cannon.CANNON.Vec3 = js.native
}
