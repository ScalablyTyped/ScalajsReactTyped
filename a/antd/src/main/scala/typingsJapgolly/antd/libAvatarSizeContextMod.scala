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

object libAvatarSizeContextMod extends Shortcut {
  
  @JSImport("antd/lib/avatar/SizeContext", JSImport.Default)
  @js.native
  val default: Context[AvatarSize] = js.native
  
  @JSImport("antd/lib/avatar/SizeContext", "SizeContextProvider")
  @js.native
  val SizeContextProvider: FC[SizeContextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.large
    - typingsJapgolly.antd.antdStrings.small
    - typingsJapgolly.antd.antdStrings.default
    - scala.Double
    - typingsJapgolly.antd.libUtilResponsiveObserveMod.ScreenSizeMap
  */
  type AvatarSize = _AvatarSize | Double
  
  trait SizeContextProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var size: js.UndefOr[AvatarSize] = js.undefined
  }
  object SizeContextProps {
    
    inline def apply(): SizeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeContextProps]
    }
    
    extension [Self <: SizeContextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait _AvatarSize extends StObject
  
  type _To = Context[AvatarSize]
  
  /* This means you don't have to write `default`, but can instead just say `libAvatarSizeContextMod.foo` */
  override def _to: Context[AvatarSize] = default
}
