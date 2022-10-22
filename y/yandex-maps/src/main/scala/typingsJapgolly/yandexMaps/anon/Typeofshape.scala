package typingsJapgolly.yandexMaps.anon

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.yandexMaps.mod.IPixelCircleGeometry
import typingsJapgolly.yandexMaps.mod.IPixelLineStringGeometry
import typingsJapgolly.yandexMaps.mod.IPixelMultiPolygonGeometry
import typingsJapgolly.yandexMaps.mod.IPixelPolygonGeometry
import typingsJapgolly.yandexMaps.mod.IPixelRectangleGeometry
import typingsJapgolly.yandexMaps.mod.shape.Circle
import typingsJapgolly.yandexMaps.mod.shape.LineString
import typingsJapgolly.yandexMaps.mod.shape.MultiPolygon
import typingsJapgolly.yandexMaps.mod.shape.Polygon
import typingsJapgolly.yandexMaps.mod.shape.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofshape extends StObject {
  
  var Circle: Instantiable2[
    /* pixelGeometry */ IPixelCircleGeometry, 
    /* params */ js.UndefOr[Fill], 
    typingsJapgolly.yandexMaps.mod.shape.Circle
  ]
  
  var LineString: Instantiable2[
    /* pixelGeometry */ IPixelLineStringGeometry, 
    /* params */ js.UndefOr[StrokeWidth], 
    typingsJapgolly.yandexMaps.mod.shape.LineString
  ]
  
  var MultiPolygon: Instantiable2[
    /* pixelGeometry */ IPixelMultiPolygonGeometry, 
    /* params */ js.UndefOr[Fill], 
    typingsJapgolly.yandexMaps.mod.shape.MultiPolygon
  ]
  
  var Polygon: Instantiable2[
    /* pixelGeometry */ IPixelPolygonGeometry, 
    /* params */ js.UndefOr[Fill], 
    typingsJapgolly.yandexMaps.mod.shape.Polygon
  ]
  
  var Rectangle: Instantiable2[
    /* geometry */ IPixelRectangleGeometry, 
    /* params */ js.UndefOr[Fill], 
    typingsJapgolly.yandexMaps.mod.shape.Rectangle
  ]
}
object Typeofshape {
  
  inline def apply(
    Circle: Instantiable2[/* pixelGeometry */ IPixelCircleGeometry, /* params */ js.UndefOr[Fill], Circle],
    LineString: Instantiable2[
      /* pixelGeometry */ IPixelLineStringGeometry, 
      /* params */ js.UndefOr[StrokeWidth], 
      LineString
    ],
    MultiPolygon: Instantiable2[
      /* pixelGeometry */ IPixelMultiPolygonGeometry, 
      /* params */ js.UndefOr[Fill], 
      MultiPolygon
    ],
    Polygon: Instantiable2[/* pixelGeometry */ IPixelPolygonGeometry, /* params */ js.UndefOr[Fill], Polygon],
    Rectangle: Instantiable2[/* geometry */ IPixelRectangleGeometry, /* params */ js.UndefOr[Fill], Rectangle]
  ): Typeofshape = {
    val __obj = js.Dynamic.literal(Circle = Circle.asInstanceOf[js.Any], LineString = LineString.asInstanceOf[js.Any], MultiPolygon = MultiPolygon.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any], Rectangle = Rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofshape]
  }
  
  extension [Self <: Typeofshape](x: Self) {
    
    inline def setCircle(
      value: Instantiable2[/* pixelGeometry */ IPixelCircleGeometry, /* params */ js.UndefOr[Fill], Circle]
    ): Self = StObject.set(x, "Circle", value.asInstanceOf[js.Any])
    
    inline def setLineString(
      value: Instantiable2[
          /* pixelGeometry */ IPixelLineStringGeometry, 
          /* params */ js.UndefOr[StrokeWidth], 
          LineString
        ]
    ): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setMultiPolygon(
      value: Instantiable2[
          /* pixelGeometry */ IPixelMultiPolygonGeometry, 
          /* params */ js.UndefOr[Fill], 
          MultiPolygon
        ]
    ): Self = StObject.set(x, "MultiPolygon", value.asInstanceOf[js.Any])
    
    inline def setPolygon(
      value: Instantiable2[/* pixelGeometry */ IPixelPolygonGeometry, /* params */ js.UndefOr[Fill], Polygon]
    ): Self = StObject.set(x, "Polygon", value.asInstanceOf[js.Any])
    
    inline def setRectangle(
      value: Instantiable2[/* geometry */ IPixelRectangleGeometry, /* params */ js.UndefOr[Fill], Rectangle]
    ): Self = StObject.set(x, "Rectangle", value.asInstanceOf[js.Any])
  }
}
