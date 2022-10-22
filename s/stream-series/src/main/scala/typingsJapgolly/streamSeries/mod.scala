package typingsJapgolly.streamSeries

import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: ReadableStream */](streams: T*): ReadWriteStream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ReadWriteStream]
  
  @JSImport("stream-series", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
