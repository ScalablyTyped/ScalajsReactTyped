package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait StorageManager extends StObject {
  
  /* standard dom */
  def estimate(): js.Promise[StorageEstimate]
  
  /* standard dom */
  def getDirectory(): js.Promise[FileSystemDirectoryHandle]
  
  /* standard dom */
  def persist(): js.Promise[scala.Boolean]
  
  /* standard dom */
  def persisted(): js.Promise[scala.Boolean]
}
object StorageManager {
  
  inline def apply(
    estimate: CallbackTo[js.Promise[StorageEstimate]],
    getDirectory: CallbackTo[js.Promise[FileSystemDirectoryHandle]],
    persist: CallbackTo[js.Promise[scala.Boolean]],
    persisted: CallbackTo[js.Promise[scala.Boolean]]
  ): StorageManager = {
    val __obj = js.Dynamic.literal(estimate = estimate.toJsFn, getDirectory = getDirectory.toJsFn, persist = persist.toJsFn, persisted = persisted.toJsFn)
    __obj.asInstanceOf[StorageManager]
  }
  
  extension [Self <: StorageManager](x: Self) {
    
    inline def setEstimate(value: CallbackTo[js.Promise[StorageEstimate]]): Self = StObject.set(x, "estimate", value.toJsFn)
    
    inline def setGetDirectory(value: CallbackTo[js.Promise[FileSystemDirectoryHandle]]): Self = StObject.set(x, "getDirectory", value.toJsFn)
    
    inline def setPersist(value: CallbackTo[js.Promise[scala.Boolean]]): Self = StObject.set(x, "persist", value.toJsFn)
    
    inline def setPersisted(value: CallbackTo[js.Promise[scala.Boolean]]): Self = StObject.set(x, "persisted", value.toJsFn)
  }
}
