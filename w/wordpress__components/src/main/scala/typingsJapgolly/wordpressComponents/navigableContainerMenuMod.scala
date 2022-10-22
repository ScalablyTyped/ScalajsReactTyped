package typingsJapgolly.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.navigableContainerMenuMod.NavigableMenu.Props
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.both
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.horizontal
import typingsJapgolly.wordpressComponents.wordpressComponentsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigableContainerMenuMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/navigable-container/menu", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object NavigableMenu {
    
    trait Props
      extends StObject
         with typingsJapgolly.wordpressComponents.navigableContainerTabbableMod.TabbableContainer.Props {
      
      /**
        * The orientation of the menu.
        * @defaultValue "vertical"
        */
      var orientation: js.UndefOr[vertical | horizontal | both] = js.undefined
    }
    object Props {
      
      inline def apply(Props: typingsJapgolly.wordpressComponents.navigableContainerTabbableMod.TabbableContainer.Props): Props = {
        val __obj = js.Dynamic.literal()
        js.Dynamic.global.Object.assign(__obj, Props)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setOrientation(value: vertical | horizontal | both): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
        
        inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      }
    }
  }
}
