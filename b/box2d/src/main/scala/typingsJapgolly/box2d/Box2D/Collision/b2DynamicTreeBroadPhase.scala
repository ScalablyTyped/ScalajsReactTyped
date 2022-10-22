package typingsJapgolly.box2d.Box2D.Collision

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2DynamicTreeBroadPhase
  extends StObject
     with IBroadPhase {
  
  /**
    * Tests if two proxies overlap.
    * @param proxyA First proxy to test.
    * @param proxyB Second proxy to test.
    * @return True if the proxyA and proxyB overlap with Fat AABBs, otherwise false.
    **/
  def TestOverlap(proxyA: b2DynamicTreeNode, proxyB: b2DynamicTreeNode): Boolean
  
  /**
    * Update the pairs. This results in pair callbacks. This can only add pairs.
    * @param callback Called for all new proxy pairs.
    *    param userDataA Proxy A in the pair user data.
    *    param userDataB Proxy B in the pair user data.
    **/
  def UpdatePairs(callback: js.Function2[/* userDataA */ Any, /* userDataB */ Any, Unit]): Unit
  
  /**
    * Validates the dynamic tree.
    * NOTE: this says "todo" in the current Box2DFlash code.
    **/
  def Validate(): Unit
}
object b2DynamicTreeBroadPhase {
  
  inline def apply(
    CreateProxy: (b2AABB, Any) => b2DynamicTreeNode,
    DestroyProxy: b2DynamicTreeNode => Callback,
    GetFatAABB: b2DynamicTreeNode => b2AABB,
    GetProxyCount: CallbackTo[Double],
    GetUserData: b2DynamicTreeNode => Any,
    MoveProxy: (b2DynamicTreeNode, b2AABB, b2Vec2) => Callback,
    Query: (js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], b2AABB) => Callback,
    RayCast: (js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], b2RayCastInput) => Callback,
    Rebalance: Double => Callback,
    TestOverlap: (b2DynamicTreeNode, b2DynamicTreeNode) => Boolean,
    UpdatePairs: js.Function2[/* userDataA */ Any, /* userDataB */ Any, Unit] => Callback,
    Validate: Callback
  ): b2DynamicTreeBroadPhase = {
    val __obj = js.Dynamic.literal(CreateProxy = js.Any.fromFunction2(CreateProxy), DestroyProxy = js.Any.fromFunction1((t0: b2DynamicTreeNode) => DestroyProxy(t0).runNow()), GetFatAABB = js.Any.fromFunction1(GetFatAABB), GetProxyCount = GetProxyCount.toJsFn, GetUserData = js.Any.fromFunction1(GetUserData), MoveProxy = js.Any.fromFunction3((t0: b2DynamicTreeNode, t1: b2AABB, t2: b2Vec2) => (MoveProxy(t0, t1, t2)).runNow()), Query = js.Any.fromFunction2((t0: js.Function1[/* proxy */ b2DynamicTreeNode, Boolean], t1: b2AABB) => (Query(t0, t1)).runNow()), RayCast = js.Any.fromFunction2((t0: js.Function2[/* input */ b2RayCastInput, /* proxy */ b2DynamicTreeNode, Double], t1: b2RayCastInput) => (RayCast(t0, t1)).runNow()), Rebalance = js.Any.fromFunction1((t0: Double) => Rebalance(t0).runNow()), TestOverlap = js.Any.fromFunction2(TestOverlap), UpdatePairs = js.Any.fromFunction1((t0: js.Function2[/* userDataA */ Any, /* userDataB */ Any, Unit]) => UpdatePairs(t0).runNow()), Validate = Validate.toJsFn)
    __obj.asInstanceOf[b2DynamicTreeBroadPhase]
  }
  
  extension [Self <: b2DynamicTreeBroadPhase](x: Self) {
    
    inline def setTestOverlap(value: (b2DynamicTreeNode, b2DynamicTreeNode) => Boolean): Self = StObject.set(x, "TestOverlap", js.Any.fromFunction2(value))
    
    inline def setUpdatePairs(value: js.Function2[/* userDataA */ Any, /* userDataB */ Any, Unit] => Callback): Self = StObject.set(x, "UpdatePairs", js.Any.fromFunction1((t0: js.Function2[/* userDataA */ Any, /* userDataB */ Any, Unit]) => value(t0).runNow()))
    
    inline def setValidate(value: Callback): Self = StObject.set(x, "Validate", value.toJsFn)
  }
}
