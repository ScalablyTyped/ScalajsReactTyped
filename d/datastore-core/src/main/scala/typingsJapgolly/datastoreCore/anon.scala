package typingsJapgolly.datastoreCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Datastore extends StObject {
    
    var datastore: typingsJapgolly.datastoreCore.distSrcMountMod.Datastore
    
    var prefix: typingsJapgolly.datastoreCore.distSrcMountMod.Key
  }
  object Datastore {
    
    inline def apply(
      datastore: typingsJapgolly.datastoreCore.distSrcMountMod.Datastore,
      prefix: typingsJapgolly.datastoreCore.distSrcMountMod.Key
    ): Datastore = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Datastore]
    }
    
    extension [Self <: Datastore](x: Self) {
      
      inline def setDatastore(value: typingsJapgolly.datastoreCore.distSrcMountMod.Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: typingsJapgolly.datastoreCore.distSrcMountMod.Key): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: typingsJapgolly.interfaceDatastore.keyMod.Key
    
    var value: js.typedarray.Uint8Array
  }
  object Key {
    
    inline def apply(key: typingsJapgolly.interfaceDatastore.keyMod.Key, value: js.typedarray.Uint8Array): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: typingsJapgolly.interfaceDatastore.keyMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.typedarray.Uint8Array): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
