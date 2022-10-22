package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to Panels of a Deck.
  * @since LibreOffice 5.1
  */
trait XPanels
  extends StObject
     with XIndexAccess
     with XNameAccess {
  
  /** The deck Id that contains the Panels */
  val DeckId: String
  
  /** The deck Id that contains the Panels */
  def getDeckId(): String
}
object XPanels {
  
  inline def apply(
    Count: Double,
    DeckId: String,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: CallbackTo[Double],
    getDeckId: CallbackTo[String],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XPanels = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DeckId = DeckId.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = getCount.toJsFn, getDeckId = getDeckId.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPanels]
  }
  
  extension [Self <: XPanels](x: Self) {
    
    inline def setDeckId(value: String): Self = StObject.set(x, "DeckId", value.asInstanceOf[js.Any])
    
    inline def setGetDeckId(value: CallbackTo[String]): Self = StObject.set(x, "getDeckId", value.toJsFn)
  }
}
