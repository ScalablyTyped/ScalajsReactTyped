package typingsJapgolly.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Collision")
@js.native
open class Collision ()
  extends typingsJapgolly.matterJs.mod.Collision
/* static members */
object Collision {
  
  @JSGlobal("Matter.Collision")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detect collision between two bodies.
    * @method collides
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @param {pairs} [Pairs] Optionally reuse collision records from existing pairs.
    * @returns {collision|null} A collision record if detected, otherwise null
    */
  inline def collides(
    bodyA: typingsJapgolly.matterJs.mod.Body,
    bodyB: typingsJapgolly.matterJs.mod.Body,
    pairs: typingsJapgolly.matterJs.mod.Pairs
  ): typingsJapgolly.matterJs.mod.Collision | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], pairs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.Collision | Null]
  
  /**
    * Creates a new collision record.
    * @method create
    * @param {Body} bodyA The first body part represented by the collision record
    * @param {Body} bodyB The second body part represented by the collision record
    * @returns {Collision} A new collision record
    */
  inline def create(bodyA: typingsJapgolly.matterJs.mod.Body, bodyB: typingsJapgolly.matterJs.mod.Body): typingsJapgolly.matterJs.mod.Collision = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.Collision]
}
