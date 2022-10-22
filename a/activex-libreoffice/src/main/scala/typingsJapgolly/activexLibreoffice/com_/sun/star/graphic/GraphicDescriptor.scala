package typingsJapgolly.activexLibreoffice.com_.sun.star.graphic

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service describes all graphic properties that are available via the {@link com.sun.star.beans.XPropertySet} interface
  * @see XPropertySet
  */
trait GraphicDescriptor
  extends StObject
     with XPropertySet {
  
  /**
    * Indicates that it is a pixel graphic with an alpha channel
    *
    * The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of just querying for the {@link GraphicDescriptor}
    */
  var Alpha: Boolean
  
  /**
    * Indicates that it is a graphic that consists of several frames that can be played as an animation
    *
    * The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of just querying for the {@link GraphicDescriptor}
    */
  var Animated: Boolean
  
  /**
    * The number of bits per pixel used for the pixel graphic
    *
    * This property is not available for vector graphics and may not be available for some kinds of pixel graphics
    */
  var BitsPerPixel: Double
  
  /**
    * The type of the graphic
    * @see GraphicType
    */
  var GraphicType: Double
  
  /**
    * The MimeType of the loaded graphic
    *
    * The mime can be the original mime type of the graphic source the graphic container was constructed from or it can be the internal mime type
    * image/x-vclgraphic, in which case the original mime type is not available anymore
    *
    * Currently, the following mime types are supported for loaded graphics:
    *
    * erimage/x-targaimage/x-photoshopimage/x-epsimage/x-dxfimage/x-metimage/x-pictimage/x-sgfimage/x-svmimage/x-wmfimage/x-sgvimage/x-emfimage/x-vclgraphic
    */
  var MimeType: String
  
  /**
    * The Size of the graphic in 100th mm.
    *
    * This property may not be available in case of pixel graphics or if the logical size can not be determined correctly for some formats without loading
    * the whole graphic
    */
  var Size100thMM: Size
  
  /**
    * The Size of the graphic in pixel.
    *
    * This property may not be available in case of vector graphics or if the pixel size can not be determined correctly for some formats without loading
    * the whole graphic
    */
  var SizePixel: Size
  
  /**
    * Indicates that it is a transparent graphic
    *
    * This property is always `TRUE` for vector graphics. The status of this flag is not always clear if the graphic was not loaded at all, e.g. in case of
    * just querying for the {@link GraphicDescriptor} .
    */
  var Transparent: Boolean
}
object GraphicDescriptor {
  
  inline def apply(
    Alpha: Boolean,
    Animated: Boolean,
    BitsPerPixel: Double,
    GraphicType: Double,
    MimeType: String,
    PropertySetInfo: XPropertySetInfo,
    Size100thMM: Size,
    SizePixel: Size,
    Transparent: Boolean,
    acquire: Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setPropertyValue: (String, Any) => Callback
  ): GraphicDescriptor = {
    val __obj = js.Dynamic.literal(Alpha = Alpha.asInstanceOf[js.Any], Animated = Animated.asInstanceOf[js.Any], BitsPerPixel = BitsPerPixel.asInstanceOf[js.Any], GraphicType = GraphicType.asInstanceOf[js.Any], MimeType = MimeType.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Size100thMM = Size100thMM.asInstanceOf[js.Any], SizePixel = SizePixel.asInstanceOf[js.Any], Transparent = Transparent.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()))
    __obj.asInstanceOf[GraphicDescriptor]
  }
  
  extension [Self <: GraphicDescriptor](x: Self) {
    
    inline def setAlpha(value: Boolean): Self = StObject.set(x, "Alpha", value.asInstanceOf[js.Any])
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "Animated", value.asInstanceOf[js.Any])
    
    inline def setBitsPerPixel(value: Double): Self = StObject.set(x, "BitsPerPixel", value.asInstanceOf[js.Any])
    
    inline def setGraphicType(value: Double): Self = StObject.set(x, "GraphicType", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "MimeType", value.asInstanceOf[js.Any])
    
    inline def setSize100thMM(value: Size): Self = StObject.set(x, "Size100thMM", value.asInstanceOf[js.Any])
    
    inline def setSizePixel(value: Size): Self = StObject.set(x, "SizePixel", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "Transparent", value.asInstanceOf[js.Any])
  }
}
