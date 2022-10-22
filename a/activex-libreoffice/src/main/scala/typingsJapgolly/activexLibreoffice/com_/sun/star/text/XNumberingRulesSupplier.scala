package typingsJapgolly.activexLibreoffice.com_.sun.star.text

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface enables the object to handle numbering rules.
  * @see com.sun.star.text.NumberingRules
  */
trait XNumberingRulesSupplier
  extends StObject
     with XInterface {
  
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  val NumberingRules: XIndexAccess
  
  /** @returns the collection of "NumberingRules" currently contained in the object. */
  def getNumberingRules(): XIndexAccess
}
object XNumberingRulesSupplier {
  
  inline def apply(
    NumberingRules: XIndexAccess,
    acquire: Callback,
    getNumberingRules: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XNumberingRulesSupplier = {
    val __obj = js.Dynamic.literal(NumberingRules = NumberingRules.asInstanceOf[js.Any], acquire = acquire.toJsFn, getNumberingRules = getNumberingRules.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNumberingRulesSupplier]
  }
  
  extension [Self <: XNumberingRulesSupplier](x: Self) {
    
    inline def setGetNumberingRules(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getNumberingRules", value.toJsFn)
    
    inline def setNumberingRules(value: XIndexAccess): Self = StObject.set(x, "NumberingRules", value.asInstanceOf[js.Any])
  }
}
