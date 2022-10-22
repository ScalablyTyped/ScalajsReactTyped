package typingsJapgolly.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of all the PivotItems related to their parent PivotField.
  *
  * @remarks
  * [Api set: ExcelApi 1.8]
  */
trait PivotItemCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: ID of the PivotItem.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Determines whether the item is expanded to show child items or if it's collapsed and child items are hidden.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Name of the PivotItem.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Specifies if the PivotItem is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PivotItemCollectionLoadOptions {
  
  inline def apply(): PivotItemCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotItemCollectionLoadOptions]
  }
  
  extension [Self <: PivotItemCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
