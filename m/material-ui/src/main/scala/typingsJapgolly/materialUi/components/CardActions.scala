package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.MaterialUI.Card.CardActionsProps
import typingsJapgolly.materialUi.cardActionsMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardActions {
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    expandable: js.UndefOr[Boolean] = js.undefined,
    showExpandableButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardActionsProps, default, Unit, CardActionsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (!js.isUndefined(showExpandableButton)) __obj.updateDynamic("showExpandableButton")(showExpandableButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.MaterialUI.Card.CardActionsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.cardActionsMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.MaterialUI.Card.CardActionsProps])(children: _*)
  }
  @JSImport("material-ui/Card/CardActions", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

