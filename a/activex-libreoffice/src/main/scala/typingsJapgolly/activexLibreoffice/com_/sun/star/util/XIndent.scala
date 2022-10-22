package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows indentation of the object to be changed. */
trait XIndent
  extends StObject
     with XInterface {
  
  /** shifts the indentation by one default step to the left. */
  def decrementIndent(): Unit
  
  /** shifts the indentation by one default step to the right. */
  def incrementIndent(): Unit
}
object XIndent {
  
  inline def apply(
    acquire: Callback,
    decrementIndent: Callback,
    incrementIndent: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XIndent = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, decrementIndent = decrementIndent.toJsFn, incrementIndent = incrementIndent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIndent]
  }
  
  extension [Self <: XIndent](x: Self) {
    
    inline def setDecrementIndent(value: Callback): Self = StObject.set(x, "decrementIndent", value.toJsFn)
    
    inline def setIncrementIndent(value: Callback): Self = StObject.set(x, "incrementIndent", value.toJsFn)
  }
}
