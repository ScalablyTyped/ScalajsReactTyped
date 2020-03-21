package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactBootstrapTable.mod.BootstrapVersion
import typingsJapgolly.reactBootstrapTable.mod.InsertModalHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InsertModalHeader {
  def apply(
    beforeClose: /* e */ ReactEventFrom[Element] => Callback = null,
    className: String = null,
    hideClose: js.UndefOr[Boolean] = js.undefined,
    onModalClose: /* closeModal */ js.Function0[Unit] => Callback = null,
    title: String = null,
    version: BootstrapVersion = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    InsertModalHeaderProps, 
    typingsJapgolly.reactBootstrapTable.mod.InsertModalHeader, 
    Unit, 
    InsertModalHeaderProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => beforeClose(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(hideClose)) __obj.updateDynamic("hideClose")(hideClose.asInstanceOf[js.Any])
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(js.Any.fromFunction1((t0: /* closeModal */ js.Function0[scala.Unit]) => onModalClose(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTable.mod.InsertModalHeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTable.mod.InsertModalHeader](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.InsertModalHeaderProps])(children: _*)
  }
  @JSImport("react-bootstrap-table", "InsertModalHeader")
  @js.native
  object componentImport extends js.Object
  
}

