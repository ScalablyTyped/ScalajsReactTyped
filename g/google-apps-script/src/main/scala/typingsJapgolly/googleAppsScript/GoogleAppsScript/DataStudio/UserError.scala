package typingsJapgolly.googleAppsScript.GoogleAppsScript.DataStudio

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error that is shown to users of the connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *
  *     cc.newUserError()
  *       .setText("This is the debug error text.")
  *       .setDebugText("This text is only shown to admins.")
  *       .throwException();
  */
trait UserError extends StObject {
  
  def printJson(): String
  
  def setDebugText(text: String): UserError
  
  def setText(text: String): UserError
  
  def throwException(): scala.Nothing
}
object UserError {
  
  inline def apply(
    printJson: CallbackTo[String],
    setDebugText: String => UserError,
    setText: String => UserError,
    throwException: CallbackTo[scala.Nothing]
  ): UserError = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn, setDebugText = js.Any.fromFunction1(setDebugText), setText = js.Any.fromFunction1(setText), throwException = throwException.toJsFn)
    __obj.asInstanceOf[UserError]
  }
  
  extension [Self <: UserError](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
    
    inline def setSetDebugText(value: String => UserError): Self = StObject.set(x, "setDebugText", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => UserError): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setThrowException(value: CallbackTo[scala.Nothing]): Self = StObject.set(x, "throwException", value.toJsFn)
  }
}
