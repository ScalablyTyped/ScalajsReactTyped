package typingsJapgolly.bunyanPrettystream

import typingsJapgolly.bunyanPrettystream.anon.End
import typingsJapgolly.bunyanPrettystream.anon.Mode
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bunyan-prettystream", JSImport.Namespace)
  @js.native
  /**
    * @param options.mode Output format, can be either `long`, `short`, or `dev`,
    *                     defaults to `long`.
    * @param options.useColor Indicates whether or not output should be colored,
    *                         defaults to `true`.
    */
  open class ^ () extends PrettyStream {
    def this(options: Mode) = this()
  }
  
  @js.native
  trait PrettyStream extends Writable {
    
    /**
      * Pipes data from this stream to another.
      *
      * @param destination Stream to write data to.
      * @param options.end Indicates whether `end()` should be called on the `destination`
      *                    stream when this stream emits `end`, defaults to `true`.
      * @return The `destination` stream.
      */
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
}
