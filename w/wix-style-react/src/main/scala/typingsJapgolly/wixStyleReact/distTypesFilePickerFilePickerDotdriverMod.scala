package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFilePickerFilePickerDotdriverMod {
  
  trait FilePickerDriver
    extends StObject
       with BaseDriver {
    
    def errorMessage(): String
    
    def getMainLabel(): String
    
    def getName(): String
    
    def getSubLabel(): String
    
    def hasError(): Boolean
  }
  object FilePickerDriver {
    
    inline def apply(
      errorMessage: CallbackTo[String],
      exists: CallbackTo[Boolean],
      getMainLabel: CallbackTo[String],
      getName: CallbackTo[String],
      getSubLabel: CallbackTo[String],
      hasError: CallbackTo[Boolean]
    ): FilePickerDriver = {
      val __obj = js.Dynamic.literal(errorMessage = errorMessage.toJsFn, exists = exists.toJsFn, getMainLabel = getMainLabel.toJsFn, getName = getName.toJsFn, getSubLabel = getSubLabel.toJsFn, hasError = hasError.toJsFn)
      __obj.asInstanceOf[FilePickerDriver]
    }
    
    extension [Self <: FilePickerDriver](x: Self) {
      
      inline def setErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "errorMessage", value.toJsFn)
      
      inline def setGetMainLabel(value: CallbackTo[String]): Self = StObject.set(x, "getMainLabel", value.toJsFn)
      
      inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetSubLabel(value: CallbackTo[String]): Self = StObject.set(x, "getSubLabel", value.toJsFn)
      
      inline def setHasError(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasError", value.toJsFn)
    }
  }
}
