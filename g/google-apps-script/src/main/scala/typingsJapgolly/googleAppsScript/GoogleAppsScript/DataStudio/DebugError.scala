package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error that is only visible to admins of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newDebugError()
  *       .setText("This is the debug error text.")
  *       .throwException();
  */
trait DebugError extends StObject {
  
  def printJson(): String
  
  def setText(text: String): DebugError
  
  def throwException(): scala.Nothing
}
object DebugError {
  
  inline def apply(
    printJson: CallbackTo[String],
    setText: String => DebugError,
    throwException: CallbackTo[scala.Nothing]
  ): DebugError = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn, setText = js.Any.fromFunction1(setText), throwException = throwException.toJsFn)
    __obj.asInstanceOf[DebugError]
  }
  
  extension [Self <: DebugError](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
    
    inline def setSetText(value: String => DebugError): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setThrowException(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "throwException", value.toJsFn)
  }
}
