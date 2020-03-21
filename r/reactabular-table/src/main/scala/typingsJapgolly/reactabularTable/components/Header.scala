package typingsJapgolly.reactabularTable.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactabularTable.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.mod.Column
import typingsJapgolly.reactabularTable.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    className: String = null,
    headerRows: js.Array[Column] = null,
    style: PartialCSSStyleDeclaratio = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[HeaderProps, typingsJapgolly.reactabularTable.mod.Header, Unit, HeaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactabularTable.mod.HeaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactabularTable.mod.Header](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactabularTable.mod.HeaderProps])(children: _*)
  }
  @JSImport("reactabular-table", "Header")
  @js.native
  object componentImport extends js.Object
  
}

