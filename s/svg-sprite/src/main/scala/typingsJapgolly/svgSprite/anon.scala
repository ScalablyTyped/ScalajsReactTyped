package typingsJapgolly.svgSprite

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    /**
      * Width and height attributes on embedded shapes
      */
    var attributes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Max. shape height
      */
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Max. shape width
      */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Floating point precision
      */
    var precision: js.UndefOr[Double] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: Boolean): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    }
  }
  
  trait Box extends StObject {
    
    /**
      * Padding strategy (similar to CSS `box-sizing`)
      */
    var box: js.UndefOr[String] = js.undefined
    
    /**
      * Padding around all shapes
      */
    var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object Box {
    
    inline def apply(): Box = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Box]
    }
    
    extension [Self <: Box](x: Self) {
      
      inline def setBox(value: String): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    }
  }
  
  trait Generator extends StObject {
    
    /**
      * SVG shape ID generator callback
      */
    var generator: js.UndefOr[String | (js.Function1[/* svg */ String, String])] = js.undefined
    
    /**
      * File name separator for shape states (e.g. ':hover')
      */
    var pseudo: js.UndefOr[String] = js.undefined
    
    /**
      * Separator for directory name traversal
      */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Whitespace replacement for shape IDs
      */
    var whitespace: js.UndefOr[String] = js.undefined
  }
  object Generator {
    
    inline def apply(): Generator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Generator]
    }
    
    extension [Self <: Generator](x: Self) {
      
      inline def setGenerator(value: String | (js.Function1[/* svg */ String, String])): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      inline def setGeneratorFunction1(value: /* svg */ String => String): Self = StObject.set(x, "generator", js.Any.fromFunction1(value))
      
      inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
      
      inline def setPseudo(value: String): Self = StObject.set(x, "pseudo", value.asInstanceOf[js.Any])
      
      inline def setPseudoUndefined: Self = StObject.set(x, "pseudo", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setWhitespace(value: String): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
      
      inline def setWhitespaceUndefined: Self = StObject.set(x, "whitespace", js.undefined)
    }
  }
  
  trait Plugins extends StObject {
    
    var plugins: js.UndefOr[js.Array[StringDictionary[Boolean]]] = js.undefined
  }
  object Plugins {
    
    inline def apply(): Plugins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins]
    }
    
    extension [Self <: Plugins](x: Self) {
      
      inline def setPlugins(value: js.Array[StringDictionary[Boolean]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: StringDictionary[Boolean]*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
