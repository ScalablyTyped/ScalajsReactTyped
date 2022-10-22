package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for Card objects.
  */
trait CardBuilder extends StObject {
  
  def addCardAction(cardAction: CardAction): CardBuilder
  
  def addSection(section: CardSection): CardBuilder
  
  def build(): Card
  
  def setDisplayStyle(displayStyle: DisplayStyle): CardBuilder
  
  def setFixedFooter(fixedFooter: FixedFooter): CardBuilder
  
  def setHeader(cardHeader: CardHeader): CardBuilder
  
  def setName(name: String): CardBuilder
  
  def setPeekCardHeader(peekCardHeader: CardHeader): CardBuilder
}
object CardBuilder {
  
  inline def apply(
    addCardAction: CardAction => CardBuilder,
    addSection: CardSection => CardBuilder,
    build: CallbackTo[Card],
    setDisplayStyle: DisplayStyle => CardBuilder,
    setFixedFooter: FixedFooter => CardBuilder,
    setHeader: CardHeader => CardBuilder,
    setName: String => CardBuilder,
    setPeekCardHeader: CardHeader => CardBuilder
  ): CardBuilder = {
    val __obj = js.Dynamic.literal(addCardAction = js.Any.fromFunction1(addCardAction), addSection = js.Any.fromFunction1(addSection), build = build.toJsFn, setDisplayStyle = js.Any.fromFunction1(setDisplayStyle), setFixedFooter = js.Any.fromFunction1(setFixedFooter), setHeader = js.Any.fromFunction1(setHeader), setName = js.Any.fromFunction1(setName), setPeekCardHeader = js.Any.fromFunction1(setPeekCardHeader))
    __obj.asInstanceOf[CardBuilder]
  }
  
  extension [Self <: CardBuilder](x: Self) {
    
    inline def setAddCardAction(value: CardAction => CardBuilder): Self = StObject.set(x, "addCardAction", js.Any.fromFunction1(value))
    
    inline def setAddSection(value: CardSection => CardBuilder): Self = StObject.set(x, "addSection", js.Any.fromFunction1(value))
    
    inline def setBuild(value: CallbackTo[Card]): Self = StObject.set(x, "build", value.toJsFn)
    
    inline def setSetDisplayStyle(value: DisplayStyle => CardBuilder): Self = StObject.set(x, "setDisplayStyle", js.Any.fromFunction1(value))
    
    inline def setSetFixedFooter(value: FixedFooter => CardBuilder): Self = StObject.set(x, "setFixedFooter", js.Any.fromFunction1(value))
    
    inline def setSetHeader(value: CardHeader => CardBuilder): Self = StObject.set(x, "setHeader", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => CardBuilder): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetPeekCardHeader(value: CardHeader => CardBuilder): Self = StObject.set(x, "setPeekCardHeader", js.Any.fromFunction1(value))
  }
}
