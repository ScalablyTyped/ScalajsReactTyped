package typingsJapgolly.areWeThereYet

import typingsJapgolly.areWeThereYet.areWeThereYetStrings.change
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.close
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.data
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.end
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.error
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.readable
import typingsJapgolly.node.AnonEnd
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.WritableStream
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("are-we-there-yet", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Tracker ()
    extends TrackerBase
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, todo: Double) = this()
    def addWork(work: Double): Unit = js.native
    def completeWork(completed: Double): Unit = js.native
    def completed(): Double = js.native
    def finish(): Unit = js.native
  }
  
  @js.native
  class TrackerBase () extends EventEmitter {
    def this(name: String) = this()
    @JSName("addListener")
    def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("on")
    def on_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("once")
    def once_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
  }
  
  @js.native
  class TrackerGroup ()
    extends TrackerBase
       with TrackerObject {
    def this(name: String) = this()
    def addUnit(tracker: TrackerBase): TrackerObject = js.native
    def addUnit(tracker: TrackerBase, weight: Double): TrackerObject = js.native
    def completed(): Double = js.native
    def debug(): String = js.native
    def finish(): Unit = js.native
    def newGroup(): TrackerGroup = js.native
    def newGroup(name: String): TrackerGroup = js.native
    def newGroup(name: String, weight: Double): TrackerGroup = js.native
    def newItem(): Tracker = js.native
    def newItem(name: String): Tracker = js.native
    def newItem(name: String, todo: Double): Tracker = js.native
    def newItem(name: String, todo: Double, weight: Double): Tracker = js.native
    def newStream(): TrackerStream = js.native
    def newStream(name: String): TrackerStream = js.native
    def newStream(name: String, todo: Double): TrackerStream = js.native
    def newStream(name: String, todo: Double, weight: Double): TrackerStream = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.areWeThereYet.mod.Tracker
    - typingsJapgolly.areWeThereYet.mod.TrackerGroup
    - typingsJapgolly.areWeThereYet.mod.TrackerStream
  */
  trait TrackerObject extends js.Object
  
  @js.native
  class TrackerStream ()
    extends Transform
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, size: Double) = this()
    def this(name: String, size: Double, options: TransformOptions) = this()
    @JSName("addListener")
    def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    def addWork(work: Double): Unit = js.native
    def completed(): Double = js.native
    @JSName("on")
    def on_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: AnonEnd): T = js.native
    @JSName("prependListener")
    def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
  }
  
  type GenericEventListener = js.Function1[/* repeated */ js.Any, Unit]
  type TrackerEventListener = js.Function3[/* name */ String, /* completed */ Double, /* tracker */ TrackerObject, Unit]
}

