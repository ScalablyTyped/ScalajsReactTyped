package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonZIndex
import typingsJapgolly.gestalt.mod.StickyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sticky {
  def apply(
    bottom: Double | String = null,
    dangerouslySetZIndex: AnonZIndex = null,
    left: Double | String = null,
    right: Double | String = null,
    top: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[StickyProps, typingsJapgolly.gestalt.mod.Sticky, Unit, StickyProps] = {
    val __obj = js.Dynamic.literal()
  
      if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (dangerouslySetZIndex != null) __obj.updateDynamic("dangerouslySetZIndex")(dangerouslySetZIndex.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.StickyProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Sticky](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.StickyProps])(children: _*)
  }
  @JSImport("gestalt", "Sticky")
  @js.native
  object componentImport extends js.Object
  
}

