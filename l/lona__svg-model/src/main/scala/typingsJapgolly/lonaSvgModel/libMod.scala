package typingsJapgolly.lonaSvgModel

import typingsJapgolly.csscolorparserTs.mod.RGBA
import typingsJapgolly.lonaSvgModel.anon.ControlPoint
import typingsJapgolly.lonaSvgModel.anon.ControlPoint1
import typingsJapgolly.lonaSvgModel.anon.ConvertQuadraticsToCubics
import typingsJapgolly.lonaSvgModel.anon.Fill
import typingsJapgolly.lonaSvgModel.anon.Height
import typingsJapgolly.lonaSvgModel.anon.To
import typingsJapgolly.lonaSvgModel.anon.ToType
import typingsJapgolly.lonaSvgModel.anon.Type
import typingsJapgolly.lonaSvgModel.libCommandsMod.Command
import typingsJapgolly.lonaSvgModel.libElementsMod.Path_
import typingsJapgolly.lonaSvgModel.libElementsMod.SVGWithoutQuadratics
import typingsJapgolly.lonaSvgModel.libElementsMod.SVG_
import typingsJapgolly.lonaSvgModel.libPrimitivesMod.Point_
import typingsJapgolly.lonaSvgModel.libPrimitivesMod.Rect_
import typingsJapgolly.lonaSvgModel.libStyleMod.Style_
import typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGNode
import typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGPathConvertibleNode
import typingsJapgolly.lonaSvgModel.libSvgTypesMod.SVGRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@lona/svg-model/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def close(): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Type]
  
  inline def convert(svg: String): SVG_ = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any]).asInstanceOf[SVG_]
  inline def convert(svg: String, options: js.Object): SVG_ = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SVG_]
  inline def convert(svg: String, options: ConvertQuadraticsToCubics): SVGWithoutQuadratics = (^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SVGWithoutQuadratics]
  
  inline def convert_SVGWithoutQuadratics(svg: String): SVGWithoutQuadratics = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(svg.asInstanceOf[js.Any]).asInstanceOf[SVGWithoutQuadratics]
  
  inline def cubicCurve(to: Point_, controlPoint1: Point_, controlPoint2: Point_): ControlPoint1 = (^.asInstanceOf[js.Dynamic].applyDynamic("cubicCurve")(to.asInstanceOf[js.Any], controlPoint1.asInstanceOf[js.Any], controlPoint2.asInstanceOf[js.Any])).asInstanceOf[ControlPoint1]
  
  inline def getCommandPoints[T /* <: Command */](command: T): js.Array[Point_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommandPoints")(command.asInstanceOf[js.Any]).asInstanceOf[js.Array[Point_]]
  
  inline def getDefinition(root: SVGRoot, id: String): js.UndefOr[SVGNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefinition")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SVGNode]]
  
  inline def getHrefNode(root: SVGRoot, id: String): js.UndefOr[SVGPathConvertibleNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHrefNode")(root.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[SVGPathConvertibleNode]]
  
  inline def line(to: Point_): To = ^.asInstanceOf[js.Dynamic].applyDynamic("line")(to.asInstanceOf[js.Any]).asInstanceOf[To]
  
  inline def mapCommandPoints[T /* <: Command */](command: T, transform: js.Function1[/* point */ Point_, Point_]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("mapCommandPoints")(command.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def move(to: Point_): ToType = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(to.asInstanceOf[js.Any]).asInstanceOf[ToType]
  
  inline def parse(string: String): SVGRoot = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(string.asInstanceOf[js.Any]).asInstanceOf[SVGRoot]
  
  inline def parseCSSColor(css_str: String): RGBA | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCSSColor")(css_str.asInstanceOf[js.Any]).asInstanceOf[RGBA | Null]
  
  inline def path(style: Style_, commands: js.Array[Command]): Path_ = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(style.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Path_]
  
  inline def point(x: Double, y: Double): Point_ = (^.asInstanceOf[js.Dynamic].applyDynamic("point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Point_]
  
  inline def quadCurve(to: Point_, controlPoint: Point_): ControlPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("quadCurve")(to.asInstanceOf[js.Any], controlPoint.asInstanceOf[js.Any])).asInstanceOf[ControlPoint]
  
  inline def rect(x: Double, y: Double, width: Double, height: Double): Rect_ = (^.asInstanceOf[js.Dynamic].applyDynamic("rect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Rect_]
  
  inline def style(): Style_ = ^.asInstanceOf[js.Dynamic].applyDynamic("style")().asInstanceOf[Style_]
  inline def style(hasFillFillOpacityFillRuleStrokeStrokeWidthStrokeLineCapStrokeOpacity: Fill): Style_ = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(hasFillFillOpacityFillRuleStrokeStrokeWidthStrokeLineCapStrokeOpacity.asInstanceOf[js.Any]).asInstanceOf[Style_]
  
  inline def svg(attributes: Height, unsupportedFeatures: js.Array[String]): SVG_ = (^.asInstanceOf[js.Dynamic].applyDynamic("svg")(attributes.asInstanceOf[js.Any], unsupportedFeatures.asInstanceOf[js.Any])).asInstanceOf[SVG_]
  
  inline def traverse(root: SVGNode, f: js.Function1[/* node */ SVGNode, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(root.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
