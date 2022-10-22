package typingsJapgolly.postMessageStream

import org.scalajs.dom.Window
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.postMessageStream.anon.Name
import typingsJapgolly.readableStream.mod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("post-message-stream", JSImport.Namespace)
  @js.native
  open class ^ protected () extends PostMessageStream {
    def this(props: Name) = this()
  }
  
  @js.native
  trait PostMessageStream extends Duplex {
    
    var _haveSyn: Boolean = js.native
    
    var _init: Boolean = js.native
    
    var _name: String = js.native
    
    var _origin: String = js.native
    
    var _target: String = js.native
    
    var _targetWindow: Window = js.native
    
    def _write(data: Any, _encoding: BufferEncoding, cb: js.Function0[Unit]): Unit = js.native
  }
}
