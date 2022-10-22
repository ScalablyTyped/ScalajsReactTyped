package typingsJapgolly.ipfsRepoMigrations

import typingsJapgolly.interfaceBlockstore.mod.Blockstore
import typingsJapgolly.interfaceDatastore.mod.Datastore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Blocks extends StObject {
    
    var blocks: Blockstore
    
    var datastore: Datastore
    
    var keys: Datastore
    
    var pins: Datastore
    
    var root: Datastore
  }
  object Blocks {
    
    inline def apply(blocks: Blockstore, datastore: Datastore, keys: Datastore, pins: Datastore, root: Datastore): Blocks = {
      val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], pins = pins.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blocks]
    }
    
    extension [Self <: Blocks](x: Self) {
      
      inline def setBlocks(value: Blockstore): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Datastore): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setPins(value: Datastore): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: Datastore): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofInvalidValueError extends StObject {
    
    val code_3: String
  }
  object TypeofInvalidValueError {
    
    inline def apply(code_3: String): TypeofInvalidValueError = {
      val __obj = js.Dynamic.literal(code_3 = code_3.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofInvalidValueError]
    }
    
    extension [Self <: TypeofInvalidValueError](x: Self) {
      
      inline def setCode_3(value: String): Self = StObject.set(x, "code_3", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofMissingRepoOptionsE extends StObject {
    
    val code_4: String
  }
  object TypeofMissingRepoOptionsE {
    
    inline def apply(code_4: String): TypeofMissingRepoOptionsE = {
      val __obj = js.Dynamic.literal(code_4 = code_4.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofMissingRepoOptionsE]
    }
    
    extension [Self <: TypeofMissingRepoOptionsE](x: Self) {
      
      inline def setCode_4(value: String): Self = StObject.set(x, "code_4", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofNonReversibleMigrat extends StObject {
    
    val code: String
  }
  object TypeofNonReversibleMigrat {
    
    inline def apply(code: String): TypeofNonReversibleMigrat = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofNonReversibleMigrat]
    }
    
    extension [Self <: TypeofNonReversibleMigrat](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofNotInitializedRepoE extends StObject {
    
    val code_1: String
  }
  object TypeofNotInitializedRepoE {
    
    inline def apply(code_1: String): TypeofNotInitializedRepoE = {
      val __obj = js.Dynamic.literal(code_1 = code_1.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofNotInitializedRepoE]
    }
    
    extension [Self <: TypeofNotInitializedRepoE](x: Self) {
      
      inline def setCode_1(value: String): Self = StObject.set(x, "code_1", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofRequiredParameterEr extends StObject {
    
    val code_2: String
  }
  object TypeofRequiredParameterEr {
    
    inline def apply(code_2: String): TypeofRequiredParameterEr = {
      val __obj = js.Dynamic.literal(code_2 = code_2.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofRequiredParameterEr]
    }
    
    extension [Self <: TypeofRequiredParameterEr](x: Self) {
      
      inline def setCode_2(value: String): Self = StObject.set(x, "code_2", value.asInstanceOf[js.Any])
    }
  }
}
