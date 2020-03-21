package typingsJapgolly.jestWorker.nodeThreadsWorkerMod

import typingsJapgolly.jestWorker.typesMod.ChildMessage
import typingsJapgolly.jestWorker.typesMod.OnEnd
import typingsJapgolly.jestWorker.typesMod.OnStart
import typingsJapgolly.jestWorker.typesMod.ParentMessage
import typingsJapgolly.jestWorker.typesMod.WorkerOptions
import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-worker/build/workers/NodeThreadsWorker", JSImport.Default)
@js.native
class default protected () extends ExperimentalWorker {
  def this(options: WorkerOptions) = this()
  /* CompleteClass */
  override var _fakeStream: js.Any = js.native
  /* CompleteClass */
  override var _getFakeStream: js.Any = js.native
  /* CompleteClass */
  override var _onProcessEnd: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _request: js.Any = js.native
  /* CompleteClass */
  override var _retries: js.Any = js.native
  /* CompleteClass */
  override var _shutdown: js.Any = js.native
  /* CompleteClass */
  override var _stderr: js.Any = js.native
  /* CompleteClass */
  override var _stdout: js.Any = js.native
  /* CompleteClass */
  override var _worker: js.Any = js.native
  /* CompleteClass */
  override def getStderr(): ReadableStream | Null = js.native
  /* CompleteClass */
  override def getStdout(): ReadableStream | Null = js.native
  /* CompleteClass */
  override def getWorkerId(): Double = js.native
  /* CompleteClass */
  override def initialize(): Unit = js.native
  /* CompleteClass */
  override def onExit(exitCode: Double): Unit = js.native
  /* CompleteClass */
  override def onMessage(message: ParentMessage): Unit = js.native
  /* CompleteClass */
  override def send(request: ChildMessage, onProcessStart: OnStart, onProcessEnd: OnEnd): Unit = js.native
}

