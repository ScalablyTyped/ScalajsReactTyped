package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.RevisionTag
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** interface to load or store a list of document revisions from or to a document using the packed XML file format */
trait XDocumentRevisionListPersistence
  extends StObject
     with XInterface {
  
  /**
    * Loads a list of available revisions from a storage
    *
    * This method does not load any revision itself
    */
  def load(Storage: XStorage): SafeArray[RevisionTag]
  
  /**
    * Stores a list of available revisions to a storage
    *
    * This method does not store revisions themselves
    */
  def store(Storage: XStorage, List: SeqEquiv[RevisionTag]): Unit
}
object XDocumentRevisionListPersistence {
  
  inline def apply(
    acquire: Callback,
    load: XStorage => SafeArray[RevisionTag],
    queryInterface: `type` => Any,
    release: Callback,
    store: (XStorage, SeqEquiv[RevisionTag]) => Callback
  ): XDocumentRevisionListPersistence = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, load = js.Any.fromFunction1(load), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, store = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[RevisionTag]) => (store(t0, t1)).runNow()))
    __obj.asInstanceOf[XDocumentRevisionListPersistence]
  }
  
  extension [Self <: XDocumentRevisionListPersistence](x: Self) {
    
    inline def setLoad(value: XStorage => SafeArray[RevisionTag]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setStore(value: (XStorage, SeqEquiv[RevisionTag]) => Callback): Self = StObject.set(x, "store", js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[RevisionTag]) => (value(t0, t1)).runNow()))
  }
}
