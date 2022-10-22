package typingsJapgolly.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.SAT")
@js.native
open class SAT ()
  extends typingsJapgolly.matterJs.mod.SAT
/* static members */
object SAT {
  
  @JSGlobal("Matter.SAT")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @deprecated replaced by Collision.collides
    * @method collides
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @param {Collision} previousCollision
    * @returns {Collision} collision
    */
  inline def collides(bodyA: typingsJapgolly.matterJs.mod.Body, bodyB: typingsJapgolly.matterJs.mod.Body): typingsJapgolly.matterJs.mod.Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.Collision]
  inline def collides(
    bodyA: typingsJapgolly.matterJs.mod.Body,
    bodyB: typingsJapgolly.matterJs.mod.Body,
    previousCollision: typingsJapgolly.matterJs.mod.Collision
  ): typingsJapgolly.matterJs.mod.Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], previousCollision.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.Collision]
}
