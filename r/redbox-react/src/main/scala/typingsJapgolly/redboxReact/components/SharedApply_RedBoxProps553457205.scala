package typingsJapgolly.redboxReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.redboxReact.mod.RedBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_RedBoxProps553457205[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    error: js.Error,
    className: String = null,
    editorScheme: String = null,
    filename: String = null,
    style: CSSProperties = null,
    useColumns: js.UndefOr[Boolean] = js.undefined,
    useLines: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RedBoxProps, ComponentRef, Unit, RedBoxProps] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (editorScheme != null) __obj.updateDynamic("editorScheme")(editorScheme.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useColumns)) __obj.updateDynamic("useColumns")(useColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(useLines)) __obj.updateDynamic("useLines")(useLines.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.redboxReact.mod.RedBoxProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.redboxReact.mod.RedBoxProps])(children: _*)
  }
}

