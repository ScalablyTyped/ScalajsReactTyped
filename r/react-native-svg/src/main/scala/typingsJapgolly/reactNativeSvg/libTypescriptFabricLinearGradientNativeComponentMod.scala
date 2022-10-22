package typingsJapgolly.reactNativeSvg

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactNative.librariesTypesCodegenTypesMod.Float
import typingsJapgolly.reactNative.librariesTypesCodegenTypesMod.Int32
import typingsJapgolly.reactNative.librariesTypesCodegenTypesMod.WithDefault
import typingsJapgolly.reactNative.librariesUtilitiesCodegenNativeComponentMod.NativeComponentType
import typingsJapgolly.reactNativeSvg.libTypescriptFabricUtilsMod.ViewProps
import typingsJapgolly.reactNativeSvg.reactNativeSvgDoubles.`1.0`
import typingsJapgolly.reactNativeSvg.reactNativeSvgInts.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptFabricLinearGradientNativeComponentMod extends Shortcut {
  
  @JSImport("react-native-svg/lib/typescript/fabric/LinearGradientNativeComponent", JSImport.Default)
  @js.native
  val default: NativeComponentType[NativeProps] = js.native
  
  trait NativeProps
    extends StObject
       with ViewProps
       with SvgNodeCommonProps {
    
    var gradient: js.UndefOr[js.Array[Float]] = js.undefined
    
    var gradientTransform: js.UndefOr[js.Array[Float]] = js.undefined
    
    var gradientUnits: js.UndefOr[Int32] = js.undefined
    
    var x1: js.UndefOr[String] = js.undefined
    
    var x2: js.UndefOr[String] = js.undefined
    
    var y1: js.UndefOr[String] = js.undefined
    
    var y2: js.UndefOr[String] = js.undefined
  }
  object NativeProps {
    
    inline def apply(): NativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeProps]
    }
    
    extension [Self <: NativeProps](x: Self) {
      
      inline def setGradient(value: js.Array[Float]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      inline def setGradientTransform(value: js.Array[Float]): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
      
      inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
      
      inline def setGradientTransformVarargs(value: Float*): Self = StObject.set(x, "gradientTransform", js.Array(value*))
      
      inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      inline def setGradientUnits(value: Int32): Self = StObject.set(x, "gradientUnits", value.asInstanceOf[js.Any])
      
      inline def setGradientUnitsUndefined: Self = StObject.set(x, "gradientUnits", js.undefined)
      
      inline def setGradientVarargs(value: Float*): Self = StObject.set(x, "gradient", js.Array(value*))
      
      inline def setX1(value: String): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      inline def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      inline def setX2(value: String): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      inline def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      inline def setY1(value: String): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      inline def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      inline def setY2(value: String): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      inline def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
  
  trait SvgNodeCommonProps extends StObject {
    
    var clipPath: js.UndefOr[String] = js.undefined
    
    var clipRule: js.UndefOr[WithDefault[Int32, `0`]] = js.undefined
    
    var display: js.UndefOr[String] = js.undefined
    
    var markerEnd: js.UndefOr[String] = js.undefined
    
    var markerMid: js.UndefOr[String] = js.undefined
    
    var markerStart: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[String] = js.undefined
    
    var matrix: js.UndefOr[js.Array[Float]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[WithDefault[Float, `1.0`]] = js.undefined
    
    var pointerEvents: js.UndefOr[String] = js.undefined
    
    var responsible: js.UndefOr[Boolean] = js.undefined
  }
  object SvgNodeCommonProps {
    
    inline def apply(): SvgNodeCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgNodeCommonProps]
    }
    
    extension [Self <: SvgNodeCommonProps](x: Self) {
      
      inline def setClipPath(value: String): Self = StObject.set(x, "clipPath", value.asInstanceOf[js.Any])
      
      inline def setClipPathUndefined: Self = StObject.set(x, "clipPath", js.undefined)
      
      inline def setClipRule(value: WithDefault[Int32, `0`]): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
      
      inline def setClipRuleNull: Self = StObject.set(x, "clipRule", null)
      
      inline def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
      
      inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setMarkerEnd(value: String): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
      
      inline def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
      
      inline def setMarkerMid(value: String): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
      
      inline def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
      
      inline def setMarkerStart(value: String): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
      
      inline def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
      
      inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMatrix(value: js.Array[Float]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setMatrixVarargs(value: Float*): Self = StObject.set(x, "matrix", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOpacity(value: WithDefault[Float, `1.0`]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityNull: Self = StObject.set(x, "opacity", null)
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setResponsible(value: Boolean): Self = StObject.set(x, "responsible", value.asInstanceOf[js.Any])
      
      inline def setResponsibleUndefined: Self = StObject.set(x, "responsible", js.undefined)
    }
  }
  
  type _To = NativeComponentType[NativeProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptFabricLinearGradientNativeComponentMod.foo` */
  override def _to: NativeComponentType[NativeProps] = default
}
