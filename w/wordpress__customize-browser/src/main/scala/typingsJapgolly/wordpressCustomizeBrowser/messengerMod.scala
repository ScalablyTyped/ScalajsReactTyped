package typingsJapgolly.wordpressCustomizeBrowser

import org.scalajs.dom.Window
import typingsJapgolly.jquery.JQuery.Callbacks
import typingsJapgolly.jquery.JQuery.Event
import typingsJapgolly.std.Record
import typingsJapgolly.wordpressCustomizeBrowser.classMod.Class
import typingsJapgolly.wordpressCustomizeBrowser.valueMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messengerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.wordpressCustomizeBrowser.eventsMod.Events because Inheritance from two classes. Inlined topics, trigger, bind, unbind */ @JSImport("@wordpress/customize-browser/Messenger", "Messenger")
  @js.native
  open class Messenger[T] protected () extends Class {
    def this(applicator: js.Object, argsArray: js.Object) = this()
    def this(applicator: js.Object, argsArray: js.Object, options: js.Object) = this()
    
    def add(key: String, initial: T): Value[T] = js.native
    def add(key: String, initial: T, options: js.Object): Value[T] = js.native
    
    def bind(id: String): this.type = js.native
    
    var channel: Value[String] = js.native
    
    def destroy(): Unit = js.native
    
    def initialize(params: MessengerParams): Unit = js.native
    def initialize(params: MessengerParams, options: js.Object): Unit = js.native
    
    var origin: Value[String] = js.native
    
    def receive(): Unit = js.native
    def receive(event: Event): Unit = js.native
    
    def send(id: String): Unit = js.native
    def send(id: String, data: js.Object): Unit = js.native
    
    var targetWidow: Value[Window | Null] = js.native
    
    // TODO: class with statics instead?
    var topics: Record[String, Callbacks[js.Function]] = js.native
    
    def trigger(id: String): this.type = js.native
    
    def unbind(id: String): this.type = js.native
    
    var url: Value[String] = js.native
  }
  
  trait MessengerParams extends StObject {
    
    var channel: String
    
    var targetWindow: Window
    
    var url: String
  }
  object MessengerParams {
    
    inline def apply(channel: String, targetWindow: Window, url: String): MessengerParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], targetWindow = targetWindow.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessengerParams]
    }
    
    extension [Self <: MessengerParams](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setTargetWindow(value: Window): Self = StObject.set(x, "targetWindow", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
