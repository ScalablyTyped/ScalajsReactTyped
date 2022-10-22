package typingsJapgolly.svgPathdata

import typingsJapgolly.svgPathdata.libTransformableSVGMod.TransformableSVG
import typingsJapgolly.svgPathdata.libTypesMod.SVGCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSvgpathdataparserMod {
  
  @JSImport("svg-pathdata/lib/SVGPathDataParser", "SVGPathDataParser")
  @js.native
  open class SVGPathDataParser () extends TransformableSVG {
    
    /* private */ var canParseCommandOrComma: Any = js.native
    
    /* private */ var curArgs: Any = js.native
    
    /* private */ var curCommandRelative: Any = js.native
    
    /* private */ var curCommandType: Any = js.native
    
    /* private */ var curNumber: Any = js.native
    
    /* private */ var curNumberHasDecimal: Any = js.native
    
    /* private */ var curNumberHasExp: Any = js.native
    
    /* private */ var curNumberHasExpDigits: Any = js.native
    
    def finish(): js.Array[SVGCommand] = js.native
    def finish(commands: js.Array[SVGCommand]): js.Array[SVGCommand] = js.native
    
    def parse(str: String): js.Array[SVGCommand] = js.native
    def parse(str: String, commands: js.Array[SVGCommand]): js.Array[SVGCommand] = js.native
  }
}
