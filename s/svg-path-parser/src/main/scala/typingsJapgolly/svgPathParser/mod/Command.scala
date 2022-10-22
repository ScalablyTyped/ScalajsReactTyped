package typingsJapgolly.svgPathParser.mod

import typingsJapgolly.svgPathParser.svgPathParserStrings.A
import typingsJapgolly.svgPathParser.svgPathParserStrings.C
import typingsJapgolly.svgPathParser.svgPathParserStrings.H
import typingsJapgolly.svgPathParser.svgPathParserStrings.L
import typingsJapgolly.svgPathParser.svgPathParserStrings.M
import typingsJapgolly.svgPathParser.svgPathParserStrings.Q
import typingsJapgolly.svgPathParser.svgPathParserStrings.S
import typingsJapgolly.svgPathParser.svgPathParserStrings.T
import typingsJapgolly.svgPathParser.svgPathParserStrings.V
import typingsJapgolly.svgPathParser.svgPathParserStrings.Z
import typingsJapgolly.svgPathParser.svgPathParserStrings.a_
import typingsJapgolly.svgPathParser.svgPathParserStrings.c_
import typingsJapgolly.svgPathParser.svgPathParserStrings.h_
import typingsJapgolly.svgPathParser.svgPathParserStrings.l_
import typingsJapgolly.svgPathParser.svgPathParserStrings.m_
import typingsJapgolly.svgPathParser.svgPathParserStrings.q_
import typingsJapgolly.svgPathParser.svgPathParserStrings.s_
import typingsJapgolly.svgPathParser.svgPathParserStrings.t_
import typingsJapgolly.svgPathParser.svgPathParserStrings.v_
import typingsJapgolly.svgPathParser.svgPathParserStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.svgPathParser.mod.MoveToCommand
  - typingsJapgolly.svgPathParser.mod.LineToCommand
  - typingsJapgolly.svgPathParser.mod.HorizontalLineToCommand
  - typingsJapgolly.svgPathParser.mod.VerticalLineToCommand
  - typingsJapgolly.svgPathParser.mod.ClosePathCommand
  - typingsJapgolly.svgPathParser.mod.CurveToCommand
  - typingsJapgolly.svgPathParser.mod.SmoothCurveToCommand
  - typingsJapgolly.svgPathParser.mod.QuadraticCurveToCommand
  - typingsJapgolly.svgPathParser.mod.SmoothQuadraticCurveToCommand
  - typingsJapgolly.svgPathParser.mod.EllipticalArcCommand
*/
trait Command extends StObject
object Command {
  
  inline def ClosePathCommand(code: z_ | Z): typingsJapgolly.svgPathParser.mod.ClosePathCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "closepath")
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.ClosePathCommand]
  }
  
  inline def CurveToCommand(code: c_ | C, x: Double, x1: Double, x2: Double, y: Double, y1: Double, y2: Double): typingsJapgolly.svgPathParser.mod.CurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "curveto", x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.CurveToCommand]
  }
  
  inline def EllipticalArcCommand(
    code: a_ | A,
    largeArc: Boolean,
    rx: Double,
    ry: Double,
    sweep: Boolean,
    x: Double,
    xAxisRotation: Double,
    y: Double
  ): typingsJapgolly.svgPathParser.mod.EllipticalArcCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "elliptical arc", largeArc = largeArc.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any], sweep = sweep.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xAxisRotation = xAxisRotation.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.EllipticalArcCommand]
  }
  
  inline def HorizontalLineToCommand(code: h_ | H, x: Double): typingsJapgolly.svgPathParser.mod.HorizontalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "horizontal lineto", x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.HorizontalLineToCommand]
  }
  
  inline def LineToCommand(code: l_ | L, x: Double, y: Double): typingsJapgolly.svgPathParser.mod.LineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "lineto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.LineToCommand]
  }
  
  inline def MoveToCommand(code: m_ | M, x: Double, y: Double): typingsJapgolly.svgPathParser.mod.MoveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "moveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.MoveToCommand]
  }
  
  inline def QuadraticCurveToCommand(code: q_ | Q, x: Double, x1: Double, y: Double, y1: Double): typingsJapgolly.svgPathParser.mod.QuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "quadratic curveto", x = x.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.QuadraticCurveToCommand]
  }
  
  inline def SmoothCurveToCommand(code: s_ | S, x: Double, x2: Double, y: Double, y2: Double): typingsJapgolly.svgPathParser.mod.SmoothCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth curveto", x = x.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.SmoothCurveToCommand]
  }
  
  inline def SmoothQuadraticCurveToCommand(code: t_ | T, x: Double, y: Double): typingsJapgolly.svgPathParser.mod.SmoothQuadraticCurveToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "smooth quadratic curveto", x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.SmoothQuadraticCurveToCommand]
  }
  
  inline def VerticalLineToCommand(code: v_ | V, y: Double): typingsJapgolly.svgPathParser.mod.VerticalLineToCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = "vertical lineto", y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.svgPathParser.mod.VerticalLineToCommand]
  }
}
