package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AjaxFileKnockout {
  
  trait IFileInputWrapper extends StObject {
    
    def fileSelected(): Boolean
    
    def getElement(): HTMLInputElement
  }
  object IFileInputWrapper {
    
    inline def apply(fileSelected: CallbackTo[Boolean], getElement: CallbackTo[HTMLInputElement]): IFileInputWrapper = {
      val __obj = js.Dynamic.literal(fileSelected = fileSelected.toJsFn, getElement = getElement.toJsFn)
      __obj.asInstanceOf[IFileInputWrapper]
    }
    
    extension [Self <: IFileInputWrapper](x: Self) {
      
      inline def setFileSelected(value: CallbackTo[Boolean]): Self = StObject.set(x, "fileSelected", value.toJsFn)
      
      inline def setGetElement(value: CallbackTo[HTMLInputElement]): Self = StObject.set(x, "getElement", value.toJsFn)
    }
  }
}
