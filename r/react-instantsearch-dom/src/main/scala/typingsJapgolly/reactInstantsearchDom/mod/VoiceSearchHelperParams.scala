package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceSearchHelperParams extends StObject {
  
  var language: js.UndefOr[String] = js.undefined
  
  def onQueryChange(query: String): Unit
  
  def onStateChange(): Unit
  
  var searchAsYouSpeak: Boolean
}
object VoiceSearchHelperParams {
  
  inline def apply(onQueryChange: String => Callback, onStateChange: Callback, searchAsYouSpeak: Boolean): VoiceSearchHelperParams = {
    val __obj = js.Dynamic.literal(onQueryChange = js.Any.fromFunction1((t0: String) => onQueryChange(t0).runNow()), onStateChange = onStateChange.toJsFn, searchAsYouSpeak = searchAsYouSpeak.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSearchHelperParams]
  }
  
  extension [Self <: VoiceSearchHelperParams](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setOnQueryChange(value: String => Callback): Self = StObject.set(x, "onQueryChange", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setOnStateChange(value: Callback): Self = StObject.set(x, "onStateChange", value.toJsFn)
    
    inline def setSearchAsYouSpeak(value: Boolean): Self = StObject.set(x, "searchAsYouSpeak", value.asInstanceOf[js.Any])
  }
}
