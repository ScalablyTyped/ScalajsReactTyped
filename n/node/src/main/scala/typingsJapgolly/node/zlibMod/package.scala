package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object zlibMod {
  import typingsJapgolly.node.Buffer
  import typingsJapgolly.node.Error
  import typingsJapgolly.node.NodeJS.ArrayBufferView
  import typingsJapgolly.std.ArrayBuffer

  type CompressCallback = js.Function2[/* error */ Error | Null, /* result */ Buffer, Unit]
  type InputType = java.lang.String | ArrayBuffer | ArrayBufferView
}
