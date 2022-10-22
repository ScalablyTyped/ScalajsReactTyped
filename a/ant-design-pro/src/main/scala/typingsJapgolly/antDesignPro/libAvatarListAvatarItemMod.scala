package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarListAvatarItemMod {
  
  @JSImport("ant-design-pro/lib/AvatarList/AvatarItem", JSImport.Default)
  @js.native
  open class default protected () extends Component[AvatarItemProps, Any, Any] {
    def this(props: AvatarItemProps) = this()
  }
  
  type AvatarItem = japgolly.scalajs.react.facade.React.Component[AvatarItemProps & js.Object, js.Object]
  
  trait AvatarItemProps extends StObject {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var src: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tips: Node
  }
  object AvatarItemProps {
    
    inline def apply(src: String): AvatarItemProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], tips = null)
      __obj.asInstanceOf[AvatarItemProps]
    }
    
    extension [Self <: AvatarItemProps](x: Self) {
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTips(value: VdomNode): Self = StObject.set(x, "tips", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTipsNull: Self = StObject.set(x, "tips", null)
      
      inline def setTipsVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tips", js.Array(value*))
      
      inline def setTipsVdomElement(value: VdomElement): Self = StObject.set(x, "tips", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typingsJapgolly.antDesignPro.antDesignProStrings.small
    - typingsJapgolly.antDesignPro.antDesignProStrings.default
    - typingsJapgolly.antDesignPro.antDesignProStrings.large
  */
  type SizeType = _SizeType | Double
  
  trait _SizeType extends StObject
}
