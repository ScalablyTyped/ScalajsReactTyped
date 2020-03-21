package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactBootstrapTable.mod.InsertModalFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InsertModalFooter {
  def apply(
    beforeClose: /* e */ ReactEventFrom[Element] => Callback = null,
    beforeSave: /* e */ ReactEventFrom[Element] => Callback = null,
    className: String = null,
    closeBtnClass: String = null,
    closeBtnContextual: String = null,
    closeBtnText: String = null,
    onModalClose: /* closeModal */ js.Function0[Unit] => Callback = null,
    onSave: /* save */ js.Function0[Unit] => Callback = null,
    saveBtnClass: String = null,
    saveBtnContextual: String = null,
    saveBtnText: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    InsertModalFooterProps, 
    typingsJapgolly.reactBootstrapTable.mod.InsertModalFooter, 
    Unit, 
    InsertModalFooterProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (beforeClose != null) __obj.updateDynamic("beforeClose")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => beforeClose(t0).runNow()))
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.Element]) => beforeSave(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeBtnClass != null) __obj.updateDynamic("closeBtnClass")(closeBtnClass.asInstanceOf[js.Any])
    if (closeBtnContextual != null) __obj.updateDynamic("closeBtnContextual")(closeBtnContextual.asInstanceOf[js.Any])
    if (closeBtnText != null) __obj.updateDynamic("closeBtnText")(closeBtnText.asInstanceOf[js.Any])
    if (onModalClose != null) __obj.updateDynamic("onModalClose")(js.Any.fromFunction1((t0: /* closeModal */ js.Function0[scala.Unit]) => onModalClose(t0).runNow()))
    if (onSave != null) __obj.updateDynamic("onSave")(js.Any.fromFunction1((t0: /* save */ js.Function0[scala.Unit]) => onSave(t0).runNow()))
    if (saveBtnClass != null) __obj.updateDynamic("saveBtnClass")(saveBtnClass.asInstanceOf[js.Any])
    if (saveBtnContextual != null) __obj.updateDynamic("saveBtnContextual")(saveBtnContextual.asInstanceOf[js.Any])
    if (saveBtnText != null) __obj.updateDynamic("saveBtnText")(saveBtnText.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactBootstrapTable.mod.InsertModalFooterProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactBootstrapTable.mod.InsertModalFooter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactBootstrapTable.mod.InsertModalFooterProps])(children: _*)
  }
  @JSImport("react-bootstrap-table", "InsertModalFooter")
  @js.native
  object componentImport extends js.Object
  
}

