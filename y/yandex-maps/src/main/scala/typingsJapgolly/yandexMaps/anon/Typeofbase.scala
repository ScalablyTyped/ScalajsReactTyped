package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.yandexMaps.mod.geometry.base.LineString
import typingsJapgolly.yandexMaps.mod.geometry.base.Point
import typingsJapgolly.yandexMaps.mod.geometry.base.Polygon
import typingsJapgolly.yandexMaps.yandexMapsStrings.evenOdd
import typingsJapgolly.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofbase extends StObject {
  
  var LineString: Instantiable0[typingsJapgolly.yandexMaps.mod.geometry.base.LineString] & TypeofLineString
  
  var Point: Instantiable0[typingsJapgolly.yandexMaps.mod.geometry.base.Point]
  
  var Polygon: (Instantiable2[
    /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
    /* fillRule */ js.UndefOr[evenOdd | nonZero], 
    typingsJapgolly.yandexMaps.mod.geometry.base.Polygon
  ]) & TypeofPolygon
}
object Typeofbase {
  
  inline def apply(
    LineString: Instantiable0[LineString] & TypeofLineString,
    Point: Instantiable0[Point],
    Polygon: (Instantiable2[
      /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
      /* fillRule */ js.UndefOr[evenOdd | nonZero], 
      Polygon
    ]) & TypeofPolygon
  ): Typeofbase = {
    val __obj = js.Dynamic.literal(LineString = LineString.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofbase]
  }
  
  extension [Self <: Typeofbase](x: Self) {
    
    inline def setLineString(value: Instantiable0[LineString] & TypeofLineString): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Instantiable0[Point]): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPolygon(
      value: (Instantiable2[
          /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
          /* fillRule */ js.UndefOr[evenOdd | nonZero], 
          Polygon
        ]) & TypeofPolygon
    ): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
