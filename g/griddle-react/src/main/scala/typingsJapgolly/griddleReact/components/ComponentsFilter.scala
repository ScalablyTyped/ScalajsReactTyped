package typingsJapgolly.griddleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.griddleReact.mod.GriddleFilter
import typingsJapgolly.griddleReact.mod.components.Filter
import typingsJapgolly.griddleReact.mod.components.FilterProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ComponentsFilter {
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    className: String = null,
    placeholder: String = null,
    setFilter: /* filter */ GriddleFilter => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[FilterProps, Filter, Unit, FilterProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (setFilter != null) __obj.updateDynamic("setFilter")(js.Any.fromFunction1((t0: /* filter */ typingsJapgolly.griddleReact.mod.GriddleFilter) => setFilter(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.griddleReact.mod.components.FilterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.griddleReact.mod.components.Filter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.griddleReact.mod.components.FilterProps])(children: _*)
  }
  @JSImport("griddle-react", "components.Filter")
  @js.native
  object componentImport extends js.Object
  
}

