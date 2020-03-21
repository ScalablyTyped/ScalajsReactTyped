package typingsJapgolly.reactStickynode.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactStickynode.mod.Props
import typingsJapgolly.reactStickynode.mod.Status
import typingsJapgolly.reactStickynode.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactStickynode {
  def apply(
    activeClass: String = null,
    bottomBoundary: Double | String = null,
    enableTransforms: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    innerZ: Double | String = null,
    onStateChange: /* status */ Status => Callback = null,
    releasedClass: String = null,
    shouldFreeze: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    top: Double | String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Node | (js.Function1[/* status */ Status, Node]) = null
  ): UnmountedWithRoot[Props, ^, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (bottomBoundary != null) __obj.updateDynamic("bottomBoundary")(bottomBoundary.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransforms)) __obj.updateDynamic("enableTransforms")(enableTransforms.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (innerZ != null) __obj.updateDynamic("innerZ")(innerZ.asInstanceOf[js.Any])
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1((t0: /* status */ typingsJapgolly.reactStickynode.mod.Status) => onStateChange(t0).runNow()))
    if (releasedClass != null) __obj.updateDynamic("releasedClass")(releasedClass.asInstanceOf[js.Any])
    shouldFreeze.foreach(p => __obj.updateDynamic("shouldFreeze")(p.toJsFn))
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactStickynode.mod.Props, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactStickynode.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactStickynode.mod.Props])
  }
  @JSImport("react-stickynode", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

