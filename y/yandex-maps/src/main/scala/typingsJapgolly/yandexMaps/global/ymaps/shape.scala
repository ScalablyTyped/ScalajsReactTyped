package typingsJapgolly.yandexMaps.global.ymaps

import typingsJapgolly.yandexMaps.anon.Fill
import typingsJapgolly.yandexMaps.anon.StrokeWidth
import typingsJapgolly.yandexMaps.mod.IPixelCircleGeometry
import typingsJapgolly.yandexMaps.mod.IPixelLineStringGeometry
import typingsJapgolly.yandexMaps.mod.IPixelMultiPolygonGeometry
import typingsJapgolly.yandexMaps.mod.IPixelPolygonGeometry
import typingsJapgolly.yandexMaps.mod.IPixelRectangleGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shape {
  
  @JSGlobal("ymaps.shape.Circle")
  @js.native
  open class Circle protected ()
    extends typingsJapgolly.yandexMaps.mod.shape.Circle {
    def this(pixelGeometry: IPixelCircleGeometry) = this()
    def this(pixelGeometry: IPixelCircleGeometry, params: Fill) = this()
  }
  
  @JSGlobal("ymaps.shape.LineString")
  @js.native
  open class LineString protected ()
    extends typingsJapgolly.yandexMaps.mod.shape.LineString {
    def this(pixelGeometry: IPixelLineStringGeometry) = this()
    def this(pixelGeometry: IPixelLineStringGeometry, params: StrokeWidth) = this()
  }
  
  @JSGlobal("ymaps.shape.MultiPolygon")
  @js.native
  open class MultiPolygon protected ()
    extends typingsJapgolly.yandexMaps.mod.shape.MultiPolygon {
    def this(pixelGeometry: IPixelMultiPolygonGeometry) = this()
    def this(pixelGeometry: IPixelMultiPolygonGeometry, params: Fill) = this()
  }
  
  @JSGlobal("ymaps.shape.Polygon")
  @js.native
  open class Polygon protected ()
    extends typingsJapgolly.yandexMaps.mod.shape.Polygon {
    def this(pixelGeometry: IPixelPolygonGeometry) = this()
    def this(pixelGeometry: IPixelPolygonGeometry, params: Fill) = this()
  }
  
  @JSGlobal("ymaps.shape.Rectangle")
  @js.native
  open class Rectangle protected ()
    extends typingsJapgolly.yandexMaps.mod.shape.Rectangle {
    def this(geometry: IPixelRectangleGeometry) = this()
    def this(geometry: IPixelRectangleGeometry, params: Fill) = this()
  }
}
