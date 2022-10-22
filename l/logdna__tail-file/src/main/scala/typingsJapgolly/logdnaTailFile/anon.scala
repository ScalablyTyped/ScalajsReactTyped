package typingsJapgolly.logdnaTailFile

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.ReadStream
import typingsJapgolly.node.fsMod.ReadStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * The actual error that was thrown, e.g. from a stream.
      */
    var actual: js.Error
  }
  object Dictkey {
    
    inline def apply(actual: js.Error): Dictkey = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setActual(value: js.Error): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(path: PathLike): ReadStream = js.native
    def apply(path: PathLike, options: BufferEncoding): ReadStream = js.native
    def apply(path: PathLike, options: ReadStreamOptions): ReadStream = js.native
  }
}
