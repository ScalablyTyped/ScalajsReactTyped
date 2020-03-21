package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrap.mod.Sizes
import typingsJapgolly.reactBootstrap.popoverMod.PopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popover {
  def apply(
    arrowOffsetLeft: Double | String = null,
    arrowOffsetTop: Double | String = null,
    bsClass: String = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    placement: String = null,
    positionLeft: Double | String = null,
    positionTop: Double | String = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverProps, typingsJapgolly.reactBootstrap.mod.Popover, Unit, PopoverProps] = {
    val __obj = js.Dynamic.literal()
  
      if (arrowOffsetLeft != null) __obj.updateDynamic("arrowOffsetLeft")(arrowOffsetLeft.asInstanceOf[js.Any])
    if (arrowOffsetTop != null) __obj.updateDynamic("arrowOffsetTop")(arrowOffsetTop.asInstanceOf[js.Any])
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (positionLeft != null) __obj.updateDynamic("positionLeft")(positionLeft.asInstanceOf[js.Any])
    if (positionTop != null) __obj.updateDynamic("positionTop")(positionTop.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.popoverMod.PopoverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.Popover](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.popoverMod.PopoverProps])(children: _*)
  }
  @JSImport("react-bootstrap", "Popover")
  @js.native
  object componentImport extends js.Object
  
}

