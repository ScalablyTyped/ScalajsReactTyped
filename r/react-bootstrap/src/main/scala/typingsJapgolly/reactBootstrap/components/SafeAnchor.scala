package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.ReactType
import typingsJapgolly.reactBootstrap.safeAnchorMod.SafeAnchorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SafeAnchor {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.safeAnchorMod.SafeAnchor] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.safeAnchorMod.SafeAnchor] = null,
    componentClass: ReactType[_] = null,
    onClick: ReactMouseEventFrom[js.Object with Element] => Callback = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SafeAnchorProps, typingsJapgolly.reactBootstrap.mod.SafeAnchor, Unit, SafeAnchorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[js.Object with org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.safeAnchorMod.SafeAnchorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.SafeAnchor](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.safeAnchorMod.SafeAnchorProps])(children: _*)
  }
  @JSImport("react-bootstrap", "SafeAnchor")
  @js.native
  object componentImport extends js.Object
  
}

