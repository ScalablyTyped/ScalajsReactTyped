package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbcx

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for creating and appending new objects to a specific container. */
trait XAppend
  extends StObject
     with XInterface {
  
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param descriptor the descriptor which should be serve to append a new object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendByDescriptor(descriptor: XPropertySet): Unit
}
object XAppend {
  
  inline def apply(
    acquire: Callback,
    appendByDescriptor: XPropertySet => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAppend = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, appendByDescriptor = js.Any.fromFunction1((t0: XPropertySet) => appendByDescriptor(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAppend]
  }
  
  extension [Self <: XAppend](x: Self) {
    
    inline def setAppendByDescriptor(value: XPropertySet => Callback): Self = StObject.set(x, "appendByDescriptor", js.Any.fromFunction1((t0: XPropertySet) => value(t0).runNow()))
  }
}
