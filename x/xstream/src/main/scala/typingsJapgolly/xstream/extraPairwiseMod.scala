package typingsJapgolly.xstream

import typingsJapgolly.xstream.mod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extraPairwiseMod {
  
  @JSImport("xstream/extra/pairwise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](ins: Stream[T]): Stream[js.Tuple2[T, T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(ins.asInstanceOf[js.Any]).asInstanceOf[Stream[js.Tuple2[T, T]]]
}
