package typingsJapgolly.teppeisMultimaps

import typingsJapgolly.std.Set
import typingsJapgolly.teppeisMultimaps.distSrcMultimapMod.Multimap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSetmultimapMod {
  
  @JSImport("@teppeis/multimaps/dist/src/setmultimap", "SetMultimap")
  @js.native
  open class SetMultimap[K, V] () extends Multimap[K, V, Set[V]] {
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
}
