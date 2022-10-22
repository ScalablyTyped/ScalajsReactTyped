package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Collision.Shapes.b2Shape
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DistanceProxy extends StObject {
  
  /**
    * Get the supporting vertex index in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex index.
    **/
  def GetSupport(d: b2Vec2): Double
  
  /**
    * Get the supporting vertex in the given direction.
    * @param d Direction to look for the supporting vertex.
    * @return Supporting vertex.
    **/
  def GetSupportVertex(d: b2Vec2): b2Vec2
  
  /**
    * Get a vertex by index.  Used by b2Distance.
    * @param index Vetex's index.
    * @return Vertex at the given index.
    **/
  def GetVertex(index: Double): b2Vec2
  
  /**
    * Get the vertex count.
    * @return The number of vertices. (m_vertices.length)
    **/
  def GetVertexCount(): Double
  
  /**
    * Initialize the proxy using the given shape. The shape must remain in scope while the proxy is in use.
    * @param shape Shape to initialize the distance proxy.
    **/
  def Set(shape: b2Shape): Unit
  
  /**
    * Count
    **/
  var m_count: Double
  
  /**
    * Radius
    **/
  var m_radius: Double
  
  /**
    * Verticies
    **/
  var m_vertices: js.Array[b2Vec2]
}
object b2DistanceProxy {
  
  inline def apply(
    GetSupport: b2Vec2 => Double,
    GetSupportVertex: b2Vec2 => b2Vec2,
    GetVertex: Double => b2Vec2,
    GetVertexCount: CallbackTo[Double],
    Set: b2Shape => Callback,
    m_count: Double,
    m_radius: Double,
    m_vertices: js.Array[b2Vec2]
  ): b2DistanceProxy = {
    val __obj = js.Dynamic.literal(GetSupport = js.Any.fromFunction1(GetSupport), GetSupportVertex = js.Any.fromFunction1(GetSupportVertex), GetVertex = js.Any.fromFunction1(GetVertex), GetVertexCount = GetVertexCount.toJsFn, Set = js.Any.fromFunction1((t0: b2Shape) => Set(t0).runNow()), m_count = m_count.asInstanceOf[js.Any], m_radius = m_radius.asInstanceOf[js.Any], m_vertices = m_vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2DistanceProxy]
  }
  
  extension [Self <: b2DistanceProxy](x: Self) {
    
    inline def setGetSupport(value: b2Vec2 => Double): Self = StObject.set(x, "GetSupport", js.Any.fromFunction1(value))
    
    inline def setGetSupportVertex(value: b2Vec2 => b2Vec2): Self = StObject.set(x, "GetSupportVertex", js.Any.fromFunction1(value))
    
    inline def setGetVertex(value: Double => b2Vec2): Self = StObject.set(x, "GetVertex", js.Any.fromFunction1(value))
    
    inline def setGetVertexCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetVertexCount", value.toJsFn)
    
    inline def setM_count(value: Double): Self = StObject.set(x, "m_count", value.asInstanceOf[js.Any])
    
    inline def setM_radius(value: Double): Self = StObject.set(x, "m_radius", value.asInstanceOf[js.Any])
    
    inline def setM_vertices(value: js.Array[b2Vec2]): Self = StObject.set(x, "m_vertices", value.asInstanceOf[js.Any])
    
    inline def setM_verticesVarargs(value: b2Vec2*): Self = StObject.set(x, "m_vertices", js.Array(value*))
    
    inline def setSet(value: b2Shape => Callback): Self = StObject.set(x, "Set", js.Any.fromFunction1((t0: b2Shape) => value(t0).runNow()))
  }
}
