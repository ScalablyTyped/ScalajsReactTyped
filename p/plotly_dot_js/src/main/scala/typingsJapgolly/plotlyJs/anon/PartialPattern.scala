package typingsJapgolly.plotlyJs.anon

import typingsJapgolly.plotlyJs.plotlyJsStrings.Dot
import typingsJapgolly.plotlyJs.plotlyJsStrings.Plussign
import typingsJapgolly.plotlyJs.plotlyJsStrings.Slash
import typingsJapgolly.plotlyJs.plotlyJsStrings.Verticalline
import typingsJapgolly.plotlyJs.plotlyJsStrings._empty
import typingsJapgolly.plotlyJs.plotlyJsStrings.`-_`
import typingsJapgolly.plotlyJs.plotlyJsStrings.overlay
import typingsJapgolly.plotlyJs.plotlyJsStrings.replace
import typingsJapgolly.plotlyJs.plotlyJsStrings.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Pattern> */
trait PartialPattern extends StObject {
  
  var bgcolor: js.UndefOr[String] = js.undefined
  
  var fgcolor: js.UndefOr[String] = js.undefined
  
  var fgopacity: js.UndefOr[String] = js.undefined
  
  var fillmode: js.UndefOr[replace | overlay] = js.undefined
  
  var shape: js.UndefOr[_empty | Slash | (/* \ */ String) | x | `-_` | Verticalline | Plussign | Dot] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var solidity: js.UndefOr[Double] = js.undefined
}
object PartialPattern {
  
  inline def apply(): PartialPattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPattern]
  }
  
  extension [Self <: PartialPattern](x: Self) {
    
    inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setFgcolor(value: String): Self = StObject.set(x, "fgcolor", value.asInstanceOf[js.Any])
    
    inline def setFgcolorUndefined: Self = StObject.set(x, "fgcolor", js.undefined)
    
    inline def setFgopacity(value: String): Self = StObject.set(x, "fgopacity", value.asInstanceOf[js.Any])
    
    inline def setFgopacityUndefined: Self = StObject.set(x, "fgopacity", js.undefined)
    
    inline def setFillmode(value: replace | overlay): Self = StObject.set(x, "fillmode", value.asInstanceOf[js.Any])
    
    inline def setFillmodeUndefined: Self = StObject.set(x, "fillmode", js.undefined)
    
    inline def setShape(
      value: _empty | Slash | (/* \ */ String) | typingsJapgolly.plotlyJs.plotlyJsStrings.x | `-_` | Verticalline | Plussign | Dot
    ): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSolidity(value: Double): Self = StObject.set(x, "solidity", value.asInstanceOf[js.Any])
    
    inline def setSolidityUndefined: Self = StObject.set(x, "solidity", js.undefined)
  }
}
