package typingsJapgolly.kendoUi.global.kendo.dataviz

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.ArcOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.CircleOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.ElementOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.GradientOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.GradientStopOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.GroupOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.LayoutOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.LinearGradientOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.MultiPathOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.OptionsStoreOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.PathOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.RadialGradientOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.RectOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.SurfaceOptions
import typingsJapgolly.kendoUi.kendo.dataviz.drawing.TextOptions
import typingsJapgolly.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("kendo.dataviz.drawing.Arc")
  @js.native
  open class Arc protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Arc {
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Circle {
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Element")
  @js.native
  open class Element ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Gradient")
  @js.native
  open class Gradient ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Gradient {
    def this(options: GradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typingsJapgolly.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: Any = js.native
  }
  
  @JSGlobal("kendo.dataviz.drawing.GradientStop")
  @js.native
  open class GradientStop ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
    
    /* CompleteClass */
    var options: GradientStopOptions = js.native
  }
  
  @JSGlobal("kendo.dataviz.drawing.Group")
  @js.native
  open class Group ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Image")
  @js.native
  open class Image protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Image {
    def this(src: String, rect: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Layout")
  @js.native
  open class Layout protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Layout {
    def this(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.LinearGradient")
  @js.native
  open class LinearGradient ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: typingsJapgolly.kendoUi.kendo.drawing.GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typingsJapgolly.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: Any = js.native
  }
  
  @JSGlobal("kendo.dataviz.drawing.MultiPath")
  @js.native
  open class MultiPath ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.OptionsStore")
  @js.native
  open class OptionsStore ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.OptionsStore {
    def this(options: OptionsStoreOptions) = this()
    
    /* CompleteClass */
    override def get(field: String): Any = js.native
    
    /* CompleteClass */
    var observer: Any = js.native
    
    /* CompleteClass */
    var options: OptionsStoreOptions = js.native
    
    /* CompleteClass */
    override def set(field: String, value: Any): Unit = js.native
  }
  
  @JSGlobal("kendo.dataviz.drawing.Path")
  @js.native
  open class Path ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Path {
    def this(options: PathOptions) = this()
  }
  object Path {
    
    @JSGlobal("kendo.dataviz.drawing.Path")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromArc(arc: typingsJapgolly.kendoUi.kendo.geometry.Arc): typingsJapgolly.kendoUi.kendo.drawing.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArc")(arc.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Path]
    inline def fromArc(arc: typingsJapgolly.kendoUi.kendo.geometry.Arc, options: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArc")(arc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Path]
    
    /* static member */
    inline def fromPoints(points: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Path]
    inline def fromPoints(points: Any, options: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromPoints")(points.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Path]
    
    /* static member */
    inline def fromRect(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect): typingsJapgolly.kendoUi.kendo.drawing.Path = ^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rect.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Path]
    inline def fromRect(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: Any): typingsJapgolly.kendoUi.kendo.drawing.Path = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRect")(rect.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Path]
    
    /* static member */
    inline def parse(svgPath: String): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(svgPath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.MultiPath]
    inline def parse(svgPath: String, options: Any): typingsJapgolly.kendoUi.kendo.drawing.MultiPath = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(svgPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.MultiPath]
  }
  
  @JSGlobal("kendo.dataviz.drawing.RadialGradient")
  @js.native
  open class RadialGradient ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: typingsJapgolly.kendoUi.kendo.drawing.GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typingsJapgolly.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: Any = js.native
  }
  
  @JSGlobal("kendo.dataviz.drawing.Rect")
  @js.native
  open class Rect protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Rect {
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Segment")
  @js.native
  open class Segment protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @JSGlobal("kendo.dataviz.drawing.Surface")
  @js.native
  open class Surface ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  object Surface {
    
    @JSGlobal("kendo.dataviz.drawing.Surface")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(element: JQuery): typingsJapgolly.kendoUi.kendo.drawing.Surface = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
    inline def create(element: JQuery, options: Any): typingsJapgolly.kendoUi.kendo.drawing.Surface = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
    /* static member */
    inline def create(element: typingsJapgolly.kendoUi.kendo.dataviz.drawing.Element): typingsJapgolly.kendoUi.kendo.drawing.Surface = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
    inline def create(element: typingsJapgolly.kendoUi.kendo.dataviz.drawing.Element, options: Any): typingsJapgolly.kendoUi.kendo.drawing.Surface = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
  }
  
  @JSGlobal("kendo.dataviz.drawing.Text")
  @js.native
  open class Text protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
}
