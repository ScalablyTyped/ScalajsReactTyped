package typingsJapgolly.tokeyCssSelectorParser

import typingsJapgolly.tokeyCssSelectorParser.anon.PartialParseConfig
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.SelectorList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSelectorParserMod {
  
  @JSImport("@tokey/css-selector-parser/dist/selector-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCssSelector(source: String): SelectorList = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any]).asInstanceOf[SelectorList]
  inline def parseCssSelector(source: String, options: PartialParseConfig): SelectorList = (^.asInstanceOf[js.Dynamic].applyDynamic("parseCssSelector")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SelectorList]
  
  trait ParseConfig extends StObject {
    
    var offset: Double
  }
  object ParseConfig {
    
    inline def apply(offset: Double): ParseConfig = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseConfig]
    }
    
    extension [Self <: ParseConfig](x: Self) {
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
