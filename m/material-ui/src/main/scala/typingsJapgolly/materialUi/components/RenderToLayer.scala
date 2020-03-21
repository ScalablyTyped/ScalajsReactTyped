package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.materialUi.renderToLayerMod.RenderToLayerProps
import typingsJapgolly.materialUi.renderToLayerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RenderToLayer {
  def apply(
    open: Boolean,
    render: js.Function,
    componentClickAway: js.Function = null,
    useLayerForClickAway: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RenderToLayerProps, default, Unit, RenderToLayerProps] = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
  
      if (componentClickAway != null) __obj.updateDynamic("componentClickAway")(componentClickAway.asInstanceOf[js.Any])
    if (!js.isUndefined(useLayerForClickAway)) __obj.updateDynamic("useLayerForClickAway")(useLayerForClickAway.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.materialUi.renderToLayerMod.RenderToLayerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.materialUi.renderToLayerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.materialUi.renderToLayerMod.RenderToLayerProps])(children: _*)
  }
  @JSImport("material-ui/internal/RenderToLayer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

