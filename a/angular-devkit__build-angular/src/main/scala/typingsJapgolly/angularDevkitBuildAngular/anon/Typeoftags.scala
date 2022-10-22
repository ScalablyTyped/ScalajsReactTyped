package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.angularDevkitCore.srcUtilsLiteralsMod.TemplateTag
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoftags extends StObject {
  
  def indentBy(indentations: Double): TemplateTag[String]
  
  def oneLine(strings: TemplateStringsArray, values: Any*): String
  
  def stripIndent(strings: TemplateStringsArray, values: Any*): String
  
  def stripIndents(strings: TemplateStringsArray, values: Any*): String
  
  def trimNewlines(strings: TemplateStringsArray, values: Any*): String
}
object Typeoftags {
  
  inline def apply(
    indentBy: Double => TemplateTag[String],
    oneLine: (TemplateStringsArray, /* repeated */ Any) => String,
    stripIndent: (TemplateStringsArray, /* repeated */ Any) => String,
    stripIndents: (TemplateStringsArray, /* repeated */ Any) => String,
    trimNewlines: (TemplateStringsArray, /* repeated */ Any) => String
  ): Typeoftags = {
    val __obj = js.Dynamic.literal(indentBy = js.Any.fromFunction1(indentBy), oneLine = js.Any.fromFunction2(oneLine), stripIndent = js.Any.fromFunction2(stripIndent), stripIndents = js.Any.fromFunction2(stripIndents), trimNewlines = js.Any.fromFunction2(trimNewlines))
    __obj.asInstanceOf[Typeoftags]
  }
  
  extension [Self <: Typeoftags](x: Self) {
    
    inline def setIndentBy(value: Double => TemplateTag[String]): Self = StObject.set(x, "indentBy", js.Any.fromFunction1(value))
    
    inline def setOneLine(value: (TemplateStringsArray, /* repeated */ Any) => String): Self = StObject.set(x, "oneLine", js.Any.fromFunction2(value))
    
    inline def setStripIndent(value: (TemplateStringsArray, /* repeated */ Any) => String): Self = StObject.set(x, "stripIndent", js.Any.fromFunction2(value))
    
    inline def setStripIndents(value: (TemplateStringsArray, /* repeated */ Any) => String): Self = StObject.set(x, "stripIndents", js.Any.fromFunction2(value))
    
    inline def setTrimNewlines(value: (TemplateStringsArray, /* repeated */ Any) => String): Self = StObject.set(x, "trimNewlines", js.Any.fromFunction2(value))
  }
}
