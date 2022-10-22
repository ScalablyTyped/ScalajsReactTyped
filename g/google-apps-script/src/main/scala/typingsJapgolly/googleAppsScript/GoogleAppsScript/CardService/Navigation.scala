package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A helper object that controls card navigation. See the card navigation guide for more details.
  */
trait Navigation extends StObject {
  
  def popCard(): Navigation
  
  def popToNamedCard(cardName: String): Navigation
  
  def popToRoot(): Navigation
  
  def printJson(): String
  
  def pushCard(card: Card): Navigation
  
  def updateCard(card: Card): Navigation
}
object Navigation {
  
  inline def apply(
    popCard: CallbackTo[Navigation],
    popToNamedCard: String => Navigation,
    popToRoot: CallbackTo[Navigation],
    printJson: CallbackTo[String],
    pushCard: Card => Navigation,
    updateCard: Card => Navigation
  ): Navigation = {
    val __obj = js.Dynamic.literal(popCard = popCard.toJsFn, popToNamedCard = js.Any.fromFunction1(popToNamedCard), popToRoot = popToRoot.toJsFn, printJson = printJson.toJsFn, pushCard = js.Any.fromFunction1(pushCard), updateCard = js.Any.fromFunction1(updateCard))
    __obj.asInstanceOf[Navigation]
  }
  
  extension [Self <: Navigation](x: Self) {
    
    inline def setPopCard(value: CallbackTo[Navigation]): Self = StObject.set(x, "popCard", value.toJsFn)
    
    inline def setPopToNamedCard(value: String => Navigation): Self = StObject.set(x, "popToNamedCard", js.Any.fromFunction1(value))
    
    inline def setPopToRoot(value: CallbackTo[Navigation]): Self = StObject.set(x, "popToRoot", value.toJsFn)
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
    
    inline def setPushCard(value: Card => Navigation): Self = StObject.set(x, "pushCard", js.Any.fromFunction1(value))
    
    inline def setUpdateCard(value: Card => Navigation): Self = StObject.set(x, "updateCard", js.Any.fromFunction1(value))
  }
}
