package typingsJapgolly.reactTabsRedux.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTabsRedux.tabContentMod.TabContentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabContent {
  def apply(
    `for`: String | Double,
    className: String = null,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    isVisible: js.UndefOr[Boolean] = js.undefined,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visibleClassName: String = null,
    visibleStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabContentProps, typingsJapgolly.reactTabsRedux.mod.TabContent, Unit, TabContentProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("for")(`for`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isVisible)) __obj.updateDynamic("isVisible")(isVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (visibleClassName != null) __obj.updateDynamic("visibleClassName")(visibleClassName.asInstanceOf[js.Any])
    if (visibleStyle != null) __obj.updateDynamic("visibleStyle")(visibleStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTabsRedux.tabContentMod.TabContentProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTabsRedux.mod.TabContent](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTabsRedux.tabContentMod.TabContentProps])(children: _*)
  }
  @JSImport("react-tabs-redux", "TabContent")
  @js.native
  object componentImport extends js.Object
  
}

