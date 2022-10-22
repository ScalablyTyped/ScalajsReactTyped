package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2ManifoldPoint extends StObject {
  
  /**
    * Resets this manifold point.
    **/
  def Reset(): Unit
  
  /**
    * Sets this manifold point from a manifold point.
    * @param m The manifold point to copy values from.
    **/
  def Set(m: b2ManifoldPoint): Unit
  
  /**
    * Contact ID.
    **/
  var m_id: b2ContactID
  
  /**
    * Local contact point.
    **/
  var m_localpoint: b2Vec2
  
  /**
    * Normal impluse for this contact point.
    **/
  var m_normalImpulse: Double
  
  /**
    * Tangent impulse for contact point.
    **/
  var m_tangentImpulse: Double
}
object b2ManifoldPoint {
  
  inline def apply(
    Reset: Callback,
    Set: b2ManifoldPoint => Callback,
    m_id: b2ContactID,
    m_localpoint: b2Vec2,
    m_normalImpulse: Double,
    m_tangentImpulse: Double
  ): b2ManifoldPoint = {
    val __obj = js.Dynamic.literal(Reset = Reset.toJsFn, Set = js.Any.fromFunction1((t0: b2ManifoldPoint) => Set(t0).runNow()), m_id = m_id.asInstanceOf[js.Any], m_localpoint = m_localpoint.asInstanceOf[js.Any], m_normalImpulse = m_normalImpulse.asInstanceOf[js.Any], m_tangentImpulse = m_tangentImpulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ManifoldPoint]
  }
  
  extension [Self <: b2ManifoldPoint](x: Self) {
    
    inline def setM_id(value: b2ContactID): Self = StObject.set(x, "m_id", value.asInstanceOf[js.Any])
    
    inline def setM_localpoint(value: b2Vec2): Self = StObject.set(x, "m_localpoint", value.asInstanceOf[js.Any])
    
    inline def setM_normalImpulse(value: Double): Self = StObject.set(x, "m_normalImpulse", value.asInstanceOf[js.Any])
    
    inline def setM_tangentImpulse(value: Double): Self = StObject.set(x, "m_tangentImpulse", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setSet(value: b2ManifoldPoint => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction1((t0: b2ManifoldPoint) => value(t0).runNow()))
  }
}
