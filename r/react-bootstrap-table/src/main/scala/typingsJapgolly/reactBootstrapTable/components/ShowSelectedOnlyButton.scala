package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactBootstrapTable.mod.ShowSelectedButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ShowSelectedOnlyButton {
  def apply(
    btnContextual: String = null,
    btnGlyphicon: String = null,
    className: String = null,
    onClick: /* e */ ReactMouseEventFrom[Element] => Callback = null,
    showAllText: String = null,
    showOnlySelectText: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ShowSelectedButtonProps, 
    typingsJapgolly.reactBootstrapTable.mod.ShowSelectedOnlyButton, 
    Unit, 
    ShowSelectedButtonProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (btnGlyphicon != null) __obj.updateDynamic("btnGlyphicon")(btnGlyphicon.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.Element]) => onClick(t0).runNow()))
    if (showAllText != null) __obj.updateDynamic("showAllText")(showAllText.asInstanceOf[js.Any])
    if (showOnlySelectText != null) __obj.updateDynamic("showOnlySelectText")(showOnlySelectText.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTable.mod.ShowSelectedButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTable.mod.ShowSelectedOnlyButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.ShowSelectedButtonProps])(children: _*)
  }
  @JSImport("react-bootstrap-table", "ShowSelectedOnlyButton")
  @js.native
  object componentImport extends js.Object
  
}

