package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.marginLeft
import typingsJapgolly.antd.antdStrings.marginRight
import typingsJapgolly.antd.antdStrings.vertical
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSpaceItemMod {
  
  @JSImport("antd/lib/space/Item", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasClassNameDirectionIndexMarginDirectionChildrenSplitWrap: ItemProps): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasClassNameDirectionIndexMarginDirectionChildrenSplitWrap.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  trait ItemProps extends StObject {
    
    var children: Node
    
    var className: String
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var index: Double
    
    var marginDirection: marginLeft | marginRight
    
    var split: js.UndefOr[String | Node] = js.undefined
    
    var wrap: js.UndefOr[Boolean] = js.undefined
  }
  object ItemProps {
    
    inline def apply(className: String, index: Double, marginDirection: marginLeft | marginRight): ItemProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], marginDirection = marginDirection.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ItemProps]
    }
    
    extension [Self <: ItemProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setMarginDirection(value: marginLeft | marginRight): Self = StObject.set(x, "marginDirection", value.asInstanceOf[js.Any])
      
      inline def setSplit(value: String | Node): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitNull: Self = StObject.set(x, "split", null)
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setSplitVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "split", js.Array(value*))
      
      inline def setSplitVdomElement(value: VdomElement): Self = StObject.set(x, "split", value.rawElement.asInstanceOf[js.Any])
      
      inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
