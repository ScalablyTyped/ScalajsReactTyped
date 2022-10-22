package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraConcatMod {
  
  @JSImport("xstream/extra/concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](streams: Stream[T]*): Stream[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(streams.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Stream[T]]
}
