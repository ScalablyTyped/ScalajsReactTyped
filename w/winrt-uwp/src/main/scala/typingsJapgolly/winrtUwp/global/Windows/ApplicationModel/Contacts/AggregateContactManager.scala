package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Contacts

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for linking individual (raw) contacts across services together into a single aggregate contact. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Contacts.AggregateContactManager")
@js.native
open class AggregateContactManager ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.AggregateContactManager {
  
  /**
    * Returns the list of individual (raw) contacts from the specified aggregate contact.
    * @param contact The aggregate contact from which to extract the list of raw contacts.
    * @return The list of individual (raw) contacts from the specified aggregate contact.
    */
  /* CompleteClass */
  override def findRawContactsAsync(contact: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact): IPromiseWithIAsyncOperation[IVectorView[Any]] = js.native
  
  /**
    * Asynchronously attempts to link contacts together to make an aggregate contact.
    * @param primaryContact The first contact to link.
    * @param secondaryContact The second contact to link to the primaryContact.
    * @return The newly created aggregate contact.
    */
  /* CompleteClass */
  override def tryLinkContactsAsync(
    primaryContact: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    secondaryContact: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact
  ): IPromiseWithIAsyncOperation[typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact] = js.native
  
  /**
    * Chooses which of the raw contacts provides the main display picture for the aggregate.
    * @param aggregateContact The aggregate contact on which to set the picture.
    * @param rawContact The raw contact that provides the picture for the aggregate.
    * @return True if successful, otherwise false.
    */
  /* CompleteClass */
  override def trySetPreferredSourceForPictureAsync(
    aggregateContact: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact,
    rawContact: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact
  ): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Asynchronously unlinks a raw contact from the parent aggregate contact.
    * @param contact The raw contact to remove from the aggregate.
    * @return An async action that indicates the operation is complete.
    */
  /* CompleteClass */
  override def unlinkRawContactAsync(contact: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Contacts.Contact): IPromiseWithIAsyncAction = js.native
}
