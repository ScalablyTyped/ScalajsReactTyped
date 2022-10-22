package typingsJapgolly.winrtUwp.global.Windows.Storage

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a write transaction for a random-access stream. */
/* note: abstract class */ @JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
open class StorageStreamTransaction ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Storage.StorageStreamTransaction {
  
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /**
    * Save the stream to the underlying file.
    * @return No object or value is returned by this method.
    */
  /* CompleteClass */
  override def commitAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the random-access stream used in the transaction. */
  /* CompleteClass */
  var stream: IRandomAccessStream = js.native
}
