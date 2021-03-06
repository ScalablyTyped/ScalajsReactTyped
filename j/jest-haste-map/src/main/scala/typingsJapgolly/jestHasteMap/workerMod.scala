package typingsJapgolly.jestHasteMap

import typingsJapgolly.jestHasteMap.typesMod.WorkerMessage
import typingsJapgolly.jestHasteMap.typesMod.WorkerMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/worker", JSImport.Namespace)
@js.native
object workerMod extends js.Object {
  def getSha1(data: WorkerMessage): js.Promise[WorkerMetadata] = js.native
  def worker(data: WorkerMessage): js.Promise[WorkerMetadata] = js.native
}

