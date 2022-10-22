package typingsJapgolly.lzbase62

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.lzbase62.anon.PartialOptions
import typingsJapgolly.lzbase62.lzbase62Strings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("lzbase62", JSImport.Namespace)
  @js.native
  val ^ : LZ62 = js.native
  
  trait DataOption extends StObject {
    
    def onData(data: String): Unit
  }
  object DataOption {
    
    inline def apply(onData: String => Callback): DataOption = {
      val __obj = js.Dynamic.literal(onData = js.Any.fromFunction1((t0: String) => onData(t0).runNow()))
      __obj.asInstanceOf[DataOption]
    }
    
    extension [Self <: DataOption](x: Self) {
      
      inline def setOnData(value: String => Callback): Self = StObject.set(x, "onData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  trait EndOption extends StObject {
    
    def onEnd(): Unit
  }
  object EndOption {
    
    inline def apply(onEnd: Callback): EndOption = {
      val __obj = js.Dynamic.literal(onEnd = onEnd.toJsFn)
      __obj.asInstanceOf[EndOption]
    }
    
    extension [Self <: EndOption](x: Self) {
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
    }
  }
  
  @js.native
  trait LZ62 extends StObject {
    
    def compress(data: String): String = js.native
    def compress(data: String, options: PartialOptions): String = js.native
    def compress(data: String, options: DataOption): _empty = js.native
    def compress(data: String, options: Options): _empty = js.native
    
    def decompress(data: String): String = js.native
    def decompress(data: String, options: PartialOptions): String = js.native
    def decompress(data: String, options: DataOption): _empty = js.native
    def decompress(data: String, options: Options): _empty = js.native
    
    var version: String = js.native
  }
  
  trait Options
    extends StObject
       with DataOption
       with EndOption
  object Options {
    
    inline def apply(onData: String => Callback, onEnd: Callback): Options = {
      val __obj = js.Dynamic.literal(onData = js.Any.fromFunction1((t0: String) => onData(t0).runNow()), onEnd = onEnd.toJsFn)
      __obj.asInstanceOf[Options]
    }
  }
  
  type _To = LZ62
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: LZ62 = ^
}
