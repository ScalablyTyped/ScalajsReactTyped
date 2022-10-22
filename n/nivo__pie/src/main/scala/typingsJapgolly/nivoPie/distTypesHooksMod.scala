package typingsJapgolly.nivoPie

import typingsJapgolly.nivoPie.anon.ActiveId
import typingsJapgolly.nivoPie.anon.ArcGenerator
import typingsJapgolly.nivoPie.anon.CenterX
import typingsJapgolly.nivoPie.anon.Data
import typingsJapgolly.nivoPie.anon.DataArray
import typingsJapgolly.nivoPie.anon.DataWithArc
import typingsJapgolly.nivoPie.anon.InnerRadius
import typingsJapgolly.nivoPie.distTypesTypesMod.CompletePieSvgProps
import typingsJapgolly.nivoPie.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoPie.distTypesTypesMod.PieCustomLayerProps
import typingsJapgolly.nivoPie.nivoPieStrings.activeInnerRadiusOffset
import typingsJapgolly.nivoPie.nivoPieStrings.activeOuterRadiusOffset
import typingsJapgolly.nivoPie.nivoPieStrings.arc
import typingsJapgolly.nivoPie.nivoPieStrings.colors
import typingsJapgolly.nivoPie.nivoPieStrings.cornerRadius
import typingsJapgolly.nivoPie.nivoPieStrings.endAngle
import typingsJapgolly.nivoPie.nivoPieStrings.fill
import typingsJapgolly.nivoPie.nivoPieStrings.fit
import typingsJapgolly.nivoPie.nivoPieStrings.height
import typingsJapgolly.nivoPie.nivoPieStrings.id
import typingsJapgolly.nivoPie.nivoPieStrings.innerRadius
import typingsJapgolly.nivoPie.nivoPieStrings.padAngle
import typingsJapgolly.nivoPie.nivoPieStrings.sortByValue
import typingsJapgolly.nivoPie.nivoPieStrings.startAngle
import typingsJapgolly.nivoPie.nivoPieStrings.value
import typingsJapgolly.nivoPie.nivoPieStrings.valueFormat
import typingsJapgolly.nivoPie.nivoPieStrings.width
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/pie/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useNormalizedData[RawDatum /* <: MayHaveLabel */](
    hasDataIdValueValueFormatColors: (Pick[CompletePieSvgProps[RawDatum], id | value | valueFormat | colors]) & Data[RawDatum]
  ): js.Array[Omit[ComputedDatum[RawDatum], fill | arc]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNormalizedData")(hasDataIdValueValueFormatColors.asInstanceOf[js.Any]).asInstanceOf[js.Array[Omit[ComputedDatum[RawDatum], fill | arc]]]
  
  inline def usePie[RawDatum](
    hasDataRadiusInnerRadiusStartAngleEndAnglePadAngleSortByValueCornerRadiusActiveInnerRadiusOffsetActiveOuterRadiusOffset: (Pick[
      Partial[CompletePieSvgProps[RawDatum]], 
      startAngle | endAngle | sortByValue | padAngle | cornerRadius | activeInnerRadiusOffset | activeOuterRadiusOffset
    ]) & InnerRadius[RawDatum]
  ): ArcGenerator[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePie")(hasDataRadiusInnerRadiusStartAngleEndAnglePadAngleSortByValueCornerRadiusActiveInnerRadiusOffsetActiveOuterRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator[RawDatum]]
  
  inline def usePieArcs[RawDatum](
    hasDataStartAngleEndAngleInnerRadiusOuterRadiusPadAngleSortByValueActiveIdActiveInnerRadiusOffsetActiveOuterRadiusOffsetHiddenIds: ActiveId[RawDatum]
  ): DataWithArc[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieArcs")(hasDataStartAngleEndAngleInnerRadiusOuterRadiusPadAngleSortByValueActiveIdActiveInnerRadiusOffsetActiveOuterRadiusOffsetHiddenIds.asInstanceOf[js.Any]).asInstanceOf[DataWithArc[RawDatum]]
  
  inline def usePieFromBox[RawDatum](
    hasDataWidthHeightInnerRadiusRatioStartAngleEndAnglePadAngleSortByValueCornerRadiusFitActiveInnerRadiusOffsetActiveOuterRadiusOffset: (Pick[
      CompletePieSvgProps[RawDatum], 
      startAngle | endAngle | innerRadius | width | height | sortByValue | padAngle | cornerRadius | fit | activeInnerRadiusOffset | activeOuterRadiusOffset
    ]) & DataArray[RawDatum]
  ): CenterX[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieFromBox")(hasDataWidthHeightInnerRadiusRatioStartAngleEndAnglePadAngleSortByValueCornerRadiusFitActiveInnerRadiusOffsetActiveOuterRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[CenterX[RawDatum]]
  
  inline def usePieLayerContext[RawDatum](hasDataWithArcArcGeneratorCenterXCenterYRadiusInnerRadius: PieCustomLayerProps[RawDatum]): PieCustomLayerProps[RawDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePieLayerContext")(hasDataWithArcArcGeneratorCenterXCenterYRadiusInnerRadius.asInstanceOf[js.Any]).asInstanceOf[PieCustomLayerProps[RawDatum]]
  
  trait MayHaveLabel extends StObject {
    
    var label: js.UndefOr[String | Double] = js.undefined
  }
  object MayHaveLabel {
    
    inline def apply(): MayHaveLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MayHaveLabel]
    }
    
    extension [Self <: MayHaveLabel](x: Self) {
      
      inline def setLabel(value: String | Double): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
}
