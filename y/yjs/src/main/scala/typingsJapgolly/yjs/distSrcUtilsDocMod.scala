package typingsJapgolly.yjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lib0.observableMod.Observable
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import typingsJapgolly.yjs.distSrcStructsItemMod.Item
import typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typingsJapgolly.yjs.distSrcTypesYarrayMod.YArray
import typingsJapgolly.yjs.distSrcTypesYmapMod.YMap
import typingsJapgolly.yjs.distSrcTypesYtextMod.YText
import typingsJapgolly.yjs.distSrcTypesYxmlfragmentMod.YXmlFragment
import typingsJapgolly.yjs.distSrcUtilsStructStoreMod.StructStore
import typingsJapgolly.yjs.distSrcUtilsTransactionMod.Transaction
import typingsJapgolly.yjs.distSrcUtilsYeventMod.YEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsDocMod {
  
  @JSImport("yjs/dist/src/utils/Doc", "Doc")
  @js.native
  /**
    * @param {DocOpts} [opts] configuration
    */
  open class Doc () extends Observable[String] {
    def this(hasGuidCollectionidGcGcFilterMetaAutoLoadShouldLoad: DocOpts) = this()
    
    /**
      * If this document is a subdocument - a document integrated into another document - then _item is defined.
      * @type {Item?}
      */
    var _item: Item | Null = js.native
    
    /**
      * @type {Transaction | null}
      */
    var _transaction: Transaction | Null = js.native
    
    /**
      * @type {Array<Transaction>}
      */
    var _transactionCleanups: js.Array[Transaction] = js.native
    
    var autoLoad: Boolean = js.native
    
    var clientID: Double = js.native
    
    var collectionid: String | Null = js.native
    
    var gc: Boolean = js.native
    
    def gcFilter(arg0: Item): Boolean = js.native
    
    /**
      * Define a shared data type.
      *
      * Multiple calls of `y.get(name, TypeConstructor)` yield the same result
      * and do not overwrite each other. I.e.
      * `y.define(name, Y.Array) === y.define(name, Y.Array)`
      *
      * After this method is called, the type is also available on `y.share.get(name)`.
      *
      * *Best Practices:*
      * Define all types right after the Yjs instance is created and store them in a separate object.
      * Also use the typed methods `getText(name)`, `getArray(name)`, ..
      *
      * @example
      *   const y = new Y(..)
      *   const appState = {
      *     document: y.getText('document')
      *     comments: y.getArray('comments')
      *   }
      *
      * @param {string} name
      * @param {Function} TypeConstructor The constructor of the type definition. E.g. Y.Text, Y.Array, Y.Map, ...
      * @return {AbstractType<any>} The created type. Constructed with TypeConstructor
      *
      * @public
      */
    def get(name: String): AbstractType[Any] = js.native
    def get(name: String, TypeConstructor: js.Function): AbstractType[Any] = js.native
    
    /**
      * @template T
      * @param {string} [name]
      * @return {YArray<T>}
      *
      * @public
      */
    def getArray[T](): YArray[T] = js.native
    def getArray[T](name: String): YArray[T] = js.native
    
    /**
      * @template T
      * @param {string} [name]
      * @return {YMap<T>}
      *
      * @public
      */
    def getMap[T_1](): YMap[T_1] = js.native
    def getMap[T_1](name: String): YMap[T_1] = js.native
    
    def getSubdocGuids(): Set[String] = js.native
    
    def getSubdocs(): Set[Doc] = js.native
    
    /**
      * @param {string} [name]
      * @return {YText}
      *
      * @public
      */
    def getText(): YText = js.native
    def getText(name: String): YText = js.native
    
    /**
      * @param {string} [name]
      * @return {YXmlFragment}
      *
      * @public
      */
    def getXmlFragment(): YXmlFragment = js.native
    def getXmlFragment(name: String): YXmlFragment = js.native
    
    var guid: String = js.native
    
    var isLoaded: Boolean = js.native
    
    /**
      * Notify the parent document that you request to load data into this subdocument (if it is a subdocument).
      *
      * `load()` might be used in the future to request any provider to load the most current data.
      *
      * It is safe to call `load()` multiple times.
      */
    def load(): Unit = js.native
    
    var meta: Any = js.native
    
    /**
      * @param {string} eventName
      * @param {function(...any):any} f
      */
    def on(eventName: String, f: js.Function1[/* repeated */ Any, Any]): Unit = js.native
    
    /**
      * @type {Map<string, AbstractType<YEvent<any>>>}
      */
    var share: Map[String, AbstractType[YEvent[Any]]] = js.native
    
    var shouldLoad: Boolean = js.native
    
    var store: StructStore = js.native
    
    /**
      * @type {Set<Doc>}
      */
    var subdocs: Set[Doc] = js.native
    
    /**
      * Converts the entire document into a js object, recursively traversing each yjs type
      * Doesn't log types that have not been defined (using ydoc.getType(..)).
      *
      * @deprecated Do not use this method and rather call toJSON directly on the shared types.
      *
      * @return {Object<string, any>}
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /**
      * Changes that happen inside of a transaction are bundled. This means that
      * the observer fires _after_ the transaction is finished and that all changes
      * that happened inside of the transaction are sent as one message to the
      * other peers.
      *
      * @param {function(Transaction):void} f The function that should be executed as a transaction
      * @param {any} [origin] Origin of who started the transaction. Will be stored on transaction.origin
      *
      * @public
      */
    def transact(f: js.Function1[/* arg0 */ Transaction, Unit]): Unit = js.native
    def transact(f: js.Function1[/* arg0 */ Transaction, Unit], origin: Any): Unit = js.native
    
    var whenLoaded: js.Promise[Any] = js.native
  }
  
  @JSImport("yjs/dist/src/utils/Doc", "generateNewClientId")
  @js.native
  val generateNewClientId: js.Function0[Double] = js.native
  
  trait DocOpts extends StObject {
    
    /**
      * If a subdocument, automatically load document. If this is a subdocument, remote peers will load the document as well automatically.
      */
    var autoLoad: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Associate this document with a collection. This only plays a role if your provider has a concept of collection.
      */
    var collectionid: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Disable garbage collection (default: gc=true)
      */
    var gc: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Will be called before an Item is garbage collected. Return false to keep the Item.
      */
    var gcFilter: js.UndefOr[js.Function1[/* arg0 */ Item, Boolean]] = js.undefined
    
    /**
      * Define a globally unique identifier for this document
      */
    var guid: js.UndefOr[String] = js.undefined
    
    /**
      * Any kind of meta information you want to associate with this document. If this is a subdocument, remote peers will store the meta information as well.
      */
    var meta: js.UndefOr[Any] = js.undefined
    
    /**
      * Whether the document should be synced by the provider now. This is toggled to true when you call ydoc.load()
      */
    var shouldLoad: js.UndefOr[Boolean] = js.undefined
  }
  object DocOpts {
    
    inline def apply(): DocOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocOpts]
    }
    
    extension [Self <: DocOpts](x: Self) {
      
      inline def setAutoLoad(value: Boolean): Self = StObject.set(x, "autoLoad", value.asInstanceOf[js.Any])
      
      inline def setAutoLoadUndefined: Self = StObject.set(x, "autoLoad", js.undefined)
      
      inline def setCollectionid(value: String): Self = StObject.set(x, "collectionid", value.asInstanceOf[js.Any])
      
      inline def setCollectionidNull: Self = StObject.set(x, "collectionid", null)
      
      inline def setCollectionidUndefined: Self = StObject.set(x, "collectionid", js.undefined)
      
      inline def setGc(value: Boolean): Self = StObject.set(x, "gc", value.asInstanceOf[js.Any])
      
      inline def setGcFilter(value: /* arg0 */ Item => Boolean): Self = StObject.set(x, "gcFilter", js.Any.fromFunction1(value))
      
      inline def setGcFilterUndefined: Self = StObject.set(x, "gcFilter", js.undefined)
      
      inline def setGcUndefined: Self = StObject.set(x, "gc", js.undefined)
      
      inline def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
      
      inline def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
      
      inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      inline def setShouldLoad(value: Boolean): Self = StObject.set(x, "shouldLoad", value.asInstanceOf[js.Any])
      
      inline def setShouldLoadUndefined: Self = StObject.set(x, "shouldLoad", js.undefined)
    }
  }
}
