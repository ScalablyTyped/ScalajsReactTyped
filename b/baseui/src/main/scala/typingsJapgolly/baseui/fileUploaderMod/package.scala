package typingsJapgolly.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileUploaderMod {
  type DropFileEventHandler = js.Function2[
    /* acceptedOrRejected */ js.Array[org.scalajs.dom.raw.File], 
    /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement], 
    js.Any
  ]
  type DropFilesEventHandler = js.Function3[
    /* accepted */ js.Array[org.scalajs.dom.raw.File], 
    /* rejected */ js.Array[org.scalajs.dom.raw.File], 
    /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement], 
    js.Any
  ]
  type GetDataTransferItems = js.Function1[
    /* event */ japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element], 
    js.Promise[js.Array[org.scalajs.dom.raw.File | typingsJapgolly.std.DataTransferItem]]
  ]
}
