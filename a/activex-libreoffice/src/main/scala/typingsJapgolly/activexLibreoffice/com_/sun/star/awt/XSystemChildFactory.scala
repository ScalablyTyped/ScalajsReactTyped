package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a factory interface for creating system child windows. */
trait XSystemChildFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a system child window.
    * @param Parent a system-specific handle to a window.  You must check the machine ID and the process ID. ;  WIN32: HWND. ;  WIN16: HWND. ;   JAVA: global
    * @param ProcessId Ignored.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns the created window.
    */
  def createSystemChild(Parent: Any, ProcessId: SeqEquiv[Double], SystemType: Double): XWindowPeer
}
object XSystemChildFactory {
  
  inline def apply(
    acquire: Callback,
    createSystemChild: (Any, SeqEquiv[Double], Double) => XWindowPeer,
    queryInterface: `type` => Any,
    release: Callback
  ): XSystemChildFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createSystemChild = js.Any.fromFunction3(createSystemChild), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSystemChildFactory]
  }
  
  extension [Self <: XSystemChildFactory](x: Self) {
    
    inline def setCreateSystemChild(value: (Any, SeqEquiv[Double], Double) => XWindowPeer): Self = StObject.set(x, "createSystemChild", js.Any.fromFunction3(value))
  }
}
