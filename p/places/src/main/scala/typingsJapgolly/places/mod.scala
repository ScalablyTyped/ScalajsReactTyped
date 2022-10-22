package typingsJapgolly.places

import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.Node
import org.scalajs.dom.NodeList
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.places.anon.Prefix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: PlacesOptions): EventEmitter = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[EventEmitter]
  
  @JSImport("places", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def version(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("version")().asInstanceOf[String]
  
  trait AutompleteOptions extends StObject {
    
    var autoselect: Boolean
    
    var cssClasses: Prefix
    
    var debug: Boolean
    
    var hint: Boolean
  }
  object AutompleteOptions {
    
    inline def apply(autoselect: Boolean, cssClasses: Prefix, debug: Boolean, hint: Boolean): AutompleteOptions = {
      val __obj = js.Dynamic.literal(autoselect = autoselect.asInstanceOf[js.Any], cssClasses = cssClasses.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutompleteOptions]
    }
    
    extension [Self <: AutompleteOptions](x: Self) {
      
      inline def setAutoselect(value: Boolean): Self = StObject.set(x, "autoselect", value.asInstanceOf[js.Any])
      
      inline def setCssClasses(value: Prefix): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setHint(value: Boolean): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var message: String
  }
  object Error {
    
    inline def apply(message: String): Error = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Places extends StObject {
    
    var query: Any
    
    var rawAnswer: Any
    
    var suggestion: Any
    
    var suggestionIndex: Any
  }
  object Places {
    
    inline def apply(query: Any, rawAnswer: Any, suggestion: Any, suggestionIndex: Any): Places = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], rawAnswer = rawAnswer.asInstanceOf[js.Any], suggestion = suggestion.asInstanceOf[js.Any], suggestionIndex = suggestionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Places]
    }
    
    extension [Self <: Places](x: Self) {
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setRawAnswer(value: Any): Self = StObject.set(x, "rawAnswer", value.asInstanceOf[js.Any])
      
      inline def setSuggestion(value: Any): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
      
      inline def setSuggestionIndex(value: Any): Self = StObject.set(x, "suggestionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlacesOptions extends StObject {
    
    var apiKey: String
    
    var appId: String
    
    var container: String | HTMLInputElement | NodeList[Node] | Element
  }
  object PlacesOptions {
    
    inline def apply(apiKey: String, appId: String, container: String | HTMLInputElement | NodeList[Node] | Element): PlacesOptions = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlacesOptions]
    }
    
    extension [Self <: PlacesOptions](x: Self) {
      
      inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: String | HTMLInputElement | NodeList[Node] | Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    }
  }
}
