package typingsJapgolly.kendoUi.global.kendo

import typingsJapgolly.kendoUi.kendo.geometry.ArcOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometry {
  
  @JSGlobal("kendo.geometry.Arc")
  @js.native
  open class Arc protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.geometry.Arc {
    def this(center: Any) = this()
    def this(center: typingsJapgolly.kendoUi.kendo.geometry.Point) = this()
    def this(center: Any, options: ArcOptions) = this()
    def this(center: typingsJapgolly.kendoUi.kendo.geometry.Point, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.geometry.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.geometry.Circle {
    def this(center: Any, radius: Double) = this()
    def this(center: typingsJapgolly.kendoUi.kendo.geometry.Point, radius: Double) = this()
  }
  
  @JSGlobal("kendo.geometry.Matrix")
  @js.native
  open class Matrix ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.geometry.Matrix
  object Matrix {
    
    @JSGlobal("kendo.geometry.Matrix")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def rotate(angle: Double, x: Double, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("rotate")(angle.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Matrix]
    
    /* static member */
    inline def scale(scaleX: Double, scaleY: Double): typingsJapgolly.kendoUi.kendo.geometry.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Matrix]
    
    /* static member */
    inline def translate(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Matrix]
    
    /* static member */
    inline def unit(): typingsJapgolly.kendoUi.kendo.geometry.Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("unit")().asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Matrix]
  }
  
  @JSGlobal("kendo.geometry.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.geometry.Point {
    def this(x: Double, y: Double) = this()
  }
  object Point {
    
    @JSGlobal("kendo.geometry.Point")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(x: Any, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Point]
    /* static member */
    inline def create(x: Double, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Point]
    /* static member */
    inline def create(x: typingsJapgolly.kendoUi.kendo.geometry.Point, y: Double): typingsJapgolly.kendoUi.kendo.geometry.Point = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def max(): typingsJapgolly.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("max")().asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def maxPoint(): typingsJapgolly.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("maxPoint")().asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def min(): typingsJapgolly.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("min")().asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Point]
    
    /* static member */
    inline def minPoint(): typingsJapgolly.kendoUi.kendo.geometry.Point = ^.asInstanceOf[js.Dynamic].applyDynamic("minPoint")().asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Point]
  }
  
  @JSGlobal("kendo.geometry.Rect")
  @js.native
  open class Rect protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.geometry.Rect {
    def this(origin: Any, size: Any) = this()
    def this(origin: Any, size: typingsJapgolly.kendoUi.kendo.geometry.Size) = this()
    def this(origin: typingsJapgolly.kendoUi.kendo.geometry.Point, size: Any) = this()
    def this(
      origin: typingsJapgolly.kendoUi.kendo.geometry.Point,
      size: typingsJapgolly.kendoUi.kendo.geometry.Size
    ) = this()
  }
  object Rect {
    
    @JSGlobal("kendo.geometry.Rect")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromPoints(
      pointA: typingsJapgolly.kendoUi.kendo.geometry.Point,
      pointB: typingsJapgolly.kendoUi.kendo.geometry.Point
    ): typingsJapgolly.kendoUi.kendo.geometry.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(pointA.asInstanceOf[js.Any], pointB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Rect]
    
    /* static member */
    inline def union(
      rectA: typingsJapgolly.kendoUi.kendo.geometry.Rect,
      rectB: typingsJapgolly.kendoUi.kendo.geometry.Rect
    ): typingsJapgolly.kendoUi.kendo.geometry.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(rectA.asInstanceOf[js.Any], rectB.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Rect]
  }
  
  @JSGlobal("kendo.geometry.Size")
  @js.native
  open class Size ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.geometry.Size
  object Size {
    
    @JSGlobal("kendo.geometry.Size")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(width: Any, height: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Size]
    /* static member */
    inline def create(width: Double, height: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Size]
    /* static member */
    inline def create(width: typingsJapgolly.kendoUi.kendo.geometry.Size, height: Double): typingsJapgolly.kendoUi.kendo.geometry.Size = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.geometry.Size]
  }
  
  @JSGlobal("kendo.geometry.Transformation")
  @js.native
  open class Transformation ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.geometry.Transformation
}
