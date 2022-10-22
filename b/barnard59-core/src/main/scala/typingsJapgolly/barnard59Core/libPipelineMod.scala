package typingsJapgolly.barnard59Core

import typingsJapgolly.barnard59Core.anon.FnCall
import typingsJapgolly.readableStream.mod.Readable
import typingsJapgolly.readableStream.mod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPipelineMod {
  
  @JSImport("barnard59-core/lib/Pipeline", JSImport.Default)
  @js.native
  open class default () extends Pipeline
  
  @js.native
  trait Pipeline
    extends typingsJapgolly.barnard59Core.libStreamObjectMod.default {
    
    def destroy(err: js.Error): Unit = js.native
    
    def finish(): FnCall = js.native
    
    def firstChild: typingsJapgolly.barnard59Core.libStreamObjectMod.default = js.native
    
    def init(): Unit = js.native
    
    def lastChild: typingsJapgolly.barnard59Core.libStreamObjectMod.default = js.native
    
    def onInit(): Unit = js.native
    
    var readable: Boolean = js.native
    
    var readableObjectMode: Boolean = js.native
    
    @JSName("stream")
    var stream_Pipeline: Readable | Writable = js.native
    
    var writable: Boolean = js.native
    
    var writableObjectMode: Boolean = js.native
  }
}
