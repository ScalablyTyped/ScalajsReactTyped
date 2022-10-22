package typingsJapgolly.dush

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dush.dushStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("dush", JSImport.Namespace)
  @js.native
  val ^ : DushStatic = js.native
  
  type DushStatic = js.Function0[Emitter]
  
  @js.native
  trait Emitter extends StObject {
    
    var _allEvents: js.Array[StringDictionary[js.Array[Handler]]] = js.native
    
    def emit(`type`: String, event: Any*): Emitter = js.native
    
    def off(`type`: String): Emitter = js.native
    def off(`type`: String, handler: Handler): Emitter = js.native
    def off(`type`: Asterisk): Emitter = js.native
    def off(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
    
    def on(`type`: String, handler: Handler): Emitter = js.native
    def on(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
    
    def once(`type`: String, handler: Handler): Emitter = js.native
    def once(`type`: Asterisk, handler: WildcardHandler): Emitter = js.native
    
    def use(plugin: js.Function2[/* app */ this.type, /* options */ Any, Unit]): Emitter = js.native
    def use(plugin: js.Function2[/* app */ this.type, /* options */ Any, Unit], options: Any): Emitter = js.native
  }
  
  @js.native
  trait Handler extends StObject {
    
    def apply(event: Any*): Unit = js.native
  }
  
  @js.native
  trait WildcardHandler extends StObject {
    
    def apply(`type`: String, event: Any*): Unit = js.native
    def apply(`type`: Unit, event: Any*): Unit = js.native
  }
  
  type _To = DushStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: DushStatic = ^
}
