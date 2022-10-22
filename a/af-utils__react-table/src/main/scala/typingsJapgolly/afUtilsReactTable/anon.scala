package typingsJapgolly.afUtilsReactTable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.HTMLElement
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.Cell
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.align
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.background
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.border
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.format
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.key
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.label
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.minWidth
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.render
import typingsJapgolly.afUtilsReactTable.afUtilsReactTableStrings.width
import typingsJapgolly.afUtilsReactTable.mod.ColumnModel
import typingsJapgolly.afUtilsReactTable.mod.RowProps
import typingsJapgolly.afUtilsReactVirtualHeadless.mod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Columns extends StObject {
    
    var columns: js.Array[ColumnModel]
    
    var components: this.type
  }
  object Columns {
    
    inline def apply(columns: js.Array[ColumnModel], components: Columns): Columns = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[Columns]
    }
    
    extension [Self <: Columns](x: Self) {
      
      inline def setColumns(value: js.Array[ColumnModel]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: ColumnModel*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComponents(value: Columns): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: RowProps
    
    var i: Double
    
    var i2: Double
    
    var model: Model
  }
  object Data {
    
    inline def apply(data: RowProps, i: Double, i2: Double, model: Model): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], i2 = i2.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: RowProps): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setI2(value: Double): Self = StObject.set(x, "i2", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ref extends StObject {
    
    var ref: typingsJapgolly.react.mod.Ref[HTMLElement]
  }
  object Ref {
    
    inline def apply(): Ref = {
      val __obj = js.Dynamic.literal(ref = null)
      __obj.asInstanceOf[Ref]
    }
    
    extension [Self <: Ref](x: Self) {
      
      inline def setRef(value: typingsJapgolly.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: HTMLElement | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
    }
  }
  
  @js.native
  trait TypeofColumnModel
    extends StObject
       with Instantiable0[ColumnModel] {
    
    val KEYS: js.Tuple10[key, align, label, render, format, Cell, background, border, width, minWidth] = js.native
  }
}
