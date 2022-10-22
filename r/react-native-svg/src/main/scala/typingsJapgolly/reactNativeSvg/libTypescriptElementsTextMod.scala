package typingsJapgolly.reactNativeSvg

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNativeSvg.anon.ObjectmatrixArraynumberunConstructor
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberArray
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.TextSpecificProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsTextMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Text", JSImport.Default)
  @js.native
  open class default () extends Text
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Text", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Text", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Text
    extends typingsJapgolly.reactNativeSvg.libTypescriptElementsShapeMod.default[TextProps] {
    
    def setNativeProps(props: ObjectmatrixArraynumberunConstructor): Unit = js.native
  }
  
  trait TextProps
    extends StObject
       with TextSpecificProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var dx: js.UndefOr[NumberArray] = js.undefined
    
    var dy: js.UndefOr[NumberArray] = js.undefined
    
    var inlineSize: js.UndefOr[NumberProp] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var rotate: js.UndefOr[NumberArray] = js.undefined
  }
  object TextProps {
    
    inline def apply(): TextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextProps]
    }
    
    extension [Self <: TextProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDx(value: NumberArray): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDxVarargs(value: NumberProp*): Self = StObject.set(x, "dx", js.Array(value*))
      
      inline def setDy(value: NumberArray): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setDyVarargs(value: NumberProp*): Self = StObject.set(x, "dy", js.Array(value*))
      
      inline def setInlineSize(value: NumberProp): Self = StObject.set(x, "inlineSize", value.asInstanceOf[js.Any])
      
      inline def setInlineSizeUndefined: Self = StObject.set(x, "inlineSize", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRotate(value: NumberArray): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setRotateVarargs(value: NumberProp*): Self = StObject.set(x, "rotate", js.Array(value*))
    }
  }
}
