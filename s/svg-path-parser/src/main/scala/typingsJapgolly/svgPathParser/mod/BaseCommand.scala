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
import typingsJapgolly.svgPathParser.svgPathParserStrings.`elliptical arc`
import typingsJapgolly.svgPathParser.svgPathParserStrings.`horizontal lineto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.`quadratic curveto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.`smooth curveto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.`smooth quadratic curveto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.`vertical lineto`
import typingsJapgolly.svgPathParser.svgPathParserStrings.a_
import typingsJapgolly.svgPathParser.svgPathParserStrings.c_
import typingsJapgolly.svgPathParser.svgPathParserStrings.closepath
import typingsJapgolly.svgPathParser.svgPathParserStrings.curveto
import typingsJapgolly.svgPathParser.svgPathParserStrings.h_
import typingsJapgolly.svgPathParser.svgPathParserStrings.l_
import typingsJapgolly.svgPathParser.svgPathParserStrings.lineto
import typingsJapgolly.svgPathParser.svgPathParserStrings.m_
import typingsJapgolly.svgPathParser.svgPathParserStrings.moveto
import typingsJapgolly.svgPathParser.svgPathParserStrings.q_
import typingsJapgolly.svgPathParser.svgPathParserStrings.s_
import typingsJapgolly.svgPathParser.svgPathParserStrings.t_
import typingsJapgolly.svgPathParser.svgPathParserStrings.v_
import typingsJapgolly.svgPathParser.svgPathParserStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseCommand extends StObject {
  
  var code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z
  
  var command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
  
  var relative: js.UndefOr[Boolean] = js.undefined
}
object BaseCommand {
  
  inline def apply(
    code: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z,
    command: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
  ): BaseCommand = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCommand]
  }
  
  extension [Self <: BaseCommand](x: Self) {
    
    inline def setCode(value: m_ | M | l_ | L | h_ | H | v_ | V | c_ | C | s_ | S | q_ | Q | t_ | T | a_ | A | z_ | Z): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCommand(
      value: moveto | lineto | (`horizontal lineto`) | (`vertical lineto`) | curveto | (`smooth curveto`) | (`quadratic curveto`) | (`smooth quadratic curveto`) | (`elliptical arc`) | closepath
    ): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setRelative(value: Boolean): Self = StObject.set(x, "relative", value.asInstanceOf[js.Any])
    
    inline def setRelativeUndefined: Self = StObject.set(x, "relative", js.undefined)
  }
}
