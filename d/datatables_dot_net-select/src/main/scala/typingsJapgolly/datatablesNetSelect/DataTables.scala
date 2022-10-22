package typingsJapgolly.datatablesNetSelect

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.datatablesNetSelect.anon.Style
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.api
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.multi
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.multiPlussignshift
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.os
import typingsJapgolly.datatablesNetSelect.datatablesNetSelectStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    var select: Style
  }
  object Api {
    
    inline def apply(select: Style): Api = {
      val __obj = js.Dynamic.literal(select = select.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setSelect(value: Style): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellMethods extends StObject {
    
    /**
      * Deselect a cell
      */
    def deselect(): Api
    
    /**
      * Select cell
      */
    def select(): Api
  }
  object CellMethods {
    
    inline def apply(deselect: CallbackTo[Api], select: CallbackTo[Api]): CellMethods = {
      val __obj = js.Dynamic.literal(deselect = deselect.toJsFn, select = select.toJsFn)
      __obj.asInstanceOf[CellMethods]
    }
    
    extension [Self <: CellMethods](x: Self) {
      
      inline def setDeselect(value: CallbackTo[Api]): Self = StObject.set(x, "deselect", value.toJsFn)
      
      inline def setSelect(value: CallbackTo[Api]): Self = StObject.set(x, "select", value.toJsFn)
    }
  }
  
  trait CellsMethods extends StObject {
    
    /**
      * Deselect cells
      */
    def deselect(): Api
    
    /**
      * Select multiple cells
      */
    def select(): Api
  }
  object CellsMethods {
    
    inline def apply(deselect: CallbackTo[Api], select: CallbackTo[Api]): CellsMethods = {
      val __obj = js.Dynamic.literal(deselect = deselect.toJsFn, select = select.toJsFn)
      __obj.asInstanceOf[CellsMethods]
    }
    
    extension [Self <: CellsMethods](x: Self) {
      
      inline def setDeselect(value: CallbackTo[Api]): Self = StObject.set(x, "deselect", value.toJsFn)
      
      inline def setSelect(value: CallbackTo[Api]): Self = StObject.set(x, "select", value.toJsFn)
    }
  }
  
  trait RowMethods extends StObject {
    
    /**
      * Deselect a row
      */
    def deselect(): Api
    
    /**
      * Select a row
      */
    def select(): Api
  }
  object RowMethods {
    
    inline def apply(deselect: CallbackTo[Api], select: CallbackTo[Api]): RowMethods = {
      val __obj = js.Dynamic.literal(deselect = deselect.toJsFn, select = select.toJsFn)
      __obj.asInstanceOf[RowMethods]
    }
    
    extension [Self <: RowMethods](x: Self) {
      
      inline def setDeselect(value: CallbackTo[Api]): Self = StObject.set(x, "deselect", value.toJsFn)
      
      inline def setSelect(value: CallbackTo[Api]): Self = StObject.set(x, "select", value.toJsFn)
    }
  }
  
  trait RowsMethods extends StObject {
    
    /**
      * Deselect a row
      */
    def deselect(): Api
    
    /**
      * Select multiple rows
      */
    def select(): Api
  }
  object RowsMethods {
    
    inline def apply(deselect: CallbackTo[Api], select: CallbackTo[Api]): RowsMethods = {
      val __obj = js.Dynamic.literal(deselect = deselect.toJsFn, select = select.toJsFn)
      __obj.asInstanceOf[RowsMethods]
    }
    
    extension [Self <: RowsMethods](x: Self) {
      
      inline def setDeselect(value: CallbackTo[Api]): Self = StObject.set(x, "deselect", value.toJsFn)
      
      inline def setSelect(value: CallbackTo[Api]): Self = StObject.set(x, "select", value.toJsFn)
    }
  }
  
  trait SelectSettings extends StObject {
    
    /*
      * Indicate if the selected items will be removed when clicking outside of the table
      */
    var blurable: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Set the class name that will be applied to selected items
      */
    var className: js.UndefOr[String] = js.undefined
    
    /*
      * Enable / disable the display for item selection information in the table summary
      */
    var info: js.UndefOr[Boolean] = js.undefined
    
    /*
      * Set which table items to select (rows, columns or cells)
      */
    var items: js.UndefOr[String] = js.undefined
    
    /*
      * Set the element selector used for mouse event capture to select items
      */
    var selector: js.UndefOr[String] = js.undefined
    
    /*
      * Set the selection style for end user interaction with the table
      */
    var style: js.UndefOr[api | single | multi | os | multiPlussignshift] = js.undefined
  }
  object SelectSettings {
    
    inline def apply(): SelectSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectSettings]
    }
    
    extension [Self <: SelectSettings](x: Self) {
      
      inline def setBlurable(value: Boolean): Self = StObject.set(x, "blurable", value.asInstanceOf[js.Any])
      
      inline def setBlurableUndefined: Self = StObject.set(x, "blurable", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setItems(value: String): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      inline def setStyle(value: api | single | multi | os | multiPlussignshift): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Settings extends StObject {
    
    /*
      * Select extension options
      */
    var select: js.UndefOr[Boolean | String | SelectSettings] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setSelect(value: Boolean | String | SelectSettings): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    }
  }
}
