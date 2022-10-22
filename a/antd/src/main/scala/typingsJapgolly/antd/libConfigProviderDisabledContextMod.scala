package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigProviderDisabledContextMod extends Shortcut {
  
  @JSImport("antd/lib/config-provider/DisabledContext", JSImport.Default)
  @js.native
  val default: Context[DisabledType] = js.native
  
  @JSImport("antd/lib/config-provider/DisabledContext", "DisabledContextProvider")
  @js.native
  val DisabledContextProvider: FC[DisabledContextProps] = js.native
  
  trait DisabledContextProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var disabled: js.UndefOr[DisabledType] = js.undefined
  }
  object DisabledContextProps {
    
    inline def apply(): DisabledContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisabledContextProps]
    }
    
    extension [Self <: DisabledContextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDisabled(value: DisabledType): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdBooleans.`true`
    - typingsJapgolly.antd.antdBooleans.`false`
    - scala.Unit
  */
  type DisabledType = js.UndefOr[_DisabledType]
  
  trait _DisabledType extends StObject
  
  type _To = Context[DisabledType]
  
  /* This means you don't have to write `default`, but can instead just say `libConfigProviderDisabledContextMod.foo` */
  override def _to: Context[DisabledType] = default
}
