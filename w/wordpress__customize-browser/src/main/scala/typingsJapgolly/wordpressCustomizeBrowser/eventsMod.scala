package typingsJapgolly.wordpressCustomizeBrowser

import typingsJapgolly.jquery.JQuery.Callbacks
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@wordpress/customize-browser/Events", "Events")
  @js.native
  open class Events[T /* <: /* keyof any */ String */] () extends StObject {
    
    def bind(id: T): this.type = js.native
    
    // TODO: class with statics instead?
    var topics: Record[T, Callbacks[js.Function]] = js.native
    
    def trigger(id: T): this.type = js.native
    
    def unbind(id: T): this.type = js.native
  }
}
