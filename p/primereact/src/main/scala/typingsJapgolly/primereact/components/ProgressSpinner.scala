package typingsJapgolly.primereact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.progressSpinnerMod.ProgressSpinnerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ProgressSpinner {
  def apply(
    animationDuration: String = null,
    className: String = null,
    fill: String = null,
    id: String = null,
    strokeWidth: String = null,
    style: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ProgressSpinnerProps, 
    typingsJapgolly.primereact.primereactProgressspinnerMod.ProgressSpinner, 
    Unit, 
    ProgressSpinnerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.progressSpinnerMod.ProgressSpinnerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactProgressspinnerMod.ProgressSpinner](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.progressSpinnerMod.ProgressSpinnerProps])(children: _*)
  }
  @JSImport("primereact/progressspinner", "ProgressSpinner")
  @js.native
  object componentImport extends js.Object
  
}

