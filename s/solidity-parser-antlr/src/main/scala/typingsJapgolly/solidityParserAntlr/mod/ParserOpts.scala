package typingsJapgolly.solidityParserAntlr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserOpts extends StObject {
  
  var loc: js.UndefOr[Boolean] = js.undefined
  
  var range: js.UndefOr[Boolean] = js.undefined
  
  var tolerant: js.UndefOr[Boolean] = js.undefined
}
object ParserOpts {
  
  inline def apply(): ParserOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOpts]
  }
  
  extension [Self <: ParserOpts](x: Self) {
    
    inline def setLoc(value: Boolean): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
    
    inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
  }
}
