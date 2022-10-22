package typingsJapgolly.reactNativeZssRichTextEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeZssRichTextEditor.anon.PartialRichTextEditorProp
import typingsJapgolly.reactNativeZssRichTextEditor.mod.ContentInset
import typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RichTextEditor {
  
  @JSImport("react-native-zss-rich-text-editor", "RichTextEditor")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeZssRichTextEditor.mod.RichTextEditor] {
    
    inline def contentInset(value: ContentInset): this.type = set("contentInset", value.asInstanceOf[js.Any])
    
    inline def contentPlaceholder(value: String): this.type = set("contentPlaceholder", value.asInstanceOf[js.Any])
    
    inline def customCSS(value: RichTextStyles): this.type = set("customCSS", value.asInstanceOf[js.Any])
    
    inline def editorInitializedCallback(value: Callback): this.type = set("editorInitializedCallback", value.toJsFn)
    
    inline def enableOnChange(value: Boolean): this.type = set("enableOnChange", value.asInstanceOf[js.Any])
    
    inline def footerHeight(value: Double): this.type = set("footerHeight", value.asInstanceOf[js.Any])
    
    inline def hiddenTitle(value: Boolean): this.type = set("hiddenTitle", value.asInstanceOf[js.Any])
    
    inline def initialContentHTML(value: String): this.type = set("initialContentHTML", value.asInstanceOf[js.Any])
    
    inline def initialTitleHTML(value: String): this.type = set("initialTitleHTML", value.asInstanceOf[js.Any])
    
    inline def titlePlaceholder(value: String): this.type = set("titlePlaceholder", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: RichTextEditor.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PartialRichTextEditorProp): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
