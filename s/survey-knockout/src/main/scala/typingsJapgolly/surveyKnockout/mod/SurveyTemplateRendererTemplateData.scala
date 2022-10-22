package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurveyTemplateRendererTemplateData extends StObject {
  
  def afterRender(el: Any, context: Any): Unit
  
  var data: Any
  
  var name: String
  
  var nodes: js.UndefOr[Any] = js.undefined
}
object SurveyTemplateRendererTemplateData {
  
  inline def apply(afterRender: (Any, Any) => Callback, data: Any, name: String): SurveyTemplateRendererTemplateData = {
    val __obj = js.Dynamic.literal(afterRender = js.Any.fromFunction2((t0: Any, t1: Any) => (afterRender(t0, t1)).runNow()), data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SurveyTemplateRendererTemplateData]
  }
  
  extension [Self <: SurveyTemplateRendererTemplateData](x: Self) {
    
    inline def setAfterRender(value: (Any, Any) => Callback): Self = StObject.set(x, "afterRender", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNodes(value: Any): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
  }
}
