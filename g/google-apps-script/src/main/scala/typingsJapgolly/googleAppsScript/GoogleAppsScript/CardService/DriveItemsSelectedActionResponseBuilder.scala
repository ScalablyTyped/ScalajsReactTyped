package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for DriveItemsSelectedActionResponse objects.
  */
trait DriveItemsSelectedActionResponseBuilder extends StObject {
  
  def build(): DriveItemsSelectedActionResponse
  
  def requestFileScope(itemId: String): DriveItemsSelectedActionResponseBuilder
}
object DriveItemsSelectedActionResponseBuilder {
  
  inline def apply(
    build: CallbackTo[DriveItemsSelectedActionResponse],
    requestFileScope: String => DriveItemsSelectedActionResponseBuilder
  ): DriveItemsSelectedActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, requestFileScope = js.Any.fromFunction1(requestFileScope))
    __obj.asInstanceOf[DriveItemsSelectedActionResponseBuilder]
  }
  
  extension [Self <: DriveItemsSelectedActionResponseBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[DriveItemsSelectedActionResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setRequestFileScope(value: String => DriveItemsSelectedActionResponseBuilder): Self = StObject.set(x, "requestFileScope", js.Any.fromFunction1(value))
  }
}
