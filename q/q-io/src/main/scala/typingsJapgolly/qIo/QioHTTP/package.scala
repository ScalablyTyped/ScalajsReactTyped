package typingsJapgolly.qIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QioHTTP {
  type Application = js.Function1[
    /* req */ typingsJapgolly.qIo.QioHTTP.Request_, 
    typingsJapgolly.q.mod.Promise[js.Any]
  ]
  type Body = typingsJapgolly.qIo.Qio.Stream
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
}
