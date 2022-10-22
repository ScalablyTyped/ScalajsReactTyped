package typingsJapgolly.reactMdTable

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdIcon.typesTextIconSpacingMod.TextIconSpacingProps
import typingsJapgolly.reactMdTable.typesConfigMod.TableCellHorizontalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableCellContentMod {
  
  @JSImport("@react-md/table/types/TableCellContent", "TableCellContent")
  @js.native
  val TableCellContent: ForwardRefExoticComponent[TableCellContentProps & RefAttributes[HTMLButtonElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdTable.reactMdTableStrings.ascending
    - typingsJapgolly.reactMdTable.reactMdTableStrings.descending
    - typingsJapgolly.reactMdTable.reactMdTableStrings.none
    - typingsJapgolly.reactMdTable.reactMdTableStrings.other
  */
  trait SortOrder extends StObject
  object SortOrder {
    
    inline def ascending: typingsJapgolly.reactMdTable.reactMdTableStrings.ascending = "ascending".asInstanceOf[typingsJapgolly.reactMdTable.reactMdTableStrings.ascending]
    
    inline def descending: typingsJapgolly.reactMdTable.reactMdTableStrings.descending = "descending".asInstanceOf[typingsJapgolly.reactMdTable.reactMdTableStrings.descending]
    
    inline def none: typingsJapgolly.reactMdTable.reactMdTableStrings.none = "none".asInstanceOf[typingsJapgolly.reactMdTable.reactMdTableStrings.none]
    
    inline def other: typingsJapgolly.reactMdTable.reactMdTableStrings.other = "other".asInstanceOf[typingsJapgolly.reactMdTable.reactMdTableStrings.other]
  }
  
  trait TableCellContentProps
    extends StObject
       with TextIconSpacingProps {
    
    /**
      * @remarks \@since 4.0.3
      * @see {@link TableCellHorizontalAlignment}
      */
    var hAlign: js.UndefOr[TableCellHorizontalAlignment] = js.undefined
    
    /**
      * An optional id for the sort order button.
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Boolean if the icon should be rotated.
      */
    var rotated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current sort order for this cell. Setting this to `null` will prevent
      * the button from being rendered.
      */
    var sortOrder: js.UndefOr[SortOrder] = js.undefined
    
    /**
      * An optional style for the sort order button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TableCellContentProps {
    
    inline def apply(): TableCellContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellContentProps]
    }
    
    extension [Self <: TableCellContentProps](x: Self) {
      
      inline def setHAlign(value: TableCellHorizontalAlignment): Self = StObject.set(x, "hAlign", value.asInstanceOf[js.Any])
      
      inline def setHAlignUndefined: Self = StObject.set(x, "hAlign", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRotated(value: Boolean): Self = StObject.set(x, "rotated", value.asInstanceOf[js.Any])
      
      inline def setRotatedUndefined: Self = StObject.set(x, "rotated", js.undefined)
      
      inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
