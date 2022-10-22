package typingsJapgolly.reactNavigationDrawer

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedback
import typingsJapgolly.reactNavigationDrawer.anon.Borderless
import typingsJapgolly.reactNavigationDrawer.anon.PressColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcViewsTouchableItemMod {
  
  @JSImport("react-navigation-drawer/lib/typescript/src/views/TouchableItem", JSImport.Default)
  @js.native
  open class default () extends TouchableItem
  /* static members */
  object default {
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/TouchableItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-drawer/lib/typescript/src/views/TouchableItem", "default.defaultProps")
    @js.native
    def defaultProps: PressColor = js.native
    inline def defaultProps_=(x: PressColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentProps[Instantiable0[TouchableWithoutFeedback]] & Borderless
  
  @js.native
  trait TouchableItem
    extends Component[Props, js.Object, Any]
}
