package typingsJapgolly.sparkpost

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[
    /* err */ js.Error | typingsJapgolly.sparkpost.mod.SparkPostError | scala.Null, 
    /* res */ typingsJapgolly.sparkpost.mod.Response[T], 
    scala.Unit
  ]
  type Recipient = (typingsJapgolly.sparkpost.mod.RecipientWithAddress | typingsJapgolly.sparkpost.mod.RecipientWithMultichannelAddresses) with typingsJapgolly.sparkpost.mod.BaseRecipient
  type ResultsCallback[T] = typingsJapgolly.sparkpost.mod.Callback[typingsJapgolly.sparkpost.AnonResults[T]]
  type ResultsPromise[T] = js.Promise[typingsJapgolly.sparkpost.AnonResults[T]]
}
