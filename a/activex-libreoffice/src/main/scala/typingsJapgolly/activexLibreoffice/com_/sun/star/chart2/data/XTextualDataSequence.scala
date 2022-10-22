package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows access to a one-dimensional sequence of strings. */
trait XTextualDataSequence
  extends StObject
     with XInterface {
  
  /** retrieves the data as strings */
  val TextualData: SafeArray[String]
  
  /** retrieves the data as strings */
  def getTextualData(): SafeArray[String]
}
object XTextualDataSequence {
  
  inline def apply(
    TextualData: SafeArray[String],
    acquire: Callback,
    getTextualData: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback
  ): XTextualDataSequence = {
    val __obj = js.Dynamic.literal(TextualData = TextualData.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTextualData = getTextualData.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTextualDataSequence]
  }
  
  extension [Self <: XTextualDataSequence](x: Self) {
    
    inline def setGetTextualData(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getTextualData", value.toJsFn)
    
    inline def setTextualData(value: SafeArray[String]): Self = StObject.set(x, "TextualData", value.asInstanceOf[js.Any])
  }
}
