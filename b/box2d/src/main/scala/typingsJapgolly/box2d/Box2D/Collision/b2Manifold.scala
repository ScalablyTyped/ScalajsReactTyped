package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2Manifold extends StObject {
  
  /**
    * Copies the manifold.
    * @return Copy of this manifold.
    **/
  def Copy(): b2Manifold
  
  /**
    * Resets this manifold.
    **/
  def Reset(): Unit
  
  /**
    * Sets this manifold from another manifold.
    * @param m Manifold to copy values from.
    **/
  def Set(m: b2Manifold): Unit
  
  /**
    * Not used for Type e_points
    **/
  var m_localPlaneNormal: b2Vec2
  
  /**
    * Usage depends on manifold type
    **/
  var m_localPoint: b2Vec2
  
  /**
    * The number of manifold points
    **/
  var m_pointCount: Double
  
  /**
    * The points of contact
    **/
  var m_points: js.Array[b2ManifoldPoint]
  
  /**
    * Manifold type.
    **/
  var m_type: Double
}
object b2Manifold {
  
  inline def apply(
    Copy: CallbackTo[b2Manifold],
    Reset: Callback,
    Set: b2Manifold => Callback,
    m_localPlaneNormal: b2Vec2,
    m_localPoint: b2Vec2,
    m_pointCount: Double,
    m_points: js.Array[b2ManifoldPoint],
    m_type: Double
  ): b2Manifold = {
    val __obj = js.Dynamic.literal(Copy = Copy.toJsFn, Reset = Reset.toJsFn, Set = js.Any.fromFunction1((t0: b2Manifold) => Set(t0).runNow()), m_localPlaneNormal = m_localPlaneNormal.asInstanceOf[js.Any], m_localPoint = m_localPoint.asInstanceOf[js.Any], m_pointCount = m_pointCount.asInstanceOf[js.Any], m_points = m_points.asInstanceOf[js.Any], m_type = m_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Manifold]
  }
  
  extension [Self <: b2Manifold](x: Self) {
    
    inline def setCopy(value: CallbackTo[b2Manifold]): Self = StObject.set(x, "Copy", value.toJsFn)
    
    inline def setM_localPlaneNormal(value: b2Vec2): Self = StObject.set(x, "m_localPlaneNormal", value.asInstanceOf[js.Any])
    
    inline def setM_localPoint(value: b2Vec2): Self = StObject.set(x, "m_localPoint", value.asInstanceOf[js.Any])
    
    inline def setM_pointCount(value: Double): Self = StObject.set(x, "m_pointCount", value.asInstanceOf[js.Any])
    
    inline def setM_points(value: js.Array[b2ManifoldPoint]): Self = StObject.set(x, "m_points", value.asInstanceOf[js.Any])
    
    inline def setM_pointsVarargs(value: b2ManifoldPoint*): Self = StObject.set(x, "m_points", js.Array(value*))
    
    inline def setM_type(value: Double): Self = StObject.set(x, "m_type", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setSet(value: b2Manifold => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction1((t0: b2Manifold) => value(t0).runNow()))
  }
}
