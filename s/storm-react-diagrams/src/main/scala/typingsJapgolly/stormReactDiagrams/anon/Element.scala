package typingsJapgolly.stormReactDiagrams.anon

import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: org.scalajs.dom.Element
  
  var model: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]
}
object Element {
  
  inline def apply(
    element: org.scalajs.dom.Element,
    model: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]
  ): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setModel(value: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
