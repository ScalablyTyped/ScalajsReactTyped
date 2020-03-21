package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.AnonAnimationState
import typingsJapgolly.blueprintjsCore.AnonHeight
import typingsJapgolly.blueprintjsCore.collapseMod.ICollapseProps
import typingsJapgolly.blueprintjsCore.collapseMod.ICollapseState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "Collapse")
@js.native
class Collapse ()
  extends typingsJapgolly.blueprintjsCore.componentsMod.Collapse

/* static members */
@JSImport("@blueprintjs/core", "Collapse")
@js.native
object Collapse extends js.Object {
  var defaultProps: ICollapseProps = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(props: ICollapseProps, state: ICollapseState): AnonAnimationState | AnonHeight = js.native
}

