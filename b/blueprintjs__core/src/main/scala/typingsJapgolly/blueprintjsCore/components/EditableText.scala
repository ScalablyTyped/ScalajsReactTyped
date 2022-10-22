package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsCore.libEsmComponentsEditableTextEditableTextMod.IEditableTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditableText {
  
  @JSImport("@blueprintjs/core", "EditableText")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsCore.mod.EditableText] {
    
    inline def alwaysRenderInput(value: Boolean): this.type = set("alwaysRenderInput", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def confirmOnEnterKey(value: Boolean): this.type = set("confirmOnEnterKey", value.asInstanceOf[js.Any])
    
    inline def contentId(value: String): this.type = set("contentId", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    inline def isEditing(value: Boolean): this.type = set("isEditing", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    inline def minLines(value: Double): this.type = set("minLines", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    inline def onCancel(value: /* value */ String => Callback): this.type = set("onCancel", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onChange(value: /* value */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onConfirm(value: /* value */ String => Callback): this.type = set("onConfirm", js.Any.fromFunction1((t0: /* value */ String) => value(t0).runNow()))
    
    inline def onEdit(value: /* value */ js.UndefOr[String] => Callback): this.type = set("onEdit", js.Any.fromFunction1((t0: /* value */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def selectAllOnFocus(value: Boolean): this.type = set("selectAllOnFocus", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: EditableText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IEditableTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
