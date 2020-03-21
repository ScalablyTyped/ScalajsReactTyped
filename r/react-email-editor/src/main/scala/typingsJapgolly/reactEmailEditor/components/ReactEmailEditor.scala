package typingsJapgolly.reactEmailEditor.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactEmailEditor.mod.AppearanceConfig
import typingsJapgolly.reactEmailEditor.mod.EmailEditorProps
import typingsJapgolly.reactEmailEditor.mod.ToolsConfig
import typingsJapgolly.reactEmailEditor.mod.UnlayerOptions
import typingsJapgolly.reactEmailEditor.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEmailEditor {
  def apply(
    appearance: AppearanceConfig = null,
    minHeight: Int | Double = null,
    onLoad: js.UndefOr[Callback] = js.undefined,
    options: UnlayerOptions = null,
    projectId: Int | Double = null,
    style: CSSProperties = null,
    tools: ToolsConfig = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[EmailEditorProps, default, Unit, EmailEditorProps] = {
    val __obj = js.Dynamic.literal()
  
      if (appearance != null) __obj.updateDynamic("appearance")(appearance.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    onLoad.foreach(p => __obj.updateDynamic("onLoad")(p.toJsFn))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEmailEditor.mod.EmailEditorProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEmailEditor.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEmailEditor.mod.EmailEditorProps])(children: _*)
  }
  @JSImport("react-email-editor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

