package typingsJapgolly.reactAsync.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAsync.AnonState
import typingsJapgolly.reactAsync.mod.AsyncState
import typingsJapgolly.reactAsync.mod.InitialChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IfInitial {
  def apply[T](
    state: AsyncState[T],
    persist: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: InitialChildren[T] = null
  ): UnmountedSimple[
    AnonState[T], 
    MountedWithRawType[AnonState[T], js.Object, RawMounted[AnonState[T], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactAsync.AnonState[T], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAsync.AnonState[T]])
  }
  @JSImport("react-async", "IfInitial")
  @js.native
  object componentImport extends js.Object
  
}

