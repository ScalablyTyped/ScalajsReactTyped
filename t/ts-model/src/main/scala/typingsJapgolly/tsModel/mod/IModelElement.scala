package typingsJapgolly.tsModel.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IModelElement extends StObject {
  
  def modelClass(): String
}
object IModelElement {
  
  inline def apply(modelClass: CallbackTo[String]): IModelElement = {
    val __obj = js.Dynamic.literal(modelClass = modelClass.toJsFn)
    __obj.asInstanceOf[IModelElement]
  }
  
  extension [Self <: IModelElement](x: Self) {
    
    inline def setModelClass(value: CallbackTo[String]): Self = StObject.set(x, "modelClass", value.toJsFn)
  }
}
