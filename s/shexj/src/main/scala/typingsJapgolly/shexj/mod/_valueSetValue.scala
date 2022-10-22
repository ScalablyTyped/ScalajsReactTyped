package typingsJapgolly.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _valueSetValue extends StObject
object _valueSetValue {
  
  inline def IriStem(stem: IRIREF): typingsJapgolly.shexj.mod.IriStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IriStem")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.IriStem]
  }
  
  inline def IriStemRange(exclusions: js.Array[IRIREF | IriStem], stem: IRIREF | Wildcard): typingsJapgolly.shexj.mod.IriStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("IriStemRange")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.IriStemRange]
  }
  
  inline def Language(languageTag: LANGTAG): typingsJapgolly.shexj.mod.Language = {
    val __obj = js.Dynamic.literal(languageTag = languageTag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Language")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.Language]
  }
  
  inline def LanguageStem(stem: LANGTAG): typingsJapgolly.shexj.mod.LanguageStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LanguageStem")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.LanguageStem]
  }
  
  inline def LanguageStemRange(exclusions: js.Array[LANGTAG | LanguageStem], stem: LANGTAG | Wildcard): typingsJapgolly.shexj.mod.LanguageStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LanguageStemRange")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.LanguageStemRange]
  }
  
  inline def LiteralStem(stem: STRING): typingsJapgolly.shexj.mod.LiteralStem = {
    val __obj = js.Dynamic.literal(stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LiteralStem")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.LiteralStem]
  }
  
  inline def LiteralStemRange(exclusions: js.Array[STRING | LiteralStem], stem: STRING | Wildcard): typingsJapgolly.shexj.mod.LiteralStemRange = {
    val __obj = js.Dynamic.literal(exclusions = exclusions.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LiteralStemRange")
    __obj.asInstanceOf[typingsJapgolly.shexj.mod.LiteralStemRange]
  }
}
