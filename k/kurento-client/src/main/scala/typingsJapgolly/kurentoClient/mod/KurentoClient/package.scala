package typingsJapgolly.kurentoClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KurentoClient {
  type Callback[T] = js.Function2[
    /* error */ typingsJapgolly.kurentoClient.mod.KurentoClient.Error, 
    /* result */ T, 
    scala.Unit
  ]
}
