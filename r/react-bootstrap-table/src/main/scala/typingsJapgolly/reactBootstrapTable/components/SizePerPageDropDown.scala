package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactBootstrapTable.AnonText
import typingsJapgolly.reactBootstrapTable.mod.DropDirection
import typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SizePerPageDropDown {
  def apply(
    btnContextual: String = null,
    className: String = null,
    currSizePerPage: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    onClick: /* toggleDropDown */ js.Function0[Unit] => Callback = null,
    open: js.UndefOr[Boolean] = js.undefined,
    options: js.Array[AnonText | Double] = null,
    variation: DropDirection = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    SizePerPageDropDownProps, 
    typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDown, 
    Unit, 
    SizePerPageDropDownProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (currSizePerPage != null) __obj.updateDynamic("currSizePerPage")(currSizePerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* toggleDropDown */ js.Function0[scala.Unit]) => onClick(t0).runNow()))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (variation != null) __obj.updateDynamic("variation")(variation.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDown](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.SizePerPageDropDownProps])(children: _*)
  }
  @JSImport("react-bootstrap-table", "SizePerPageDropDown")
  @js.native
  object componentImport extends js.Object
  
}

