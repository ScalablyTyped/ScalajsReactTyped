package typingsJapgolly.gulpJsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JEditor = js.Function2[
    /* mergeWith */ js.Any | (js.Function1[/* json */ js.Any, js.Any]), 
    /* jsBeautifyOptions */ js.UndefOr[typingsJapgolly.jsBeautify.JsBeautifyOptions], 
    typingsJapgolly.node.NodeJS.ReadWriteStream
  ]
}
