package typingsJapgolly.jsoneditorForReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jsoneditorForReact.mod.ReactJsonEditorProps
import typingsJapgolly.jsoneditorForReact.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object JsoneditorForReact {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ReactJsonEditorProps, default, Unit, ReactJsonEditorProps] = {
    val __obj = js.Dynamic.literal()
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.jsoneditorForReact.mod.ReactJsonEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.jsoneditorForReact.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.jsoneditorForReact.mod.ReactJsonEditorProps])(children: _*)
  }
  @JSImport("jsoneditor-for-react", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

