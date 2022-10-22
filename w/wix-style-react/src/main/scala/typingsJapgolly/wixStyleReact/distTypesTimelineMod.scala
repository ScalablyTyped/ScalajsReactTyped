package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimelineMod {
  
  @JSImport("wix-style-react/dist/types/Timeline", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[TimelineProps, js.Object, Any]
  
  type Timeline = PureComponent[TimelineProps, js.Object, Any]
  
  trait TimelineItem extends StObject {
    
    var customPrefix: js.UndefOr[Node] = js.undefined
    
    var label: Node
    
    var labelAction: js.UndefOr[Node] = js.undefined
    
    var suffix: js.UndefOr[Node | String] = js.undefined
  }
  object TimelineItem {
    
    inline def apply(): TimelineItem = {
      val __obj = js.Dynamic.literal(label = null)
      __obj.asInstanceOf[TimelineItem]
    }
    
    extension [Self <: TimelineItem](x: Self) {
      
      inline def setCustomPrefix(value: VdomNode): Self = StObject.set(x, "customPrefix", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCustomPrefixNull: Self = StObject.set(x, "customPrefix", null)
      
      inline def setCustomPrefixUndefined: Self = StObject.set(x, "customPrefix", js.undefined)
      
      inline def setCustomPrefixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "customPrefix", js.Array(value*))
      
      inline def setCustomPrefixVdomElement(value: VdomElement): Self = StObject.set(x, "customPrefix", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelAction(value: VdomNode): Self = StObject.set(x, "labelAction", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelActionNull: Self = StObject.set(x, "labelAction", null)
      
      inline def setLabelActionUndefined: Self = StObject.set(x, "labelAction", js.undefined)
      
      inline def setLabelActionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "labelAction", js.Array(value*))
      
      inline def setLabelActionVdomElement(value: VdomElement): Self = StObject.set(x, "labelAction", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSuffix(value: Node | String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setSuffixVdomElement(value: VdomElement): Self = StObject.set(x, "suffix", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait TimelineProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var gap: js.UndefOr[String] = js.undefined
    
    var items: js.Array[TimelineItem]
  }
  object TimelineProps {
    
    inline def apply(items: js.Array[TimelineItem]): TimelineProps = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimelineProps]
    }
    
    extension [Self <: TimelineProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setGap(value: String): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setItems(value: js.Array[TimelineItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: TimelineItem*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}
