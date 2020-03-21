package typingsJapgolly.rrc.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rrc.mod.ScrollIntoViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScrollIntoView {
  def apply(
    id: String,
    alignToTop: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollIntoViewProps, typingsJapgolly.rrc.mod.ScrollIntoView, Unit, ScrollIntoViewProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rrc.mod.ScrollIntoViewProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rrc.mod.ScrollIntoView](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rrc.mod.ScrollIntoViewProps])(children: _*)
  }
  @JSImport("rrc", "ScrollIntoView")
  @js.native
  object componentImport extends js.Object
  
}

