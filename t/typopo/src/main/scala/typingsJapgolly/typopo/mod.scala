package typingsJapgolly.typopo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typopo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fixTypos(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fixTypos(string: String, locale: Unit, configuration: Configuration): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fixTypos(string: String, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def fixTypos(string: String, locale: Locale, configuration: Configuration): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fixTypos")(string.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], configuration.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Configuration extends StObject {
    
    /**
      * keep Markdown code blocks in your Markdown files
      */
    var keepMarkdownCodeBlocks: js.UndefOr[Boolean] = js.undefined
    
    var removeLines: js.UndefOr[Boolean] = js.undefined
    
    var removeWhitespacesBeforeMarkdownList: js.UndefOr[Boolean] = js.undefined
  }
  object Configuration {
    
    inline def apply(): Configuration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setKeepMarkdownCodeBlocks(value: Boolean): Self = StObject.set(x, "keepMarkdownCodeBlocks", value.asInstanceOf[js.Any])
      
      inline def setKeepMarkdownCodeBlocksUndefined: Self = StObject.set(x, "keepMarkdownCodeBlocks", js.undefined)
      
      inline def setRemoveLines(value: Boolean): Self = StObject.set(x, "removeLines", value.asInstanceOf[js.Any])
      
      inline def setRemoveLinesUndefined: Self = StObject.set(x, "removeLines", js.undefined)
      
      inline def setRemoveWhitespacesBeforeMarkdownList(value: Boolean): Self = StObject.set(x, "removeWhitespacesBeforeMarkdownList", value.asInstanceOf[js.Any])
      
      inline def setRemoveWhitespacesBeforeMarkdownListUndefined: Self = StObject.set(x, "removeWhitespacesBeforeMarkdownList", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typopo.typopoStrings.`en-us`
    - typingsJapgolly.typopo.typopoStrings.`de-de`
    - typingsJapgolly.typopo.typopoStrings.cs
    - typingsJapgolly.typopo.typopoStrings.rue
    - typingsJapgolly.typopo.typopoStrings.sk
  */
  trait Locale extends StObject
  object Locale {
    
    inline def cs: typingsJapgolly.typopo.typopoStrings.cs = "cs".asInstanceOf[typingsJapgolly.typopo.typopoStrings.cs]
    
    inline def `de-de`: typingsJapgolly.typopo.typopoStrings.`de-de` = "de-de".asInstanceOf[typingsJapgolly.typopo.typopoStrings.`de-de`]
    
    inline def `en-us`: typingsJapgolly.typopo.typopoStrings.`en-us` = "en-us".asInstanceOf[typingsJapgolly.typopo.typopoStrings.`en-us`]
    
    inline def rue: typingsJapgolly.typopo.typopoStrings.rue = "rue".asInstanceOf[typingsJapgolly.typopo.typopoStrings.rue]
    
    inline def sk: typingsJapgolly.typopo.typopoStrings.sk = "sk".asInstanceOf[typingsJapgolly.typopo.typopoStrings.sk]
  }
}
