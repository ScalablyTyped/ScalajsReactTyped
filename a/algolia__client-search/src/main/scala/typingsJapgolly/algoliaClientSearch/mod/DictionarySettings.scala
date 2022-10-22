package typingsJapgolly.algoliaClientSearch.mod

import typingsJapgolly.algoliaClientSearch.anon.RecordDictionaryNameRecor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictionarySettings extends StObject {
  
  /**
    * Disable the builtin Algolia entries for a type of dictionary per language.
    */
  val disableStandardEntries: RequireAtLeastOne[RecordDictionaryNameRecor]
}
object DictionarySettings {
  
  inline def apply(disableStandardEntries: RequireAtLeastOne[RecordDictionaryNameRecor]): DictionarySettings = {
    val __obj = js.Dynamic.literal(disableStandardEntries = disableStandardEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictionarySettings]
  }
  
  extension [Self <: DictionarySettings](x: Self) {
    
    inline def setDisableStandardEntries(value: RequireAtLeastOne[RecordDictionaryNameRecor]): Self = StObject.set(x, "disableStandardEntries", value.asInstanceOf[js.Any])
  }
}
