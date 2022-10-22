package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsTipMod.TipProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendType
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendValue
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.`3xl`
import typingsJapgolly.grommet.grommetStrings.`4xl`
import typingsJapgolly.grommet.grommetStrings.`5xl`
import typingsJapgolly.grommet.grommetStrings.`6xl`
import typingsJapgolly.grommet.grommetStrings.`break-all`
import typingsJapgolly.grommet.grommetStrings.`break-word`
import typingsJapgolly.grommet.grommetStrings.`keep-all`
import typingsJapgolly.grommet.grommetStrings.bold
import typingsJapgolly.grommet.grommetStrings.bolder
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.lighter
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.normal
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.tip
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxlarge
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined grommet.grommet/es6/components/Text.TextProps & {  extend :grommet.grommet/es6/themes/base.ExtendType<std.Record<string, any>> | undefined} */
trait TextPropsextendExtendType extends StObject {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
  
  var as: js.UndefOr[PolymorphicType] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var gridArea: js.UndefOr[GridAreaType] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var size: js.UndefOr[
    xsmall | small | medium | large | xlarge | xxlarge | typingsJapgolly.grommet.grommetStrings.`2xl` | `3xl` | `4xl` | `5xl` | `6xl` | String
  ] = js.undefined
  
  var tag: js.UndefOr[PolymorphicType] = js.undefined
  
  var textAlign: js.UndefOr[TextAlignType] = js.undefined
  
  var tip: js.UndefOr[TipProps | String] = js.undefined
  
  var truncate: js.UndefOr[Boolean | tip] = js.undefined
  
  var weight: js.UndefOr[normal | bold | bolder | lighter | Double] = js.undefined
  
  var wordBreak: js.UndefOr[normal | `break-all` | `keep-all` | `break-word`] = js.undefined
}
object TextPropsextendExtendType {
  
  inline def apply(): TextPropsextendExtendType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPropsextendExtendType]
  }
  
  extension [Self <: TextPropsextendExtendType](x: Self) {
    
    inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
    
    inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
    
    inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
    
    inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
    
    inline def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
    
    inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setSize(
      value: xsmall | small | medium | large | xlarge | xxlarge | typingsJapgolly.grommet.grommetStrings.`2xl` | `3xl` | `4xl` | `5xl` | `6xl` | String
    ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTag(value: PolymorphicType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTip(value: TipProps | String): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
    
    inline def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
    
    inline def setTruncate(value: Boolean | tip): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
    
    inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    
    inline def setWeight(value: normal | bold | bolder | lighter | Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    inline def setWordBreak(value: normal | `break-all` | `keep-all` | `break-word`): Self = StObject.set(x, "wordBreak", value.asInstanceOf[js.Any])
    
    inline def setWordBreakUndefined: Self = StObject.set(x, "wordBreak", js.undefined)
  }
}
