package typingsJapgolly.rcMenu

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.rcMenu.esInterfaceMod.RenderIconInfo
import typingsJapgolly.rcMenu.esInterfaceMod.RenderIconType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esIconMod {
  
  @JSImport("rc-menu/es/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasIconPropsChildren: IconProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasIconPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait IconProps extends StObject {
    
    /** Fallback of icon if provided */
    var children: js.UndefOr[Element] = js.undefined
    
    var icon: js.UndefOr[RenderIconType] = js.undefined
    
    var props: RenderIconInfo
  }
  object IconProps {
    
    inline def apply(props: RenderIconInfo): IconProps = {
      val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIcon(value: RenderIconType): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconFunction1(value: /* props */ RenderIconInfo => Node): Self = StObject.set(x, "icon", js.Any.fromFunction1(value))
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setProps(value: RenderIconInfo): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
