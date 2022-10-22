package typingsJapgolly.knockstrap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutNativeTemplateEngine * / any */ trait KnockstrapStringTemplateEngine extends StObject {
  
  def addTemplate(name: String, template: Any): Unit
  
  var allowTemplateRewriting: Boolean
  
  def getTemplate(name: String): Any
  
  def isTemplateExist(name: String): Boolean
  
  def makeTemplateSource(template: String): KnockstrapStringTemplate
  
  def removeTemplate(name: String): Unit
}
object KnockstrapStringTemplateEngine {
  
  inline def apply(
    addTemplate: (String, Any) => Callback,
    allowTemplateRewriting: Boolean,
    getTemplate: String => Any,
    isTemplateExist: String => Boolean,
    makeTemplateSource: String => KnockstrapStringTemplate,
    removeTemplate: String => Callback
  ): KnockstrapStringTemplateEngine = {
    val __obj = js.Dynamic.literal(addTemplate = js.Any.fromFunction2((t0: String, t1: Any) => (addTemplate(t0, t1)).runNow()), allowTemplateRewriting = allowTemplateRewriting.asInstanceOf[js.Any], getTemplate = js.Any.fromFunction1(getTemplate), isTemplateExist = js.Any.fromFunction1(isTemplateExist), makeTemplateSource = js.Any.fromFunction1(makeTemplateSource), removeTemplate = js.Any.fromFunction1((t0: String) => removeTemplate(t0).runNow()))
    __obj.asInstanceOf[KnockstrapStringTemplateEngine]
  }
  
  extension [Self <: KnockstrapStringTemplateEngine](x: Self) {
    
    inline def setAddTemplate(value: (String, Any) => Callback): Self = StObject.set(x, "addTemplate", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setAllowTemplateRewriting(value: Boolean): Self = StObject.set(x, "allowTemplateRewriting", value.asInstanceOf[js.Any])
    
    inline def setGetTemplate(value: String => Any): Self = StObject.set(x, "getTemplate", js.Any.fromFunction1(value))
    
    inline def setIsTemplateExist(value: String => Boolean): Self = StObject.set(x, "isTemplateExist", js.Any.fromFunction1(value))
    
    inline def setMakeTemplateSource(value: String => KnockstrapStringTemplate): Self = StObject.set(x, "makeTemplateSource", js.Any.fromFunction1(value))
    
    inline def setRemoveTemplate(value: String => Callback): Self = StObject.set(x, "removeTemplate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
