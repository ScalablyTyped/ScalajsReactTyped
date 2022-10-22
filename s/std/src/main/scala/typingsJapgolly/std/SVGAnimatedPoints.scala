package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGAnimatedPoints extends StObject {
  
  /* standard dom */
  val animatedPoints: org.scalajs.dom.SVGPointList
  
  /* standard dom */
  val points: org.scalajs.dom.SVGPointList
}
object SVGAnimatedPoints {
  
  inline def apply(animatedPoints: org.scalajs.dom.SVGPointList, points: org.scalajs.dom.SVGPointList): SVGAnimatedPoints = {
    val __obj = js.Dynamic.literal(animatedPoints = animatedPoints.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPoints]
  }
  
  extension [Self <: SVGAnimatedPoints](x: Self) {
    
    inline def setAnimatedPoints(value: org.scalajs.dom.SVGPointList): Self = StObject.set(x, "animatedPoints", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: org.scalajs.dom.SVGPointList): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
  }
}
