package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonEventSyntheticEvent
import typingsJapgolly.gestalt.mod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    image: VdomNode = null,
    onMouseEnter: /* args */ AnonEventSyntheticEvent => Callback = null,
    onMouseLeave: /* args */ AnonEventSyntheticEvent => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardProps, typingsJapgolly.gestalt.mod.Card, Unit, CardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.rawNode.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseEnter(t0).runNow()))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonEventSyntheticEvent) => onMouseLeave(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.CardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Card](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.CardProps])(children: _*)
  }
  @JSImport("gestalt", "Card")
  @js.native
  object componentImport extends js.Object
  
}

