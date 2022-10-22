package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.yandexMaps.mod.geometry.LineString
import typingsJapgolly.yandexMaps.mod.geometry.Point
import typingsJapgolly.yandexMaps.mod.geometry.Polygon
import typingsJapgolly.yandexMaps.yandexMapsStrings.evenOdd
import typingsJapgolly.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofgeometry extends StObject {
  
  var LineString: (Instantiable2[
    /* coordinates */ js.UndefOr[js.Array[js.Array[Double]]], 
    /* options */ js.UndefOr[CoordRendering], 
    typingsJapgolly.yandexMaps.mod.geometry.LineString
  ]) & TypeofLineString
  
  var Point: Instantiable1[
    /* coordinates */ js.UndefOr[js.Array[Double] | Null], 
    typingsJapgolly.yandexMaps.mod.geometry.Point
  ]
  
  var Polygon: (Instantiable3[
    /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
    /* fillRule */ js.UndefOr[evenOdd | nonZero], 
    /* options */ js.UndefOr[js.Object], 
    typingsJapgolly.yandexMaps.mod.geometry.Polygon
  ]) & TypeofPolygonFromEncodedCoordinates
  
  val base: Typeofbase
  
  val pixel: Typeofpixel
}
object Typeofgeometry {
  
  inline def apply(
    LineString: (Instantiable2[
      /* coordinates */ js.UndefOr[js.Array[js.Array[Double]]], 
      /* options */ js.UndefOr[CoordRendering], 
      LineString
    ]) & TypeofLineString,
    Point: Instantiable1[/* coordinates */ js.UndefOr[js.Array[Double] | Null], Point],
    Polygon: (Instantiable3[
      /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
      /* fillRule */ js.UndefOr[evenOdd | nonZero], 
      /* options */ js.UndefOr[js.Object], 
      Polygon
    ]) & TypeofPolygonFromEncodedCoordinates,
    base: Typeofbase,
    pixel: Typeofpixel
  ): Typeofgeometry = {
    val __obj = js.Dynamic.literal(LineString = LineString.asInstanceOf[js.Any], Point = Point.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofgeometry]
  }
  
  extension [Self <: Typeofgeometry](x: Self) {
    
    inline def setBase(value: Typeofbase): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setLineString(
      value: (Instantiable2[
          /* coordinates */ js.UndefOr[js.Array[js.Array[Double]]], 
          /* options */ js.UndefOr[CoordRendering], 
          LineString
        ]) & TypeofLineString
    ): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setPixel(value: Typeofpixel): Self = StObject.set(x, "pixel", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: Instantiable1[/* coordinates */ js.UndefOr[js.Array[Double] | Null], Point]): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPolygon(
      value: (Instantiable3[
          /* coordinates */ js.UndefOr[js.Array[js.Array[js.Array[Double]]]], 
          /* fillRule */ js.UndefOr[evenOdd | nonZero], 
          /* options */ js.UndefOr[js.Object], 
          Polygon
        ]) & TypeofPolygonFromEncodedCoordinates
    ): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
  }
}
