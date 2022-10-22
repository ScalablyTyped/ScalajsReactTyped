package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBroadPhase extends StObject {
  
  /**
    * Create a proxy with an initial AABB. Pairs are not reported until UpdatePairs is called.
    * @param aabb Proxy Fat AABB.
    * @param userData User defined data.
    * @return Proxy created from aabb and userData.
    **/
  def CreateProxy(aabb: b2AABB, userData: Any): b2DynamicTreeNode
  
  /**
    * Destroy a proxy. It is up to the client to remove any pairs.
    * @param proxy Proxy to destroy.
    **/
  def DestroyProxy(proxy: b2DynamicTreeNode): Unit
  
  /**
    * Get the Fat AABB for a proxy.
    * @param proxy Proxy to retrieve the Fat AABB.
    **/
  def GetFatAABB(proxy: b2DynamicTreeNode): b2AABB
  
  /**
    * Get the number of proxies.
    * @return Number of proxies.
    **/
  def GetProxyCount(): Double
  
  /**
    * Get user data from a proxy. Returns null if the proxy is invalid.
    * @param proxy Proxy to retrieve user data from.
    * @return Gets the user data from proxy, or null if the proxy is invalid.
    **/
  def GetUserData(proxy: b2DynamicTreeNode): Any
  
  /**
    * Call MoveProxy as many times as you like, then when you are done call UpdatePairs to finalized the proxy pairs (for your time step).
    * @param proxy Proxy to move.
    * @param aabb Swept AABB.
    * @param displacement Extra AABB displacement.
    **/
  def MoveProxy(proxy: b2DynamicTreeNode, aabb: b2AABB, displacement: b2Vec2): Unit
  
  /**
    * Query an AABB for overlapping proxies. The callback is called for each proxy that overlaps the supplied AABB. The callback should match function signature fuction callback(proxy:b2DynamicTreeNode):Boolean and should return false to trigger premature termination.
    * @param callback Called for each proxy that overlaps the supplied AABB.
    *    param proxy Proxy overlapping the supplied AABB.
    * @param aabb Proxies are query for overlap on this AABB.
    **/
  def Query(callback: js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], aabb: b2AABB): Unit
  
  /**
    * Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
    * @param callback Called for each proxy that is hit by the ray.
    *    param input Ray cast input data.
    *    param proxy The proxy hit by the ray cast.
    *    param return Return value is the new value for maxFraction.
    * @param input Ray cast input data.  Query all proxies along this ray cast.
    **/
  def RayCast(
    callback: js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double],
    input: b2RayCastInput
  ): Unit
  
  /**
    * Perform some iterations to re-balance the tree.
    * @param iterations Number of rebalance iterations to perform.
    **/
  def Rebalance(iterations: Double): Unit
}
object IBroadPhase {
  
  inline def apply(
    CreateProxy: (b2AABB, Any) => b2DynamicTreeNode,
    DestroyProxy: b2DynamicTreeNode => Callback,
    GetFatAABB: b2DynamicTreeNode => b2AABB,
    GetProxyCount: CallbackTo[Double],
    GetUserData: b2DynamicTreeNode => Any,
    MoveProxy: (b2DynamicTreeNode, b2AABB, b2Vec2) => Callback,
    Query: (js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], b2AABB) => Callback,
    RayCast: (js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], b2RayCastInput) => Callback,
    Rebalance: Double => Callback
  ): IBroadPhase = {
    val __obj = js.Dynamic.literal(CreateProxy = js.Any.fromFunction2(CreateProxy), DestroyProxy = js.Any.fromFunction1((t0: b2DynamicTreeNode) => DestroyProxy(t0).runNow()), GetFatAABB = js.Any.fromFunction1(GetFatAABB), GetProxyCount = GetProxyCount.toJsFn, GetUserData = js.Any.fromFunction1(GetUserData), MoveProxy = js.Any.fromFunction3((t0: b2DynamicTreeNode, t1: b2AABB, t2: b2Vec2) => (MoveProxy(t0, t1, t2)).runNow()), Query = js.Any.fromFunction2((t0: js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], t1: b2AABB) => (Query(t0, t1)).runNow()), RayCast = js.Any.fromFunction2((t0: js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], t1: b2RayCastInput) => (RayCast(t0, t1)).runNow()), Rebalance = js.Any.fromFunction1((t0: Double) => Rebalance(t0).runNow()))
    __obj.asInstanceOf[IBroadPhase]
  }
  
  extension [Self <: IBroadPhase](x: Self) {
    
    inline def setCreateProxy(value: (b2AABB, Any) => b2DynamicTreeNode): Self = StObject.set(x, "CreateProxy", js.Any.fromFunction2(value))
    
    inline def setDestroyProxy(value: b2DynamicTreeNode => Callback): Self = StObject.set(x, "DestroyProxy", js.Any.fromFunction1((t0: b2DynamicTreeNode) => value(t0).runNow()))
    
    inline def setGetFatAABB(value: b2DynamicTreeNode => b2AABB): Self = StObject.set(x, "GetFatAABB", js.Any.fromFunction1(value))
    
    inline def setGetProxyCount(value: CallbackTo[Double]): Self = StObject.set(x, "GetProxyCount", value.toJsFn)
    
    inline def setGetUserData(value: b2DynamicTreeNode => Any): Self = StObject.set(x, "GetUserData", js.Any.fromFunction1(value))
    
    inline def setMoveProxy(value: (b2DynamicTreeNode, b2AABB, b2Vec2) => Callback): Self = StObject.set(x, "MoveProxy", js.Any.fromFunction3((t0: b2DynamicTreeNode, t1: b2AABB, t2: b2Vec2) => (value(t0, t1, t2)).runNow()))
    
    inline def setQuery(value: (js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], b2AABB) => Callback): Self = StObject.set(x, "Query", js.Any.fromFunction2((t0: js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], t1: b2AABB) => (value(t0, t1)).runNow()))
    
    inline def setRayCast(
      value: (js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], b2RayCastInput) => Callback
    ): Self = StObject.set(x, "RayCast", js.Any.fromFunction2((t0: js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], t1: b2RayCastInput) => (value(t0, t1)).runNow()))
    
    inline def setRebalance(value: Double => Callback): Self = StObject.set(x, "Rebalance", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
