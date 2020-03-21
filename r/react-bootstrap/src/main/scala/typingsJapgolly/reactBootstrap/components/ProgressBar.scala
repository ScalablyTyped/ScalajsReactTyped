package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.progressBarMod.ProgressBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressBar {
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    interpolatedClass: js.Any = null,
    label: VdomNode = null,
    max: Int | Double = null,
    min: Int | Double = null,
    now: Int | Double = null,
    srOnly: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProgressBarProps, 
    typingsJapgolly.reactBootstrap.mod.ProgressBar, 
    Unit, 
    ProgressBarProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (interpolatedClass != null) __obj.updateDynamic("interpolatedClass")(interpolatedClass.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(srOnly)) __obj.updateDynamic("srOnly")(srOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.progressBarMod.ProgressBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.ProgressBar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.progressBarMod.ProgressBarProps])(children: _*)
  }
  @JSImport("react-bootstrap", "ProgressBar")
  @js.native
  object componentImport extends js.Object
  
}

