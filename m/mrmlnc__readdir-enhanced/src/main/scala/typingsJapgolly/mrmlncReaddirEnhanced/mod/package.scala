package typingsJapgolly.mrmlncReaddirEnhanced

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ typingsJapgolly.node.NodeJS.ErrnoException, /* result */ T, scala.Unit]
  type CallbackEntry = typingsJapgolly.mrmlncReaddirEnhanced.mod.Callback[js.Array[typingsJapgolly.mrmlncReaddirEnhanced.mod.Entry]]
  type CallbackString = typingsJapgolly.mrmlncReaddirEnhanced.mod.Callback[js.Array[java.lang.String]]
  type FilterFunction = js.Function1[/* stat */ typingsJapgolly.mrmlncReaddirEnhanced.mod.Entry, scala.Boolean]
}
