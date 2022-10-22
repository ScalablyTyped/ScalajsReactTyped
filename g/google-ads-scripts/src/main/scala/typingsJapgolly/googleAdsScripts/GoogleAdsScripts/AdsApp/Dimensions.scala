package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Pixel dimensions of a media object. */
trait Dimensions extends StObject {
  
  /** Returns the height. */
  def getHeight(): Double
  
  /** Returns the width. */
  def getWidth(): Double
}
object Dimensions {
  
  inline def apply(getHeight: CallbackTo[Double], getWidth: CallbackTo[Double]): Dimensions = {
    val __obj = js.Dynamic.literal(getHeight = getHeight.toJsFn, getWidth = getWidth.toJsFn)
    __obj.asInstanceOf[Dimensions]
  }
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
    
    inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
  }
}
