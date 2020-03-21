package typingsJapgolly.blueprintjsCore.componentsMod

import typingsJapgolly.blueprintjsCore.AnonHasEverOpened
import typingsJapgolly.blueprintjsCore.overlayMod.IOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", "Overlay")
@js.native
class Overlay ()
  extends typingsJapgolly.blueprintjsCore.overlayMod.Overlay {
  def this(props: IOverlayProps) = this()
  def this(props: IOverlayProps, context: js.Any) = this()
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components", "Overlay")
@js.native
object Overlay extends js.Object {
  var defaultProps: IOverlayProps = js.native
  var displayName: String = js.native
  var getLastOpened: js.Any = js.native
  var openStack: js.Any = js.native
  def getDerivedStateFromProps(hasIsOpen: IOverlayProps): AnonHasEverOpened = js.native
}

