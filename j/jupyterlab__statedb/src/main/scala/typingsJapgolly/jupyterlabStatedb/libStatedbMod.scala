package typingsJapgolly.jupyterlabStatedb

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jupyterlabStatedb.jupyterlabStatedbStrings.cancel
import typingsJapgolly.jupyterlabStatedb.jupyterlabStatedbStrings.clear
import typingsJapgolly.jupyterlabStatedb.jupyterlabStatedbStrings.merge
import typingsJapgolly.jupyterlabStatedb.jupyterlabStatedbStrings.overwrite
import typingsJapgolly.jupyterlabStatedb.jupyterlabStatedbStrings.remove
import typingsJapgolly.jupyterlabStatedb.jupyterlabStatedbStrings.save
import typingsJapgolly.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typingsJapgolly.jupyterlabStatedb.libStatedbMod.StateDB.Change
import typingsJapgolly.jupyterlabStatedb.libStatedbMod.StateDB.IOptions
import typingsJapgolly.jupyterlabStatedb.libTokensMod.IStateDB
import typingsJapgolly.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typingsJapgolly.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatedbMod {
  
  @JSImport("@jupyterlab/statedb/lib/statedb", "StateDB")
  @js.native
  /**
    * Create a new state database.
    *
    * @param options - The instantiation options for a state database.
    */
  open class StateDB[T /* <: ReadonlyPartialJSONValue */] ()
    extends StObject
       with IStateDB[T] {
    def this(options: IOptions[T]) = this()
    
    /* private */ var _changed: Any = js.native
    
    /**
      * Clear the entire database.
      */
    /* private */ var _clear: Any = js.native
    
    /* private */ var _connector: Any = js.native
    
    /**
      * Fetch a value from the database.
      */
    /* private */ var _fetch: Any = js.native
    
    /**
      * Fetch a list from the database.
      */
    /* private */ var _list: Any = js.native
    
    /**
      * Merge data into the state database.
      */
    /* private */ var _merge: Any = js.native
    
    /**
      * Overwrite the entire database with new contents.
      */
    /* private */ var _overwrite: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /**
      * Remove a key in the database.
      */
    /* private */ var _remove: Any = js.native
    
    /**
      * Save a key and its value in the database.
      */
    /* private */ var _save: Any = js.native
    
    /**
      * A signal that emits the change type any time a value changes.
      */
    def changed: ISignal[this.type, Change] = js.native
    
    /**
      * Clear the entire database.
      */
    def clear(): js.Promise[Unit] = js.native
  }
  object StateDB {
    
    /**
      * An in-memory string key/value data connector.
      */
    @JSImport("@jupyterlab/statedb/lib/statedb", "StateDB.Connector")
    @js.native
    open class Connector ()
      extends StObject
         with IDataConnector[String, String, String, String] {
      
      /* private */ var _storage: Any = js.native
    }
    
    /**
      * A state database change.
      */
    trait Change extends StObject {
      
      /**
        * The key of the database item that was changed.
        *
        * #### Notes
        * This field is set to `null` for global changes (i.e. `clear`).
        */
      var id: String | Null
      
      /**
        * The type of change.
        */
      var `type`: clear | remove | save
    }
    object Change {
      
      inline def apply(`type`: clear | remove | save): Change = {
        val __obj = js.Dynamic.literal(id = null)
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Change]
      }
      
      extension [Self <: Change](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdNull: Self = StObject.set(x, "id", null)
        
        inline def setType(value: clear | remove | save): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Database content map
      */
    type Content[T] = StringDictionary[js.UndefOr[T]]
    
    /**
      * A data transformation that can be applied to a state database.
      */
    trait DataTransform[T /* <: ReadonlyPartialJSONValue */] extends StObject {
      
      /**
        * The contents of the change operation.
        */
      var contents: Content[T] | Null
      
      var `type`: cancel | clear | merge | overwrite
    }
    object DataTransform {
      
      inline def apply[T /* <: ReadonlyPartialJSONValue */](`type`: cancel | clear | merge | overwrite): DataTransform[T] = {
        val __obj = js.Dynamic.literal(contents = null)
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataTransform[T]]
      }
      
      extension [Self <: DataTransform[?], T /* <: ReadonlyPartialJSONValue */](x: Self & DataTransform[T]) {
        
        inline def setContents(value: Content[T]): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
        
        inline def setContentsNull: Self = StObject.set(x, "contents", null)
        
        inline def setType(value: cancel | clear | merge | overwrite): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The instantiation options for a state database.
      */
    trait IOptions[T /* <: ReadonlyPartialJSONValue */] extends StObject {
      
      /**
        * Optional string key/value connector. Defaults to in-memory connector.
        */
      var connector: js.UndefOr[IDataConnector[String, String, String, String]] = js.undefined
      
      /**
        * An optional promise that resolves with a data transformation that is
        * applied to the database contents before the database begins resolving
        * client requests.
        */
      var transform: js.UndefOr[js.Promise[DataTransform[T]]] = js.undefined
    }
    object IOptions {
      
      inline def apply[T /* <: ReadonlyPartialJSONValue */](): IOptions[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T /* <: ReadonlyPartialJSONValue */](x: Self & IOptions[T]) {
        
        inline def setConnector(value: IDataConnector[String, String, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        inline def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
        
        inline def setTransform(value: js.Promise[DataTransform[T]]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      }
    }
  }
}
