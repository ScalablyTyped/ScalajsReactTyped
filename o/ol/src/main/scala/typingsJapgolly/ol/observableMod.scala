package typingsJapgolly.ol

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.change
import typingsJapgolly.ol.olStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observableMod {
  
  @JSImport("ol/Observable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/Observable", JSImport.Default)
  @js.native
  open class default () extends Observable
  
  inline def unByKey(key: js.Array[EventsKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unByKey(key: EventsKey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unByKey")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Observable
    extends typingsJapgolly.ol.eventsTargetMod.default {
    
    /**
      * Increases the revision counter and dispatches a 'change' event.
      */
    def changed(): Unit = js.native
    
    /**
      * Get the version number for this object.  Each time the object is modified,
      * its version number will be incremented.
      */
    def getRevision(): Double = js.native
    
    /**
      * Listen for a certain type of event.
      */
    def on(`type`: String, listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    def on(`type`: js.Array[String], listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    @JSName("on")
    def on_change(`type`: change, listener: js.Function1[/* evt */ typingsJapgolly.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    @JSName("on")
    def on_error(`type`: error, listener: js.Function1[/* evt */ typingsJapgolly.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    
    /**
      * Listen once for a certain type of event.
      */
    def once(`type`: String, listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    def once(`type`: js.Array[String], listener: js.Function1[/* p0 */ Any, Any]): EventsKey | js.Array[EventsKey] = js.native
    @JSName("once")
    def once_change(`type`: change, listener: js.Function1[/* evt */ typingsJapgolly.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    @JSName("once")
    def once_error(`type`: error, listener: js.Function1[/* evt */ typingsJapgolly.ol.eventsEventMod.default, Unit]): EventsKey = js.native
    
    /**
      * Unlisten for a certain type of event.
      */
    def un(`type`: String, listener: js.Function1[/* p0 */ Any, Any]): Unit = js.native
    def un(`type`: js.Array[String], listener: js.Function1[/* p0 */ Any, Any]): Unit = js.native
    @JSName("un")
    def un_change(`type`: change, listener: js.Function1[/* evt */ typingsJapgolly.ol.eventsEventMod.default, Unit]): Unit = js.native
    @JSName("un")
    def un_error(`type`: error, listener: js.Function1[/* evt */ typingsJapgolly.ol.eventsEventMod.default, Unit]): Unit = js.native
  }
}
