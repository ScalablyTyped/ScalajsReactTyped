package typingsJapgolly.blueprintjsTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsTable.contextMenuTargetWrapperMod.IContextMenuTargetWrapper
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextMenuTargetWrapper {
  def apply(
    style: CSSProperties,
    renderContextMenu: ReactMouseEventFrom[HTMLElement] => CallbackTo[Element],
    className: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IContextMenuTargetWrapper, 
    typingsJapgolly.blueprintjsTable.contextMenuTargetWrapperMod.ContextMenuTargetWrapper, 
    Unit, 
    IContextMenuTargetWrapper
  ] = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderContextMenu")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => renderContextMenu(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTable.contextMenuTargetWrapperMod.IContextMenuTargetWrapper, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTable.contextMenuTargetWrapperMod.ContextMenuTargetWrapper](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTable.contextMenuTargetWrapperMod.IContextMenuTargetWrapper])(children: _*)
  }
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  object componentImport extends js.Object
  
}

