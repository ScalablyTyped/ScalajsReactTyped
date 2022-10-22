package typingsJapgolly.reactNativeWindows.rntypesMod

import typingsJapgolly.reactNativeWindows.anon.Width
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`100`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`200`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`300`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`400`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`500`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`600`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`700`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`800`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`900`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`line-through`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.`underline line-through`
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.auto
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.bold
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.bottom
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.capitalize
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.center
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.italic
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.justify
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.left
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.lowercase
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.none
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.normal_
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.right
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.top
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.underline
import typingsJapgolly.reactNativeWindows.reactNativeWindowsStrings.uppercase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.reactNativeWindows.rntypesMod.TransformsStyle because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.ShadowStyleIOS because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.FlexStyle because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.ViewStyle because Already inherited
- typingsJapgolly.reactNativeWindows.rntypesMod.TextStyleAndroid because var conflicts: alignContent, alignItems, alignSelf, aspectRatio, backfaceVisibility, backgroundColor, borderBottomColor, borderBottomEndRadius, borderBottomLeftRadius, borderBottomRightRadius, borderBottomStartRadius, borderBottomWidth, borderColor, borderEndColor, borderEndWidth, borderLeftColor, borderLeftWidth, borderRadius, borderRightColor, borderRightWidth, borderStartColor, borderStartWidth, borderStyle, borderTopColor, borderTopEndRadius, borderTopLeftRadius, borderTopRightRadius, borderTopStartRadius, borderTopWidth, borderWidth, bottom, direction, display, elevation, end, flex, flexBasis, flexDirection, flexGrow, flexShrink, flexWrap, height, justifyContent, left, margin, marginBottom, marginEnd, marginHorizontal, marginLeft, marginRight, marginStart, marginTop, marginVertical, maxHeight, maxWidth, minHeight, minWidth, opacity, overflow, padding, paddingBottom, paddingEnd, paddingHorizontal, paddingLeft, paddingRight, paddingStart, paddingTop, paddingVertical, position, right, rotation, scaleX, scaleY, shadowColor, shadowOffset, shadowOpacity, shadowRadius, start, testID, top, transform, transformMatrix, translateX, translateY, width, zIndex. Inlined textAlignVertical, includeFontPadding */ trait TextStyle
  extends StObject
     with TextStyleIOS {
  
  var color: js.UndefOr[ColorValue] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[normal_ | italic] = js.undefined
  
  /**
    * Specifies font weight. The values 'normal' and 'bold' are supported
    * for most fonts. Not all fonts have a variant for each of the numeric
    * values, in that case the closest one is chosen.
    */
  var fontWeight: js.UndefOr[
    normal_ | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`
  ] = js.undefined
  
  var includeFontPadding: js.UndefOr[Boolean] = js.undefined
  
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.undefined
  
  var textAlignVertical: js.UndefOr[auto | top | bottom | center] = js.undefined
  
  var textDecorationLine: js.UndefOr[none | underline | `line-through` | (`underline line-through`)] = js.undefined
  
  var textShadowColor: js.UndefOr[ColorValue] = js.undefined
  
  var textShadowOffset: js.UndefOr[Width] = js.undefined
  
  var textShadowRadius: js.UndefOr[Double] = js.undefined
  
  var textTransform: js.UndefOr[none | capitalize | uppercase | lowercase] = js.undefined
}
object TextStyle {
  
  inline def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setColor(value: ColorValue): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: normal_ | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: normal_ | bold | `100` | `200` | `300` | `400` | `500` | `600` | `700` | `800` | `900`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setIncludeFontPadding(value: Boolean): Self = StObject.set(x, "includeFontPadding", value.asInstanceOf[js.Any])
    
    inline def setIncludeFontPaddingUndefined: Self = StObject.set(x, "includeFontPadding", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setTextAlign(value: auto | left | right | center | justify): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextAlignVertical(value: auto | top | bottom | center): Self = StObject.set(x, "textAlignVertical", value.asInstanceOf[js.Any])
    
    inline def setTextAlignVerticalUndefined: Self = StObject.set(x, "textAlignVertical", js.undefined)
    
    inline def setTextDecorationLine(value: none | underline | `line-through` | (`underline line-through`)): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
    
    inline def setTextShadowColor(value: ColorValue): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
    
    inline def setTextShadowColorUndefined: Self = StObject.set(x, "textShadowColor", js.undefined)
    
    inline def setTextShadowOffset(value: Width): Self = StObject.set(x, "textShadowOffset", value.asInstanceOf[js.Any])
    
    inline def setTextShadowOffsetUndefined: Self = StObject.set(x, "textShadowOffset", js.undefined)
    
    inline def setTextShadowRadius(value: Double): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
    
    inline def setTextShadowRadiusUndefined: Self = StObject.set(x, "textShadowRadius", js.undefined)
    
    inline def setTextTransform(value: none | capitalize | uppercase | lowercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
  }
}
