package typingsJapgolly.kiiCloudSdk.KiiCloud

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents Geo Point.
  */
trait KiiGeoPoint extends StObject {
  
  /**
    * Return the latitide of this point.
    */
  def getLatitude(): Double
  
  /**
    * Return the longitude of this point.
    */
  def getLongitude(): Double
}
object KiiGeoPoint {
  
  inline def apply(getLatitude: CallbackTo[Double], getLongitude: CallbackTo[Double]): KiiGeoPoint = {
    val __obj = js.Dynamic.literal(getLatitude = getLatitude.toJsFn, getLongitude = getLongitude.toJsFn)
    __obj.asInstanceOf[KiiGeoPoint]
  }
  
  extension [Self <: KiiGeoPoint](x: Self) {
    
    inline def setGetLatitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLatitude", value.toJsFn)
    
    inline def setGetLongitude(value: CallbackTo[Double]): Self = StObject.set(x, "getLongitude", value.toJsFn)
  }
}
