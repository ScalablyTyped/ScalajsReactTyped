package typingsJapgolly.useSidecar

import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.useSidecar.typesMod.Importer
import typingsJapgolly.useSidecar.typesMod.SideCarHOC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar/dist/es5/hoc", JSImport.Namespace)
@js.native
object hocMod extends js.Object {
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: Node): FunctionComponent[T with SideCarHOC] = js.native
}

