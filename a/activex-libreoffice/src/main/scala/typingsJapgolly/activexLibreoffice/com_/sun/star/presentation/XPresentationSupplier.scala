package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** controls a presentation directly. This supplier will do this. */
trait XPresentationSupplier
  extends StObject
     with XInterface {
  
  /** @returns an interface to control a presentation. */
  val Presentation: XPresentation
  
  /** @returns an interface to control a presentation. */
  def getPresentation(): XPresentation
}
object XPresentationSupplier {
  
  inline def apply(
    Presentation: XPresentation,
    acquire: Callback,
    getPresentation: CallbackTo[XPresentation],
    queryInterface: `type` => Any,
    release: Callback
  ): XPresentationSupplier = {
    val __obj = js.Dynamic.literal(Presentation = Presentation.asInstanceOf[js.Any], acquire = acquire.toJsFn, getPresentation = getPresentation.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPresentationSupplier]
  }
  
  extension [Self <: XPresentationSupplier](x: Self) {
    
    inline def setGetPresentation(value: CallbackTo[XPresentation]): Self = StObject.set(x, "getPresentation", value.toJsFn)
    
    inline def setPresentation(value: XPresentation): Self = StObject.set(x, "Presentation", value.asInstanceOf[js.Any])
  }
}
