package typingsJapgolly.vscodeLanguageserverTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueText
  - typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueVariableLookup
  - typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression
*/
trait InlineValue extends StObject
object InlineValue {
  
  inline def InlineValueEvaluatableExpression(range: Range): typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueEvaluatableExpression]
  }
  
  inline def InlineValueText(range: Range, text: String): typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueText = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueText]
  }
  
  inline def InlineValueVariableLookup(caseSensitiveLookup: Boolean, range: Range): typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueVariableLookup = {
    val __obj = js.Dynamic.literal(caseSensitiveLookup = caseSensitiveLookup.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vscodeLanguageserverTypes.mod.InlineValueVariableLookup]
  }
}
