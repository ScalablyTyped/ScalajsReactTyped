package typingsJapgolly.bmpJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Decode_ = js.Function1[/* bmpData */ typingsJapgolly.node.Buffer, typingsJapgolly.bmpJs.mod.BmpDecoder]
  type Encode_ = js.Function2[
    /* imgData */ typingsJapgolly.bmpJs.mod.ImageData, 
    /* quality */ js.UndefOr[scala.Double], 
    typingsJapgolly.bmpJs.mod.ImageData
  ]
}
