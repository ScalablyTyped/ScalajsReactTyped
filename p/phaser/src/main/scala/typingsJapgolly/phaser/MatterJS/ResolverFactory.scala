package typingsJapgolly.phaser.MatterJS

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolverFactory extends StObject {
  
  /**
    * Apply position resolution.
    * @method postSolvePosition
    * @param {body[]} bodies
    */
  def postSolvePosition(bodies: js.Array[BodyType]): Unit
  
  /**
    * Prepare pairs for position solving.
    * @method preSolvePosition
    * @param {pair[]} pairs
    */
  def preSolvePosition(pairs: js.Array[IPair]): Unit
  
  /**
    * Prepare pairs for velocity solving.
    * @method preSolveVelocity
    * @param {pair[]} pairs
    */
  def preSolveVelocity(pairs: js.Array[IPair]): Unit
  
  /**
    * Find a solution for pair positions.
    * @method solvePosition
    * @param {pair[]} pairs
    * @param {body[]} bodies
    * @param {number} timeScale
    */
  def solvePosition(pairs: js.Array[IPair], bodies: js.Array[BodyType], timeScale: Double): Unit
  
  /**
    * Find a solution for pair velocities.
    * @method solveVelocity
    * @param {pair[]} pairs
    * @param {number} timeScale
    */
  def solveVelocity(pairs: js.Array[IPair], timeScale: Double): Unit
}
object ResolverFactory {
  
  inline def apply(
    postSolvePosition: js.Array[BodyType] => Callback,
    preSolvePosition: js.Array[IPair] => Callback,
    preSolveVelocity: js.Array[IPair] => Callback,
    solvePosition: (js.Array[IPair], js.Array[BodyType], Double) => Callback,
    solveVelocity: (js.Array[IPair], Double) => Callback
  ): ResolverFactory = {
    val __obj = js.Dynamic.literal(postSolvePosition = js.Any.fromFunction1((t0: js.Array[BodyType]) => postSolvePosition(t0).runNow()), preSolvePosition = js.Any.fromFunction1((t0: js.Array[IPair]) => preSolvePosition(t0).runNow()), preSolveVelocity = js.Any.fromFunction1((t0: js.Array[IPair]) => preSolveVelocity(t0).runNow()), solvePosition = js.Any.fromFunction3((t0: js.Array[IPair], t1: js.Array[BodyType], t2: Double) => (solvePosition(t0, t1, t2)).runNow()), solveVelocity = js.Any.fromFunction2((t0: js.Array[IPair], t1: Double) => (solveVelocity(t0, t1)).runNow()))
    __obj.asInstanceOf[ResolverFactory]
  }
  
  extension [Self <: ResolverFactory](x: Self) {
    
    inline def setPostSolvePosition(value: js.Array[BodyType] => Callback): Self = StObject.set(x, "postSolvePosition", js.Any.fromFunction1((t0: js.Array[BodyType]) => value(t0).runNow()))
    
    inline def setPreSolvePosition(value: js.Array[IPair] => Callback): Self = StObject.set(x, "preSolvePosition", js.Any.fromFunction1((t0: js.Array[IPair]) => value(t0).runNow()))
    
    inline def setPreSolveVelocity(value: js.Array[IPair] => Callback): Self = StObject.set(x, "preSolveVelocity", js.Any.fromFunction1((t0: js.Array[IPair]) => value(t0).runNow()))
    
    inline def setSolvePosition(value: (js.Array[IPair], js.Array[BodyType], Double) => Callback): Self = StObject.set(x, "solvePosition", js.Any.fromFunction3((t0: js.Array[IPair], t1: js.Array[BodyType], t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setSolveVelocity(value: (js.Array[IPair], Double) => Callback): Self = StObject.set(x, "solveVelocity", js.Any.fromFunction2((t0: js.Array[IPair], t1: Double) => (value(t0, t1)).runNow()))
  }
}
