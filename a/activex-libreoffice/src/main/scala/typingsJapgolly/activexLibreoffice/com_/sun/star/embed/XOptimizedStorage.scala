package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a temporary interface that is introduced to temporarily optimize the document storing process. PLEASE DO NOT USE IT, it might change in any
  * time and will be deprecated soon! Another solution will be introduced as final one.
  */
trait XOptimizedStorage extends StObject {
  
  /**
    * allows to switch storage persistence to the provided URL. The caller is responsible to be sure that the file referenced by the URL contains the same
    * contents as the stream the storage is based currently. Thus using of this method is very dangerous and should be avoided when possible. It is
    * applicable only for root storages.
    */
  def attachToURL(sURL: String, bReadOnly: Boolean): Unit
  
  /** allows to copy storage element directly, not guarantied to work. */
  def copyElementDirectlyTo(sSourceName: String, xTargetStorage: XOptimizedStorage, sTargetName: String): Unit
  
  /**
    * fills the provided stream with the last flushed version of data from the child stream of the storage.
    * @param sStreamName the name of the substream that should be copied
    * @param xTargetStream the target stream where the data must be copied to
    * @throws com::sun::star::embed::InvalidStorageException this storage is in invalid state for any reason
    * @throws com::sun::star::lang::IllegalArgumentException one of provided arguments is illegal
    * @throws com::sun::star::packages::WrongPasswordException the provided password is wrong
    * @throws com::sun::star::io::IOException in case of io errors during stream opening
    * @throws com::sun::star::embed::StorageWrappedTargetException wraps other exceptions
    */
  def copyStreamElementData(sStreamName: String, xTargetStream: XStream): Unit
  
  /**
    * allows to get property of the child element with the specified name. The implementation of the method might allow to access only subset of the
    * supported by element properties.
    */
  def getElementPropertyValue(sElementName: String, sPropertyName: String): Any
  
  /** allows to insert a raw stream representing non-encrypted stream with header. */
  def insertRawNonEncrStreamElementDirect(sStreamName: String, xInStream: XInputStream): Unit
  
  /** allows to insert a stream to the storage directly. The stream must stay alive till the storage is committed. */
  def insertStreamElementDirect(sStreamName: String, xInStream: XInputStream, aProperties: SeqEquiv[PropertyValue]): Unit
  
  /**
    * allows to switch storage persistence to the provided stream. The stream will be filled by the storage. If an empty reference is provided, the storage
    * will create a temporary stream to switch to itself. It is applicable only for root storages.
    */
  def writeAndAttachToStream(xStream: XStream): Unit
}
object XOptimizedStorage {
  
  inline def apply(
    attachToURL: (String, Boolean) => Callback,
    copyElementDirectlyTo: (String, XOptimizedStorage, String) => Callback,
    copyStreamElementData: (String, XStream) => Callback,
    getElementPropertyValue: (String, String) => Any,
    insertRawNonEncrStreamElementDirect: (String, XInputStream) => Callback,
    insertStreamElementDirect: (String, XInputStream, SeqEquiv[PropertyValue]) => Callback,
    writeAndAttachToStream: XStream => Callback
  ): XOptimizedStorage = {
    val __obj = js.Dynamic.literal(attachToURL = js.Any.fromFunction2((t0: String, t1: Boolean) => (attachToURL(t0, t1)).runNow()), copyElementDirectlyTo = js.Any.fromFunction3((t0: String, t1: XOptimizedStorage, t2: String) => (copyElementDirectlyTo(t0, t1, t2)).runNow()), copyStreamElementData = js.Any.fromFunction2((t0: String, t1: XStream) => (copyStreamElementData(t0, t1)).runNow()), getElementPropertyValue = js.Any.fromFunction2(getElementPropertyValue), insertRawNonEncrStreamElementDirect = js.Any.fromFunction2((t0: String, t1: XInputStream) => (insertRawNonEncrStreamElementDirect(t0, t1)).runNow()), insertStreamElementDirect = js.Any.fromFunction3((t0: String, t1: XInputStream, t2: SeqEquiv[PropertyValue]) => (insertStreamElementDirect(t0, t1, t2)).runNow()), writeAndAttachToStream = js.Any.fromFunction1((t0: XStream) => writeAndAttachToStream(t0).runNow()))
    __obj.asInstanceOf[XOptimizedStorage]
  }
  
  extension [Self <: XOptimizedStorage](x: Self) {
    
    inline def setAttachToURL(value: (String, Boolean) => Callback): Self = StObject.set(x, "attachToURL", js.Any.fromFunction2((t0: String, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setCopyElementDirectlyTo(value: (String, XOptimizedStorage, String) => Callback): Self = StObject.set(x, "copyElementDirectlyTo", js.Any.fromFunction3((t0: String, t1: XOptimizedStorage, t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setCopyStreamElementData(value: (String, XStream) => Callback): Self = StObject.set(x, "copyStreamElementData", js.Any.fromFunction2((t0: String, t1: XStream) => (value(t0, t1)).runNow()))
    
    inline def setGetElementPropertyValue(value: (String, String) => Any): Self = StObject.set(x, "getElementPropertyValue", js.Any.fromFunction2(value))
    
    inline def setInsertRawNonEncrStreamElementDirect(value: (String, XInputStream) => Callback): Self = StObject.set(x, "insertRawNonEncrStreamElementDirect", js.Any.fromFunction2((t0: String, t1: XInputStream) => (value(t0, t1)).runNow()))
    
    inline def setInsertStreamElementDirect(value: (String, XInputStream, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "insertStreamElementDirect", js.Any.fromFunction3((t0: String, t1: XInputStream, t2: SeqEquiv[PropertyValue]) => (value(t0, t1, t2)).runNow()))
    
    inline def setWriteAndAttachToStream(value: XStream => Callback): Self = StObject.set(x, "writeAndAttachToStream", js.Any.fromFunction1((t0: XStream) => value(t0).runNow()))
  }
}
