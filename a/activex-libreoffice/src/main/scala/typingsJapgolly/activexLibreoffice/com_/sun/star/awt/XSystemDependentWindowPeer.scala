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
trait XSystemDependentWindowPeer
  extends StObject
     with XInterface {
  
  /**
    * returns a system-specific window handle.
    * @param ProcessId the process identifier. Use the sal_getGlobalProcessId function of the RTL library.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns a system-specific handle to a window or 0 if the window is not in the same process.  You must check the machine ID and the process ID. ;  WIN32:
    */
  def getWindowHandle(ProcessId: SeqEquiv[Double], SystemType: Double): Any
}
object XSystemDependentWindowPeer {
  
  inline def apply(
    acquire: Callback,
    getWindowHandle: (SeqEquiv[Double], Double) => Any,
    queryInterface: `type` => Any,
    release: Callback
  ): XSystemDependentWindowPeer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getWindowHandle = js.Any.fromFunction2(getWindowHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSystemDependentWindowPeer]
  }
  
  extension [Self <: XSystemDependentWindowPeer](x: Self) {
    
    inline def setGetWindowHandle(value: (SeqEquiv[Double], Double) => Any): Self = StObject.set(x, "getWindowHandle", js.Any.fromFunction2(value))
  }
}
