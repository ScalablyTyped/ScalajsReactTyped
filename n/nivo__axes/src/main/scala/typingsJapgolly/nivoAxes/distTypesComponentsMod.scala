package typingsJapgolly.nivoAxes

import typingsJapgolly.nivoAxes.anon.AnimatedProps
import typingsJapgolly.nivoAxes.anon.Left
import typingsJapgolly.nivoAxes.anon.Length
import typingsJapgolly.nivoAxes.anon.Lines
import typingsJapgolly.nivoAxes.anon.Width
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisTickProps
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleValue
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsMod {
  
  @JSImport("@nivo/axes/dist/types/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nivo/axes/dist/types/components", "Axes")
  @js.native
  val Axes: MemoExoticComponent[
    js.Function1[
      /* hasXScaleYScaleWidthHeightTopRightBottomLeft */ Left[ScaleValue, ScaleValue], 
      Element
    ]
  ] = js.native
  
  inline def Axis[Value /* <: ScaleValue */](
    hasAxisScaleXYLengthTicksPositionTickValuesTickSizeTickPaddingTickRotationFormatRenderTickLegendLegendPositionLegendOffsetOnClickAriaHidden: AxisProps[Value] & Length[Value]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Axis")(hasAxisScaleXYLengthTicksPositionTickValuesTickSizeTickPaddingTickRotationFormatRenderTickLegendLegendPositionLegendOffsetOnClickAriaHidden.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def AxisTick[Value /* <: ScaleValue */](has_valueFormatLineXLineYOnClickTextBaselineTextAnchorAnimatedProps: AxisTickProps[Value]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AxisTick")(has_valueFormatLineXLineYOnClickTextBaselineTextAnchorAnimatedProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@nivo/axes/dist/types/components", "Grid")
  @js.native
  val Grid: MemoExoticComponent[
    js.Function1[
      /* hasWidthHeightXScaleYScaleXValuesYValues */ Width[ScaleValue, ScaleValue], 
      Element
    ]
  ] = js.native
  
  @JSImport("@nivo/axes/dist/types/components", "GridLine")
  @js.native
  val GridLine: MemoExoticComponent[js.Function1[/* hasAnimatedProps */ AnimatedProps, Element]] = js.native
  
  @JSImport("@nivo/axes/dist/types/components", "GridLines")
  @js.native
  val GridLines: MemoExoticComponent[js.Function1[/* hasLines */ Lines, Element]] = js.native
}
