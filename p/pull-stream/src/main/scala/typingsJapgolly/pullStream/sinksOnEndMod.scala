package typingsJapgolly.pullStream

import typingsJapgolly.pullStream.mod.EndOrError
import typingsJapgolly.pullStream.mod.Sink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sinksOnEndMod {
  
  /**
    * Drain the stream and then call `cb` when done.
    */
  inline def apply(): Sink[Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Sink[Any]]
  inline def apply(cb: js.Function1[/* err */ EndOrError, Any]): Sink[Any] = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Sink[Any]]
  
  @JSImport("pull-stream/sinks/on-end", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
