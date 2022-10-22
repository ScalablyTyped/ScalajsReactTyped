package typingsJapgolly.reactPanelgroup

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.column
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.dynamic
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.fixed
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.row
import typingsJapgolly.reactPanelgroup.reactPanelgroupStrings.stretch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-panelgroup", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PropTypes, js.Object, Any]
  
  type PanelGroup = japgolly.scalajs.react.facade.React.Component[PropTypes & js.Object, js.Object]
  
  trait PanelWidth extends StObject {
    
    var minSize: js.UndefOr[Double] = js.undefined
    
    var resize: js.UndefOr[fixed | dynamic | stretch] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var snap: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object PanelWidth {
    
    inline def apply(): PanelWidth = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelWidth]
    }
    
    extension [Self <: PanelWidth](x: Self) {
      
      inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setResize(value: fixed | dynamic | stretch): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSnap(value: js.Array[Double]): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
      
      inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
      
      inline def setSnapVarargs(value: Double*): Self = StObject.set(x, "snap", js.Array(value*))
    }
  }
  
  trait PropTypes extends StObject {
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var direction: js.UndefOr[row | column] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* data */ PanelWidth, Unit]] = js.undefined
    
    var panelColor: js.UndefOr[String] = js.undefined
    
    var panelWidths: js.UndefOr[js.Array[PanelWidth | Null]] = js.undefined
    
    var spacing: js.UndefOr[Double] = js.undefined
  }
  object PropTypes {
    
    inline def apply(): PropTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropTypes]
    }
    
    extension [Self <: PropTypes](x: Self) {
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDirection(value: row | column): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setOnUpdate(value: /* data */ PanelWidth => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* data */ PanelWidth) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPanelColor(value: String): Self = StObject.set(x, "panelColor", value.asInstanceOf[js.Any])
      
      inline def setPanelColorUndefined: Self = StObject.set(x, "panelColor", js.undefined)
      
      inline def setPanelWidths(value: js.Array[PanelWidth | Null]): Self = StObject.set(x, "panelWidths", value.asInstanceOf[js.Any])
      
      inline def setPanelWidthsUndefined: Self = StObject.set(x, "panelWidths", js.undefined)
      
      inline def setPanelWidthsVarargs(value: (PanelWidth | Null)*): Self = StObject.set(x, "panelWidths", js.Array(value*))
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
}
