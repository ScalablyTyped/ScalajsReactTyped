package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealBezierSegment2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealPoint2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface provides access to a graphic device, such as a printer, or a screen device. Every canvas (
  * @see XCanvas) has exactly one associated graphic device, into which its output is rendered. For a typical windowing system, the graphic device is equi
  */
trait XGraphicDevice
  extends StObject
     with XInterface {
  
  /**
    * Query the controller for multi buffering functionality on this graphic device.
    *
    * If there is no such functionality available, the NULL reference is returned.
    */
  val BufferController: XBufferController
  
  /**
    * Query the color space interface for this graphic device.
    *
    * This is to be used when interpreting or setting device color values.
    */
  val DeviceColorSpace: XColorSpace
  
  /**
    * Get a reference to this device's parametric polygon factory.
    * @returns a reference to this device's parametric polygon factory. Although it is possible to use parametric polygons on all canvases, regardless of the as
    */
  val ParametricPolyPolygonFactory: XMultiServiceFactory
  
  /**
    * Query the physical resolution of the device in pixel per millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    */
  val PhysicalResolution: RealSize2D
  
  /**
    * Query the physical dimensions of the device in millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    * @see XBitmap.getSize()
    */
  val PhysicalSize: RealSize2D
  
  /**
    * Create a bitmap with alpha channel whose memory layout and sample model is compatible to the graphic device.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createCompatibleAlphaBitmap(size: IntegerSize2D): XBitmap
  
  /**
    * Create a Bezier poly-polygon which can internally use device-optimized representations already.
    * @param points The points of the poly-polygon, in a separate array for every polygon.
    */
  def createCompatibleBezierPolyPolygon(points: SeqEquiv[SeqEquiv[RealBezierSegment2D]]): XBezierPolyPolygon2D
  
  /**
    * Create a bitmap whose memory layout and sample model is compatible to the graphic device.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createCompatibleBitmap(size: IntegerSize2D): XBitmap
  
  /**
    * Create a line poly-polygon which can internally use device-optimized representations already.
    * @param points The points of the poly-polygon, in a separate array for every polygon.
    */
  def createCompatibleLinePolyPolygon(points: SeqEquiv[SeqEquiv[RealPoint2D]]): XLinePolyPolygon2D
  
  /**
    * Create a volatile bitmap with alpha channel that is usable with this graphic device.
    *
    * A volatile bitmap's difference in comparison to a plain bitmap (e.g. generated via {@link createCompatibleBitmap()} ) is the fact that its content
    * might vanish at any point in time (making any operation with them produce a {@link VolatileContentDestroyedException} ). The benefit, on the other
    * hand, is that they might be easy to hardware-accelerate on certain platforms, without the need to keep a safety copy of the content internally.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createVolatileAlphaBitmap(size: IntegerSize2D): XVolatileBitmap
  
  /**
    * Create a volatile bitmap that is usable with this graphic device.
    *
    * A volatile bitmap's difference in comparison to a plain bitmap (e.g. generated via {@link createCompatibleBitmap()} ) is the fact that its content
    * might vanish at any point in time (making any operation with them produce a {@link VolatileContentDestroyedException} ). The benefit, on the other
    * hand, is that they might be easy to hardware-accelerate on certain platforms, without the need to keep a safety copy of the content internally.
    * @param size Size of the requested bitmap in pixel. Both components of the size must be greater than 0
    */
  def createVolatileBitmap(size: IntegerSize2D): XVolatileBitmap
  
  /** Enter or leave the fullscreen mode, if possible. The return value denotes the success of the operation. */
  def enterFullScreenMode(bEnter: Boolean): Boolean
  
  /**
    * Query the controller for multi buffering functionality on this graphic device.
    *
    * If there is no such functionality available, the NULL reference is returned.
    */
  def getBufferController(): XBufferController
  
  /**
    * Query the color space interface for this graphic device.
    *
    * This is to be used when interpreting or setting device color values.
    */
  def getDeviceColorSpace(): XColorSpace
  
  /**
    * Get a reference to this device's parametric polygon factory.
    * @returns a reference to this device's parametric polygon factory. Although it is possible to use parametric polygons on all canvases, regardless of the as
    */
  def getParametricPolyPolygonFactory(): XMultiServiceFactory
  
  /**
    * Query the physical resolution of the device in pixel per millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    */
  def getPhysicalResolution(): RealSize2D
  
  /**
    * Query the physical dimensions of the device in millimeter.
    *
    * A special floating point value of +infinity here indicates "unknown", i.e. at the time of rendering undetermined or possibly infinite resolution along
    * the corresponding direction.
    * @see XBitmap.getSize()
    */
  def getPhysicalSize(): RealSize2D
  
  /** Tells whether this graphic device has a full screen mode, i.e. whether a window can cover the whole screen exclusively. */
  def hasFullScreenMode(): Boolean
}
object XGraphicDevice {
  
  inline def apply(
    BufferController: XBufferController,
    DeviceColorSpace: XColorSpace,
    ParametricPolyPolygonFactory: XMultiServiceFactory,
    PhysicalResolution: RealSize2D,
    PhysicalSize: RealSize2D,
    acquire: Callback,
    createCompatibleAlphaBitmap: IntegerSize2D => XBitmap,
    createCompatibleBezierPolyPolygon: SeqEquiv[SeqEquiv[RealBezierSegment2D]] => XBezierPolyPolygon2D,
    createCompatibleBitmap: IntegerSize2D => XBitmap,
    createCompatibleLinePolyPolygon: SeqEquiv[SeqEquiv[RealPoint2D]] => XLinePolyPolygon2D,
    createVolatileAlphaBitmap: IntegerSize2D => XVolatileBitmap,
    createVolatileBitmap: IntegerSize2D => XVolatileBitmap,
    enterFullScreenMode: Boolean => Boolean,
    getBufferController: CallbackTo[XBufferController],
    getDeviceColorSpace: CallbackTo[XColorSpace],
    getParametricPolyPolygonFactory: CallbackTo[XMultiServiceFactory],
    getPhysicalResolution: CallbackTo[RealSize2D],
    getPhysicalSize: CallbackTo[RealSize2D],
    hasFullScreenMode: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XGraphicDevice = {
    val __obj = js.Dynamic.literal(BufferController = BufferController.asInstanceOf[js.Any], DeviceColorSpace = DeviceColorSpace.asInstanceOf[js.Any], ParametricPolyPolygonFactory = ParametricPolyPolygonFactory.asInstanceOf[js.Any], PhysicalResolution = PhysicalResolution.asInstanceOf[js.Any], PhysicalSize = PhysicalSize.asInstanceOf[js.Any], acquire = acquire.toJsFn, createCompatibleAlphaBitmap = js.Any.fromFunction1(createCompatibleAlphaBitmap), createCompatibleBezierPolyPolygon = js.Any.fromFunction1(createCompatibleBezierPolyPolygon), createCompatibleBitmap = js.Any.fromFunction1(createCompatibleBitmap), createCompatibleLinePolyPolygon = js.Any.fromFunction1(createCompatibleLinePolyPolygon), createVolatileAlphaBitmap = js.Any.fromFunction1(createVolatileAlphaBitmap), createVolatileBitmap = js.Any.fromFunction1(createVolatileBitmap), enterFullScreenMode = js.Any.fromFunction1(enterFullScreenMode), getBufferController = getBufferController.toJsFn, getDeviceColorSpace = getDeviceColorSpace.toJsFn, getParametricPolyPolygonFactory = getParametricPolyPolygonFactory.toJsFn, getPhysicalResolution = getPhysicalResolution.toJsFn, getPhysicalSize = getPhysicalSize.toJsFn, hasFullScreenMode = hasFullScreenMode.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XGraphicDevice]
  }
  
  extension [Self <: XGraphicDevice](x: Self) {
    
    inline def setBufferController(value: XBufferController): Self = StObject.set(x, "BufferController", value.asInstanceOf[js.Any])
    
    inline def setCreateCompatibleAlphaBitmap(value: IntegerSize2D => XBitmap): Self = StObject.set(x, "createCompatibleAlphaBitmap", js.Any.fromFunction1(value))
    
    inline def setCreateCompatibleBezierPolyPolygon(value: SeqEquiv[SeqEquiv[RealBezierSegment2D]] => XBezierPolyPolygon2D): Self = StObject.set(x, "createCompatibleBezierPolyPolygon", js.Any.fromFunction1(value))
    
    inline def setCreateCompatibleBitmap(value: IntegerSize2D => XBitmap): Self = StObject.set(x, "createCompatibleBitmap", js.Any.fromFunction1(value))
    
    inline def setCreateCompatibleLinePolyPolygon(value: SeqEquiv[SeqEquiv[RealPoint2D]] => XLinePolyPolygon2D): Self = StObject.set(x, "createCompatibleLinePolyPolygon", js.Any.fromFunction1(value))
    
    inline def setCreateVolatileAlphaBitmap(value: IntegerSize2D => XVolatileBitmap): Self = StObject.set(x, "createVolatileAlphaBitmap", js.Any.fromFunction1(value))
    
    inline def setCreateVolatileBitmap(value: IntegerSize2D => XVolatileBitmap): Self = StObject.set(x, "createVolatileBitmap", js.Any.fromFunction1(value))
    
    inline def setDeviceColorSpace(value: XColorSpace): Self = StObject.set(x, "DeviceColorSpace", value.asInstanceOf[js.Any])
    
    inline def setEnterFullScreenMode(value: Boolean => Boolean): Self = StObject.set(x, "enterFullScreenMode", js.Any.fromFunction1(value))
    
    inline def setGetBufferController(value: CallbackTo[XBufferController]): Self = StObject.set(x, "getBufferController", value.toJsFn)
    
    inline def setGetDeviceColorSpace(value: CallbackTo[XColorSpace]): Self = StObject.set(x, "getDeviceColorSpace", value.toJsFn)
    
    inline def setGetParametricPolyPolygonFactory(value: CallbackTo[XMultiServiceFactory]): Self = StObject.set(x, "getParametricPolyPolygonFactory", value.toJsFn)
    
    inline def setGetPhysicalResolution(value: CallbackTo[RealSize2D]): Self = StObject.set(x, "getPhysicalResolution", value.toJsFn)
    
    inline def setGetPhysicalSize(value: CallbackTo[RealSize2D]): Self = StObject.set(x, "getPhysicalSize", value.toJsFn)
    
    inline def setHasFullScreenMode(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasFullScreenMode", value.toJsFn)
    
    inline def setParametricPolyPolygonFactory(value: XMultiServiceFactory): Self = StObject.set(x, "ParametricPolyPolygonFactory", value.asInstanceOf[js.Any])
    
    inline def setPhysicalResolution(value: RealSize2D): Self = StObject.set(x, "PhysicalResolution", value.asInstanceOf[js.Any])
    
    inline def setPhysicalSize(value: RealSize2D): Self = StObject.set(x, "PhysicalSize", value.asInstanceOf[js.Any])
  }
}
