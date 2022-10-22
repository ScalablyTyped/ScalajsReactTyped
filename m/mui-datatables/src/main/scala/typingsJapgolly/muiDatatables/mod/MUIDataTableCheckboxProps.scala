package typingsJapgolly.muiDatatables.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.muiDatatables.anon.Checked
import typingsJapgolly.muiDatatables.muiDatatablesStrings.`row-select-header`
import typingsJapgolly.muiDatatables.muiDatatablesStrings.`row-select`
import typingsJapgolly.muiDatatables.muiDatatablesStrings.`table-filter`
import typingsJapgolly.muiDatatables.muiDatatablesStrings.`table-view-col`
import typingsJapgolly.muiDatatables.muiDatatablesStrings.primary
import typingsJapgolly.muiDatatables.muiDatatablesStrings.secondary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUIDataTableCheckboxProps extends StObject {
  
  var checked: Boolean
  
  var classes: Checked
  
  var color: primary | secondary
  
  var `data-description`: `row-select` | `row-select-header` | `table-filter` | `table-view-col`
  
  var `data-index`: Double | Null
  
  var disabled: Boolean
  
  var indeterminante: Boolean
  
  def onChange(event: ReactEventFrom[HTMLInputElement], checked: Boolean): Unit
}
object MUIDataTableCheckboxProps {
  
  inline def apply(
    checked: Boolean,
    classes: Checked,
    color: primary | secondary,
    `data-description`: `row-select` | `row-select-header` | `table-filter` | `table-view-col`,
    disabled: Boolean,
    indeterminante: Boolean,
    onChange: (ReactEventFrom[HTMLInputElement], Boolean) => Callback
  ): MUIDataTableCheckboxProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], indeterminante = indeterminante.asInstanceOf[js.Any], onChange = js.Any.fromFunction2((t0: ReactEventFrom[HTMLInputElement], t1: Boolean) => (onChange(t0, t1)).runNow()))
    __obj.updateDynamic("data-description")(`data-description`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-index")(null)
    __obj.asInstanceOf[MUIDataTableCheckboxProps]
  }
  
  extension [Self <: MUIDataTableCheckboxProps](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: Checked): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setColor(value: primary | secondary): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def `setData-description`(value: `row-select` | `row-select-header` | `table-filter` | `table-view-col`): Self = StObject.set(x, "data-description", value.asInstanceOf[js.Any])
    
    inline def `setData-index`(value: Double): Self = StObject.set(x, "data-index", value.asInstanceOf[js.Any])
    
    inline def `setData-indexNull`: Self = StObject.set(x, "data-index", null)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setIndeterminante(value: Boolean): Self = StObject.set(x, "indeterminante", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: (ReactEventFrom[HTMLInputElement], Boolean) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: ReactEventFrom[HTMLInputElement], t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
