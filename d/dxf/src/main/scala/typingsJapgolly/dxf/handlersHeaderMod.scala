package typingsJapgolly.dxf

import typingsJapgolly.dxf.commonMod.Point2D
import typingsJapgolly.dxf.commonMod.UnitTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlersHeaderMod {
  
  type ArrowSize = Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dxf.dxfInts.`10`
    - typingsJapgolly.dxf.dxfInts.`20`
    - typingsJapgolly.dxf.dxfInts.`30`
    - typingsJapgolly.dxf.dxfInts.`40`
    - typingsJapgolly.dxf.dxfInts.`70`
  */
  trait DXFHeaderPropertyType extends StObject
  object DXFHeaderPropertyType {
    
    inline def `10`: typingsJapgolly.dxf.dxfInts.`10` = 10.asInstanceOf[typingsJapgolly.dxf.dxfInts.`10`]
    
    inline def `20`: typingsJapgolly.dxf.dxfInts.`20` = 20.asInstanceOf[typingsJapgolly.dxf.dxfInts.`20`]
    
    inline def `30`: typingsJapgolly.dxf.dxfInts.`30` = 30.asInstanceOf[typingsJapgolly.dxf.dxfInts.`30`]
    
    inline def `40`: typingsJapgolly.dxf.dxfInts.`40` = 40.asInstanceOf[typingsJapgolly.dxf.dxfInts.`40`]
    
    inline def `70`: typingsJapgolly.dxf.dxfInts.`70` = 70.asInstanceOf[typingsJapgolly.dxf.dxfInts.`70`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dxf.dxfStrings.$MEASUREMENT
    - typingsJapgolly.dxf.dxfStrings.$INSUNITS
    - typingsJapgolly.dxf.dxfStrings.$EXTMIN
    - typingsJapgolly.dxf.dxfStrings.$EXTMAX
    - typingsJapgolly.dxf.dxfStrings.$DIMASZ
  */
  trait DXFHeaderPropertyValue extends StObject
  object DXFHeaderPropertyValue {
    
    inline def $DIMASZ: typingsJapgolly.dxf.dxfStrings.$DIMASZ = "$DIMASZ".asInstanceOf[typingsJapgolly.dxf.dxfStrings.$DIMASZ]
    
    inline def $EXTMAX: typingsJapgolly.dxf.dxfStrings.$EXTMAX = "$EXTMAX".asInstanceOf[typingsJapgolly.dxf.dxfStrings.$EXTMAX]
    
    inline def $EXTMIN: typingsJapgolly.dxf.dxfStrings.$EXTMIN = "$EXTMIN".asInstanceOf[typingsJapgolly.dxf.dxfStrings.$EXTMIN]
    
    inline def $INSUNITS: typingsJapgolly.dxf.dxfStrings.$INSUNITS = "$INSUNITS".asInstanceOf[typingsJapgolly.dxf.dxfStrings.$INSUNITS]
    
    inline def $MEASUREMENT: typingsJapgolly.dxf.dxfStrings.$MEASUREMENT = "$MEASUREMENT".asInstanceOf[typingsJapgolly.dxf.dxfStrings.$MEASUREMENT]
  }
  
  trait Header extends StObject {
    
    @JSName("$INSUNITS")
    var $INSUNITS: UnitTypes
    
    var dimArrowSize: ArrowSize
    
    var extMax: Point2D
    
    var extMin: Point2D
  }
  object Header {
    
    inline def apply($INSUNITS: UnitTypes, dimArrowSize: ArrowSize, extMax: Point2D, extMin: Point2D): Header = {
      val __obj = js.Dynamic.literal($INSUNITS = $INSUNITS.asInstanceOf[js.Any], dimArrowSize = dimArrowSize.asInstanceOf[js.Any], extMax = extMax.asInstanceOf[js.Any], extMin = extMin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def set$INSUNITS(value: UnitTypes): Self = StObject.set(x, "$INSUNITS", value.asInstanceOf[js.Any])
      
      inline def setDimArrowSize(value: ArrowSize): Self = StObject.set(x, "dimArrowSize", value.asInstanceOf[js.Any])
      
      inline def setExtMax(value: Point2D): Self = StObject.set(x, "extMax", value.asInstanceOf[js.Any])
      
      inline def setExtMin(value: Point2D): Self = StObject.set(x, "extMin", value.asInstanceOf[js.Any])
    }
  }
}
