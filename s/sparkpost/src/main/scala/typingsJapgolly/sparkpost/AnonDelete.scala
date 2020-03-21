package typingsJapgolly.sparkpost

import typingsJapgolly.sparkpost.mod.Callback
import typingsJapgolly.sparkpost.mod.CreateRecipientList
import typingsJapgolly.sparkpost.mod.RecipientList
import typingsJapgolly.sparkpost.mod.RecipientListMetadata
import typingsJapgolly.sparkpost.mod.RecipientListWithRecipients
import typingsJapgolly.sparkpost.mod.ResultsCallback
import typingsJapgolly.sparkpost.mod.ResultsPromise
import typingsJapgolly.sparkpost.mod.UpdateRecipientList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelete extends js.Object {
  /**
    * Create a recipient list by providing a recipient list object as the POST request body.
    * At a minimum, the “recipients” array is required, which must contain a valid “address”.
    * If the recipient list “id” is not provided in the POST request body, one will be generated and returned in the results body.
    * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
    * @param options The create options
    * @returns Promise metadata results
    */
  def create(options: CreateRecipientList): ResultsPromise[RecipientListMetadata] = js.native
  /**
    * Create a recipient list by providing a recipient list object as the POST request body.
    * At a minimum, the “recipients” array is required, which must contain a valid “address”.
    * If the recipient list “id” is not provided in the POST request body, one will be generated and returned in the results body.
    * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
    * @param options The create options
    * @param callback The request callback with metadata results
    */
  def create(options: CreateRecipientList, callback: ResultsCallback[RecipientListMetadata]): Unit = js.native
  /**
    * Permanently delete the specified recipient list.
    *
    * @param id The list id
    * @returns Promise void
    */
  def delete(id: String): js.Promise[Unit] = js.native
  /**
    * Permanently delete the specified recipient list.
    *
    * @param id The list id
    * @param callback The request callback
    */
  def delete(id: String, callback: Callback[Unit]): Unit = js.native
  /**
    * Retrieve details about a specified recipient list by specifying its id in the URI path.
    * To retrieve the recipients contained in a list, the show_recipients parameter must be set to true.
    *
    * @param [options] specifies whether to retrieve the recipients. Defaults to false
    */
  def get(id: String): ResultsPromise[RecipientListWithRecipients] = js.native
  /**
    * Retrieve details about a specified recipient list by specifying its id in the URI path.
    * To retrieve the recipients contained in a list, the show_recipients parameter must be set to true.
    *
    */
  def get(id: String, callback: Callback[RecipientListWithRecipients]): Unit = js.native
  def get(id: String, options: AnonShowrecipients): ResultsPromise[RecipientListWithRecipients] = js.native
  /**
    * Retrieve details about a specified recipient list by specifying its id in the URI path.
    * To retrieve the recipients contained in a list, the show_recipients parameter must be set to true.
    *
    * @param specifies whether to retrieve the recipients. Defaults to false
    */
  def get(id: String, options: AnonShowrecipients, callback: Callback[RecipientListWithRecipients]): Unit = js.native
  /**
    * List a summary of all recipient lists. The recipients for each list are not included in the results.
    * To retrieve recipient details, use the [Retrieve a Recipient List endpoint]{@link https://developers.sparkpost.com/api/recipient-lists.html#recipient-lists-retrieve-get},
    * and specify the recipient list.
    *
    * @returns Promise The RecipientList results array
    */
  def list(): ResultsPromise[js.Array[RecipientList]] = js.native
  /**
    * List a summary of all recipient lists. The recipients for each list are not included in the results.
    * To retrieve recipient details, use the [Retrieve a Recipient List endpoint]{@link https://developers.sparkpost.com/api/recipient-lists.html#recipient-lists-retrieve-get},
    * and specify the recipient list.
    *
    * @param callback The request callback with RecipientList results array
    */
  def list(callback: ResultsCallback[js.Array[RecipientList]]): Unit = js.native
  /**
    * Update an existing recipient list by specifying its ID in the URI path and use a recipient list object as the PUT request body.
    * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
    *
    * @param id Identifier of the recipient list
    */
  def update(id: String, options: UpdateRecipientList): ResultsPromise[RecipientListMetadata] = js.native
  /**
    * Update an existing recipient list by specifying its ID in the URI path and use a recipient list object as the PUT request body.
    * Use the num_rcpt_errors parameter to limit the number of recipient errors returned.
    *
    * @param id Identifier of the recipient list
    * @param options The update options
    * @param callback The request callback with metadata results
    */
  def update(id: String, options: UpdateRecipientList, callback: ResultsCallback[RecipientListMetadata]): Unit = js.native
}

