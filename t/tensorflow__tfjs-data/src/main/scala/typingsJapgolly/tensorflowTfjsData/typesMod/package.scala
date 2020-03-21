package typingsJapgolly.tensorflowTfjsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ContainerOrT[T] = typingsJapgolly.tensorflowTfjsData.typesMod.Container[T] | T
  type DataElement = typingsJapgolly.tensorflowTfjsCore.tensorTypesMod.TensorContainer
  type FileElement = org.scalajs.dom.raw.File | org.scalajs.dom.raw.Blob | scala.scalajs.js.typedarray.Uint8Array
}
