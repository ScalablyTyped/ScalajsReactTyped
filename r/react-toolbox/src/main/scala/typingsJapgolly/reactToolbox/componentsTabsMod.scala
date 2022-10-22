package typingsJapgolly.reactToolbox

import typingsJapgolly.reactToolbox.componentsTabsTabMod.TabProps
import typingsJapgolly.reactToolbox.componentsTabsTabsMod.TabsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTabsMod {
  
  @JSImport("react-toolbox/components/tabs", "Tab")
  @js.native
  open class Tab protected ()
    extends typingsJapgolly.reactToolbox.componentsTabsTabMod.Tab {
    def this(props: TabProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabProps, context: Any) = this()
  }
  
  @JSImport("react-toolbox/components/tabs", "Tabs")
  @js.native
  open class Tabs protected ()
    extends typingsJapgolly.reactToolbox.componentsTabsTabsMod.Tabs {
    def this(props: TabsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TabsProps, context: Any) = this()
  }
}
