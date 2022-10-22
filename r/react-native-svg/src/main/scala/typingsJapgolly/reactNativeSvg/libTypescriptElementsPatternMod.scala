package typingsJapgolly.reactNativeSvg

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNativeSvg.anon.Height
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.ColumnMajorTransformMatrix
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.TransformProps
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsPatternMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Pattern", JSImport.Default)
  @js.native
  open class default () extends Pattern
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Pattern", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Pattern", "default.defaultProps")
    @js.native
    def defaultProps: Height = js.native
    inline def defaultProps_=(x: Height): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Pattern", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Pattern
    extends typingsJapgolly.reactNativeSvg.libTypescriptElementsShapeMod.default[PatternProps]
  
  trait PatternProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var height: js.UndefOr[NumberProp] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var patternContentUnits: js.UndefOr[Units] = js.undefined
    
    var patternTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
    
    var patternUnits: js.UndefOr[Units] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var transform: js.UndefOr[ColumnMajorTransformMatrix | String | TransformProps] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[NumberProp] = js.undefined
    
    var x: js.UndefOr[NumberProp] = js.undefined
    
    var y: js.UndefOr[NumberProp] = js.undefined
  }
  object PatternProps {
    
    inline def apply(): PatternProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternProps]
    }
    
    extension [Self <: PatternProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHeight(value: NumberProp): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPatternContentUnits(value: Units): Self = StObject.set(x, "patternContentUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternContentUnitsUndefined: Self = StObject.set(x, "patternContentUnits", js.undefined)
      
      inline def setPatternTransform(value: ColumnMajorTransformMatrix | String): Self = StObject.set(x, "patternTransform", value.asInstanceOf[js.Any])
      
      inline def setPatternTransformUndefined: Self = StObject.set(x, "patternTransform", js.undefined)
      
      inline def setPatternUnits(value: Units): Self = StObject.set(x, "patternUnits", value.asInstanceOf[js.Any])
      
      inline def setPatternUnitsUndefined: Self = StObject.set(x, "patternUnits", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setTransform(value: ColumnMajorTransformMatrix | String | TransformProps): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
      
      inline def setWidth(value: NumberProp): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: NumberProp): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: NumberProp): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
