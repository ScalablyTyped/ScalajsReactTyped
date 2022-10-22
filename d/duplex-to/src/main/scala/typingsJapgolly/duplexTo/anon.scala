package typingsJapgolly.duplexTo

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(duplex: Stream): Readable = js.native
    def apply(duplex: typingsJapgolly.readableStream.mod.Stream): typingsJapgolly.readableStream.mod.Readable = js.native
  }
  
  @js.native
  trait FnCallDuplex extends StObject {
    
    def apply(duplex: Stream): Writable = js.native
    def apply(duplex: typingsJapgolly.readableStream.mod.Stream): typingsJapgolly.readableStream.mod.Writable = js.native
  }
}
