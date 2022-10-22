package typingsJapgolly.phaser.global.MatterJS

import typingsJapgolly.phaser.MatterJS.BodyType
import typingsJapgolly.phaser.MatterJS.ICollisionData
import typingsJapgolly.phaser.MatterJS.IPair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `Matter.Pair` module contains methods for creating and manipulating collision pairs.
  *
  * @class Pair
  */
@JSGlobal("MatterJS.Pair")
@js.native
open class Pair ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.Pair
object Pair {
  
  @JSGlobal("MatterJS.Pair")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a pair.
    * @method create
    * @param {ICollisionData} collision
    * @param {number} timestamp
    * @return {IPair} A new pair
    */
  /* static member */
  inline def create(collision: ICollisionData, timestamp: Double): IPair = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(collision.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[IPair]
  
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @return {string} Unique pairId
    */
  /* static member */
  inline def id(bodyA: BodyType, bodyB: BodyType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("id")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {IPair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  /* static member */
  inline def setActive(pair: IPair, isActive: Boolean, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActive")(pair.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {IPair} pair
    * @param {ICollisionData} collision
    * @param {number} timestamp
    */
  /* static member */
  inline def update(pair: IPair, collision: ICollisionData, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(pair.asInstanceOf[js.Any], collision.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
