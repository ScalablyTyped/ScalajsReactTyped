package typingsJapgolly.nodeResque.mod

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeResque.nodeResqueStrings.cleaning_worker
import typingsJapgolly.nodeResque.nodeResqueStrings.end
import typingsJapgolly.nodeResque.nodeResqueStrings.error
import typingsJapgolly.nodeResque.nodeResqueStrings.failure
import typingsJapgolly.nodeResque.nodeResqueStrings.job
import typingsJapgolly.nodeResque.nodeResqueStrings.pause
import typingsJapgolly.nodeResque.nodeResqueStrings.ping
import typingsJapgolly.nodeResque.nodeResqueStrings.poll
import typingsJapgolly.nodeResque.nodeResqueStrings.reEnqueue
import typingsJapgolly.nodeResque.nodeResqueStrings.start
import typingsJapgolly.nodeResque.nodeResqueStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-resque", "Worker")
@js.native
class Worker protected () extends EventEmitter {
  def this(options: WorkerOptions) = this()
  def this(options: WorkerOptions, jobs: JobsHash) = this()
  def connect(): js.Promise[Unit] = js.native
  def end(): js.Promise[Unit] = js.native
  @JSName("on")
  def on_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function3[/* error */ js.Error, /* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("on")
  def on_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* failure */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("on")
  def on_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_reEnqueue(
    event: reEnqueue,
    cb: js.Function3[/* queue */ String, /* job */ Job[_], /* plugin */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* result */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_cleaningworker(event: cleaning_worker, cb: js.Function2[/* worker */ String, /* pid */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_end(event: end, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, cb: js.Function3[/* error */ js.Error, /* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("once")
  def once_failure(event: failure, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* failure */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_job(event: job, cb: js.Function2[/* queue */ String, /* job */ Job[_], Unit]): this.type = js.native
  @JSName("once")
  def once_pause(event: pause, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_ping(event: ping, cb: js.Function1[/* time */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_poll(event: poll, cb: js.Function1[/* queue */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_reEnqueue(
    event: reEnqueue,
    cb: js.Function3[/* queue */ String, /* job */ Job[_], /* plugin */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_success(event: success, cb: js.Function3[/* queue */ String, /* job */ Job[_], /* result */ js.Any, Unit]): this.type = js.native
  def removeAllListeners(event: WorkerEvent): this.type = js.native
  def start(): js.Promise[Unit] = js.native
}

