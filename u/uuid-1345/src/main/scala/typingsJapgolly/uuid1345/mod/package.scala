package typingsJapgolly.uuid1345

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ASCIICallback = js.Function2[/* error */ java.lang.String, /* result */ java.lang.String, scala.Unit]
  type BinaryCallback = js.Function2[/* error */ java.lang.String, /* result */ typingsJapgolly.node.Buffer, scala.Unit]
  type ObjectCallback = js.Function2[
    /* error */ java.lang.String, 
    /* result */ typingsJapgolly.uuid1345.mod.UUID, 
    scala.Unit
  ]
  type UuidTypes = java.lang.String | typingsJapgolly.node.Buffer | typingsJapgolly.uuid1345.mod.UUID
}
