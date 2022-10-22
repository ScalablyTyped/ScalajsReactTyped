package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for inplace embedded objects. */
trait XInplaceObject
  extends StObject
     with XInterface {
  
  /**
    * enables or disables modeless dialogs of the object.
    *
    * In case container wants to show a modal dialog it should disable modeless of embedded object dialogs with this call. Later the same call can be used
    * to enable it.
    * @param bEnable `TRUE` to enable object modeless `FALSE` to disable it
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def enableModeless(bEnable: Boolean): Unit
  
  /**
    * sets the visible part of the inplace object.
    *
    * Both rectangles are provided in object's parent window coordinates in pixels. The intersection of rectangles specifies the visible part of the object.
    * In case the position window has a size that is different from object's visual area size, the object should either scale or deactivate.
    *
    * The method must activate object repainting.
    * @param aPosRect specifies a new position rectangle
    * @param aClipRect specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in invalid state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def setObjectRectangles(aPosRect: Rectangle, aClipRect: Rectangle): Unit
  
  /**
    * provides accelerator table the container wants to use during inplace editing.
    * @returns an accelerator table from container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def translateAccelerators(aKeys: SeqEquiv[KeyEvent]): Unit
}
object XInplaceObject {
  
  inline def apply(
    acquire: Callback,
    enableModeless: Boolean => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setObjectRectangles: (Rectangle, Rectangle) => Callback,
    translateAccelerators: SeqEquiv[KeyEvent] => Callback
  ): XInplaceObject = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, enableModeless = js.Any.fromFunction1((t0: Boolean) => enableModeless(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setObjectRectangles = js.Any.fromFunction2((t0: Rectangle, t1: Rectangle) => (setObjectRectangles(t0, t1)).runNow()), translateAccelerators = js.Any.fromFunction1((t0: SeqEquiv[KeyEvent]) => translateAccelerators(t0).runNow()))
    __obj.asInstanceOf[XInplaceObject]
  }
  
  extension [Self <: XInplaceObject](x: Self) {
    
    inline def setEnableModeless(value: Boolean => Callback): Self = StObject.set(x, "enableModeless", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetObjectRectangles(value: (Rectangle, Rectangle) => Callback): Self = StObject.set(x, "setObjectRectangles", js.Any.fromFunction2((t0: Rectangle, t1: Rectangle) => (value(t0, t1)).runNow()))
    
    inline def setTranslateAccelerators(value: SeqEquiv[KeyEvent] => Callback): Self = StObject.set(x, "translateAccelerators", js.Any.fromFunction1((t0: SeqEquiv[KeyEvent]) => value(t0).runNow()))
  }
}
