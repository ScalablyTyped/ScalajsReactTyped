package typingsJapgolly.ol

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.propertychange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("ol/Object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/Object", JSImport.Default)
  @js.native
  open class default () extends BaseObject {
    def this(opt_values: StringDictionary[Any]) = this()
  }
  
  @JSImport("ol/Object", "ObjectEvent")
  @js.native
  open class ObjectEvent protected ()
    extends typingsJapgolly.ol.eventsEventMod.default {
    def this(`type`: String, key: String, oldValue: Any) = this()
    
    /**
      * The name of the property whose value is changing.
      */
    var key: String = js.native
    
    /**
      * The old value. To get the new value use e.target.get(e.key) where
      * e is the event object.
      */
    var oldValue: Any = js.native
  }
  
  inline def getChangeEventType(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getChangeEventType")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait BaseObject
    extends typingsJapgolly.ol.observableMod.default {
    
    /**
      * Apply any properties from another object without triggering events.
      */
    /* protected */ def applyProperties(source: BaseObject): Unit = js.native
    
    /**
      * Gets a value.
      */
    def get(key: String): Any = js.native
    
    /**
      * Get a list of object property names.
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * Get an object of all property names and values.
      */
    def getProperties(): StringDictionary[Any] = js.native
    
    def hasProperties(): Boolean = js.native
    
    def notify(key: String, oldValue: Any): Unit = js.native
    
    @JSName("on")
    def on_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Sets a value.
      */
    def set(key: String, value: Any): Unit = js.native
    def set(key: String, value: Any, opt_silent: Boolean): Unit = js.native
    
    /**
      * Sets a collection of key-value pairs.  Note that this changes any existing
      * properties and adds new ones (it does not remove any existing properties).
      */
    def setProperties(values: StringDictionary[Any]): Unit = js.native
    def setProperties(values: StringDictionary[Any], opt_silent: Boolean): Unit = js.native
    
    @JSName("un")
    def un_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    
    /**
      * Unsets a property.
      */
    def unset(key: String): Unit = js.native
    def unset(key: String, opt_silent: Boolean): Unit = js.native
  }
}
