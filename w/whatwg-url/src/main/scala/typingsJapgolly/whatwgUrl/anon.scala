package typingsJapgolly.whatwgUrl

import typingsJapgolly.whatwgUrl.mod.StateOverride
import typingsJapgolly.whatwgUrl.mod.URLRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    val baseURL: js.UndefOr[String] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    var doNotStripQMark: js.UndefOr[Boolean] = js.undefined
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setDoNotStripQMark(value: Boolean): Self = StObject.set(x, "doNotStripQMark", value.asInstanceOf[js.Any])
      
      inline def setDoNotStripQMarkUndefined: Self = StObject.set(x, "doNotStripQMark", js.undefined)
    }
  }
  
  trait BaseURL extends StObject {
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var stateOverride: js.UndefOr[StateOverride] = js.undefined
    
    var url: js.UndefOr[URLRecord] = js.undefined
  }
  object BaseURL {
    
    inline def apply(): BaseURL = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseURL]
    }
    
    extension [Self <: BaseURL](x: Self) {
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      inline def setStateOverride(value: StateOverride): Self = StObject.set(x, "stateOverride", value.asInstanceOf[js.Any])
      
      inline def setStateOverrideUndefined: Self = StObject.set(x, "stateOverride", js.undefined)
      
      inline def setUrl(value: URLRecord): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var context: String
  }
  object Context {
    
    inline def apply(context: String): Context = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait DoNotStripQMark extends StObject {
    
    val doNotStripQMark: js.UndefOr[Boolean] = js.undefined
  }
  object DoNotStripQMark {
    
    inline def apply(): DoNotStripQMark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoNotStripQMark]
    }
    
    extension [Self <: DoNotStripQMark](x: Self) {
      
      inline def setDoNotStripQMark(value: Boolean): Self = StObject.set(x, "doNotStripQMark", value.asInstanceOf[js.Any])
      
      inline def setDoNotStripQMarkUndefined: Self = StObject.set(x, "doNotStripQMark", js.undefined)
    }
  }
}
