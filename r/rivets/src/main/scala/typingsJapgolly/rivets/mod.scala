package typingsJapgolly.rivets

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery
import typingsJapgolly.rivets.anon.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Rivets extends Shortcut {
    
    @JSImport("rivets", "Rivets")
    @js.native
    val ^ : typingsJapgolly.rivets.mod.Rivets.Rivets = js.native
    @js.native
    trait Rivets extends StObject {
      
      // Global sightglass adapters.
      var adapters: js.Object = js.native
      
      def bind(element: js.Array[HTMLElement], models: js.Object): View = js.native
      def bind(element: js.Array[HTMLElement], models: js.Object, options: js.Object): View = js.native
      def bind(element: HTMLElement, models: js.Object): View = js.native
      def bind(element: HTMLElement, models: js.Object, options: js.Object): View = js.native
      def bind(element: JQuery[HTMLElement], models: js.Object): View = js.native
      def bind(element: JQuery[HTMLElement], models: js.Object, options: js.Object): View = js.native
      
      // Global binders.
      var binders: js.Object = js.native
      
      // Global components.
      var components: js.Object = js.native
      
      def configure(): Unit = js.native
      def configure(options: Handler): Unit = js.native
      
      // Global formatters.
      var formatters: js.Object = js.native
      
      def handler(context: Any, ev: Event, biding: Any): Unit = js.native
      
      // Default attribute prefix.
      var prefix: String = js.native
      
      // Preload data by default.
      var preloadData: Boolean = js.native
      
      // Default sightglass root interface.
      var rootInterface: String = js.native
      
      // Default template delimiters.
      var templateDelimiters: js.Array[String] = js.native
    }
    
    trait View extends StObject {
      
      def bind(): Unit
      
      def build(): Unit
      
      def unbind(): Unit
    }
    object View {
      
      inline def apply(bind: Callback, build: Callback, unbind: Callback): View = {
        val __obj = js.Dynamic.literal(bind = bind.toJsFn, build = build.toJsFn, unbind = unbind.toJsFn)
        __obj.asInstanceOf[View]
      }
      
      extension [Self <: View](x: Self) {
        
        inline def setBind(value: Callback): Self = StObject.set(x, "bind", value.toJsFn)
        
        inline def setBuild(value: Callback): Self = StObject.set(x, "build", value.toJsFn)
        
        inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
      }
    }
    
    type _To = typingsJapgolly.rivets.mod.Rivets.Rivets
    
    /* This means you don't have to write `^`, but can instead just say `Rivets.foo` */
    override def _to: typingsJapgolly.rivets.mod.Rivets.Rivets = ^
  }
}
