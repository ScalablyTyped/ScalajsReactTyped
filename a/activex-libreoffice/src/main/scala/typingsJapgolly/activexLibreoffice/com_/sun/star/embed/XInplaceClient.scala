package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.KeyEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XDispatchProvider
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XLayoutManager
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents common functionality for inplace clients. */
trait XInplaceClient
  extends StObject
     with XInterface {
  
  /**
    * gets the inplace object clip rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object.
    * @returns specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val ClipRectangle: Rectangle
  
  /**
    * allows to retrieve the container's dispatch provider.
    * @returns reference to object implementing the {@link com.sun.star.frame.XDispatchProvider}
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val InplaceDispatchProvider: XDispatchProvider
  
  /**
    * allows to retrieve the {@link com.sun.star.frame.LayoutManager} of the container.
    * @returns reference to object representing the {@link com.sun.star.frame.LayoutManager} of the container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val LayoutManager: XLayoutManager
  
  /**
    * gets the inplace object position rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object. In case the position window has a size that is bigger than object's size, the object should either scale or deactivate.
    * @returns specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  val Placement: Rectangle
  
  /**
    * notifies container through the client that the object is to be inplace activated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for activation
    */
  def activatingInplace(): Unit
  
  /**
    * notifies container through the client that the object is to be UI-activated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for activation
    */
  def activatingUI(): Unit
  
  /**
    * checks if the container can activate the object inplace.
    * @returns `TRUE` the container can activate the object inplace. `FALSE` otherwise.
    */
  def canInplaceActivate(): Boolean
  
  /**
    * notifies the container that the position of the object is changed.
    * @param aPosRect specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object state is not correct
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def changedPlacement(aPosRect: Rectangle): Unit
  
  /**
    * notifies container through the client that the object is deactivated.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for deactivation
    */
  def deactivatedInplace(): Unit
  
  /**
    * notifies container through the client that the object is UI-deactivated.
    *
    * After this notification the container can restore it's own UI and take focus.
    * @throws com::sun::star::embed::WrongStateException the container is not ready for deactivation
    */
  def deactivatedUI(): Unit
  
  /**
    * gets the inplace object clip rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object.
    * @returns specifies a new clip rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getClipRectangle(): Rectangle
  
  /**
    * allows to retrieve the container's dispatch provider.
    * @returns reference to object implementing the {@link com.sun.star.frame.XDispatchProvider}
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getInplaceDispatchProvider(): XDispatchProvider
  
  /**
    * allows to retrieve the {@link com.sun.star.frame.LayoutManager} of the container.
    * @returns reference to object representing the {@link com.sun.star.frame.LayoutManager} of the container
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getLayoutManager(): XLayoutManager
  
  /**
    * gets the inplace object position rectangle.
    *
    * The rectangle is provided in object's parent window coordinates in pixels. The intersection of position and clip rectangles specifies the visible part
    * of the object. In case the position window has a size that is bigger than object's size, the object should either scale or deactivate.
    * @returns specifies a new position rectangle
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state to make such request
    */
  def getPlacement(): Rectangle
  
  /**
    * scrolls the object.
    * @param aOffset scrolls the object to specified offset in pixels
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def scrollObject(aOffset: Size): Unit
  
  /**
    * provides accelerator table the object wants to use while it is inplace active.
    * @param aKeys an accelerator table from object
    * @throws com::sun::star::embed::WrongStateException the object is in unexpected state
    */
  def translateAccelerators(aKeys: SeqEquiv[KeyEvent]): Unit
}
object XInplaceClient {
  
  inline def apply(
    ClipRectangle: Rectangle,
    InplaceDispatchProvider: XDispatchProvider,
    LayoutManager: XLayoutManager,
    Placement: Rectangle,
    acquire: Callback,
    activatingInplace: Callback,
    activatingUI: Callback,
    canInplaceActivate: CallbackTo[Boolean],
    changedPlacement: Rectangle => Callback,
    deactivatedInplace: Callback,
    deactivatedUI: Callback,
    getClipRectangle: CallbackTo[Rectangle],
    getInplaceDispatchProvider: CallbackTo[XDispatchProvider],
    getLayoutManager: CallbackTo[XLayoutManager],
    getPlacement: CallbackTo[Rectangle],
    queryInterface: `type` => Any,
    release: Callback,
    scrollObject: Size => Callback,
    translateAccelerators: SeqEquiv[KeyEvent] => Callback
  ): XInplaceClient = {
    val __obj = js.Dynamic.literal(ClipRectangle = ClipRectangle.asInstanceOf[js.Any], InplaceDispatchProvider = InplaceDispatchProvider.asInstanceOf[js.Any], LayoutManager = LayoutManager.asInstanceOf[js.Any], Placement = Placement.asInstanceOf[js.Any], acquire = acquire.toJsFn, activatingInplace = activatingInplace.toJsFn, activatingUI = activatingUI.toJsFn, canInplaceActivate = canInplaceActivate.toJsFn, changedPlacement = js.Any.fromFunction1((t0: Rectangle) => changedPlacement(t0).runNow()), deactivatedInplace = deactivatedInplace.toJsFn, deactivatedUI = deactivatedUI.toJsFn, getClipRectangle = getClipRectangle.toJsFn, getInplaceDispatchProvider = getInplaceDispatchProvider.toJsFn, getLayoutManager = getLayoutManager.toJsFn, getPlacement = getPlacement.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, scrollObject = js.Any.fromFunction1((t0: Size) => scrollObject(t0).runNow()), translateAccelerators = js.Any.fromFunction1((t0: SeqEquiv[KeyEvent]) => translateAccelerators(t0).runNow()))
    __obj.asInstanceOf[XInplaceClient]
  }
  
  extension [Self <: XInplaceClient](x: Self) {
    
    inline def setActivatingInplace(value: Callback): Self = StObject.set(x, "activatingInplace", value.toJsFn)
    
    inline def setActivatingUI(value: Callback): Self = StObject.set(x, "activatingUI", value.toJsFn)
    
    inline def setCanInplaceActivate(value: CallbackTo[Boolean]): Self = StObject.set(x, "canInplaceActivate", value.toJsFn)
    
    inline def setChangedPlacement(value: Rectangle => Callback): Self = StObject.set(x, "changedPlacement", js.Any.fromFunction1((t0: Rectangle) => value(t0).runNow()))
    
    inline def setClipRectangle(value: Rectangle): Self = StObject.set(x, "ClipRectangle", value.asInstanceOf[js.Any])
    
    inline def setDeactivatedInplace(value: Callback): Self = StObject.set(x, "deactivatedInplace", value.toJsFn)
    
    inline def setDeactivatedUI(value: Callback): Self = StObject.set(x, "deactivatedUI", value.toJsFn)
    
    inline def setGetClipRectangle(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getClipRectangle", value.toJsFn)
    
    inline def setGetInplaceDispatchProvider(value: CallbackTo[XDispatchProvider]): Self = StObject.set(x, "getInplaceDispatchProvider", value.toJsFn)
    
    inline def setGetLayoutManager(value: CallbackTo[XLayoutManager]): Self = StObject.set(x, "getLayoutManager", value.toJsFn)
    
    inline def setGetPlacement(value: CallbackTo[Rectangle]): Self = StObject.set(x, "getPlacement", value.toJsFn)
    
    inline def setInplaceDispatchProvider(value: XDispatchProvider): Self = StObject.set(x, "InplaceDispatchProvider", value.asInstanceOf[js.Any])
    
    inline def setLayoutManager(value: XLayoutManager): Self = StObject.set(x, "LayoutManager", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Rectangle): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setScrollObject(value: Size => Callback): Self = StObject.set(x, "scrollObject", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
    
    inline def setTranslateAccelerators(value: SeqEquiv[KeyEvent] => Callback): Self = StObject.set(x, "translateAccelerators", js.Any.fromFunction1((t0: SeqEquiv[KeyEvent]) => value(t0).runNow()))
  }
}
