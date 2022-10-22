package typingsJapgolly.streamMock

import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.streamMock.libDuplexDuplexMockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDuplexMod {
  
  @JSImport("stream-mock/lib/duplex", "DuplexMock")
  @js.native
  open class DuplexMock () extends default {
    def this(source: js.Iterable[Any]) = this()
    def this(source: ArrayLike[Any]) = this()
    def this(source: js.Iterable[Any], options: DuplexOptions) = this()
    def this(source: Unit, options: DuplexOptions) = this()
    def this(source: ArrayLike[Any], options: DuplexOptions) = this()
  }
}
