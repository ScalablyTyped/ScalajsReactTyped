package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod.AlignContentType
import typingsJapgolly.grommet.es6UtilsMod.DirectionType
import typingsJapgolly.grommet.es6UtilsMod.GapType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignDirection extends StObject {
  
  var align: js.UndefOr[AlignContentType] = js.undefined
  
  var direction: js.UndefOr[DirectionType] = js.undefined
  
  var gap: js.UndefOr[GapType] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var pad: js.UndefOr[PadType] = js.undefined
}
object AlignDirection {
  
  inline def apply(): AlignDirection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignDirection]
  }
  
  extension [Self <: AlignDirection](x: Self) {
    
    inline def setAlign(value: AlignContentType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
