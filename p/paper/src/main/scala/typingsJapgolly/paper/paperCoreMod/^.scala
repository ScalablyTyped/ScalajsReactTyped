package typingsJapgolly.paper.paperCoreMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable6
import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.paper.TypeofColor
import typingsJapgolly.paper.TypeofKey
import typingsJapgolly.paper.TypeofPaperScope
import typingsJapgolly.paper.TypeofPath
import typingsJapgolly.paper.TypeofPathItem
import typingsJapgolly.paper.TypeofPoint
import typingsJapgolly.paper.TypeofShape
import typingsJapgolly.paper.TypeofSize
import typingsJapgolly.paper.paper.Color
import typingsJapgolly.paper.paper.Point
import typingsJapgolly.paper.paper.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Color: TypeofColor = js.native
  var CompoundPath: Instantiable1[/* pathData */ String, typingsJapgolly.paper.paper.CompoundPath] = js.native
  var Curve: Instantiable2[
    /* segment1 */ typingsJapgolly.paper.paper.Segment, 
    /* segment2 */ typingsJapgolly.paper.paper.Segment, 
    typingsJapgolly.paper.paper.Curve
  ] = js.native
  var CurveLocation: Instantiable3[
    /* curve */ typingsJapgolly.paper.paper.Curve, 
    /* time */ Double, 
    js.UndefOr[/* point */ Point], 
    typingsJapgolly.paper.paper.CurveLocation
  ] = js.native
  var Event: Instantiable0[typingsJapgolly.paper.paper.Event] = js.native
  var Gradient: Instantiable0[typingsJapgolly.paper.paper.Gradient] = js.native
  var GradientStop: Instantiable2[
    js.UndefOr[/* color */ Color], 
    js.UndefOr[/* offset */ Double], 
    typingsJapgolly.paper.paper.GradientStop
  ] = js.native
  var Group: Instantiable1[
    js.UndefOr[/* children */ js.Array[typingsJapgolly.paper.paper.Item]], 
    typingsJapgolly.paper.paper.Group
  ] = js.native
  var HitResult: Instantiable0[typingsJapgolly.paper.paper.HitResult] = js.native
  var Item: Instantiable0[typingsJapgolly.paper.paper.Item] = js.native
  var Key: TypeofKey = js.native
  var KeyEvent: Instantiable0[typingsJapgolly.paper.paper.KeyEvent] = js.native
  var Layer: Instantiable1[
    js.UndefOr[/* children */ js.Array[typingsJapgolly.paper.paper.Item]], 
    typingsJapgolly.paper.paper.Layer
  ] = js.native
  var Matrix: Instantiable0[typingsJapgolly.paper.paper.Matrix] = js.native
  var MouseEvent: Instantiable0[typingsJapgolly.paper.paper.MouseEvent] = js.native
  var PaperScope: TypeofPaperScope = js.native
  var Path: TypeofPath with (Instantiable1[
    js.UndefOr[/* segments */ js.Array[typingsJapgolly.paper.paper.Segment]], 
    typingsJapgolly.paper.paper.Path
  ]) = js.native
  var PathItem: TypeofPathItem = js.native
  var Point: TypeofPoint = js.native
  var PointText: Instantiable1[/* point */ Point, typingsJapgolly.paper.paper.PointText] = js.native
  var Project: Instantiable1[
    /* element */ HTMLCanvasElement | String | Size, 
    typingsJapgolly.paper.paper.Project
  ] = js.native
  var Raster: Instantiable2[
    js.UndefOr[HTMLImageElement | HTMLCanvasElement | String], 
    js.UndefOr[/* position */ Point], 
    typingsJapgolly.paper.paper.Raster
  ] = js.native
  var Rectangle: Instantiable2[/* point */ Point, /* size */ Size, typingsJapgolly.paper.paper.Rectangle] = js.native
  var Segment: Instantiable3[
    js.UndefOr[/* point */ Point], 
    js.UndefOr[/* handleIn */ Point], 
    js.UndefOr[/* handleOut */ Point], 
    typingsJapgolly.paper.paper.Segment
  ] = js.native
  var Shape: TypeofShape with Instantiable0[typingsJapgolly.paper.paper.Shape] = js.native
  var Size: TypeofSize = js.native
  var Style: Instantiable1[/* style */ js.Object, typingsJapgolly.paper.paper.Style] = js.native
  var SymbolDefinition: Instantiable2[
    /* item */ typingsJapgolly.paper.paper.Item, 
    js.UndefOr[/* dontCenter */ Boolean], 
    typingsJapgolly.paper.paper.SymbolDefinition
  ] = js.native
  var SymbolItem: Instantiable2[
    /* definition */ typingsJapgolly.paper.paper.SymbolDefinition | typingsJapgolly.paper.paper.Item, 
    js.UndefOr[/* point */ Point], 
    typingsJapgolly.paper.paper.SymbolItem
  ] = js.native
  var TextItem: Instantiable0[typingsJapgolly.paper.paper.TextItem] = js.native
  var Tool: Instantiable0[typingsJapgolly.paper.paper.Tool] = js.native
  var ToolEvent: Instantiable0[typingsJapgolly.paper.paper.ToolEvent] = js.native
  var Tween: Instantiable6[
    /* object */ js.Object, 
    /* from */ js.Object, 
    /* to */ js.Object, 
    /* duration */ Double, 
    js.UndefOr[String | js.Function], 
    js.UndefOr[/* start */ Boolean], 
    typingsJapgolly.paper.paper.Tween
  ] = js.native
  var View: Instantiable0[typingsJapgolly.paper.paper.View] = js.native
  @JSName("activate")
  var activate_Original: js.Function0[Unit] = js.native
  @JSName("constructor")
  var constructor_Original: js.Function0[js.Any] = js.native
  @JSName("execute")
  var execute_Original: js.Function2[/* code */ String, /* options */ js.UndefOr[js.Object], Unit] = js.native
  var get: js.Any = js.native
  @JSName("install")
  var install_Original: js.Function1[/* scope */ js.Any, Unit] = js.native
  var project: typingsJapgolly.paper.paper.Project = js.native
  var projects: js.Array[typingsJapgolly.paper.paper.Project] = js.native
  var settings: js.Any = js.native
  @JSName("setup")
  var setup_Original: js.Function1[/* element */ HTMLCanvasElement | String | Size, Unit] = js.native
  var tool: typingsJapgolly.paper.paper.Tool = js.native
  var tools: js.Array[typingsJapgolly.paper.paper.Tool] = js.native
  var version: String = js.native
  var view: typingsJapgolly.paper.paper.View = js.native
  def activate(): Unit = js.native
  def execute(code: String): Unit = js.native
  def execute(code: String, options: js.Object): Unit = js.native
  def install(scope: js.Any): Unit = js.native
  def setup(element: String): Unit = js.native
  def setup(element: Size): Unit = js.native
  def setup(element: typingsJapgolly.std.HTMLCanvasElement): Unit = js.native
}

