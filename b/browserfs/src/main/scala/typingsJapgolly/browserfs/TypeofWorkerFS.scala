package typingsJapgolly.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemOptions
import typingsJapgolly.browserfs.workerFSMod.WorkerFS
import typingsJapgolly.browserfs.workerFSMod.WorkerFSOptions
import typingsJapgolly.browserfs.workerFSMod.default
import typingsJapgolly.std.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWorkerFS
  extends Instantiable1[/* worker */ Worker, default]
     with Instantiable2[/* worker */ Worker, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  def Create(opts: WorkerFSOptions, cb: BFSCallback[WorkerFS]): Unit = js.native
  /**
    * Attaches a listener to the remote worker for file system requests.
    */
  def attachRemoteListener(worker: org.scalajs.dom.raw.Worker): Unit = js.native
  def isAvailable(): Boolean = js.native
}

