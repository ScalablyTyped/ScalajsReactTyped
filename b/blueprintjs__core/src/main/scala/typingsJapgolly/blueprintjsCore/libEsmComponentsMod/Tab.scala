package typingsJapgolly.blueprintjsCore.libEsmComponentsMod

import typingsJapgolly.blueprintjsCore.anon.PartialTabProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsTabsTabMod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Tab")
@js.native
open class Tab protected ()
  extends typingsJapgolly.blueprintjsCore.libEsmComponentsTabsTabMod.Tab {
  def this(props: TabProps) = this()
  def this(props: TabProps, context: Any) = this()
}
/* static members */
object Tab {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tab.defaultProps")
  @js.native
  def defaultProps: PartialTabProps = js.native
  inline def defaultProps_=(x: PartialTabProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Tab.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
