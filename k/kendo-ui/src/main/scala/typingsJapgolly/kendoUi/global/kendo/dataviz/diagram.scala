package typingsJapgolly.kendoUi.global.kendo.dataviz

import typingsJapgolly.kendoUi.kendo.dataviz.diagram.CircleOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.ConnectionOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.ConnectorOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.GroupOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.ImageOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.LayoutOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.LineOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.PathOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.PolylineOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.RectangleOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.ShapeOptions
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.TextBlockOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagram {
  
  @JSGlobal("kendo.dataviz.diagram.Circle")
  @js.native
  open class Circle ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Circle {
    def this(options: CircleOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Connection")
  @js.native
  open class Connection ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Connection {
    def this(from: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape) = this()
    def this(from: Unit, to: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape) = this()
    def this(
      from: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape,
      to: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape
    ) = this()
    def this(from: Unit, to: Unit, options: ConnectionOptions) = this()
    def this(from: Unit, to: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape, options: ConnectionOptions) = this()
    def this(from: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape, to: Unit, options: ConnectionOptions) = this()
    def this(
      from: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape,
      to: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape,
      options: ConnectionOptions
    ) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Connector")
  @js.native
  open class Connector ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Connector {
    def this(options: ConnectorOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Group")
  @js.native
  open class Group ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Group {
    def this(options: GroupOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Image")
  @js.native
  open class Image ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Image {
    def this(options: ImageOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Layout")
  @js.native
  open class Layout protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Layout {
    def this(rect: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Rect) = this()
    def this(rect: typingsJapgolly.kendoUi.kendo.dataviz.diagram.Rect, options: LayoutOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Line")
  @js.native
  open class Line ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Line {
    def this(options: LineOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Path")
  @js.native
  open class Path ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Path {
    def this(options: PathOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Point")
  @js.native
  open class Point protected ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Point {
    def this(x: Double, y: Double) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Polyline")
  @js.native
  open class Polyline ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Polyline {
    def this(options: PolylineOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Rect")
  @js.native
  open class Rect ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Rect {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Rectangle")
  @js.native
  open class Rectangle ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Rectangle {
    def this(options: RectangleOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.Shape")
  @js.native
  open class Shape ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.Shape {
    def this(options: ShapeOptions) = this()
  }
  
  @JSGlobal("kendo.dataviz.diagram.TextBlock")
  @js.native
  open class TextBlock ()
    extends StObject
       with typingsJapgolly.kendoUi.kendo.dataviz.diagram.TextBlock {
    def this(options: TextBlockOptions) = this()
  }
}
