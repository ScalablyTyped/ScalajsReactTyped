package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBroadPhase extends js.Object {
  /**
  		* Create a proxy with an initial AABB. Pairs are not reported until UpdatePairs is called.
  		* @param aabb Proxy Fat AABB.
  		* @param userData User defined data.
  		* @return Proxy created from aabb and userData.
  		**/
  def CreateProxy(aabb: b2AABB, userData: js.Any): b2DynamicTreeNode
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
  def GetUserData(proxy: b2DynamicTreeNode): js.Any
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
  		*	param proxy Proxy overlapping the supplied AABB.
  		* @param aabb Proxies are query for overlap on this AABB.
  		**/
  def Query(callback: js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], aabb: b2AABB): Unit
  /**
  		* Ray-cast against the proxies in the tree. This relies on the callback to perform a exact ray-cast in the case were the proxy contains a shape. The callback also performs the any collision filtering. This has performance roughly equal to k log(n), where k is the number of collisions and n is the number of proxies in the tree.
  		* @param callback Called for each proxy that is hit by the ray.
  		*	param input Ray cast input data.
  		*	param proxy The proxy hit by the ray cast.
  		*	param return Return value is the new value for maxFraction.
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
  @scala.inline
  def apply(
    CreateProxy: (b2AABB, js.Any) => CallbackTo[b2DynamicTreeNode],
    DestroyProxy: b2DynamicTreeNode => Callback,
    GetFatAABB: b2DynamicTreeNode => CallbackTo[b2AABB],
    GetProxyCount: CallbackTo[Double],
    GetUserData: b2DynamicTreeNode => CallbackTo[js.Any],
    MoveProxy: (b2DynamicTreeNode, b2AABB, b2Vec2) => Callback,
    Query: (js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], b2AABB) => Callback,
    RayCast: (js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], b2RayCastInput) => Callback,
    Rebalance: Double => Callback
  ): IBroadPhase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CreateProxy")(js.Any.fromFunction2((t0: typingsJapgolly.box2d.Box2D.Collision.b2AABB, t1: js.Any) => CreateProxy(t0, t1).runNow()))
    __obj.updateDynamic("DestroyProxy")(js.Any.fromFunction1((t0: typingsJapgolly.box2d.Box2D.Collision.b2DynamicTreeNode) => DestroyProxy(t0).runNow()))
    __obj.updateDynamic("GetFatAABB")(js.Any.fromFunction1((t0: typingsJapgolly.box2d.Box2D.Collision.b2DynamicTreeNode) => GetFatAABB(t0).runNow()))
    __obj.updateDynamic("GetProxyCount")(GetProxyCount.toJsFn)
    __obj.updateDynamic("GetUserData")(js.Any.fromFunction1((t0: typingsJapgolly.box2d.Box2D.Collision.b2DynamicTreeNode) => GetUserData(t0).runNow()))
    __obj.updateDynamic("MoveProxy")(js.Any.fromFunction3((t0: typingsJapgolly.box2d.Box2D.Collision.b2DynamicTreeNode, t1: typingsJapgolly.box2d.Box2D.Collision.b2AABB, t2: typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2) => MoveProxy(t0, t1, t2).runNow()))
    __obj.updateDynamic("Query")(js.Any.fromFunction2((t0: js.Function1[/* proxy */ typingsJapgolly.box2d.Box2D.Collision.b2DynamicTreeNode, scala.Boolean], t1: typingsJapgolly.box2d.Box2D.Collision.b2AABB) => Query(t0, t1).runNow()))
    __obj.updateDynamic("RayCast")(js.Any.fromFunction2((t0: js.Function2[
  /* input */ typingsJapgolly.box2d.Box2D.Collision.b2RayCastInput, 
  /* proxy */ typingsJapgolly.box2d.Box2D.Collision.b2DynamicTreeNode, 
  scala.Double], t1: typingsJapgolly.box2d.Box2D.Collision.b2RayCastInput) => RayCast(t0, t1).runNow()))
    __obj.updateDynamic("Rebalance")(js.Any.fromFunction1((t0: scala.Double) => Rebalance(t0).runNow()))
    __obj.asInstanceOf[IBroadPhase]
  }
}

