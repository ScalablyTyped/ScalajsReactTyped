package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the system dependent implementation of the window.
  * @see com.sun.star.lang.SystemDependent
  * @see WindowAttribute
  * @see WindowAttribute.SYSTEMDEPENDENT
  */
trait XSystemDependentMenuPeer
  extends StObject
     with XInterface {
  
  /**
    * returns a system-specific window handle.
    * @param ProcessId the process identifier. Use the sal_getGlobalProcessId function of the RTL library.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns a system-specific handle to a menu or 0 if the menu is not in the same process.  You must check the machine ID and the process ID. ;  WIN32: Retu
    */
  def getMenuHandle(ProcessId: SeqEquiv[Double], SystemType: Double): Any
}
object XSystemDependentMenuPeer {
  
  inline def apply(
    acquire: Callback,
    getMenuHandle: (SeqEquiv[Double], Double) => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XSystemDependentMenuPeer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getMenuHandle = js.Any.fromFunction2(getMenuHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSystemDependentMenuPeer]
  }
  
  extension [Self <: XSystemDependentMenuPeer](x: Self) {
    
    inline def setGetMenuHandle(value: (SeqEquiv[Double], Double) => Any): Self = StObject.set(x, "getMenuHandle", js.Any.fromFunction2(value))
  }
}
