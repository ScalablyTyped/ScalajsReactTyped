package typingsJapgolly.ipfsBitswap

import typingsJapgolly.ipfsBitswap.anon.DebuggererrorDebugger
import typingsJapgolly.ipfsBitswap.distSrcMessageEntryMod.BitswapMessageEntry
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("ipfs-bitswap/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupBy[K /* <: String | Double | js.Symbol */, V](pred: js.Function1[/* v */ V, K], list: js.Array[V]): Record[K, js.Array[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("groupBy")(pred.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Record[K, js.Array[V]]]
  
  inline def includesWith[X, T](pred: js.Function2[/* x */ X, /* t */ T, Boolean], x: X, list: js.Array[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("includesWith")(pred.asInstanceOf[js.Any], x.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMapEqual(
    a: Map[String, js.typedarray.Uint8Array | BitswapMessageEntry],
    b: Map[String, js.typedarray.Uint8Array | BitswapMessageEntry]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMapEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def logger(): DebuggererrorDebugger = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")().asInstanceOf[DebuggererrorDebugger]
  inline def logger(id: Unit, subsystem: String): DebuggererrorDebugger = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(id.asInstanceOf[js.Any], subsystem.asInstanceOf[js.Any])).asInstanceOf[DebuggererrorDebugger]
  inline def logger(id: PeerId): DebuggererrorDebugger = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(id.asInstanceOf[js.Any]).asInstanceOf[DebuggererrorDebugger]
  inline def logger(id: PeerId, subsystem: String): DebuggererrorDebugger = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(id.asInstanceOf[js.Any], subsystem.asInstanceOf[js.Any])).asInstanceOf[DebuggererrorDebugger]
  
  inline def pullAllWith[T, E](pred: js.Function2[/* a */ T, /* b */ E, Boolean], list: js.Array[T], values: js.Array[E]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("pullAllWith")(pred.asInstanceOf[js.Any], list.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def sortBy[T](fn: js.Function1[/* v */ T, Double], list: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortBy")(fn.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def uniqWith[T](pred: js.Function2[/* x */ T, /* t */ T, Boolean], list: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("uniqWith")(pred.asInstanceOf[js.Any], list.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
