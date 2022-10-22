package typingsJapgolly.monacoEditor.mod.languages

import typingsJapgolly.monacoEditor.mod.IMarkdownString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterInformation extends StObject {
  
  /**
    * The human-readable doc-comment of this signature. Will be shown
    * in the UI but can be omitted.
    */
  var documentation: js.UndefOr[String | IMarkdownString] = js.undefined
  
  /**
    * The label of this signature. Will be shown in
    * the UI.
    */
  var label: String | (js.Tuple2[Double, Double])
}
object ParameterInformation {
  
  inline def apply(label: String | (js.Tuple2[Double, Double])): ParameterInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterInformation]
  }
  
  extension [Self <: ParameterInformation](x: Self) {
    
    inline def setDocumentation(value: String | IMarkdownString): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setLabel(value: String | (js.Tuple2[Double, Double])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
