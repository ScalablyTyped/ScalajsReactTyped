package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Card.CardMediaProps
import typingsJapgolly.materialDashUi.cardCardMediaMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardMedia {
  def apply(
    actAsExpander: js.UndefOr[Boolean] = js.undefined,
    expandable: js.UndefOr[Boolean] = js.undefined,
    mediaStyle: CSSProperties = null,
    overlay: VdomNode = null,
    overlayContainerStyle: CSSProperties = null,
    overlayContentStyle: CSSProperties = null,
    overlayStyle: CSSProperties = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardMediaProps, default, Unit, CardMediaProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(actAsExpander)) __obj.updateDynamic("actAsExpander")(actAsExpander.asInstanceOf[js.Any])
    if (!js.isUndefined(expandable)) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (mediaStyle != null) __obj.updateDynamic("mediaStyle")(mediaStyle.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.rawNode.asInstanceOf[js.Any])
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (overlayContentStyle != null) __obj.updateDynamic("overlayContentStyle")(overlayContentStyle.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Card.CardMediaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.cardCardMediaMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Card.CardMediaProps])(children: _*)
  }
  @JSImport("material-ui/Card/CardMedia", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

