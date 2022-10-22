package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a response that makes changes to Drive while Drive items are selected and in reaction to an action taken in the UI, such as a button click.
  */
trait DriveItemsSelectedActionResponse extends StObject {
  
  def printJson(): String
}
object DriveItemsSelectedActionResponse {
  
  inline def apply(printJson: CallbackTo[String]): DriveItemsSelectedActionResponse = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn)
    __obj.asInstanceOf[DriveItemsSelectedActionResponse]
  }
  
  extension [Self <: DriveItemsSelectedActionResponse](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
  }
}
