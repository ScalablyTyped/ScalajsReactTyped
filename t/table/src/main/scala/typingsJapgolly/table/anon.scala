package typingsJapgolly.table

import typingsJapgolly.table.distSrcDrawBorderMod.Separator
import typingsJapgolly.table.distSrcSpanningCellManagerMod.SpanningCellManager
import typingsJapgolly.table.distSrcTypesApiMod.Alignment
import typingsJapgolly.table.distSrcTypesApiMod.DrawVerticalLine
import typingsJapgolly.table.distSrcTypesApiMod.VerticalAlignment
import typingsJapgolly.table.tableBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined table.table/dist/src/types/api.ColumnUserConfig & { readonly width :number} */
  trait ColumnUserConfigreadonlyw extends StObject {
    
    /**
      * Cell content horizontal alignment (default: left)
      */
    val alignment: js.UndefOr[Alignment] = js.undefined
    
    /**
      * Cell content padding width left (default: 1)
      */
    val paddingLeft: js.UndefOr[Double] = js.undefined
    
    /**
      * Cell content padding width right (default: 1)
      */
    val paddingRight: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of characters are which the content will be truncated (default: Infinity)
      */
    val truncate: js.UndefOr[Double] = js.undefined
    
    /**
      * Cell content vertical alignment (default: top)
      */
    val verticalAlignment: js.UndefOr[VerticalAlignment] = js.undefined
    
    /**
      * Column width (default: auto calculation based on the cell content)
      */
    /**
      * The default width for each column
      */
    val width: js.UndefOr[Double] & Double
    
    /**
      * If true, the text is broken at the nearest space or one of the special characters: "\|/_.,;-"
      */
    val wrapWord: js.UndefOr[Boolean] = js.undefined
  }
  object ColumnUserConfigreadonlyw {
    
    inline def apply(width: js.UndefOr[Double] & Double): ColumnUserConfigreadonlyw = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnUserConfigreadonlyw]
    }
    
    extension [Self <: ColumnUserConfigreadonlyw](x: Self) {
      
      inline def setAlignment(value: Alignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setTruncate(value: Double): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setVerticalAlignment(value: VerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      inline def setWidth(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWrapWord(value: Boolean): Self = StObject.set(x, "wrapWord", value.asInstanceOf[js.Any])
      
      inline def setWrapWordUndefined: Self = StObject.set(x, "wrapWord", js.undefined)
    }
  }
  
  trait InstancePath extends StObject {
    
    var instancePath: js.UndefOr[String] = js.undefined
    
    var parentData: Any
    
    var parentDataProperty: Any
    
    var rootData: js.UndefOr[Any] = js.undefined
  }
  object InstancePath {
    
    inline def apply(parentData: Any, parentDataProperty: Any): InstancePath = {
      val __obj = js.Dynamic.literal(parentData = parentData.asInstanceOf[js.Any], parentDataProperty = parentDataProperty.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstancePath]
    }
    
    extension [Self <: InstancePath](x: Self) {
      
      inline def setInstancePath(value: String): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
      
      inline def setInstancePathUndefined: Self = StObject.set(x, "instancePath", js.undefined)
      
      inline def setParentData(value: Any): Self = StObject.set(x, "parentData", value.asInstanceOf[js.Any])
      
      inline def setParentDataProperty(value: Any): Self = StObject.set(x, "parentDataProperty", value.asInstanceOf[js.Any])
      
      inline def setRootData(value: Any): Self = StObject.set(x, "rootData", value.asInstanceOf[js.Any])
      
      inline def setRootDataUndefined: Self = StObject.set(x, "rootData", js.undefined)
    }
  }
  
  trait Mapped extends StObject {
    
    var mapped: `true`
  }
  object Mapped {
    
    inline def apply(): Mapped = {
      val __obj = js.Dynamic.literal(mapped = true)
      __obj.asInstanceOf[Mapped]
    }
    
    extension [Self <: Mapped](x: Self) {
      
      inline def setMapped(value: `true`): Self = StObject.set(x, "mapped", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Omit<table.table/dist/src/drawBorder.DrawBorderParameters, 'border'> & {  separator :table.table/dist/src/drawBorder.Separator} */
  trait OmitDrawBorderParametersb extends StObject {
    
    def drawVerticalLine(index: Double, size: Double): Boolean
    @JSName("drawVerticalLine")
    var drawVerticalLine_Original: DrawVerticalLine
    
    var horizontalBorderIndex: js.UndefOr[Double] = js.undefined
    
    var rowCount: js.UndefOr[Double] = js.undefined
    
    var separator: Separator
    
    var spanningCellManager: js.UndefOr[SpanningCellManager] = js.undefined
  }
  object OmitDrawBorderParametersb {
    
    inline def apply(drawVerticalLine: (/* index */ Double, /* size */ Double) => Boolean, separator: Separator): OmitDrawBorderParametersb = {
      val __obj = js.Dynamic.literal(drawVerticalLine = js.Any.fromFunction2(drawVerticalLine), separator = separator.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitDrawBorderParametersb]
    }
    
    extension [Self <: OmitDrawBorderParametersb](x: Self) {
      
      inline def setDrawVerticalLine(value: (/* index */ Double, /* size */ Double) => Boolean): Self = StObject.set(x, "drawVerticalLine", js.Any.fromFunction2(value))
      
      inline def setHorizontalBorderIndex(value: Double): Self = StObject.set(x, "horizontalBorderIndex", value.asInstanceOf[js.Any])
      
      inline def setHorizontalBorderIndexUndefined: Self = StObject.set(x, "horizontalBorderIndex", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setSeparator(value: Separator): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellManager(value: SpanningCellManager): Self = StObject.set(x, "spanningCellManager", value.asInstanceOf[js.Any])
      
      inline def setSpanningCellManagerUndefined: Self = StObject.set(x, "spanningCellManager", js.undefined)
    }
  }
}
