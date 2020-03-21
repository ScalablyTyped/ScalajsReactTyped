package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loginWithAmazonSdkBrowser {
  type AuthorizeScope = typingsJapgolly.loginWithAmazonSdkBrowser.AuthorizationScopeOptions | js.Array[typingsJapgolly.loginWithAmazonSdkBrowser.AuthorizationScopeOptions]
  /**
    * Type of callback invoked after `authorize` completes.
    */
  type NextCallback[T /* <: typingsJapgolly.loginWithAmazonSdkBrowser.AuthorizeRequest */] = js.Function1[/* response */ T, scala.Unit]
  type RetrieveProfileCallback = js.Function1[
    /* response */ typingsJapgolly.loginWithAmazonSdkBrowser.RetrieveProfileResponse, 
    scala.Unit
  ]
}
