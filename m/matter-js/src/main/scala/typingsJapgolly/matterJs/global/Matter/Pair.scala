package typingsJapgolly.matterJs.global.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Matter.Pair")
@js.native
open class Pair ()
  extends typingsJapgolly.matterJs.mod.Pair
/* static members */
object Pair {
  
  @JSGlobal("Matter.Pair")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a pair.
    * @method create
    * @param {Collision} collision
    * @param {number} timestamp
    * @returns {Pair} A new pair
    */
  inline def create(collision: typingsJapgolly.matterJs.mod.Collision, timestamp: Double): typingsJapgolly.matterJs.mod.Pair = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(collision.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.matterJs.mod.Pair]
  
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @returns {string} Unique pairId
    */
  inline def id(bodyA: typingsJapgolly.matterJs.mod.Body, bodyB: typingsJapgolly.matterJs.mod.Body): String = (^.asInstanceOf[js.Dynamic].applyDynamic("id")(bodyA.asInstanceOf[js.Any], bodyB.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {Pair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  inline def setActive(pair: typingsJapgolly.matterJs.mod.Pair, isActive: Boolean, timestamp: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setActive")(pair.asInstanceOf[js.Any], isActive.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {Pair} pair
    * @param {Collision} collision
    * @param {number} timestamp
    */
  inline def update(
    pair: typingsJapgolly.matterJs.mod.Pair,
    collision: typingsJapgolly.matterJs.mod.Collision,
    timestamp: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(pair.asInstanceOf[js.Any], collision.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
