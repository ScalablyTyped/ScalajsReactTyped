package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for the UniversalActionResponse objects.
  */
trait UniversalActionResponseBuilder extends StObject {
  
  def build(): UniversalActionResponse
  
  def displayAddOnCards(cardObjects: js.Array[Card]): UniversalActionResponseBuilder
  
  def setOpenLink(openLink: OpenLink): UniversalActionResponseBuilder
}
object UniversalActionResponseBuilder {
  
  inline def apply(
    build: CallbackTo[UniversalActionResponse],
    displayAddOnCards: js.Array[Card] => UniversalActionResponseBuilder,
    setOpenLink: OpenLink => UniversalActionResponseBuilder
  ): UniversalActionResponseBuilder = {
    val __obj = js.Dynamic.literal(build = build.toJsFn, displayAddOnCards = js.Any.fromFunction1(displayAddOnCards), setOpenLink = js.Any.fromFunction1(setOpenLink))
    __obj.asInstanceOf[UniversalActionResponseBuilder]
  }
  
  extension [Self <: UniversalActionResponseBuilder](x: Self) {
    
    inline def setBuild(value: CallbackTo[UniversalActionResponse]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setDisplayAddOnCards(value: js.Array[Card] => UniversalActionResponseBuilder): Self = StObject.set(x, "displayAddOnCards", js.Any.fromFunction1(value))
    
    inline def setSetOpenLink(value: OpenLink => UniversalActionResponseBuilder): Self = StObject.set(x, "setOpenLink", js.Any.fromFunction1(value))
  }
}
