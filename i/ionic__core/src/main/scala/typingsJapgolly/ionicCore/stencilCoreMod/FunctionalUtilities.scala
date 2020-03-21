package typingsJapgolly.ionicCore.stencilCoreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionalUtilities extends js.Object {
  def forEach(
    children: js.Array[VNode],
    cb: js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]
  ): Unit
  def map(
    children: js.Array[VNode],
    cb: js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]
  ): js.Array[VNode]
}

object FunctionalUtilities {
  @scala.inline
  def apply(
    forEach: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], Unit]) => Callback,
    map: (js.Array[VNode], js.Function3[/* vnode */ ChildNode, /* index */ Double, /* array */ js.Array[ChildNode], ChildNode]) => CallbackTo[js.Array[VNode]]
  ): FunctionalUtilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forEach")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.ionicCore.stencilCoreMod.VNode], t1: js.Function3[
  /* vnode */ typingsJapgolly.ionicCore.stencilCoreMod.ChildNode, 
  /* index */ scala.Double, 
  /* array */ js.Array[typingsJapgolly.ionicCore.stencilCoreMod.ChildNode], 
  scala.Unit]) => forEach(t0, t1).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.ionicCore.stencilCoreMod.VNode], t1: js.Function3[
  /* vnode */ typingsJapgolly.ionicCore.stencilCoreMod.ChildNode, 
  /* index */ scala.Double, 
  /* array */ js.Array[typingsJapgolly.ionicCore.stencilCoreMod.ChildNode], 
  typingsJapgolly.ionicCore.stencilCoreMod.ChildNode]) => map(t0, t1).runNow()))
    __obj.asInstanceOf[FunctionalUtilities]
  }
}

