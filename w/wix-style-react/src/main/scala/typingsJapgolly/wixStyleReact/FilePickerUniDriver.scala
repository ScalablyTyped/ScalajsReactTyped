package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePickerUniDriver
  extends StObject
     with BaseUniDriver {
  
  def errorMessage(): js.Promise[String]
  
  def getMainLabel(): js.Promise[String]
  
  def getName(): js.Promise[Any]
  
  def getSubLabel(): js.Promise[String]
  
  def hasError(): js.Promise[Boolean]
}
object FilePickerUniDriver {
  
  inline def apply(
    click: CallbackTo[js.Promise[Unit]],
    element: CallbackTo[js.Promise[Any]],
    errorMessage: CallbackTo[js.Promise[String]],
    exists: CallbackTo[js.Promise[Boolean]],
    getMainLabel: CallbackTo[js.Promise[String]],
    getName: CallbackTo[js.Promise[Any]],
    getSubLabel: CallbackTo[js.Promise[String]],
    hasError: CallbackTo[js.Promise[Boolean]]
  ): FilePickerUniDriver = {
    val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, errorMessage = errorMessage.toJsFn, exists = exists.toJsFn, getMainLabel = getMainLabel.toJsFn, getName = getName.toJsFn, getSubLabel = getSubLabel.toJsFn, hasError = hasError.toJsFn)
    __obj.asInstanceOf[FilePickerUniDriver]
  }
  
  extension [Self <: FilePickerUniDriver](x: Self) {
    
    inline def setErrorMessage(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "errorMessage", value.toJsFn)
    
    inline def setGetMainLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getMainLabel", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetSubLabel(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "getSubLabel", value.toJsFn)
    
    inline def setHasError(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasError", value.toJsFn)
  }
}
