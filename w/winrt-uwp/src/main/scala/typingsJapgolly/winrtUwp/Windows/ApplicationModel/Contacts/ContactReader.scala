package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to read Contact objects in batches from the ContactStore which may be local or remotely located. */
trait ContactReader extends StObject {
  
  /**
    * Gets the reason a Contact matched the search query. Returns the properties and substrings that match.
    * @param contact The Contact for which to get the matching properties.
    * @return The list of matching properties and match reasons.
    */
  def getMatchingPropertiesWithMatchReason(contact: Contact): IVectorView[ContactMatchReason]
  
  /**
    * Asynchronously reads a batch of Contact objects from the ContactStore .
    * @return The batch of contacts read from the ContactStore .
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[ContactBatch]
}
object ContactReader {
  
  inline def apply(
    getMatchingPropertiesWithMatchReason: Contact => IVectorView[ContactMatchReason],
    readBatchAsync: CallbackTo[IPromiseWithIAsyncOperation[ContactBatch]]
  ): ContactReader = {
    val __obj = js.Dynamic.literal(getMatchingPropertiesWithMatchReason = js.Any.fromFunction1(getMatchingPropertiesWithMatchReason), readBatchAsync = readBatchAsync.toJsFn)
    __obj.asInstanceOf[ContactReader]
  }
  
  extension [Self <: ContactReader](x: Self) {
    
    inline def setGetMatchingPropertiesWithMatchReason(value: Contact => IVectorView[ContactMatchReason]): Self = StObject.set(x, "getMatchingPropertiesWithMatchReason", js.Any.fromFunction1(value))
    
    inline def setReadBatchAsync(value: CallbackTo[IPromiseWithIAsyncOperation[ContactBatch]]): Self = StObject.set(x, "readBatchAsync", value.toJsFn)
  }
}
