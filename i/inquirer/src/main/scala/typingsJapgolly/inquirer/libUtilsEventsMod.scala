package typingsJapgolly.inquirer

import typingsJapgolly.node.readlineMod.Interface
import typingsJapgolly.node.readlineMod.Key
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsEventsMod {
  
  @JSImport("inquirer/lib/utils/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(readline: Interface): Events = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(readline.asInstanceOf[js.Any]).asInstanceOf[Events]
  
  /**
    * A set of events.
    */
  trait Events extends StObject {
    
    /**
      * The event-flow of the `aKey`-event.
      */
    var aKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `iKey`-event.
      */
    var iKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `keypress`-event of the {@link ReadlineInterface `readline.Interface`}-object.
      */
    var keypress: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `line`-event of the {@link ReadlineInterface `readline.Interface`}-object.
      */
    var line: Observable_[String]
    
    /**
      * The event-flow of the `normalizedDownKey`-event.
      */
    var normalizedDownKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `normalizedUpKey`-event.
      */
    var normalizedUpKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `numberKey`-event.
      */
    var numberKey: Observable_[KeyDescriptor]
    
    /**
      * The event-flow of the `spaceKey`-event.
      */
    var spaceKey: Observable_[KeyDescriptor]
  }
  object Events {
    
    inline def apply(
      aKey: Observable_[KeyDescriptor],
      iKey: Observable_[KeyDescriptor],
      keypress: Observable_[KeyDescriptor],
      line: Observable_[String],
      normalizedDownKey: Observable_[KeyDescriptor],
      normalizedUpKey: Observable_[KeyDescriptor],
      numberKey: Observable_[KeyDescriptor],
      spaceKey: Observable_[KeyDescriptor]
    ): Events = {
      val __obj = js.Dynamic.literal(aKey = aKey.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], normalizedDownKey = normalizedDownKey.asInstanceOf[js.Any], normalizedUpKey = normalizedUpKey.asInstanceOf[js.Any], numberKey = numberKey.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setAKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "aKey", value.asInstanceOf[js.Any])
      
      inline def setIKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "iKey", value.asInstanceOf[js.Any])
      
      inline def setKeypress(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "keypress", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Observable_[String]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setNormalizedDownKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "normalizedDownKey", value.asInstanceOf[js.Any])
      
      inline def setNormalizedUpKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "normalizedUpKey", value.asInstanceOf[js.Any])
      
      inline def setNumberKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "numberKey", value.asInstanceOf[js.Any])
      
      inline def setSpaceKey(value: Observable_[KeyDescriptor]): Self = StObject.set(x, "spaceKey", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides a description about a key.
    */
  trait KeyDescriptor extends StObject {
    
    /**
      * The description of the key.
      */
    var key: Key
    
    /**
      * The value of the key.
      */
    var value: String
  }
  object KeyDescriptor {
    
    inline def apply(key: Key, value: String): KeyDescriptor = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDescriptor]
    }
    
    extension [Self <: KeyDescriptor](x: Self) {
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
