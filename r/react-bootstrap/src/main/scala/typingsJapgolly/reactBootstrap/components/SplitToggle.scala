package typingsJapgolly.reactBootstrap.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.splitToggleMod.SplitToggleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SplitToggle {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[typingsJapgolly.reactBootstrap.dropdownToggleMod.DropdownToggle] = null,
    ClassAttributes: ClassAttributes[typingsJapgolly.reactBootstrap.dropdownToggleMod.DropdownToggle] = null,
    bsClass: String = null,
    bsRole: String = null,
    bsSize: String = null,
    bsStyle: String = null,
    noCaret: js.UndefOr[Boolean] = js.undefined,
    useAnchor: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SplitToggleProps, 
    typingsJapgolly.reactBootstrap.mod.SplitToggle, 
    Unit, 
    SplitToggleProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass.asInstanceOf[js.Any])
    if (bsRole != null) __obj.updateDynamic("bsRole")(bsRole.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(noCaret)) __obj.updateDynamic("noCaret")(noCaret.asInstanceOf[js.Any])
    if (!js.isUndefined(useAnchor)) __obj.updateDynamic("useAnchor")(useAnchor.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrap.splitToggleMod.SplitToggleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrap.mod.SplitToggle](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrap.splitToggleMod.SplitToggleProps])(children: _*)
  }
  @JSImport("react-bootstrap", "SplitToggle")
  @js.native
  object componentImport extends js.Object
  
}

