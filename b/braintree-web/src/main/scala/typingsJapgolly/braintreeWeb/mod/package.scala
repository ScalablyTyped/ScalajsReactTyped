package typingsJapgolly.braintreeWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BraintreeError = typingsJapgolly.braintreeWeb.mod.BraintreeError_
  /**
    * @global
    * @callback callback
    * @param {?BraintreeError} [err] `null` or `undefined` if there was no error.
    * @param {?any} [data] The successful result of the asynchronous function call (if data exists).
    * @description The Node.js-style callback pattern used throughout the SDK.
    * @returns {void}
    */
  type callback = js.Function2[
    /* err */ js.UndefOr[typingsJapgolly.braintreeWeb.mod.BraintreeError], 
    /* data */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
