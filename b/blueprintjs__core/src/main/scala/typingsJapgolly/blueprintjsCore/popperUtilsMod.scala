package typingsJapgolly.blueprintjsCore

import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.bottom
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.center
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.left
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.right
import typingsJapgolly.blueprintjsCore.blueprintjsCoreStrings.top
import typingsJapgolly.popperJs.mod.Popper.Data
import typingsJapgolly.popperJs.mod.Popper.ModifierFn
import typingsJapgolly.popperJs.mod.Popper.Placement
import typingsJapgolly.popperJs.mod.Popper.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components/popover/popperUtils", JSImport.Namespace)
@js.native
object popperUtilsMod extends js.Object {
  val arrowOffsetModifier: ModifierFn = js.native
  def getAlignment(placement: Placement): center | left | right = js.native
  def getOppositePosition(side: Position): left | right | bottom | top = js.native
  def getPosition(placement: Placement): left | right | bottom | top = js.native
  def getTransformOrigin(data: Data): String = js.native
  def isVerticalPosition(side: Position): Boolean = js.native
}

