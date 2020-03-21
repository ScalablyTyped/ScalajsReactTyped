package typingsJapgolly.loadableServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AttrFn = js.Function1[/* chunk */ typingsJapgolly.loadableServer.mod.Chunk, js.Object]
  type ChunkExtractorOptions = typingsJapgolly.loadableServer.AnonEntrypoints with (typingsJapgolly.loadableServer.AnonStatsFile | typingsJapgolly.loadableServer.AnonStats)
}
