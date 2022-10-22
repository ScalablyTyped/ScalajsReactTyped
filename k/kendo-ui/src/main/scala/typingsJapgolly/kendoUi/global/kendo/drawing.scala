package typingsJapgolly.kendoUi.global.kendo

import typingsJapgolly.kendoUi.JQuery
import typingsJapgolly.kendoUi.JQueryPromise
import typingsJapgolly.kendoUi.kendo.drawing.ArcOptions
import typingsJapgolly.kendoUi.kendo.drawing.CircleOptions
import typingsJapgolly.kendoUi.kendo.drawing.ElementOptions
import typingsJapgolly.kendoUi.kendo.drawing.GradientOptions
import typingsJapgolly.kendoUi.kendo.drawing.GradientStopOptions
import typingsJapgolly.kendoUi.kendo.drawing.GroupOptions
import typingsJapgolly.kendoUi.kendo.drawing.LayoutOptions
import typingsJapgolly.kendoUi.kendo.drawing.LinearGradientOptions
import typingsJapgolly.kendoUi.kendo.drawing.MultiPathOptions
import typingsJapgolly.kendoUi.kendo.drawing.OptionsStoreOptions
import typingsJapgolly.kendoUi.kendo.drawing.PDFOptions
import typingsJapgolly.kendoUi.kendo.drawing.PathOptions
import typingsJapgolly.kendoUi.kendo.drawing.RadialGradientOptions
import typingsJapgolly.kendoUi.kendo.drawing.RectOptions
import typingsJapgolly.kendoUi.kendo.drawing.SurfaceOptions
import typingsJapgolly.kendoUi.kendo.drawing.TextOptions
import typingsJapgolly.kendoUi.kendo.geometry.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object drawing {
  
  @JSGlobal("kendo.drawing")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("kendo.drawing.Arc")
  @js.native
  open class Arc protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Arc {
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Arc) = this()
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Arc, options: ArcOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Circle")
  @js.native
  open class Circle protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Circle {
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Circle) = this()
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Circle, options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Element")
  @js.native
  open class Element ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Element {
    def this(options: ElementOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Gradient")
  @js.native
  open class Gradient ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Gradient {
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
  
  @JSGlobal("kendo.drawing.GradientStop")
  @js.native
  open class GradientStop ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.GradientStop {
    def this(options: GradientStopOptions) = this()
    
    /* CompleteClass */
    var options: GradientStopOptions = js.native
  }
  
  @JSGlobal("kendo.drawing.Group")
  @js.native
  open class Group ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Image")
  @js.native
  open class Image protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Image {
    def this(src: String, rect: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
  }
  
  @JSGlobal("kendo.drawing.Layout")
  @js.native
  open class Layout protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Layout {
    def this(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
    def this(rect: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.LinearGradient")
  @js.native
  open class LinearGradient ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.LinearGradient {
    def this(options: LinearGradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typingsJapgolly.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: Any = js.native
  }
  
  @JSGlobal("kendo.drawing.MultiPath")
  @js.native
  open class MultiPath ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.MultiPath {
    def this(options: MultiPathOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.OptionsStore")
  @js.native
  open class OptionsStore ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.OptionsStore {
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
  
  @JSGlobal("kendo.drawing.Path")
  @js.native
  open class Path ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Path {
    def this(options: PathOptions) = this()
  }
  object Path {
    
    @JSGlobal("kendo.drawing.Path")
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
  
  @JSGlobal("kendo.drawing.RadialGradient")
  @js.native
  open class RadialGradient ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.RadialGradient {
    def this(options: RadialGradientOptions) = this()
    
    /* CompleteClass */
    override def addStop(offset: Double, color: String, opacity: Double): typingsJapgolly.kendoUi.kendo.drawing.GradientStop = js.native
    
    /* CompleteClass */
    var options: GradientOptions = js.native
    
    /* CompleteClass */
    override def removeStop(stop: typingsJapgolly.kendoUi.kendo.drawing.GradientStop): Unit = js.native
    
    /* CompleteClass */
    var stops: Any = js.native
  }
  
  @JSGlobal("kendo.drawing.Rect")
  @js.native
  open class Rect protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Rect {
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect) = this()
    def this(geometry: typingsJapgolly.kendoUi.kendo.geometry.Rect, options: RectOptions) = this()
  }
  
  @JSGlobal("kendo.drawing.Segment")
  @js.native
  open class Segment protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Segment {
    def this(anchor: Point, controlIn: Point, controlOut: Point) = this()
  }
  
  @JSGlobal("kendo.drawing.Surface")
  @js.native
  open class Surface ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Surface {
    def this(options: SurfaceOptions) = this()
  }
  object Surface {
    
    @JSGlobal("kendo.drawing.Surface")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(element: JQuery): typingsJapgolly.kendoUi.kendo.drawing.Surface = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
    inline def create(element: JQuery, options: Any): typingsJapgolly.kendoUi.kendo.drawing.Surface = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
    /* static member */
    inline def create(element: typingsJapgolly.kendoUi.kendo.drawing.Element): typingsJapgolly.kendoUi.kendo.drawing.Surface = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
    inline def create(element: typingsJapgolly.kendoUi.kendo.drawing.Element, options: Any): typingsJapgolly.kendoUi.kendo.drawing.Surface = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kendoUi.kendo.drawing.Surface]
  }
  
  @JSGlobal("kendo.drawing.Text")
  @js.native
  open class Text protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.drawing.Text {
    def this(content: String, position: Point) = this()
    def this(content: String, position: Point, options: TextOptions) = this()
  }
  
  inline def align(elements: Any, rect: typingsJapgolly.kendoUi.kendo.geometry.Rect, alignment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("align")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def drawDOM(element: JQuery, options: Any): JQueryPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("drawDOM")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[Any]]
  
  inline def exportImage(group: typingsJapgolly.kendoUi.kendo.drawing.Group): JQueryPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportImage")(group.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise[Any]]
  inline def exportImage(group: typingsJapgolly.kendoUi.kendo.drawing.Group, options: Any): JQueryPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportImage")(group.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[Any]]
  
  inline def exportPDF(group: typingsJapgolly.kendoUi.kendo.drawing.Group): JQueryPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportPDF")(group.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise[Any]]
  inline def exportPDF(group: typingsJapgolly.kendoUi.kendo.drawing.Group, options: PDFOptions): JQueryPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportPDF")(group.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[Any]]
  
  inline def exportSVG(group: typingsJapgolly.kendoUi.kendo.drawing.Group): JQueryPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("exportSVG")(group.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise[Any]]
  inline def exportSVG(group: typingsJapgolly.kendoUi.kendo.drawing.Group, options: Any): JQueryPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exportSVG")(group.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[Any]]
  
  inline def fit(
    element: typingsJapgolly.kendoUi.kendo.drawing.Element,
    rect: typingsJapgolly.kendoUi.kendo.geometry.Rect
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fit")(element.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object pdf {
    
    @JSGlobal("kendo.drawing.pdf")
    @js.native
    val ^ : js.Any = js.native
    
    inline def saveAs(group: typingsJapgolly.kendoUi.kendo.drawing.Group, fileName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(group: typingsJapgolly.kendoUi.kendo.drawing.Group, fileName: String, proxyUrl: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(
      group: typingsJapgolly.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: String,
      callback: js.Function
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def saveAs(
      group: typingsJapgolly.kendoUi.kendo.drawing.Group,
      fileName: String,
      proxyUrl: Unit,
      callback: js.Function
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(group.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any], proxyUrl.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def stack(elements: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stack")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def vAlign(elements: Any, rect: typingsJapgolly.kendoUi.kendo.geometry.Rect, alignment: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("vAlign")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any], alignment.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def vStack(elements: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vStack")(elements.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def vWrap(elements: Any, rect: typingsJapgolly.kendoUi.kendo.geometry.Rect): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("vWrap")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def wrap(elements: Any, rect: typingsJapgolly.kendoUi.kendo.geometry.Rect): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(elements.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Any]
}
