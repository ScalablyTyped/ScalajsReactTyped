package typingsJapgolly.nivoArcs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.SVGPathElement
import typingsJapgolly.nivoArcs.distTypesArcShapeMod.ArcMouseHandler
import typingsJapgolly.nivoArcs.distTypesArcShapeMod.ArcShapeProps
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typingsJapgolly.nivoArcs.distTypesTypesMod.ArcGenerator
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcsLayerMod {
  
  @JSImport("@nivo/arcs/dist/types/ArcsLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataArcGeneratorBorderWidthBorderColorOnClickOnMouseEnterOnMouseMoveOnMouseLeaveTransitionModeComponent: ArcsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcsLayer")(hasCenterDataArcGeneratorBorderWidthBorderColorOnClickOnMouseEnterOnMouseMoveOnMouseLeaveTransitionModeComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ArcComponent[Datum /* <: DatumWithArcAndColor */] = js.Function1[/* props */ ArcShapeProps[Datum], Element]
  
  trait ArcsLayerProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var arcGenerator: ArcGenerator
    
    var borderColor: InheritedColorConfig[Datum]
    
    var borderWidth: Double
    
    var center: js.Tuple2[Double, Double]
    
    var component: js.UndefOr[ArcComponent[Datum]] = js.undefined
    
    var data: js.Array[Datum]
    
    var onClick: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseEnter: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseLeave: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var onMouseMove: js.UndefOr[ArcMouseHandler[Datum]] = js.undefined
    
    var transitionMode: ArcTransitionMode
  }
  object ArcsLayerProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](
      arcGenerator: ArcGenerator,
      borderColor: InheritedColorConfig[Datum],
      borderWidth: Double,
      center: js.Tuple2[Double, Double],
      data: js.Array[Datum],
      transitionMode: ArcTransitionMode
    ): ArcsLayerProps[Datum] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], transitionMode = transitionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcsLayerProps[Datum]]
    }
    
    extension [Self <: ArcsLayerProps[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcsLayerProps[Datum]) {
      
      inline def setArcGenerator(value: ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setBorderColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: /* props */ ArcShapeProps[Datum] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setOnClick(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnMouseMove(value: (Datum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: Datum, t1: /* event */ ReactMouseEventFrom[SVGPathElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    }
  }
}
