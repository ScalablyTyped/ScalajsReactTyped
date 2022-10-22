package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationErrorsCollection extends StObject {
  
  def deepErrors(): js.Array[ValidationError]
  
  def `for`(name: String): ValidationErrorsCollection
  
  def forIndex(index: Double): ValidationErrorsCollection
  
  def on(name: String): ValidationError
}
object ValidationErrorsCollection {
  
  inline def apply(
    deepErrors: CallbackTo[js.Array[ValidationError]],
    `for`: String => ValidationErrorsCollection,
    forIndex: Double => ValidationErrorsCollection,
    on: String => ValidationError
  ): ValidationErrorsCollection = {
    val __obj = js.Dynamic.literal(deepErrors = deepErrors.toJsFn, forIndex = js.Any.fromFunction1(forIndex), on = js.Any.fromFunction1(on))
    __obj.updateDynamic("for")(js.Any.fromFunction1(`for`))
    __obj.asInstanceOf[ValidationErrorsCollection]
  }
  
  extension [Self <: ValidationErrorsCollection](x: Self) {
    
    inline def setDeepErrors(value: CallbackTo[js.Array[ValidationError]]): Self = StObject.set(x, "deepErrors", value.toJsFn)
    
    inline def setFor(value: String => ValidationErrorsCollection): Self = StObject.set(x, "for", js.Any.fromFunction1(value))
    
    inline def setForIndex(value: Double => ValidationErrorsCollection): Self = StObject.set(x, "forIndex", js.Any.fromFunction1(value))
    
    inline def setOn(value: String => ValidationError): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
  }
}
