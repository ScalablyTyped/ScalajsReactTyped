package typingsJapgolly.yjs

import typingsJapgolly.std.Map
import typingsJapgolly.yjs.anon.Action
import typingsJapgolly.yjs.anon.Added
import typingsJapgolly.yjs.anon.Delete
import typingsJapgolly.yjs.distSrcStructsAbstractStructMod.AbstractStruct
import typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsYeventMod {
  
  @JSImport("yjs/dist/src/utils/YEvent", "YEvent")
  @js.native
  open class YEvent[T /* <: AbstractType[Any] */] protected () extends StObject {
    /**
      * @param {T} target The changed type.
      * @param {Transaction} transaction
      */
    def this(target: T, transaction: Transaction) = this()
    
    /**
      * @type {Object|null}
      */
    var _changes: js.Object | Null = js.native
    
    /**
      * @type {null | Array<{ insert?: string | Array<any> | object | AbstractType<any>, retain?: number, delete?: number, attributes?: Object<string, any> }>}
      */
    var _delta: js.Array[Delete] | Null = js.native
    
    /**
      * @type {null | Map<string, { action: 'add' | 'update' | 'delete', oldValue: any, newValue: any }>}
      */
    var _keys: (Map[String, Action]) | Null = js.native
    
    /**
      * Check if a struct is added by this event.
      *
      * In contrast to change.deleted, this method also returns true if the struct was added and then deleted.
      *
      * @param {AbstractStruct} struct
      * @return {boolean}
      */
    def adds(struct: AbstractStruct): Boolean = js.native
    
    /**
      * @type {{added:Set<Item>,deleted:Set<Item>,keys:Map<string,{action:'add'|'update'|'delete',oldValue:any}>,delta:Array<{insert?:Array<any>|string, delete?:number, retain?:number}>}}
      */
    def changes: Added = js.native
    
    /**
      * The current target on which the observe callback is called.
      * @type {AbstractType<any>}
      */
    var currentTarget: AbstractType[Any] = js.native
    
    /**
      * Check if a struct is deleted by this event.
      *
      * In contrast to change.deleted, this method also returns true if the struct was added and then deleted.
      *
      * @param {AbstractStruct} struct
      * @return {boolean}
      */
    def deletes(struct: AbstractStruct): Boolean = js.native
    
    /**
      * @type {Array<{insert?: string | Array<any> | object | AbstractType<any>, retain?: number, delete?: number, attributes?: Object<string, any>}>}
      */
    def delta: js.Array[Delete] = js.native
    
    /**
      * @type {Map<string, { action: 'add' | 'update' | 'delete', oldValue: any, newValue: any }>}
      */
    def keys: Map[String, Action] = js.native
    
    /**
      * Computes the path from `y` to the changed type.
      *
      * @todo v14 should standardize on path: Array<{parent, index}> because that is easier to work with.
      *
      * The following property holds:
      * @example
      *   let type = y
      *   event.path.forEach(dir => {
      *     type = type.get(dir)
      *   })
      *   type === event.target // => true
      */
    def path: js.Array[String | Double] = js.native
    
    /**
      * The type on which this event was created on.
      * @type {T}
      */
    var target: T = js.native
    
    /**
      * The transaction that triggered this event.
      * @type {Transaction}
      */
    var transaction: Transaction = js.native
  }
}
