package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies an implementation for embedded object persistence.
  *
  * The idea is that any usable embedded object should be initialized with an entry in the parent storage that will be used as persistent representation.
  */
trait XEmbedPersist
  extends StObject
     with XCommonEmbedPersist {
  
  /**
    * allows to retrieve the current object entry name.
    * @returns the object entry name if any
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  val EntryName: String
  
  /**
    * allows to retrieve the current object entry name.
    * @returns the object entry name if any
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state ( has no entry )
    */
  def getEntryName(): String
  
  /**
    * allows to detect if the object has entry.
    * @returns `TRUE` if the object has own entry set `FALSE` otherwise
    */
  def hasEntry(): Boolean
  
  /**
    * specifies whether the object should use an old storage or a new one after "save as" operation.
    * @param bUseNew `TRUE` the new storage should be used `FALSE` the old one
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def saveCompleted(bUseNew: Boolean): Unit
  
  /**
    * provides object with a parent storage and a name for object's entry.
    *
    * An entry with the specified name should be created/opened inside provided storage. It can be a storage or a stream. For example, OOo API will refer to
    * OLE storages only by streams, but the object implementation will use storage based on this stream.
    *
    * Factory does this call to initialize the embedded object. The linked object can be initialized by factory in different way ( internally ).
    *
    * It is also possible to switch object persistent representation through this call. Actually this is the way, this call can be used by user ( since
    * initialization is done by factory ).
    * @param xStorage a parent storage the entry should be created in
    * @param sEntName a name for the entry
    * @param nEntryConnectionMode a mode in which the object should be initialized from entry can take values from {@link EntryInitModes} constant set
    * @param aMediaArgs optional parameters for the embedded document persistence initialization, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object persistence initialization, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during opening or creation
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def setPersistentEntry(
    xStorage: XStorage,
    sEntName: String,
    nEntryConnectionMode: Double,
    aMediaArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): Unit
  
  /**
    * lets the object store itself to an entry in destination storage and prepare to use the new entry for own persistence.
    *
    * The object should be stored to the new entry, after that the entry should be remembered by the object. After the storing process is finished the
    * {@link XEmbedPersist.saveCompleted()} method can be used to specify whether the object should use the new entry or the old one. The object persistence
    * can not be used until {@link XEmbedPersist.saveCompleted()} is called. So this state can be treated as "HandsOff" state.
    * @param xStorage a parent storage the entry should be created in
    * @param sEntName a name for the entry
    * @param aMediaArgs optional parameters for document saving, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object saving, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during storing
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeAsEntry(
    xStorage: XStorage,
    sEntName: String,
    aMediaArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): Unit
  
  /**
    * lets the object store itself to an entry in destination storage, the own persistence entry is not changed.
    * @param xStorage a parent storage the entry should be created inside
    * @param sEntName a name for the entry
    * @param aMediaArgs optional parameters for document saving, see also {@link com.sun.star.document.MediaDescriptor}
    * @param aObjectArgs optional parameters for the object saving, see also {@link com.sun.star.embed.EmbeddedObjectDescriptor}
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    * @throws com::sun::star::embed::WrongStateException the object is in wrong state
    * @throws com::sun::star::io::IOException in case of io problems during storing
    * @throws com::sun::star::uno::Exception in case of other problems
    */
  def storeToEntry(
    xStorage: XStorage,
    sEntName: String,
    aMediaArgs: SeqEquiv[PropertyValue],
    aObjectArgs: SeqEquiv[PropertyValue]
  ): Unit
}
object XEmbedPersist {
  
  inline def apply(
    EntryName: String,
    acquire: Callback,
    getEntryName: CallbackTo[String],
    hasEntry: CallbackTo[Boolean],
    isReadonly: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    reload: (SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    saveCompleted: Boolean => Callback,
    setPersistentEntry: (XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    storeAsEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback,
    storeOwn: Callback,
    storeToEntry: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback
  ): XEmbedPersist = {
    val __obj = js.Dynamic.literal(EntryName = EntryName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getEntryName = getEntryName.toJsFn, hasEntry = hasEntry.toJsFn, isReadonly = isReadonly.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, reload = js.Any.fromFunction2((t0: SeqEquiv[PropertyValue], t1: SeqEquiv[PropertyValue]) => (reload(t0, t1)).runNow()), saveCompleted = js.Any.fromFunction1((t0: Boolean) => saveCompleted(t0).runNow()), setPersistentEntry = js.Any.fromFunction5((t0: XStorage, t1: String, t2: Double, t3: SeqEquiv[PropertyValue], t4: SeqEquiv[PropertyValue]) => (setPersistentEntry(t0, t1, t2, t3, t4)).runNow()), storeAsEntry = js.Any.fromFunction4((t0: XStorage, t1: String, t2: SeqEquiv[PropertyValue], t3: SeqEquiv[PropertyValue]) => (storeAsEntry(t0, t1, t2, t3)).runNow()), storeOwn = storeOwn.toJsFn, storeToEntry = js.Any.fromFunction4((t0: XStorage, t1: String, t2: SeqEquiv[PropertyValue], t3: SeqEquiv[PropertyValue]) => (storeToEntry(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[XEmbedPersist]
  }
  
  extension [Self <: XEmbedPersist](x: Self) {
    
    inline def setEntryName(value: String): Self = StObject.set(x, "EntryName", value.asInstanceOf[js.Any])
    
    inline def setGetEntryName(value: CallbackTo[String]): Self = StObject.set(x, "getEntryName", value.toJsFn)
    
    inline def setHasEntry(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasEntry", value.toJsFn)
    
    inline def setSaveCompleted(value: Boolean => Callback): Self = StObject.set(x, "saveCompleted", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetPersistentEntry(value: (XStorage, String, Double, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "setPersistentEntry", js.Any.fromFunction5((t0: XStorage, t1: String, t2: Double, t3: SeqEquiv[PropertyValue], t4: SeqEquiv[PropertyValue]) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setStoreAsEntry(value: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "storeAsEntry", js.Any.fromFunction4((t0: XStorage, t1: String, t2: SeqEquiv[PropertyValue], t3: SeqEquiv[PropertyValue]) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setStoreToEntry(value: (XStorage, String, SeqEquiv[PropertyValue], SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "storeToEntry", js.Any.fromFunction4((t0: XStorage, t1: String, t2: SeqEquiv[PropertyValue], t3: SeqEquiv[PropertyValue]) => (value(t0, t1, t2, t3)).runNow()))
  }
}
