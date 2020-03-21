package typingsJapgolly.reactAsync.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAsync.AnonChildrenInitial
import typingsJapgolly.reactAsync.mod.AsyncState
import typingsJapgolly.reactAsync.mod.PendingChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_AnonChildrenInitial560219466 () {
  val componentImport: js.Any
  def apply[T](
    state: AsyncState[T],
    initial: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: PendingChildren[T] = null
  ): UnmountedSimple[
    AnonChildrenInitial[T], 
    MountedWithRawType[AnonChildrenInitial[T], js.Object, RawMounted[AnonChildrenInitial[T], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initial)) __obj.updateDynamic("initial")(initial.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactAsync.AnonChildrenInitial[T], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAsync.AnonChildrenInitial[T]])
  }
}

