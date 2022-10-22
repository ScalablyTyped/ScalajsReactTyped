package typingsJapgolly.handsontable

import typingsJapgolly.handsontable.anon.From
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsCustomBordersCustomBordersMod {
  
  @JSImport("handsontable/plugins/customBorders/customBorders", "CustomBorders")
  @js.native
  open class CustomBorders protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def clearBorders(selectionRanges: js.Array[js.Array[RangeType] | (js.Tuple4[Double, Double, Double, Double])]): Unit = js.native
    
    def getBorders(selectionRanges: js.Array[js.Array[RangeType] | (js.Tuple4[Double, Double, Double, Double])]): js.Array[js.Array[js.Object]] = js.native
    
    def isEnabled(): Boolean = js.native
    
    def setBorders(
      selectionRanges: js.Array[js.Array[RangeType] | (js.Tuple4[Double, Double, Double, Double])],
      borderObject: js.Object
    ): Unit = js.native
  }
  
  trait BorderOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var hide: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object BorderOptions {
    
    inline def apply(): BorderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderOptions]
    }
    
    extension [Self <: BorderOptions](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait BorderRange extends StObject {
    
    var range: From
  }
  object BorderRange {
    
    inline def apply(range: From): BorderRange = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[BorderRange]
    }
    
    extension [Self <: BorderRange](x: Self) {
      
      inline def setRange(value: From): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.handsontable.anon.SimpleCellCoordsleftBorde
    - typingsJapgolly.handsontable.anon.BorderRangeleftBorderOpti
  */
  trait DetailedSettings extends StObject
  object DetailedSettings {
    
    inline def BorderRangeleftBorderOpti(range: From): typingsJapgolly.handsontable.anon.BorderRangeleftBorderOpti = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.handsontable.anon.BorderRangeleftBorderOpti]
    }
    
    inline def SimpleCellCoordsleftBorde(col: Double, row: Double): typingsJapgolly.handsontable.anon.SimpleCellCoordsleftBorde = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.handsontable.anon.SimpleCellCoordsleftBorde]
    }
  }
  
  trait RangeType extends StObject {
    
    var endCol: Double
    
    var endRow: Double
    
    var startCol: Double
    
    var startRow: Double
  }
  object RangeType {
    
    inline def apply(endCol: Double, endRow: Double, startCol: Double, startRow: Double): RangeType = {
      val __obj = js.Dynamic.literal(endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeType]
    }
    
    extension [Self <: RangeType](x: Self) {
      
      inline def setEndCol(value: Double): Self = StObject.set(x, "endCol", value.asInstanceOf[js.Any])
      
      inline def setEndRow(value: Double): Self = StObject.set(x, "endRow", value.asInstanceOf[js.Any])
      
      inline def setStartCol(value: Double): Self = StObject.set(x, "startCol", value.asInstanceOf[js.Any])
      
      inline def setStartRow(value: Double): Self = StObject.set(x, "startRow", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean | js.Array[DetailedSettings]
}
