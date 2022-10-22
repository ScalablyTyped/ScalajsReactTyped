package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsVirtualScrollVirtualScrollInterfaceMod {
  
  trait Cell extends StObject {
    
    var height: Double
    
    var i: Double
    
    var index: Double
    
    var reads: Double
    
    var `type`: CellType
    
    var value: Any
    
    var visible: Boolean
  }
  object Cell {
    
    inline def apply(
      height: Double,
      i: Double,
      index: Double,
      reads: Double,
      `type`: CellType,
      value: Any,
      visible: Boolean
    ): Cell = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], reads = reads.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cell]
    }
    
    extension [Self <: Cell](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setReads(value: Double): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
      
      inline def setType(value: CellType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreStrings.item
    - typingsJapgolly.ionicCore.ionicCoreStrings.header
    - typingsJapgolly.ionicCore.ionicCoreStrings.footer
  */
  trait CellType extends StObject
  object CellType {
    
    inline def footer: typingsJapgolly.ionicCore.ionicCoreStrings.footer = "footer".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.footer]
    
    inline def header: typingsJapgolly.ionicCore.ionicCoreStrings.header = "header".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.header]
    
    inline def item: typingsJapgolly.ionicCore.ionicCoreStrings.item = "item".asInstanceOf[typingsJapgolly.ionicCore.ionicCoreStrings.item]
  }
  
  type DomRenderFn = js.Function1[/* dom */ js.Array[VirtualNode], Unit]
  
  type FooterHeightFn = js.Function2[/* item */ Any, /* index */ Double, Double]
  
  type HeaderFn = js.Function3[
    /* item */ Any, 
    /* index */ Double, 
    /* items */ js.Array[Any], 
    js.UndefOr[String | Null]
  ]
  
  type HeaderHeightFn = js.Function2[/* item */ Any, /* index */ Double, Double]
  
  type ItemHeightFn = js.Function2[/* item */ Any, /* index */ Double, Double]
  
  type ItemRenderFn = js.Function3[/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double, HTMLElement]
  
  type NodeChange = Double
  
  trait VirtualNode extends StObject {
    
    var cell: Cell
    
    var change: NodeChange
    
    var d: Boolean
    
    var top: Double
    
    var visible: Boolean
  }
  object VirtualNode {
    
    inline def apply(cell: Cell, change: NodeChange, d: Boolean, top: Double, visible: Boolean): VirtualNode = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualNode]
    }
    
    extension [Self <: VirtualNode](x: Self) {
      
      inline def setCell(value: Cell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setChange(value: NodeChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setD(value: Boolean): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
