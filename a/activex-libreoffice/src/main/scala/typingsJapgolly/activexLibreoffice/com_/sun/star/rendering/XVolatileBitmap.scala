package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.IntegerSize2D
import typingsJapgolly.activexLibreoffice.com_.sun.star.geometry.RealSize2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a specialized interface to a volatile bitmap (which can become invalid at any point in time). */
trait XVolatileBitmap
  extends StObject
     with XBitmap {
  
  /**
    * Query whether this volatile bitmap still has valid content.
    *
    * As the video RAM allocated to this bitmap can be reclaimed at any time, a return value of true here does not imply that the next draw operation with
    * this bitmap will succeed. Instead, the exception VolatileContentDestroyed might then be thrown, if lost bitmap data is accessed.
    */
  def isValid(): Boolean
}
object XVolatileBitmap {
  
  inline def apply(
    Size: IntegerSize2D,
    acquire: Callback,
    getScaledBitmap: (RealSize2D, Boolean) => XBitmap,
    getSize: CallbackTo[IntegerSize2D],
    hasAlpha: CallbackTo[Boolean],
    isValid: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XVolatileBitmap = {
    val __obj = js.Dynamic.literal(Size = Size.asInstanceOf[js.Any], acquire = acquire.toJsFn, getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = getSize.toJsFn, hasAlpha = hasAlpha.toJsFn, isValid = isValid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XVolatileBitmap]
  }
  
  extension [Self <: XVolatileBitmap](x: Self) {
    
    inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
  }
}
