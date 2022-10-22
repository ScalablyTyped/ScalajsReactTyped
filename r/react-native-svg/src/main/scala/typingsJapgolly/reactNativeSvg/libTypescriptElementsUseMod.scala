package typingsJapgolly.reactNativeSvg

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNativeSvg.anon.Width
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.CommonPathProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsUseMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Use", JSImport.Default)
  @js.native
  open class default () extends Use
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Use", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Use", "default.defaultProps")
    @js.native
    def defaultProps: Width = js.native
    inline def defaultProps_=(x: Width): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Use", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Use
    extends typingsJapgolly.reactNativeSvg.libTypescriptElementsShapeMod.default[UseProps]
  
  trait UseProps
    extends StObject
       with CommonPathProps {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[NumberProp] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
    
    @JSName("x")
    var x_UseProps: js.UndefOr[NumberProp] = js.undefined
    
    var xlinkHref: js.UndefOr[String] = js.undefined
    
    @JSName("y")
    var y_UseProps: js.UndefOr[NumberProp] = js.undefined
  }
  object UseProps {
    
    inline def apply(): UseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseProps]
    }
    
    extension [Self <: UseProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setOpacity(value: NumberProp): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setXlinkHref(value: String): Self = StObject.set(x, "xlinkHref", value.asInstanceOf[js.Any])
      
      inline def setXlinkHrefUndefined: Self = StObject.set(x, "xlinkHref", js.undefined)
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
