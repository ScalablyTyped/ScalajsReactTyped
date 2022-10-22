package typingsJapgolly.n3.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.rdfjsTypes.streamMod.Sink
import typingsJapgolly.rdfjsTypes.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "StreamWriter")
@js.native
open class StreamWriter[Q /* <: typingsJapgolly.rdfjsTypes.dataModelMod.BaseQuad */] ()
  extends Transform
     with Sink[Stream[Q], EventEmitter] {
  def this(fd: Any) = this()
  def this(options: WriterOptions) = this()
  def this(fd: Any, options: WriterOptions) = this()
  
  /**
    * Consumes the given stream.
    *
    * The `end` and `error` events are used like described in the Stream interface.
    * Depending on the use case, subtypes of EventEmitter or Stream are used.
    * @see Stream
    *
    * @param stream The stream that will be consumed.
    * @return The resulting event emitter.
    */
  /* CompleteClass */
  override def `import`(stream: Stream[Q]): EventEmitter = js.native
}
