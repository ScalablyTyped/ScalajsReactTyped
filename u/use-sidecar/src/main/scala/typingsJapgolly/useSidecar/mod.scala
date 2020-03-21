package typingsJapgolly.useSidecar

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.useSidecar.renderPropMod.CombinedProps
import typingsJapgolly.useSidecar.renderPropMod.Options
import typingsJapgolly.useSidecar.renderPropMod.RenderPropComponent
import typingsJapgolly.useSidecar.typesMod.Importer
import typingsJapgolly.useSidecar.typesMod.MiddlewareCallback
import typingsJapgolly.useSidecar.typesMod.SideCarComponent
import typingsJapgolly.useSidecar.typesMod.SideCarHOC
import typingsJapgolly.useSidecar.typesMod.SideCarMedium
import typingsJapgolly.useSidecar.typesMod.SideCarMediumOptions
import typingsJapgolly.useSidecar.typesMod.SideMedium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("use-sidecar", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createMedium[T](): SideMedium[T] = js.native
  def createMedium[T](defaults: T): SideMedium[T] = js.native
  def createMedium[T](defaults: T, middleware: MiddlewareCallback[T]): SideMedium[T] = js.native
  def createSidecarMedium(): ReadonlySideCarMedium = js.native
  def createSidecarMedium(options: SideCarMediumOptions): ReadonlySideCarMedium = js.native
  def exportSidecar[T](medium: SideCarMedium, exported: ComponentType[T]): SideCarComponent[T] = js.native
  def renderCar[T /* <: js.Array[_] */, K](WrappedComponent: RenderPropComponent[T, K], defaults: js.Function1[/* props */ K, T]): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def renderCar[T /* <: js.Array[_] */, K](
    WrappedComponent: RenderPropComponent[T, K],
    defaults: js.Function1[/* props */ K, T],
    options: Options
  ): js.Function1[/* props */ CombinedProps[T, K], Element] = js.native
  def setConfig(conf: PartialIConfig): Unit = js.native
  def sidecar[T](importer: Importer[T]): FunctionComponent[T with SideCarHOC] = js.native
  def sidecar[T](importer: Importer[T], errorComponent: Node): FunctionComponent[T with SideCarHOC] = js.native
  def useSidecar[T](importer: Importer[T]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = js.native
  def useSidecar[T](importer: Importer[T], effect: SideMedium[_]): js.Tuple2[ComponentType[T] | Null, js.Error | Null] = js.native
}

