package typingsJapgolly.geopattern

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geopattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[Pattern]
  inline def generate(string: String): Pattern = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any]).asInstanceOf[Pattern]
  inline def generate(string: String, options: PatternOptions): Pattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Pattern]
  inline def generate(string: Unit, options: PatternOptions): Pattern = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Pattern]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.geopattern.geopatternStrings.chevrons
    - typingsJapgolly.geopattern.geopatternStrings.octogons
    - typingsJapgolly.geopattern.geopatternStrings.overlappingCircles
    - typingsJapgolly.geopattern.geopatternStrings.plusSigns
    - typingsJapgolly.geopattern.geopatternStrings.xes
    - typingsJapgolly.geopattern.geopatternStrings.sineWaves
    - typingsJapgolly.geopattern.geopatternStrings.hexagons
    - typingsJapgolly.geopattern.geopatternStrings.overlappingRings
    - typingsJapgolly.geopattern.geopatternStrings.plaid
    - typingsJapgolly.geopattern.geopatternStrings.triangles
    - typingsJapgolly.geopattern.geopatternStrings.squares
    - typingsJapgolly.geopattern.geopatternStrings.nestedSquares
    - typingsJapgolly.geopattern.geopatternStrings.mosaicSquares
    - typingsJapgolly.geopattern.geopatternStrings.concentricCircles
    - typingsJapgolly.geopattern.geopatternStrings.diamonds
    - typingsJapgolly.geopattern.geopatternStrings.tessellation
  */
  trait GeneratorType extends StObject
  object GeneratorType {
    
    inline def chevrons: typingsJapgolly.geopattern.geopatternStrings.chevrons = "chevrons".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.chevrons]
    
    inline def concentricCircles: typingsJapgolly.geopattern.geopatternStrings.concentricCircles = "concentricCircles".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.concentricCircles]
    
    inline def diamonds: typingsJapgolly.geopattern.geopatternStrings.diamonds = "diamonds".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.diamonds]
    
    inline def hexagons: typingsJapgolly.geopattern.geopatternStrings.hexagons = "hexagons".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.hexagons]
    
    inline def mosaicSquares: typingsJapgolly.geopattern.geopatternStrings.mosaicSquares = "mosaicSquares".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.mosaicSquares]
    
    inline def nestedSquares: typingsJapgolly.geopattern.geopatternStrings.nestedSquares = "nestedSquares".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.nestedSquares]
    
    inline def octogons: typingsJapgolly.geopattern.geopatternStrings.octogons = "octogons".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.octogons]
    
    inline def overlappingCircles: typingsJapgolly.geopattern.geopatternStrings.overlappingCircles = "overlappingCircles".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.overlappingCircles]
    
    inline def overlappingRings: typingsJapgolly.geopattern.geopatternStrings.overlappingRings = "overlappingRings".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.overlappingRings]
    
    inline def plaid: typingsJapgolly.geopattern.geopatternStrings.plaid = "plaid".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.plaid]
    
    inline def plusSigns: typingsJapgolly.geopattern.geopatternStrings.plusSigns = "plusSigns".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.plusSigns]
    
    inline def sineWaves: typingsJapgolly.geopattern.geopatternStrings.sineWaves = "sineWaves".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.sineWaves]
    
    inline def squares: typingsJapgolly.geopattern.geopatternStrings.squares = "squares".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.squares]
    
    inline def tessellation: typingsJapgolly.geopattern.geopatternStrings.tessellation = "tessellation".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.tessellation]
    
    inline def triangles: typingsJapgolly.geopattern.geopatternStrings.triangles = "triangles".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.triangles]
    
    inline def xes: typingsJapgolly.geopattern.geopatternStrings.xes = "xes".asInstanceOf[typingsJapgolly.geopattern.geopatternStrings.xes]
  }
  
  trait Pattern extends StObject {
    
    /** Gets the pattern's background color as a hexadecimal string. */
    var color: String
    
    /** Gets the SVG as a Base64-encoded string. */
    def toBase64(): String
    
    /**
      * Gets the pattern as a data URI,
      * i.e. data:image/svg+xml;base64,PHN2ZyB...
      */
    def toDataUri(): String
    
    /**
      * Gets the pattern as a data URL suitable for use as a CSS
      * background-image, i.e. url("data:image/svg+xml;base64,PHN2ZyB...").
      */
    def toDataUrl(): String
    
    /** Gets the SVG string representing the pattern. */
    def toSvg(): String
  }
  object Pattern {
    
    inline def apply(
      color: String,
      toBase64: CallbackTo[String],
      toDataUri: CallbackTo[String],
      toDataUrl: CallbackTo[String],
      toSvg: CallbackTo[String]
    ): Pattern = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], toBase64 = toBase64.toJsFn, toDataUri = toDataUri.toJsFn, toDataUrl = toDataUrl.toJsFn, toSvg = toSvg.toJsFn)
      __obj.asInstanceOf[Pattern]
    }
    
    extension [Self <: Pattern](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setToBase64(value: CallbackTo[String]): Self = StObject.set(x, "toBase64", value.toJsFn)
      
      inline def setToDataUri(value: CallbackTo[String]): Self = StObject.set(x, "toDataUri", value.toJsFn)
      
      inline def setToDataUrl(value: CallbackTo[String]): Self = StObject.set(x, "toDataUrl", value.toJsFn)
      
      inline def setToSvg(value: CallbackTo[String]): Self = StObject.set(x, "toSvg", value.toJsFn)
    }
  }
  
  trait PatternOptions extends StObject {
    
    /**
      * Controls the relative background color of the generated image. The color
      * is not identical to that used in the pattern because the hue is rotated
      * by the generator. This is a CSS hexadecimal color value, which defaults
      * to #933c3c.
      */
    var baseColor: js.UndefOr[String] = js.undefined
    
    /**
      * Specify an exact background color. This is a CSS hexadecimal color
      * value.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /**
      * Determines the pattern. All of the original patterns from the Ruby
      * version at jasonlong/geo_pattern are available in this port, and their
      * names are camelCased.
      */
    var generator: js.UndefOr[GeneratorType] = js.undefined
  }
  object PatternOptions {
    
    inline def apply(): PatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternOptions]
    }
    
    extension [Self <: PatternOptions](x: Self) {
      
      inline def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      inline def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGenerator(value: GeneratorType): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def geopattern(string: String): JQuery = js.native
      def geopattern(string: String, options: PatternOptions): JQuery = js.native
    }
  }
}
