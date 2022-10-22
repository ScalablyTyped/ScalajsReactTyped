package typingsJapgolly.phaser.matterMod

import typingsJapgolly.phaser.MatterJS.BodyType
import typingsJapgolly.phaser.MatterJS.ICollisionData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.SAT` module contains methods for detecting collisions using the Separating Axis Theorem.
  *
  * @class SAT
  */
@JSImport("matter", "SAT")
@js.native
open class SAT ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.SAT
object SAT {
  
  @JSImport("matter", "SAT")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detect collision between two bodies using the Separating Axis Theorem.
    * @method collides
    * @param {body} bodyA
    * @param {body} bodyB
    * @param {ICollisionData} previousCollision
    * @return {ICollisionData} collision
    */
  /* static member */
  inline def collides(bodyA: BodyType, bodyB: BodyType, previousCollision: ICollisionData): ICollisionData = (^.asInstanceOf[js.Dynamic].applyDynamic("collides")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any], previousCollision.asInstanceOf[js.Any])).asInstanceOf[ICollisionData]
}
