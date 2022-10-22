package typingsJapgolly.xregexp

import typingsJapgolly.xregexp.mod.FeatureOptions
import typingsJapgolly.xregexp.mod.UnicodeCharacterRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Astral
    extends StObject
       with FeatureOptions {
    
    var astral: js.UndefOr[Boolean] = js.undefined
    
    var namespacing: js.UndefOr[Boolean] = js.undefined
  }
  object Astral {
    
    inline def apply(): Astral = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Astral]
    }
    
    extension [Self <: Astral](x: Self) {
      
      inline def setAstral(value: Boolean): Self = StObject.set(x, "astral", value.asInstanceOf[js.Any])
      
      inline def setAstralUndefined: Self = StObject.set(x, "astral", js.undefined)
      
      inline def setNamespacing(value: Boolean): Self = StObject.set(x, "namespacing", value.asInstanceOf[js.Any])
      
      inline def setNamespacingUndefined: Self = StObject.set(x, "namespacing", js.undefined)
    }
  }
  
  /* Inlined xregexp.xregexp.PickRequired<xregexp.xregexp.UnicodeCharacterRangeBase, 'astral'> */
  trait PickRequiredUnicodeCharac
    extends StObject
       with UnicodeCharacterRange {
    
    /**
      * An alternate name for the character range.
      */
    var alias: js.UndefOr[String] = js.undefined
    
    /**
      * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
      * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
      * When `bmp` is not present this `name` will error in BMP mode, but works in astral mode.
      * When this is present, it is used in combination with `bmp` in astral mode.
      * This can additionally use character classes and alternation, and should use surrogate pairs to represent astral code points.
      */
    var astral: js.UndefOr[String] & String
    
    /**
      * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
      * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
      * When `astral` is not present, this is used BMP and astral modes.
      * When this is present, it is used in BMP mode and in combination with `astral` in astral mode.
      */
    var bmp: js.UndefOr[String] = js.undefined
    
    /**
      * Can be used to avoid duplicating character data if a Unicode token is defined as the exact inverse of another token.
      */
    var inverseOf: js.UndefOr[String] = js.undefined
    
    /**
      * This is needed when a token matches orphan high surrogates *and* uses surrogate pairs to match astral code points.
      */
    var isBmpLast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the character range.
      */
    var name: String
  }
  object PickRequiredUnicodeCharac {
    
    inline def apply(astral: js.UndefOr[String] & String, name: String): PickRequiredUnicodeCharac = {
      val __obj = js.Dynamic.literal(astral = astral.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickRequiredUnicodeCharac]
    }
    
    extension [Self <: PickRequiredUnicodeCharac](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAstral(value: js.UndefOr[String] & String): Self = StObject.set(x, "astral", value.asInstanceOf[js.Any])
      
      inline def setBmp(value: String): Self = StObject.set(x, "bmp", value.asInstanceOf[js.Any])
      
      inline def setBmpUndefined: Self = StObject.set(x, "bmp", js.undefined)
      
      inline def setInverseOf(value: String): Self = StObject.set(x, "inverseOf", value.asInstanceOf[js.Any])
      
      inline def setInverseOfUndefined: Self = StObject.set(x, "inverseOf", js.undefined)
      
      inline def setIsBmpLast(value: Boolean): Self = StObject.set(x, "isBmpLast", value.asInstanceOf[js.Any])
      
      inline def setIsBmpLastUndefined: Self = StObject.set(x, "isBmpLast", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined xregexp.xregexp.PickRequired<xregexp.xregexp.UnicodeCharacterRangeBase, 'bmp'> */
  trait PickRequiredUnicodeCharacAlias
    extends StObject
       with UnicodeCharacterRange {
    
    /**
      * An alternate name for the character range.
      */
    var alias: js.UndefOr[String] = js.undefined
    
    /**
      * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
      * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
      * When `bmp` is not present this `name` will error in BMP mode, but works in astral mode.
      * When this is present, it is used in combination with `bmp` in astral mode.
      * This can additionally use character classes and alternation, and should use surrogate pairs to represent astral code points.
      */
    var astral: js.UndefOr[String] = js.undefined
    
    /**
      * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
      * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
      * When `astral` is not present, this is used BMP and astral modes.
      * When this is present, it is used in BMP mode and in combination with `astral` in astral mode.
      */
    var bmp: js.UndefOr[String] & String
    
    /**
      * Can be used to avoid duplicating character data if a Unicode token is defined as the exact inverse of another token.
      */
    var inverseOf: js.UndefOr[String] = js.undefined
    
    /**
      * This is needed when a token matches orphan high surrogates *and* uses surrogate pairs to match astral code points.
      */
    var isBmpLast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the character range.
      */
    var name: String
  }
  object PickRequiredUnicodeCharacAlias {
    
    inline def apply(bmp: js.UndefOr[String] & String, name: String): PickRequiredUnicodeCharacAlias = {
      val __obj = js.Dynamic.literal(bmp = bmp.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickRequiredUnicodeCharacAlias]
    }
    
    extension [Self <: PickRequiredUnicodeCharacAlias](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAstral(value: String): Self = StObject.set(x, "astral", value.asInstanceOf[js.Any])
      
      inline def setAstralUndefined: Self = StObject.set(x, "astral", js.undefined)
      
      inline def setBmp(value: js.UndefOr[String] & String): Self = StObject.set(x, "bmp", value.asInstanceOf[js.Any])
      
      inline def setInverseOf(value: String): Self = StObject.set(x, "inverseOf", value.asInstanceOf[js.Any])
      
      inline def setInverseOfUndefined: Self = StObject.set(x, "inverseOf", js.undefined)
      
      inline def setIsBmpLast(value: Boolean): Self = StObject.set(x, "isBmpLast", value.asInstanceOf[js.Any])
      
      inline def setIsBmpLastUndefined: Self = StObject.set(x, "isBmpLast", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined xregexp.xregexp.PickRequired<xregexp.xregexp.UnicodeCharacterRangeBase, 'inverseOf'> */
  trait PickRequiredUnicodeCharacAstral
    extends StObject
       with UnicodeCharacterRange {
    
    /**
      * An alternate name for the character range.
      */
    var alias: js.UndefOr[String] = js.undefined
    
    /**
      * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
      * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
      * When `bmp` is not present this `name` will error in BMP mode, but works in astral mode.
      * When this is present, it is used in combination with `bmp` in astral mode.
      * This can additionally use character classes and alternation, and should use surrogate pairs to represent astral code points.
      */
    var astral: js.UndefOr[String] = js.undefined
    
    /**
      * A combination of literal characters and `\xHH` or `\\uHHHH` escape sequences, with hyphens to create ranges.
      * Any regex metacharacters in the data should be escaped, apart from range-creating hyphens.
      * When `astral` is not present, this is used BMP and astral modes.
      * When this is present, it is used in BMP mode and in combination with `astral` in astral mode.
      */
    var bmp: js.UndefOr[String] = js.undefined
    
    /**
      * Can be used to avoid duplicating character data if a Unicode token is defined as the exact inverse of another token.
      */
    var inverseOf: js.UndefOr[String] & String
    
    /**
      * This is needed when a token matches orphan high surrogates *and* uses surrogate pairs to match astral code points.
      */
    var isBmpLast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the character range.
      */
    var name: String
  }
  object PickRequiredUnicodeCharacAstral {
    
    inline def apply(inverseOf: js.UndefOr[String] & String, name: String): PickRequiredUnicodeCharacAstral = {
      val __obj = js.Dynamic.literal(inverseOf = inverseOf.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickRequiredUnicodeCharacAstral]
    }
    
    extension [Self <: PickRequiredUnicodeCharacAstral](x: Self) {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setAstral(value: String): Self = StObject.set(x, "astral", value.asInstanceOf[js.Any])
      
      inline def setAstralUndefined: Self = StObject.set(x, "astral", js.undefined)
      
      inline def setBmp(value: String): Self = StObject.set(x, "bmp", value.asInstanceOf[js.Any])
      
      inline def setBmpUndefined: Self = StObject.set(x, "bmp", js.undefined)
      
      inline def setInverseOf(value: js.UndefOr[String] & String): Self = StObject.set(x, "inverseOf", value.asInstanceOf[js.Any])
      
      inline def setIsBmpLast(value: Boolean): Self = StObject.set(x, "isBmpLast", value.asInstanceOf[js.Any])
      
      inline def setIsBmpLastUndefined: Self = StObject.set(x, "isBmpLast", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
