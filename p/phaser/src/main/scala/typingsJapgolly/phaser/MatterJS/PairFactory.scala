package typingsJapgolly.phaser.MatterJS

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PairFactory extends StObject {
  
  /**
    * Creates a pair.
    * @method create
    * @param {ICollisionData} collision
    * @param {number} timestamp
    * @return {IPair} A new pair
    */
  def create(collision: ICollisionData, timestamp: Double): IPair
  
  /**
    * Get the id for the given pair.
    * @method id
    * @param {Body} bodyA
    * @param {Body} bodyB
    * @return {string} Unique pairId
    */
  def id(bodyA: BodyType, bodyB: BodyType): String
  
  /**
    * Set a pair as active or inactive.
    * @method setActive
    * @param {IPair} pair
    * @param {boolean} isActive
    * @param {number} timestamp
    */
  def setActive(pair: IPair, isActive: Boolean, timestamp: Double): Unit
  
  /**
    * Updates a pair given a collision.
    * @method update
    * @param {IPair} pair
    * @param {ICollisionData} collision
    * @param {number} timestamp
    */
  def update(pair: IPair, collision: ICollisionData, timestamp: Double): Unit
}
object PairFactory {
  
  inline def apply(
    create: (ICollisionData, Double) => IPair,
    id: (BodyType, BodyType) => String,
    setActive: (IPair, Boolean, Double) => Callback,
    update: (IPair, ICollisionData, Double) => Callback
  ): PairFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), id = js.Any.fromFunction2(id), setActive = js.Any.fromFunction3((t0: IPair, t1: Boolean, t2: Double) => (setActive(t0, t1, t2)).runNow()), update = js.Any.fromFunction3((t0: IPair, t1: ICollisionData, t2: Double) => (update(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[PairFactory]
  }
  
  extension [Self <: PairFactory](x: Self) {
    
    inline def setCreate(value: (ICollisionData, Double) => IPair): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
    
    inline def setId(value: (BodyType, BodyType) => String): Self = StObject.set(x, "id", js.Any.fromFunction2(value))
    
    inline def setSetActive(value: (IPair, Boolean, Double) => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction3((t0: IPair, t1: Boolean, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdate(value: (IPair, ICollisionData, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: IPair, t1: ICollisionData, t2: Double) => (value(t0, t1, t2)).runNow()))
  }
}
