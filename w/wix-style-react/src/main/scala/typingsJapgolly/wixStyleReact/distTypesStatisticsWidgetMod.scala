package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.end
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.large
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.start
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.tiny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStatisticsWidgetMod {
  
  @JSImport("wix-style-react/dist/types/StatisticsWidget", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[StatisticsWidgetProps, js.Object, Any]
  
  type StatisticsWidget = PureComponent[StatisticsWidgetProps, js.Object, Any]
  
  trait StatisticsWidgetItem extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var descriptionInfo: js.UndefOr[String] = js.undefined
    
    var invertedPercentage: js.UndefOr[Boolean] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function1[
          /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement], 
          Unit
        ]
      ] = js.undefined
    
    var percentage: js.UndefOr[Double] = js.undefined
    
    var value: String
    
    var valueInShort: js.UndefOr[String] = js.undefined
  }
  object StatisticsWidgetItem {
    
    inline def apply(value: String): StatisticsWidgetItem = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatisticsWidgetItem]
    }
    
    extension [Self <: StatisticsWidgetItem](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionInfo(value: String): Self = StObject.set(x, "descriptionInfo", value.asInstanceOf[js.Any])
      
      inline def setDescriptionInfoUndefined: Self = StObject.set(x, "descriptionInfo", js.undefined)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setInvertedPercentage(value: Boolean): Self = StObject.set(x, "invertedPercentage", value.asInstanceOf[js.Any])
      
      inline def setInvertedPercentageUndefined: Self = StObject.set(x, "invertedPercentage", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setOnClick(
        value: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement] => Callback
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueInShort(value: String): Self = StObject.set(x, "valueInShort", value.asInstanceOf[js.Any])
      
      inline def setValueInShortUndefined: Self = StObject.set(x, "valueInShort", js.undefined)
    }
  }
  
  trait StatisticsWidgetProps extends StObject {
    
    var alignItems: js.UndefOr[center | start | end] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var items: js.UndefOr[js.Array[StatisticsWidgetItem]] = js.undefined
    
    var size: js.UndefOr[large | tiny] = js.undefined
  }
  object StatisticsWidgetProps {
    
    inline def apply(): StatisticsWidgetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatisticsWidgetProps]
    }
    
    extension [Self <: StatisticsWidgetProps](x: Self) {
      
      inline def setAlignItems(value: center | start | end): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setItems(value: js.Array[StatisticsWidgetItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: StatisticsWidgetItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSize(value: large | tiny): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
