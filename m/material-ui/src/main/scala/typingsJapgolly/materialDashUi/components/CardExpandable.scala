package typingsJapgolly.materialDashUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialDashUi.__MaterialUI.Card.CardExpandableProps
import typingsJapgolly.materialDashUi.cardCardExpandableMod.default
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CardExpandable {
  def apply(
    expanded: js.UndefOr[Boolean] = js.undefined,
    onExpanding: /* isExpanded */ Boolean => Callback = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardExpandableProps, default, Unit, CardExpandableProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (onExpanding != null) __obj.updateDynamic("onExpanding")(js.Any.fromFunction1((t0: /* isExpanded */ scala.Boolean) => onExpanding(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialDashUi.__MaterialUI.Card.CardExpandableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialDashUi.cardCardExpandableMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialDashUi.__MaterialUI.Card.CardExpandableProps])(children: _*)
  }
  @JSImport("material-ui/Card/CardExpandable", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

