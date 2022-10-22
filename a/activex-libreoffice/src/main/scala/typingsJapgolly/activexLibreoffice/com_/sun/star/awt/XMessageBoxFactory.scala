package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a factory interface for creating message boxes. */
trait XMessageBoxFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a message box.
    * @param aParent a valid {@link XWindowPeer} reference which is used as a parent.  This parameter must not be null.
    * @param eType the message box type.
    * @param nButtons specifies which buttons should be available on the message box.  A combination of {@link com.sun.star.awt.MessageBoxButtons}  A com::sun
    * @param sTitle specifies the title of the message box.
    * @param sMessage specifies text which will be shown by the message box. Line-breaks must be added using 'CR' or 'CR+LF'.
    * @returns the created message box or a null reference if it cannot be created.
    */
  def createMessageBox(aParent: XWindowPeer, eType: MessageBoxType, nButtons: Double, sTitle: String, sMessage: String): XMessageBox
}
object XMessageBoxFactory {
  
  inline def apply(
    acquire: Callback,
    createMessageBox: (XWindowPeer, MessageBoxType, Double, String, String) => XMessageBox,
    queryInterface: `type` => Any,
    release: Callback
  ): XMessageBoxFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createMessageBox = js.Any.fromFunction5(createMessageBox), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMessageBoxFactory]
  }
  
  extension [Self <: XMessageBoxFactory](x: Self) {
    
    inline def setCreateMessageBox(value: (XWindowPeer, MessageBoxType, Double, String, String) => XMessageBox): Self = StObject.set(x, "createMessageBox", js.Any.fromFunction5(value))
  }
}
