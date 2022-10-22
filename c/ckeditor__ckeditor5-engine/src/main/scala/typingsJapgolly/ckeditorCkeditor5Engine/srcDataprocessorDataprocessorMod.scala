package typingsJapgolly.ckeditorCkeditor5Engine

import japgolly.scalajs.react.Callback
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.marked
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewMatcherMod.MatcherPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDataprocessorDataprocessorMod {
  
  trait DataProcessor extends StObject {
    
    def registerRawContentMatcher(pattern: MatcherPattern): Unit
    
    def toData(fragment: default): String
    
    def toView(data: String): default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null
    
    def useFillerType(`type`: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked): Unit
  }
  object DataProcessor {
    
    inline def apply(
      registerRawContentMatcher: MatcherPattern => Callback,
      toData: default => String,
      toView: String => default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null,
      useFillerType: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked => Callback
    ): DataProcessor = {
      val __obj = js.Dynamic.literal(registerRawContentMatcher = js.Any.fromFunction1((t0: MatcherPattern) => registerRawContentMatcher(t0).runNow()), toData = js.Any.fromFunction1(toData), toView = js.Any.fromFunction1(toView), useFillerType = js.Any.fromFunction1((t0: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked) => useFillerType(t0).runNow()))
      __obj.asInstanceOf[DataProcessor]
    }
    
    extension [Self <: DataProcessor](x: Self) {
      
      inline def setRegisterRawContentMatcher(value: MatcherPattern => Callback): Self = StObject.set(x, "registerRawContentMatcher", js.Any.fromFunction1((t0: MatcherPattern) => value(t0).runNow()))
      
      inline def setToData(value: default => String): Self = StObject.set(x, "toData", js.Any.fromFunction1(value))
      
      inline def setToView(value: String => default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default | Null): Self = StObject.set(x, "toView", js.Any.fromFunction1(value))
      
      inline def setUseFillerType(
        value: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked => Callback
      ): Self = StObject.set(x, "useFillerType", js.Any.fromFunction1((t0: typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.default | marked) => value(t0).runNow()))
    }
  }
}
