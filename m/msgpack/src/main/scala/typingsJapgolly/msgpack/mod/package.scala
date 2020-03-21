package typingsJapgolly.msgpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MsgPackDownloadCallback = js.Function3[
    /* data */ js.Any, 
    /* option */ typingsJapgolly.msgpack.mod.MsgPackDownloadOption, 
    /* result */ typingsJapgolly.msgpack.mod.MsgPackCallbackResult, 
    scala.Unit
  ]
  type MsgPackUploadCallback = js.Function3[
    /* data */ java.lang.String, 
    /* option */ typingsJapgolly.msgpack.mod.MsgPackUploadOption, 
    /* result */ typingsJapgolly.msgpack.mod.MsgPackCallbackResult, 
    scala.Unit
  ]
}
