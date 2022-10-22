package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface provides access to the style families within the container document. */
trait XAutoStylesSupplier
  extends StObject
     with XInterface {
  
  /**
    * This method returns the collection of automatic style families available in the container document.
    * @see AutoStyles
    */
  val AutoStyles: XAutoStyles
  
  /**
    * This method returns the collection of automatic style families available in the container document.
    * @see AutoStyles
    */
  def getAutoStyles(): XAutoStyles
}
object XAutoStylesSupplier {
  
  inline def apply(
    AutoStyles: XAutoStyles,
    acquire: Callback,
    getAutoStyles: CallbackTo[XAutoStyles],
    queryInterface: `type` => Any,
    release: Callback
  ): XAutoStylesSupplier = {
    val __obj = js.Dynamic.literal(AutoStyles = AutoStyles.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAutoStyles = getAutoStyles.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAutoStylesSupplier]
  }
  
  extension [Self <: XAutoStylesSupplier](x: Self) {
    
    inline def setAutoStyles(value: XAutoStyles): Self = StObject.set(x, "AutoStyles", value.asInstanceOf[js.Any])
    
    inline def setGetAutoStyles(value: CallbackTo[XAutoStyles]): Self = StObject.set(x, "getAutoStyles", value.toJsFn)
  }
}
