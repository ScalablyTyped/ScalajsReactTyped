package typingsJapgolly.reactNativeZssRichTextEditor.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichTextEditorProps extends StObject {
  
  var contentInset: ContentInset
  
  // Text that will be used as a placeholder when no text is present in the content section.
  var contentPlaceholder: String
  
  // Any custom CSS styles that you want to inject to the editor.
  var customCSS: RichTextStyles
  
  // A function that will be called when the editor has been initialized.
  var editorInitializedCallback: FunctionWithZeroArgs
  
  var enableOnChange: Boolean
  
  var footerHeight: Double
  
  // Hide title
  var hiddenTitle: Boolean
  
  // HTML that will be rendered in the content section on load.
  var initialContentHTML: String
  
  // HTML that will be rendered in the title section as soon as the component loads.
  var initialTitleHTML: String
  
  // Text that will be used as a placeholder when no text is present in the title section.
  var titlePlaceholder: String
}
object RichTextEditorProps {
  
  inline def apply(
    contentInset: ContentInset,
    contentPlaceholder: String,
    customCSS: RichTextStyles,
    editorInitializedCallback: Callback,
    enableOnChange: Boolean,
    footerHeight: Double,
    hiddenTitle: Boolean,
    initialContentHTML: String,
    initialTitleHTML: String,
    titlePlaceholder: String
  ): RichTextEditorProps = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentPlaceholder = contentPlaceholder.asInstanceOf[js.Any], customCSS = customCSS.asInstanceOf[js.Any], editorInitializedCallback = editorInitializedCallback.toJsFn, enableOnChange = enableOnChange.asInstanceOf[js.Any], footerHeight = footerHeight.asInstanceOf[js.Any], hiddenTitle = hiddenTitle.asInstanceOf[js.Any], initialContentHTML = initialContentHTML.asInstanceOf[js.Any], initialTitleHTML = initialTitleHTML.asInstanceOf[js.Any], titlePlaceholder = titlePlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[RichTextEditorProps]
  }
  
  extension [Self <: RichTextEditorProps](x: Self) {
    
    inline def setContentInset(value: ContentInset): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
    
    inline def setContentPlaceholder(value: String): Self = StObject.set(x, "contentPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setCustomCSS(value: RichTextStyles): Self = StObject.set(x, "customCSS", value.asInstanceOf[js.Any])
    
    inline def setEditorInitializedCallback(value: Callback): Self = StObject.set(x, "editorInitializedCallback", value.toJsFn)
    
    inline def setEnableOnChange(value: Boolean): Self = StObject.set(x, "enableOnChange", value.asInstanceOf[js.Any])
    
    inline def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
    
    inline def setHiddenTitle(value: Boolean): Self = StObject.set(x, "hiddenTitle", value.asInstanceOf[js.Any])
    
    inline def setInitialContentHTML(value: String): Self = StObject.set(x, "initialContentHTML", value.asInstanceOf[js.Any])
    
    inline def setInitialTitleHTML(value: String): Self = StObject.set(x, "initialTitleHTML", value.asInstanceOf[js.Any])
    
    inline def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
  }
}
