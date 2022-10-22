package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a bitmap in the Microsoft DIB format. */
trait XBitmap
  extends StObject
     with XInterface {
  
  /** returns the device independent bitmap. */
  val DIB: SafeArray[Double]
  
  /** returns the transparency mask of the device independent bitmap. */
  val MaskDIB: SafeArray[Double]
  
  /** returns the size of the bitmap in pixel. */
  val Size: typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
  
  /** returns the device independent bitmap. */
  def getDIB(): SafeArray[Double]
  
  /** returns the transparency mask of the device independent bitmap. */
  def getMaskDIB(): SafeArray[Double]
  
  /** returns the size of the bitmap in pixel. */
  def getSize(): typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
}
object XBitmap {
  
  inline def apply(
    DIB: SafeArray[Double],
    MaskDIB: SafeArray[Double],
    Size: Size,
    acquire: Callback,
    getDIB: CallbackTo[SafeArray[Double]],
    getMaskDIB: CallbackTo[SafeArray[Double]],
    getSize: CallbackTo[Size],
    queryInterface: `type` => Any,
    release: Callback
  ): XBitmap = {
    val __obj = js.Dynamic.literal(DIB = DIB.asInstanceOf[js.Any], MaskDIB = MaskDIB.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getDIB = getDIB.toJsFn, getMaskDIB = getMaskDIB.toJsFn, getSize = getSize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XBitmap]
  }
  
  extension [Self <: XBitmap](x: Self) {
    
    inline def setDIB(value: SafeArray[Double]): Self = StObject.set(x, "DIB", value.asInstanceOf[js.Any])
    
    inline def setGetDIB(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getDIB", value.toJsFn)
    
    inline def setGetMaskDIB(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getMaskDIB", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setMaskDIB(value: SafeArray[Double]): Self = StObject.set(x, "MaskDIB", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
  }
}
