package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to intercept value request for parametrized SQL statements. */
trait XDatabaseParameterListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when there is a need for parameter values
    * @param aEvent the event describing the parameter value request.
    * @returns `TRUE` when the execution of the parametrized statement should continue, `FALSE` otherwise.
    * @see com.sun.star.form.DatabaseParameterEvent
    */
  def approveParameter(aEvent: DatabaseParameterEvent): Boolean
}
object XDatabaseParameterListener {
  
  inline def apply(
    acquire: Callback,
    approveParameter: DatabaseParameterEvent => Boolean,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDatabaseParameterListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveParameter = js.Any.fromFunction1(approveParameter), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDatabaseParameterListener]
  }
  
  extension [Self <: XDatabaseParameterListener](x: Self) {
    
    inline def setApproveParameter(value: DatabaseParameterEvent => Boolean): Self = StObject.set(x, "approveParameter", js.Any.fromFunction1(value))
  }
}
