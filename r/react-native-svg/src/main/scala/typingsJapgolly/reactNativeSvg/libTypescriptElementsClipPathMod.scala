package typingsJapgolly.reactNativeSvg

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsClipPathMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/ClipPath", JSImport.Default)
  @js.native
  open class default () extends ClipPath
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/ClipPath", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/ClipPath", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ClipPath
    extends typingsJapgolly.reactNativeSvg.libTypescriptElementsShapeMod.default[ClipPathProps]
  
  trait ClipPathProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
  }
  object ClipPathProps {
    
    inline def apply(): ClipPathProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipPathProps]
    }
    
    extension [Self <: ClipPathProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
}
