package typingsJapgolly.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellObject extends StObject {
  
  /** Range of enclosing array if formula is array formula (if applicable) */
  var F: js.UndefOr[String] = js.undefined
  
  /** Comments associated with the cell */
  var c: js.UndefOr[Comments] = js.undefined
  
  /** Cell formula (if applicable) */
  var f: js.UndefOr[String] = js.undefined
  
  /** HTML rendering of the rich text (if applicable) */
  var h: js.UndefOr[String] = js.undefined
  
  /** Cell hyperlink object (.Target holds link, .tooltip is tooltip) */
  var l: js.UndefOr[Hyperlink] = js.undefined
  
  /** Rich text encoding (if applicable) */
  var r: js.UndefOr[Any] = js.undefined
  
  /** The style/theme of the cell (if applicable) */
  var s: js.UndefOr[Any] = js.undefined
  
  /**
    * The Excel Data Type of the cell.
    * b Boolean, n Number, e Error, s String, d Date, z Empty
    */
  var t: ExcelDataType
  
  /** The raw value of the cell.  Can be omitted if a formula is specified */
  var v: js.UndefOr[String | Double | Boolean | js.Date] = js.undefined
  
  /** Formatted text (if applicable) */
  var w: js.UndefOr[String] = js.undefined
  
  /** Number format string associated with the cell (if requested) */
  var z: js.UndefOr[NumberFormat] = js.undefined
}
object CellObject {
  
  inline def apply(t: ExcelDataType): CellObject = {
    val __obj = js.Dynamic.literal(t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellObject]
  }
  
  extension [Self <: CellObject](x: Self) {
    
    inline def setC(value: Comments): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    inline def setF(value: String): Self = StObject.set(x, "F", value.asInstanceOf[js.Any])
    
    inline def setFUndefined: Self = StObject.set(x, "F", js.undefined)
    
    inline def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setL(value: Hyperlink): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    inline def setR(value: Any): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setS(value: Any): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    
    inline def setSUndefined: Self = StObject.set(x, "s", js.undefined)
    
    inline def setT(value: ExcelDataType): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setV(value: String | Double | Boolean | js.Date): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    
    inline def setVUndefined: Self = StObject.set(x, "v", js.undefined)
    
    inline def setW(value: String): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setZ(value: NumberFormat): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
