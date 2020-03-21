package typingsJapgolly.reactAsync.components

import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactAsync.AnonChildrenPersistState
import typingsJapgolly.reactAsync.mod.AsyncState
import typingsJapgolly.reactAsync.mod.RejectedChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IfRejected {
  def apply[T](
    state: AsyncState[T],
    persist: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: RejectedChildren[T] = null
  ): UnmountedSimple[
    AnonChildrenPersistState[T], 
    MountedWithRawType[
      AnonChildrenPersistState[T], 
      js.Object, 
      RawMounted[AnonChildrenPersistState[T], js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.reactAsync.AnonChildrenPersistState[T], 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAsync.AnonChildrenPersistState[T]])
  }
  @JSImport("react-async", "IfRejected")
  @js.native
  object componentImport extends js.Object
  
}

