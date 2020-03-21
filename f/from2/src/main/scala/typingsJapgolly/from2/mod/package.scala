package typingsJapgolly.from2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Chunk = java.lang.String | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | scala.Null
  type From2Ctor[R /* <: typingsJapgolly.from2.mod.ReadInput | typingsJapgolly.from2.mod.ReadObjectInput */] = org.scalablytyped.runtime.Instantiable1[/* read */ R, typingsJapgolly.node.NodeJS.ReadableStream]
  type NextCallback = js.Function2[
    /* err */ js.UndefOr[js.Any], 
    /* chunk */ typingsJapgolly.from2.mod.Chunk, 
    scala.Unit
  ]
  type NextObjectCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* chunk */ js.Any, scala.Unit]
  type ReadCallback[N /* <: typingsJapgolly.from2.mod.NextCallback | typingsJapgolly.from2.mod.NextObjectCallback */] = js.Function2[/* size */ scala.Double, /* next */ N, scala.Unit]
  type ReadInput = typingsJapgolly.from2.mod.ReadCallback[typingsJapgolly.from2.mod.NextCallback] | js.Array[typingsJapgolly.from2.mod.Chunk]
  type ReadObjectInput = typingsJapgolly.from2.mod.ReadCallback[typingsJapgolly.from2.mod.NextObjectCallback] | js.Array[js.Any]
}
