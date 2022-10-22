package typingsJapgolly.jqueryAjaxfile.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import typingsJapgolly.jqueryAjaxfile.KnockoutBindingContext
import typingsJapgolly.jqueryAjaxfile.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTemplate extends StObject {
  
  def addTemplate(templateName: String, templateMarkup: String): Unit
  
  def createJavaScriptEvaluatorBlock(script: String): String
  
  def renderTemplateSource(templateSource: Object, bindingContext: KnockoutBindingContext, options: Object): js.Array[Node]
}
object AddTemplate {
  
  inline def apply(
    addTemplate: (String, String) => Callback,
    createJavaScriptEvaluatorBlock: String => String,
    renderTemplateSource: (Object, KnockoutBindingContext, Object) => js.Array[Node]
  ): AddTemplate = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2((t0: String, t1: String) => (addTemplate(t0, t1)).runNow()), createJavaScriptEvaluatorBlock = js.Any.fromFunction1(createJavaScriptEvaluatorBlock), renderTemplateSource = js.Any.fromFunction3(renderTemplateSource))
    __obj.asInstanceOf[AddTemplate]
  }
  
  extension [Self <: AddTemplate](x: Self) {
    
    inline def setAddTemplate(value: (String, String) => Callback): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setCreateJavaScriptEvaluatorBlock(value: String => String): Self = StObject.set(x, "createJavaScriptEvaluatorBlock", js.Any.fromFunction1(value))
    
    inline def setRenderTemplateSource(value: (Object, KnockoutBindingContext, Object) => js.Array[Node]): Self = StObject.set(x, "renderTemplateSource", js.Any.fromFunction3(value))
  }
}
