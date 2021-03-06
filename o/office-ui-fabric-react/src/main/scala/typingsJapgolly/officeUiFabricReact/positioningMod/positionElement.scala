package typingsJapgolly.officeUiFabricReact.positioningMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.IPositionProps
import typingsJapgolly.officeUiFabricReact.positioningTypesMod.IPositionedData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning", "positionElement")
@js.native
object positionElement extends js.Object {
  def apply(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): IPositionedData = js.native
  def apply(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: IPositionedData
  ): IPositionedData = js.native
}

