package typingsJapgolly.sparkpost.anon

import typingsJapgolly.sparkpost.mod.MessageEvent
import typingsJapgolly.sparkpost.mod.MessageEventParameters
import typingsJapgolly.sparkpost.mod.ResultsCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Search extends StObject {
  
  /**
    * Retrieves list of message events according to given params
    * @param parameters Query parameters
    * @returns Promise The MessageEvent results array
    */
  def search(parameters: MessageEventParameters): js.Promise[Results[js.Array[MessageEvent]]] = js.native
  /**
    * Retrieves list of message events according to given params
    * @param parameters Query parameters
    * @param callback The request callback with MessageEvent results array
    */
  def search(parameters: MessageEventParameters, callback: ResultsCallback[js.Array[MessageEvent]]): Unit = js.native
}
