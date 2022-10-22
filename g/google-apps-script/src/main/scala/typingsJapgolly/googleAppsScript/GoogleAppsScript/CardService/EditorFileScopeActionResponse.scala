package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Makes changes to an Editor, such as Google Docs, Sheets, or Slides in reaction to an action taken in the UI.
  */
trait EditorFileScopeActionResponse extends StObject {
  
  /**
    * Prints the JSON representation of this object.
    */
  def printJson(): String
}
object EditorFileScopeActionResponse {
  
  inline def apply(printJson: CallbackTo[String]): EditorFileScopeActionResponse = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn)
    __obj.asInstanceOf[EditorFileScopeActionResponse]
  }
  
  extension [Self <: EditorFileScopeActionResponse](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
  }
}
