package typingsJapgolly.materialUi

import typingsJapgolly.materialUi.MaterialUI.Tabs.TabProps
import typingsJapgolly.materialUi.MaterialUI.Tabs.TabsProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod {
  
  @JSImport("material-ui/Tabs", JSImport.Default)
  @js.native
  open class default () extends Tabs
  
  @JSImport("material-ui/Tabs", "Tab")
  @js.native
  open class Tab ()
    extends Component[TabProps, js.Object, Any]
  
  @JSImport("material-ui/Tabs", "Tabs")
  @js.native
  open class Tabs ()
    extends Component[TabsProps, js.Object, Any]
}
