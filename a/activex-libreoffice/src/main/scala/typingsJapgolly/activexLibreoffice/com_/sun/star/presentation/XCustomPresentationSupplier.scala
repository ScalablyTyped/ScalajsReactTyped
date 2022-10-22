package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * must be supported to provide access to customized presentations of a presentation document.
  * @see XCustomPresentation
  * @see XCustomPresentationAccess
  */
trait XCustomPresentationSupplier
  extends StObject
     with XInterface {
  
  /** @returns the {@link CustomPresentation} . */
  val CustomPresentations: XNameContainer
  
  /** @returns the {@link CustomPresentation} . */
  def getCustomPresentations(): XNameContainer
}
object XCustomPresentationSupplier {
  
  inline def apply(
    CustomPresentations: XNameContainer,
    acquire: Callback,
    getCustomPresentations: CallbackTo[XNameContainer],
    queryInterface: `type` => Any,
    release: Callback
  ): XCustomPresentationSupplier = {
    val __obj = js.Dynamic.literal(CustomPresentations = CustomPresentations.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCustomPresentations = getCustomPresentations.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCustomPresentationSupplier]
  }
  
  extension [Self <: XCustomPresentationSupplier](x: Self) {
    
    inline def setCustomPresentations(value: XNameContainer): Self = StObject.set(x, "CustomPresentations", value.asInstanceOf[js.Any])
    
    inline def setGetCustomPresentations(value: CallbackTo[XNameContainer]): Self = StObject.set(x, "getCustomPresentations", value.toJsFn)
  }
}
