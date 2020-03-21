package typingsJapgolly.useSidecar

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.useSidecar.typesMod.Importer
import typingsJapgolly.useSidecar.typesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/hook", JSImport.Namespace)
@js.native
object hookMod extends js.Object {
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = js.native
}

