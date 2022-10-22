package typingsJapgolly.blueprintjsCore.mod

import typingsJapgolly.blueprintjsCore.anon.PartialTabsProps
import typingsJapgolly.blueprintjsCore.anon.SelectedTabId
import typingsJapgolly.blueprintjsCore.anon.TypeofTab
import typingsJapgolly.blueprintjsCore.libEsmComponentsTabsTabsMod.TabsProps
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tabs")
@js.native
open class Tabs protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsMod.Tabs {
  def this(props: TabsProps) = this()
}
/* static members */
object Tabs {
  
  @JSImport("@blueprintjs/core", "Tabs")
  @js.native
  val ^ : js.Any = js.native
  
  /** Insert a `Tabs.Expander` between any two children to right-align all subsequent children. */
  @JSImport("@blueprintjs/core", "Tabs.Expander")
  @js.native
  def Expander: FC[js.Object] = js.native
  inline def Expander_=(x: FC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Expander")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Tabs.Tab")
  @js.native
  def Tab: TypeofTab = js.native
  inline def Tab_=(x: TypeofTab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Tabs.defaultProps")
  @js.native
  def defaultProps: PartialTabsProps = js.native
  inline def defaultProps_=(x: PartialTabsProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Tabs.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  inline def getDerivedStateFromProps(hasSelectedTabId: TabsProps): SelectedTabId | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasSelectedTabId.asInstanceOf[js.Any]).asInstanceOf[SelectedTabId | Null]
}
