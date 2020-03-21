package typingsJapgolly.reactScrollableAnchor.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactScrollableAnchor.mod.ScrollableAnchorProps
import typingsJapgolly.reactScrollableAnchor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactScrollableAnchor {
  def apply(
    id: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollableAnchorProps, default, Unit, ScrollableAnchorProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScrollableAnchor.mod.ScrollableAnchorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactScrollableAnchor.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScrollableAnchor.mod.ScrollableAnchorProps])(children: _*)
  }
  @JSImport("react-scrollable-anchor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

