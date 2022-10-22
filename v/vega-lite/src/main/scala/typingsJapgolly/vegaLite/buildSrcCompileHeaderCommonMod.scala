package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.buildSrcChannelMod.FacetChannel
import typingsJapgolly.vegaLite.buildSrcCompileHeaderComponentMod.HeaderChannel
import typingsJapgolly.vegaLite.buildSrcConfigMod.Config
import typingsJapgolly.vegaLite.buildSrcHeaderMod.Header
import typingsJapgolly.vegaLite.buildSrcUtilMod.Dict
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
import typingsJapgolly.vegaLite.vegaLiteStrings.number
import typingsJapgolly.vegaLite.vegaLiteStrings.orient
import typingsJapgolly.vegaLite.vegaLiteStrings.time
import typingsJapgolly.vegaLite.vegaLiteStrings.title
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
import typingsJapgolly.vegaTypings.typesSpecColorMod.Color
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Align
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.FontStyle
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.FontWeight
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Orient
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Text
import typingsJapgolly.vegaTypings.typesSpecEncodeMod.TextBaseline
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.typesSpecTitleMod.TitleAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileHeaderCommonMod {
  
  @JSImport("vega-lite/build/src/compile/header/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHeaderChannel(channel: FacetChannel, orient: Orient): HeaderChannel = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderChannel")(channel.asInstanceOf[js.Any], orient.asInstanceOf[js.Any])).asInstanceOf[HeaderChannel]
  
  inline def getHeaderProperties(
    properties: js.Array[
      /* keyof vega-lite.vega-lite/build/src/header.Header<vega-typings.vega-typings/types/spec/signal.SignalRef> */ titleAnchor | titleAlign | titleAngle | titleBaseline | titleColor | titleFont | titleFontSize | titleFontStyle | titleFontWeight | titleLimit | titleLineHeight | titleOrient | titlePadding | labels | labelAlign | labelBaseline | labelAnchor | labelExpr | labelAngle | labelColor | labelFont | labelFontSize | labelFontStyle | labelFontWeight | labelLimit | labelLineHeight | labelOrient | labelPadding | orient | format | formatType | title
    ],
    header: Header[SignalRef],
    config: Config[SignalRef],
    channel: FacetChannel
  ): Header[SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperties")(properties.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Header[SignalRef]]
  
  inline def getHeaderProperty_format(prop: format, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | Dict[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | Dict[Any]]]
  
  inline def getHeaderProperty_formatType(prop: formatType, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[number | time | String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[number | time | String]]
  
  inline def getHeaderProperty_labelAlign(prop: labelAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Align | SignalRef]]
  
  inline def getHeaderProperty_labelAnchor(prop: labelAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TitleAnchor]]
  
  inline def getHeaderProperty_labelAngle(prop: labelAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getHeaderProperty_labelBaseline(prop: labelBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextBaseline | SignalRef]]
  
  inline def getHeaderProperty_labelColor(prop: labelColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Color | SignalRef]]
  
  inline def getHeaderProperty_labelExpr(prop: labelExpr, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getHeaderProperty_labelFont(prop: labelFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | SignalRef]]
  
  inline def getHeaderProperty_labelFontSize(prop: labelFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labelFontStyle(prop: labelFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontStyle | SignalRef]]
  
  inline def getHeaderProperty_labelFontWeight(prop: labelFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontWeight | SignalRef]]
  
  inline def getHeaderProperty_labelLimit(prop: labelLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labelLineHeight(prop: labelLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labelOrient(prop: labelOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Orient]]
  
  inline def getHeaderProperty_labelPadding(prop: labelPadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_labels(prop: labels, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def getHeaderProperty_orient(prop: orient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Orient]]
  
  inline def getHeaderProperty_title(prop: title, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Text | Null | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Text | Null | SignalRef]]
  
  inline def getHeaderProperty_titleAlign(prop: titleAlign, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Align | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Align | SignalRef]]
  
  inline def getHeaderProperty_titleAnchor(prop: titleAnchor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TitleAnchor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TitleAnchor]]
  
  inline def getHeaderProperty_titleAngle(prop: titleAngle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double]]
  
  inline def getHeaderProperty_titleBaseline(prop: titleBaseline, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[TextBaseline | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TextBaseline | SignalRef]]
  
  inline def getHeaderProperty_titleColor(prop: titleColor, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Color | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Color | SignalRef]]
  
  inline def getHeaderProperty_titleFont(prop: titleFont, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[String | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String | SignalRef]]
  
  inline def getHeaderProperty_titleFontSize(prop: titleFontSize, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_titleFontStyle(prop: titleFontStyle, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontStyle | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontStyle | SignalRef]]
  
  inline def getHeaderProperty_titleFontWeight(prop: titleFontWeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[FontWeight | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[FontWeight | SignalRef]]
  
  inline def getHeaderProperty_titleLimit(prop: titleLimit, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_titleLineHeight(prop: titleLineHeight, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
  
  inline def getHeaderProperty_titleOrient(prop: titleOrient, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Orient] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Orient]]
  
  inline def getHeaderProperty_titlePadding(prop: titlePadding, header: Header[SignalRef], config: Config[SignalRef], channel: FacetChannel): js.UndefOr[Double | SignalRef] = (^.asInstanceOf[js.Dynamic].applyDynamic("getHeaderProperty")(prop.asInstanceOf[js.Any], header.asInstanceOf[js.Any], config.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Double | SignalRef]]
}
