package typingsJapgolly.blueprintjsCore.componentsMod

import typingsJapgolly.blueprintjsCore.AnonSelectedTabId
import typingsJapgolly.blueprintjsCore.PartialITabsProps
import typingsJapgolly.blueprintjsCore.TypeofTab
import typingsJapgolly.blueprintjsCore.tabsMod.ITabsProps
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
@js.native
class Tabs ()
  extends typingsJapgolly.blueprintjsCore.tabsMod.Tabs {
  def this(props: ITabsProps) = this()
}

/* static members */
@JSImport("@blueprintjs/core/lib/esm/components", "Tabs")
@js.native
object Tabs extends js.Object {
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  var Expander: FunctionComponent[js.Object] = js.native
  var Tab: TypeofTab = js.native
  var defaultProps: PartialITabsProps = js.native
  var displayName: String = js.native
  def getDerivedStateFromProps(hasSelectedTabId: ITabsProps): AnonSelectedTabId = js.native
}

