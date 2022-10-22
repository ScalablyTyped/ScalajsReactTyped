package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.anon.Align
import typingsJapgolly.vegaLite.anon.AlignString
import typingsJapgolly.vegaLite.anon.AlignUndefined
import typingsJapgolly.vegaLite.anon.Anchor
import typingsJapgolly.vegaLite.anon.Angle
import typingsJapgolly.vegaLite.anon.Aria
import typingsJapgolly.vegaLite.anon.Axes
import typingsJapgolly.vegaLite.anon.Baseline
import typingsJapgolly.vegaLite.anon.BaselineUndefined
import typingsJapgolly.vegaLite.anon.Color
import typingsJapgolly.vegaLite.anon.Name
import typingsJapgolly.vegaLite.anon.PartialRecordkeyofCoreHea
import typingsJapgolly.vegaLite.anon.PartialVgTitle
import typingsJapgolly.vegaLite.anon.`1`
import typingsJapgolly.vegaLite.anon.`2`
import typingsJapgolly.vegaLite.buildSrcChannelMod.FacetChannel
import typingsJapgolly.vegaLite.buildSrcCompileHeaderComponentMod.HeaderChannel
import typingsJapgolly.vegaLite.buildSrcCompileHeaderComponentMod.HeaderComponent
import typingsJapgolly.vegaLite.buildSrcCompileHeaderComponentMod.HeaderType
import typingsJapgolly.vegaLite.buildSrcCompileHeaderComponentMod.LayoutHeaderComponent
import typingsJapgolly.vegaLite.buildSrcCompileHeaderComponentMod.LayoutHeaderComponentIndex
import typingsJapgolly.vegaLite.buildSrcCompileModelMod.Model
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcSpecFacetMod.FacetFieldDef
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.RowCol
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgMarkGroup
import typingsJapgolly.vegaLite.vegaLiteStrings.format
import typingsJapgolly.vegaLite.vegaLiteStrings.formatType
import typingsJapgolly.vegaLite.vegaLiteStrings.labelAlign
import typingsJapgolly.vegaLite.vegaLiteStrings.labelAnchor
import typingsJapgolly.vegaLite.vegaLiteStrings.labelAngle
import typingsJapgolly.vegaLite.vegaLiteStrings.labelBaseline
import typingsJapgolly.vegaLite.vegaLiteStrings.labelColor
import typingsJapgolly.vegaLite.vegaLiteStrings.labelExpr
import typingsJapgolly.vegaLite.vegaLiteStrings.labelFont
import typingsJapgolly.vegaLite.vegaLiteStrings.labelFontSize
import typingsJapgolly.vegaLite.vegaLiteStrings.labelFontStyle
import typingsJapgolly.vegaLite.vegaLiteStrings.labelFontWeight
import typingsJapgolly.vegaLite.vegaLiteStrings.labelLimit
import typingsJapgolly.vegaLite.vegaLiteStrings.labelLineHeight
import typingsJapgolly.vegaLite.vegaLiteStrings.labelOrient
import typingsJapgolly.vegaLite.vegaLiteStrings.labelPadding
import typingsJapgolly.vegaLite.vegaLiteStrings.labels
import typingsJapgolly.vegaLite.vegaLiteStrings.orient
import typingsJapgolly.vegaLite.vegaLiteStrings.titleAlign
import typingsJapgolly.vegaLite.vegaLiteStrings.titleAnchor
import typingsJapgolly.vegaLite.vegaLiteStrings.titleAngle
import typingsJapgolly.vegaLite.vegaLiteStrings.titleBaseline
import typingsJapgolly.vegaLite.vegaLiteStrings.titleColor
import typingsJapgolly.vegaLite.vegaLiteStrings.titleFont
import typingsJapgolly.vegaLite.vegaLiteStrings.titleFontSize
import typingsJapgolly.vegaLite.vegaLiteStrings.titleFontStyle
import typingsJapgolly.vegaLite.vegaLiteStrings.titleFontWeight
import typingsJapgolly.vegaLite.vegaLiteStrings.titleLimit
import typingsJapgolly.vegaLite.vegaLiteStrings.titleLineHeight
import typingsJapgolly.vegaLite.vegaLiteStrings.titleOrient
import typingsJapgolly.vegaLite.vegaLiteStrings.titlePadding
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.typesSpecTitleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileHeaderAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/header/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleHeaderGroup(
    model: Model,
    channel: HeaderChannel,
    headerType: HeaderType,
    layoutHeader: LayoutHeaderComponent,
    headerComponent: HeaderComponent
  ): Axes = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleHeaderGroup")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], headerType.asInstanceOf[js.Any], layoutHeader.asInstanceOf[js.Any], headerComponent.asInstanceOf[js.Any])).asInstanceOf[Axes]
  
  inline def assembleHeaderGroups(model: Model, channel: HeaderChannel): js.Array[VgMarkGroup] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleHeaderGroups")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.Array[VgMarkGroup]]
  
  inline def assembleHeaderProperties(
    config: Config[SignalRef],
    facetFieldDef: FacetFieldDef[String, SignalRef],
    channel: FacetChannel,
    properties: js.Array[
      /* keyof vega-lite.vega-lite/build/src/header.CoreHeader<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType
    ],
    propertiesMap: PartialRecordkeyofCoreHea
  ): PartialVgTitle = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleHeaderProperties")(config.asInstanceOf[js.Any], facetFieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], propertiesMap.asInstanceOf[js.Any])).asInstanceOf[PartialVgTitle]
  
  inline def assembleLabelTitle(facetFieldDef: FacetFieldDef[String, SignalRef], channel: FacetChannel, config: Config[SignalRef]): Align | Baseline | Anchor | Angle | Color | Aria = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLabelTitle")(facetFieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Align | Baseline | Anchor | Angle | Color | Aria]
  
  inline def assembleLayoutTitleBand(headerComponentIndex: LayoutHeaderComponentIndex, config: Config[SignalRef]): RowCol[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLayoutTitleBand")(headerComponentIndex.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[RowCol[Double]]
  
  inline def assembleTitleGroup(model: Model, channel: FacetChannel): Name = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleTitleGroup")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Name]
  
  inline def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double): AlignString | `1` | AlignUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderGuideAlign")(headerChannel.asInstanceOf[js.Any], angle.asInstanceOf[js.Any])).asInstanceOf[AlignString | `1` | AlignUndefined]
  inline def defaultHeaderGuideAlign(headerChannel: HeaderChannel, angle: Double, anchor: TitleAnchor): AlignString | `1` | AlignUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderGuideAlign")(headerChannel.asInstanceOf[js.Any], angle.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any])).asInstanceOf[AlignString | `1` | AlignUndefined]
  
  inline def defaultHeaderGuideBaseline(angle: Double, channel: FacetChannel): `2` | BaselineUndefined = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultHeaderGuideBaseline")(angle.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[`2` | BaselineUndefined]
  
  inline def getLayoutTitleBand(titleAnchor: TitleAnchor, headerChannel: HeaderChannel): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutTitleBand")(titleAnchor.asInstanceOf[js.Any], headerChannel.asInstanceOf[js.Any])).asInstanceOf[Any]
}
