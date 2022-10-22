package typingsJapgolly.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.distTypesMod.CodeKeywordDefinition
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsTransformMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/definitions/transform", JSImport.Default)
  @js.native
  val default: js.Function0[CodeKeywordDefinition] & typingsJapgolly.ajvKeywords.anon.Transform = js.native
  
  type Transform = js.Function2[/* s */ String, /* cfg */ js.UndefOr[TransformConfig], String]
  
  trait TransformConfig extends StObject {
    
    var hash: Record[String, js.UndefOr[String]]
  }
  object TransformConfig {
    
    inline def apply(hash: Record[String, js.UndefOr[String]]): TransformConfig = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformConfig]
    }
    
    extension [Self <: TransformConfig](x: Self) {
      
      inline def setHash(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimStart
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimEnd
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimLeft
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimRight
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trim
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toLowerCase
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toUpperCase
    - typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toEnumCase
  */
  trait TransformName extends StObject
  object TransformName {
    
    inline def toEnumCase: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toEnumCase = "toEnumCase".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toEnumCase]
    
    inline def toLowerCase: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toLowerCase = "toLowerCase".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toLowerCase]
    
    inline def toUpperCase: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toUpperCase = "toUpperCase".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.toUpperCase]
    
    inline def trim: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trim = "trim".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trim]
    
    inline def trimEnd: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimEnd = "trimEnd".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimEnd]
    
    inline def trimLeft: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimLeft = "trimLeft".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimLeft]
    
    inline def trimRight: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimRight = "trimRight".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimRight]
    
    inline def trimStart: typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimStart = "trimStart".asInstanceOf[typingsJapgolly.ajvKeywords.ajvKeywordsStrings.trimStart]
  }
  
  type _To = js.Function0[CodeKeywordDefinition] & typingsJapgolly.ajvKeywords.anon.Transform
  
  /* This means you don't have to write `default`, but can instead just say `distDefinitionsTransformMod.foo` */
  override def _to: js.Function0[CodeKeywordDefinition] & typingsJapgolly.ajvKeywords.anon.Transform = default
}
