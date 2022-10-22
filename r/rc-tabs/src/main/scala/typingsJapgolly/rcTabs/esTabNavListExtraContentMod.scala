package typingsJapgolly.rcTabs

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcTabs.esInterfaceMod.TabBarExtraContent
import typingsJapgolly.rcTabs.esInterfaceMod.TabBarExtraPosition
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListExtraContentMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/ExtraContent", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ExtraContentProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait ExtraContentProps extends StObject {
    
    var extra: js.UndefOr[TabBarExtraContent] = js.undefined
    
    var position: TabBarExtraPosition
    
    var prefixCls: String
  }
  object ExtraContentProps {
    
    inline def apply(position: TabBarExtraPosition, prefixCls: String): ExtraContentProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtraContentProps]
    }
    
    extension [Self <: ExtraContentProps](x: Self) {
      
      inline def setExtra(value: TabBarExtraContent): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      inline def setExtraNull: Self = StObject.set(x, "extra", null)
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPosition(value: TabBarExtraPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[ExtraContentProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListExtraContentMod.foo` */
  override def _to: ForwardRefExoticComponent[ExtraContentProps & RefAttributes[HTMLDivElement]] = default
}
