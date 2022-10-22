package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionContinuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An interaction continuation handing back parameter data.
  *
  * This continuation is typically used in conjunction with a {@link com.sun.star.sdb.ParametersRequest} .
  */
trait XInteractionSupplyParameters
  extends StObject
     with XInteractionContinuation {
  
  /**
    * set the parameters chosen by the interaction handler
    * @param Values the parameters to set
    */
  def setParameters(Values: SeqEquiv[PropertyValue]): Unit
}
object XInteractionSupplyParameters {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    select: Callback,
    setParameters: SeqEquiv[PropertyValue] => Callback
  ): XInteractionSupplyParameters = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, select = select.toJsFn, setParameters = js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => setParameters(t0).runNow()))
    __obj.asInstanceOf[XInteractionSupplyParameters]
  }
  
  extension [Self <: XInteractionSupplyParameters](x: Self) {
    
    inline def setSetParameters(value: SeqEquiv[PropertyValue] => Callback): Self = StObject.set(x, "setParameters", js.Any.fromFunction1((t0: SeqEquiv[PropertyValue]) => value(t0).runNow()))
  }
}
