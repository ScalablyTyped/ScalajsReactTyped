package typingsJapgolly.activexLibreoffice.com_.sun.star.task

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies a way of how to continue from an {@link com.sun.star.task.XInteractionRequest} .
  *
  * Different sub-interfaces of this interface specify different ways of continuing.
  */
trait XInteractionContinuation
  extends StObject
     with XInterface {
  
  /**
    * Select this way of continuing from an {@link com.sun.star.task.XInteractionRequest} (given a choice of various instances of {@link
    * com.sun.star.task.XInteractionContinuation} ).
    */
  def select(): Unit
}
object XInteractionContinuation {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, select: Callback): XInteractionContinuation = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn)
    __obj.asInstanceOf[XInteractionContinuation]
  }
  
  extension [Self <: XInteractionContinuation](x: Self) {
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "select", value.toJsFn)
  }
}
