package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the access to a container of parameters, typically used for a prepared statement. */
trait XParametersSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  val Parameters: XIndexAccess
  
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  def getParameters(): XIndexAccess
}
object XParametersSupplier {
  
  inline def apply(
    Parameters: XIndexAccess,
    acquire: Callback,
    getParameters: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XParametersSupplier = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], acquire = acquire.toJsFn, getParameters = getParameters.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XParametersSupplier]
  }
  
  extension [Self <: XParametersSupplier](x: Self) {
    
    inline def setGetParameters(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setParameters(value: XIndexAccess): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
