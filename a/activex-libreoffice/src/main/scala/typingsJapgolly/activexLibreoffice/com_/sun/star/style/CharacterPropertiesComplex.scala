package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.FontSlant
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is a set of properties to describe the style of characters in complex texts. */
trait CharacterPropertiesComplex extends StObject {
  
  /** This property contains the text encoding of the font as specified in {@link com.sun.star.awt.CharSet} . */
  var CharFontCharSetComplex: Double
  
  /** This property contains font family as specified in {@link com.sun.star.awt.FontFamily} . */
  var CharFontFamilyComplex: Double
  
  /**
    * This property specifies the name of the font style.
    *
    * It may contain more than one name separated by comma.
    */
  var CharFontNameComplex: String
  
  /** This property contains the font pitch as specified in {@link com.sun.star.awt.FontPitch} . */
  var CharFontPitchComplex: Double
  
  /**
    * This property contains the name of the font style.
    *
    * This property may be empty.
    */
  var CharFontStyleNameComplex: String
  
  /** This value contains the height of the characters in point. */
  var CharHeightComplex: Double
  
  /** contains the value of the locale. */
  var CharLocaleComplex: Locale
  
  /**
    * This property contains the value of the posture of the document.
    * @see com.sun.star.awt.FontSlant
    */
  var CharPostureComplex: FontSlant
  
  /**
    * This property contains the value of the font weight.
    * @see com.sun.star.awt.FontWeight
    */
  var CharWeightComplex: Double
}
object CharacterPropertiesComplex {
  
  inline def apply(
    CharFontCharSetComplex: Double,
    CharFontFamilyComplex: Double,
    CharFontNameComplex: String,
    CharFontPitchComplex: Double,
    CharFontStyleNameComplex: String,
    CharHeightComplex: Double,
    CharLocaleComplex: Locale,
    CharPostureComplex: FontSlant,
    CharWeightComplex: Double
  ): CharacterPropertiesComplex = {
    val __obj = js.Dynamic.literal(CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterPropertiesComplex]
  }
  
  extension [Self <: CharacterPropertiesComplex](x: Self) {
    
    inline def setCharFontCharSetComplex(value: Double): Self = StObject.set(x, "CharFontCharSetComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontFamilyComplex(value: Double): Self = StObject.set(x, "CharFontFamilyComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontNameComplex(value: String): Self = StObject.set(x, "CharFontNameComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontPitchComplex(value: Double): Self = StObject.set(x, "CharFontPitchComplex", value.asInstanceOf[js.Any])
    
    inline def setCharFontStyleNameComplex(value: String): Self = StObject.set(x, "CharFontStyleNameComplex", value.asInstanceOf[js.Any])
    
    inline def setCharHeightComplex(value: Double): Self = StObject.set(x, "CharHeightComplex", value.asInstanceOf[js.Any])
    
    inline def setCharLocaleComplex(value: Locale): Self = StObject.set(x, "CharLocaleComplex", value.asInstanceOf[js.Any])
    
    inline def setCharPostureComplex(value: FontSlant): Self = StObject.set(x, "CharPostureComplex", value.asInstanceOf[js.Any])
    
    inline def setCharWeightComplex(value: Double): Self = StObject.set(x, "CharWeightComplex", value.asInstanceOf[js.Any])
  }
}
