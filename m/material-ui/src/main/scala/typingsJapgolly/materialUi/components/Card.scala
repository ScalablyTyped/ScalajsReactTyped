package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Card.CardProps
import typingsJapgolly.materialUi.cardMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    containerStyle: CSSProperties = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    initiallyExpanded: js.UndefOr[Boolean] = js.undefined,
    onExpandChange: /* isExpanded */ Boolean => Callback = null,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardProps, default, Unit, CardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (!js.isUndefined(initiallyExpanded)) __obj.updateDynamic("initiallyExpanded")(initiallyExpanded.asInstanceOf[js.Any])
    if (onExpandChange != null) __obj.updateDynamic("onExpandChange")(js.Any.fromFunction1((t0: /* isExpanded */ scala.Boolean) => onExpandChange(t0).runNow()))
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Card.CardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.cardMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Card.CardProps])(children: _*)
  }
  @JSImport("material-ui/Card", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

