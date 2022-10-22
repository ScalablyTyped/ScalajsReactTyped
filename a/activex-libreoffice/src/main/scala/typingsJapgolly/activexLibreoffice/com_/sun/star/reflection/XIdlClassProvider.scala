package typingsJapgolly.activexLibreoffice.com_.sun.star.reflection

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated interface. Do not use anymore.
  * @deprecated Deprecated
  */
trait XIdlClassProvider
  extends StObject
     with XInterface {
  
  val IdlClasses: SafeArray[XIdlClass[Any]]
  
  def getIdlClasses(): SafeArray[XIdlClass[Any]]
}
object XIdlClassProvider {
  
  inline def apply(
    IdlClasses: SafeArray[XIdlClass[Any]],
    acquire: Callback,
    getIdlClasses: CallbackTo[SafeArray[XIdlClass[Any]]],
    queryInterface: `type` => Any,
    release: Callback
  ): XIdlClassProvider = {
    val __obj = js.Dynamic.literal(IdlClasses = IdlClasses.asInstanceOf[js.Any], acquire = acquire.toJsFn, getIdlClasses = getIdlClasses.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XIdlClassProvider]
  }
  
  extension [Self <: XIdlClassProvider](x: Self) {
    
    inline def setGetIdlClasses(value: CallbackTo[SafeArray[XIdlClass[Any]]]): Self = StObject.set(x, "getIdlClasses", value.toJsFn)
    
    inline def setIdlClasses(value: SafeArray[XIdlClass[Any]]): Self = StObject.set(x, "IdlClasses", value.asInstanceOf[js.Any])
  }
}
