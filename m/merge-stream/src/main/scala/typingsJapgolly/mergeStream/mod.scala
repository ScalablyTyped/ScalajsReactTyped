package typingsJapgolly.mergeStream

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: ReadableStream */](streams: (T | js.Array[T])*): MergedStream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[MergedStream]
  
  @JSImport("merge-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait MergedStream
    extends StObject
       with ReadWriteStream {
    
    def add(source: js.Array[ReadableStream]): MergedStream = js.native
    def add(source: ReadableStream): MergedStream = js.native
    
    def isEmpty(): Boolean = js.native
  }
}
