package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignPro.AnonCollapseText
import typingsJapgolly.antDesignPro.tagSelectMod.TagSelectProps
import typingsJapgolly.antDesignPro.tagSelectMod.default
import typingsJapgolly.antDesignPro.tagSelectOptionMod.TagSelectOptionProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagSelect {
  def apply(
    Option: TagSelectOptionProps,
    className: String,
    actionsText: AnonCollapseText = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    hideCheckAll: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ js.Array[String] => Callback = null,
    style: CSSProperties = null,
    value: js.Array[Double | String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Element | js.Array[Element]
  ): UnmountedWithRoot[TagSelectProps, default, Unit, TagSelectProps] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], Option = Option.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
  
      if (actionsText != null) __obj.updateDynamic("actionsText")(actionsText.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(hideCheckAll)) __obj.updateDynamic("hideCheckAll")(hideCheckAll.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Array[java.lang.String]) => onChange(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignPro.tagSelectMod.TagSelectProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antDesignPro.tagSelectMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignPro.tagSelectMod.TagSelectProps])
  }
  @JSImport("ant-design-pro/lib/TagSelect", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

