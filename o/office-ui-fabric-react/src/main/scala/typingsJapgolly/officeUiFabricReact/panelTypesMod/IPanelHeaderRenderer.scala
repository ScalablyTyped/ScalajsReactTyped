package typingsJapgolly.officeUiFabricReact.panelTypesMod

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanelHeaderRenderer extends IRenderFunction[IPanelProps] {
  /**
    * @param props - Props given to the panel
    * @param defaultRender - Default header renderer. If using this renderer in code that does not
    * assign `headerTextId` to an element elsewhere, it **must** be passed to this function.
    * @param headerTextId - If provided, this **must** be used as the ID of an element containing the
    * panel's title, because the panel popup uses this ID as its aria-labelledby.
    */
  def apply(): Element | Null = js.native
  def apply(props: IPanelProps): Element | Null = js.native
  def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer): Element | Null = js.native
  def apply(props: IPanelProps, defaultRender: IPanelHeaderRenderer, headerTextId: String): Element | Null = js.native
}

