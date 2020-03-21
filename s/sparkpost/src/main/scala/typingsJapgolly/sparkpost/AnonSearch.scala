package typingsJapgolly.sparkpost

import typingsJapgolly.sparkpost.mod.MessageEvent
import typingsJapgolly.sparkpost.mod.MessageEventParameters
import typingsJapgolly.sparkpost.mod.ResultsCallback
import typingsJapgolly.sparkpost.mod.ResultsPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSearch extends js.Object {
  /**
    * Retrieves list of message events according to given params
    * @param parameters Query parameters
    * @returns Promise The MessageEvent results array
    */
  def search(parameters: MessageEventParameters): ResultsPromise[js.Array[MessageEvent]] = js.native
  /**
    * Retrieves list of message events according to given params
    * @param parameters Query parameters
    * @param callback The request callback with MessageEvent results array
    */
  def search(parameters: MessageEventParameters, callback: ResultsCallback[js.Array[MessageEvent]]): Unit = js.native
}

