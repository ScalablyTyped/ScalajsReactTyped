package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Card.CardHeaderProps
import typingsJapgolly.materialUi.cardHeaderMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardHeader {
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    avatar: VdomNode = null,
    className: String = null,
    closeIcon: VdomNode = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    iconStyle: CSSProperties = null,
    openIcon: VdomNode = null,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    subtitle: VdomNode = null,
    subtitleColor: String = null,
    subtitleStyle: CSSProperties = null,
    textStyle: CSSProperties = null,
    title: VdomNode = null,
    titleColor: String = null,
    titleStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardHeaderProps, default, Unit, CardHeaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.asInstanceOf[js.Any])
    if (avatar != null) __obj.updateDynamic("avatar")(avatar.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeIcon != null) __obj.updateDynamic("closeIcon")(closeIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (openIcon != null) __obj.updateDynamic("openIcon")(openIcon.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.rawNode.asInstanceOf[js.Any])
    if (subtitleColor != null) __obj.updateDynamic("subtitleColor")(subtitleColor.asInstanceOf[js.Any])
    if (subtitleStyle != null) __obj.updateDynamic("subtitleStyle")(subtitleStyle.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Card.CardHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.cardHeaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Card.CardHeaderProps])(children: _*)
  }
  @JSImport("material-ui/Card/CardHeader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

