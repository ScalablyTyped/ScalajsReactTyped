package typingsJapgolly.areWeThereYet

import typingsJapgolly.areWeThereYet.areWeThereYetStrings.change
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.close
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.data
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.end
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.error
import typingsJapgolly.areWeThereYet.areWeThereYetStrings.readable
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("are-we-there-yet", "Tracker")
  @js.native
  open class Tracker ()
    extends TrackerBase
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, todo: Double) = this()
    def this(name: Unit, todo: Double) = this()
    
    def addWork(work: Double): Unit = js.native
    
    def completeWork(completed: Double): Unit = js.native
    
    def completed(): Double = js.native
    
    def finish(): Unit = js.native
  }
  
  @JSImport("are-we-there-yet", "TrackerBase")
  @js.native
  open class TrackerBase () extends EventEmitter {
    def this(name: String) = this()
    
    def addListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("addListener")
    def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def on(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("on")
    def on_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def once(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("once")
    def once_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def prependListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def prependOnceListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    
    def removeListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
  }
  
  @JSImport("are-we-there-yet", "TrackerGroup")
  @js.native
  open class TrackerGroup ()
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
    def newGroup(name: Unit, weight: Double): TrackerGroup = js.native
    
    def newItem(): Tracker = js.native
    def newItem(name: String): Tracker = js.native
    def newItem(name: String, todo: Double): Tracker = js.native
    def newItem(name: String, todo: Double, weight: Double): Tracker = js.native
    def newItem(name: String, todo: Unit, weight: Double): Tracker = js.native
    def newItem(name: Unit, todo: Double): Tracker = js.native
    def newItem(name: Unit, todo: Double, weight: Double): Tracker = js.native
    def newItem(name: Unit, todo: Unit, weight: Double): Tracker = js.native
    
    def newStream(): TrackerStream = js.native
    def newStream(name: String): TrackerStream = js.native
    def newStream(name: String, todo: Double): TrackerStream = js.native
    def newStream(name: String, todo: Double, weight: Double): TrackerStream = js.native
    def newStream(name: String, todo: Unit, weight: Double): TrackerStream = js.native
    def newStream(name: Unit, todo: Double): TrackerStream = js.native
    def newStream(name: Unit, todo: Double, weight: Double): TrackerStream = js.native
    def newStream(name: Unit, todo: Unit, weight: Double): TrackerStream = js.native
  }
  
  @JSImport("are-we-there-yet", "TrackerStream")
  @js.native
  open class TrackerStream ()
    extends Transform
       with TrackerObject {
    def this(name: String) = this()
    def this(name: String, size: Double) = this()
    def this(name: Unit, size: Double) = this()
    def this(name: String, size: Double, options: TransformOptions) = this()
    def this(name: String, size: Unit, options: TransformOptions) = this()
    def this(name: Unit, size: Double, options: TransformOptions) = this()
    def this(name: Unit, size: Unit, options: TransformOptions) = this()
    
    def addListener(event: readable | end | close, listener: js.Function0[Unit]): this.type = js.native
    def addListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("addListener")
    def addListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def addWork(work: Double): Unit = js.native
    
    def completed(): Double = js.native
    
    def on(event: readable | end | close, listener: js.Function0[Unit]): this.type = js.native
    def on(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("on")
    def on_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def once(event: readable | end | close, listener: js.Function0[Unit]): this.type = js.native
    def once(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("once")
    def once_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def prependListener(event: readable | end | close, listener: js.Function0[Unit]): this.type = js.native
    def prependListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def prependOnceListener(event: readable | end | close, listener: js.Function0[Unit]): this.type = js.native
    def prependOnceListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def removeListener(event: readable | end | close, listener: js.Function0[Unit]): this.type = js.native
    def removeListener(event: String, listener: GenericEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_change(event: change, listener: TrackerEventListener): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ Buffer | String, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  }
  
  @js.native
  trait GenericEventListener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  type TrackerEventListener = js.Function3[/* name */ String, /* completed */ Double, /* tracker */ TrackerObject, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.areWeThereYet.mod.Tracker
    - typingsJapgolly.areWeThereYet.mod.TrackerGroup
    - typingsJapgolly.areWeThereYet.mod.TrackerStream
  */
  trait TrackerObject extends StObject
}
