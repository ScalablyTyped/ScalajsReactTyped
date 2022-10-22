package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.Text
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import typingsJapgolly.vegaTypings.typesSpecTitleMod.TitleEncode
import typingsJapgolly.vegaTypings.typesSpecValuesMod.AnchorValue
import typingsJapgolly.vegaTypings.typesSpecValuesMod.ColorValue
import typingsJapgolly.vegaTypings.typesSpecValuesMod.FontStyleValue
import typingsJapgolly.vegaTypings.typesSpecValuesMod.FontWeightValue
import typingsJapgolly.vegaTypings.typesSpecValuesMod.NumberValue
import typingsJapgolly.vegaTypings.typesSpecValuesMod.StringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: String | SignalRef | FieldField | Scale | Band | Range | ValueAlign
  
  var anchor: js.UndefOr[AnchorValue] = js.undefined
  
  var angle: js.UndefOr[NumberValue] = js.undefined
  
  var aria: js.UndefOr[Boolean] = js.undefined
  
  var baseline: String | SignalRef | FieldField | Scale | Band | Range | ValueTextBaseline
  
  var color: js.UndefOr[ColorValue] = js.undefined
  
  var dx: js.UndefOr[NumberValue] = js.undefined
  
  var dy: js.UndefOr[NumberValue] = js.undefined
  
  var encode: js.UndefOr[TitleEncode | PartialRecordEncodeEntryN] = js.undefined
  
  var font: js.UndefOr[StringValue] = js.undefined
  
  var fontSize: js.UndefOr[NumberValue] = js.undefined
  
  var fontStyle: js.UndefOr[FontStyleValue] = js.undefined
  
  var fontWeight: js.UndefOr[FontWeightValue] = js.undefined
  
  var frame: String | SignalRef | FieldField | Scale | Band | Range | ValueString
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var limit: js.UndefOr[NumberValue] = js.undefined
  
  var lineHeight: js.UndefOr[NumberValue] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[NumberValue] = js.undefined
  
  var orient: js.UndefOr[String | SignalRef] = js.undefined
  
  var style: String | js.Array[String]
  
  var subtitle: js.UndefOr[SignalRef | Text] = js.undefined
  
  var subtitleColor: js.UndefOr[ColorValue] = js.undefined
  
  var subtitleFont: js.UndefOr[StringValue] = js.undefined
  
  var subtitleFontSize: js.UndefOr[NumberValue] = js.undefined
  
  var subtitleFontStyle: js.UndefOr[FontStyleValue] = js.undefined
  
  var subtitleFontWeight: js.UndefOr[FontWeightValue] = js.undefined
  
  var subtitleLineHeight: js.UndefOr[NumberValue] = js.undefined
  
  var subtitlePadding: js.UndefOr[NumberValue] = js.undefined
  
  var text: SignalRef | Text
  
  var zindex: js.UndefOr[Double] = js.undefined
}
object Align {
  
  inline def apply(
    align: String | SignalRef | FieldField | Scale | Band | Range | ValueAlign,
    baseline: String | SignalRef | FieldField | Scale | Band | Range | ValueTextBaseline,
    frame: String | SignalRef | FieldField | Scale | Band | Range | ValueString,
    style: String | js.Array[String],
    text: SignalRef | Text
  ): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  extension [Self <: Align](x: Self) {
    
    inline def setAlign(value: String | SignalRef | FieldField | Scale | Band | Range | ValueAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAnchor(value: AnchorValue): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorNull: Self = StObject.set(x, "anchor", null)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setAngle(value: NumberValue): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setBaseline(value: String | SignalRef | FieldField | Scale | Band | Range | ValueTextBaseline): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDx(value: NumberValue): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: NumberValue): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setEncode(value: TitleEncode | PartialRecordEncodeEntryN): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setFont(value: StringValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: NumberValue): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: FontStyleValue): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontWeight(value: FontWeightValue): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setFrame(value: String | SignalRef | FieldField | Scale | Band | Range | ValueString): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setLimit(value: NumberValue): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLineHeight(value: NumberValue): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOffset(value: NumberValue): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOrient(value: String | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setStyle(value: String | js.Array[String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleVarargs(value: String*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setSubtitle(value: SignalRef | Text): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleColor(value: ColorValue): Self = StObject.set(x, "subtitleColor", value.asInstanceOf[js.Any])
    
    inline def setSubtitleColorNull: Self = StObject.set(x, "subtitleColor", null)
    
    inline def setSubtitleColorUndefined: Self = StObject.set(x, "subtitleColor", js.undefined)
    
    inline def setSubtitleFont(value: StringValue): Self = StObject.set(x, "subtitleFont", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontSize(value: NumberValue): Self = StObject.set(x, "subtitleFontSize", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontSizeUndefined: Self = StObject.set(x, "subtitleFontSize", js.undefined)
    
    inline def setSubtitleFontStyle(value: FontStyleValue): Self = StObject.set(x, "subtitleFontStyle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontStyleUndefined: Self = StObject.set(x, "subtitleFontStyle", js.undefined)
    
    inline def setSubtitleFontUndefined: Self = StObject.set(x, "subtitleFont", js.undefined)
    
    inline def setSubtitleFontWeight(value: FontWeightValue): Self = StObject.set(x, "subtitleFontWeight", value.asInstanceOf[js.Any])
    
    inline def setSubtitleFontWeightUndefined: Self = StObject.set(x, "subtitleFontWeight", js.undefined)
    
    inline def setSubtitleLineHeight(value: NumberValue): Self = StObject.set(x, "subtitleLineHeight", value.asInstanceOf[js.Any])
    
    inline def setSubtitleLineHeightUndefined: Self = StObject.set(x, "subtitleLineHeight", js.undefined)
    
    inline def setSubtitlePadding(value: NumberValue): Self = StObject.set(x, "subtitlePadding", value.asInstanceOf[js.Any])
    
    inline def setSubtitlePaddingUndefined: Self = StObject.set(x, "subtitlePadding", js.undefined)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setSubtitleVarargs(value: String*): Self = StObject.set(x, "subtitle", js.Array(value*))
    
    inline def setText(value: SignalRef | Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
    
    inline def setZindex(value: Double): Self = StObject.set(x, "zindex", value.asInstanceOf[js.Any])
    
    inline def setZindexUndefined: Self = StObject.set(x, "zindex", js.undefined)
  }
}
