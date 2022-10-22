package typingsJapgolly.autolinker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait OnCloseTag extends StObject {
    
    def onCloseTag(tagName: String, offset: Double): Unit
    
    def onComment(offset: Double): Unit
    
    def onDoctype(offset: Double): Unit
    
    def onOpenTag(tagName: String, offset: Double): Unit
    
    def onText(text: String, offset: Double): Unit
  }
  object OnCloseTag {
    
    inline def apply(
      onCloseTag: (String, Double) => Callback,
      onComment: Double => Callback,
      onDoctype: Double => Callback,
      onOpenTag: (String, Double) => Callback,
      onText: (String, Double) => Callback
    ): OnCloseTag = {
      val __obj = js.Dynamic.literal(onCloseTag = js.Any.fromFunction2((t0: String, t1: Double) => (onCloseTag(t0, t1)).runNow()), onComment = js.Any.fromFunction1((t0: Double) => onComment(t0).runNow()), onDoctype = js.Any.fromFunction1((t0: Double) => onDoctype(t0).runNow()), onOpenTag = js.Any.fromFunction2((t0: String, t1: Double) => (onOpenTag(t0, t1)).runNow()), onText = js.Any.fromFunction2((t0: String, t1: Double) => (onText(t0, t1)).runNow()))
      __obj.asInstanceOf[OnCloseTag]
    }
    
    extension [Self <: OnCloseTag](x: Self) {
      
      inline def setOnCloseTag(value: (String, Double) => Callback): Self = StObject.set(x, "onCloseTag", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOnComment(value: Double => Callback): Self = StObject.set(x, "onComment", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnDoctype(value: Double => Callback): Self = StObject.set(x, "onDoctype", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setOnOpenTag(value: (String, Double) => Callback): Self = StObject.set(x, "onOpenTag", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setOnText(value: (String, Double) => Callback): Self = StObject.set(x, "onText", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Inlined std.Required<autolinker.autolinker/dist/commonjs/autolinker.StripPrefixConfigObj> */
  trait RequiredStripPrefixConfig extends StObject {
    
    var scheme: Boolean
    
    var www: Boolean
  }
  object RequiredStripPrefixConfig {
    
    inline def apply(scheme: Boolean, www: Boolean): RequiredStripPrefixConfig = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any], www = www.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredStripPrefixConfig]
    }
    
    extension [Self <: RequiredStripPrefixConfig](x: Self) {
      
      inline def setScheme(value: Boolean): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setWww(value: Boolean): Self = StObject.set(x, "www", value.asInstanceOf[js.Any])
    }
  }
}
