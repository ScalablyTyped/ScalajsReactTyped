package typingsJapgolly.reactNativeSvg

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNativeSvg.anon.ObjectmatrixArraynumberun
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.FontProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsGMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/G", JSImport.Default)
  @js.native
  open class default[P] () extends G[P]
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/G", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/G", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait G[P]
    extends typingsJapgolly.reactNativeSvg.libTypescriptElementsShapeMod.default[GProps & P] {
    
    def setNativeProps(props: ObjectmatrixArraynumberun): Unit = js.native
  }
  
  trait GProps
    extends StObject
       with CommonPathProps
       with FontProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
  }
  object GProps {
    
    inline def apply(): GProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GProps]
    }
    
    extension [Self <: GProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
}
