package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality to search for chat messages in the ChatMessageStore . */
@js.native
trait ChatSearchReader extends StObject {
  
  /**
    * Returns a batch of found items matching the search criteria.
    * @return A list of items matching the search criteria.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  /**
    * Returns a batch of found items matching the search criteria.
    * @param count The maximum number of items to return.
    * @return A list of items matching the search criteria.
    */
  def readBatchAsync(count: Double): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
}
