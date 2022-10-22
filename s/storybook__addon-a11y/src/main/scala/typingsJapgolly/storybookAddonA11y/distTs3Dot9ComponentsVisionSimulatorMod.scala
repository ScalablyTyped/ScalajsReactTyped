package typingsJapgolly.storybookAddonA11y

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsVisionSimulatorMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/VisionSimulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def VisionSimulator(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("VisionSimulator")().asInstanceOf[Element]
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/VisionSimulator", "baseList")
  @js.native
  val baseList: js.Array[Option] = js.native
  
  trait Link extends StObject {
    
    var active: Boolean
    
    var id: String
    
    def onClick(): Unit
    
    var right: js.UndefOr[Node] = js.undefined
    
    var title: Node
  }
  object Link {
    
    inline def apply(active: Boolean, id: String, onClick: Callback): Link = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClick = onClick.toJsFn, title = null)
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setRight(value: VdomNode): Self = StObject.set(x, "right", value.rawNode.asInstanceOf[js.Any])
      
      inline def setRightNull: Self = StObject.set(x, "right", null)
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "right", js.Array(value*))
      
      inline def setRightVdomElement(value: VdomElement): Self = StObject.set(x, "right", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Option extends StObject {
    
    var name: String
    
    var percentage: js.UndefOr[Double] = js.undefined
  }
  object Option {
    
    inline def apply(name: String): Option = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    }
  }
}
