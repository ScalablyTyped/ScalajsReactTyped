package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.componentsDrawerDrawerMod.DrawerCommonProps
import typingsJapgolly.reactToolbox.reactToolboxStrings.lg
import typingsJapgolly.reactToolbox.reactToolboxStrings.lgTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.md
import typingsJapgolly.reactToolbox.reactToolboxStrings.sm
import typingsJapgolly.reactToolbox.reactToolboxStrings.smTablet
import typingsJapgolly.reactToolbox.reactToolboxStrings.xl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxl
import typingsJapgolly.reactToolbox.reactToolboxStrings.xxxl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLayoutNavDrawerMod {
  
  @JSImport("react-toolbox/components/layout/NavDrawer", "NavDrawer")
  @js.native
  open class NavDrawer protected ()
    extends Component[NavDrawerProps, js.Object, Any] {
    def this(props: NavDrawerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NavDrawerProps, context: Any) = this()
  }
  
  trait NavDrawerProps
    extends StObject
       with DrawerCommonProps {
    
    /**
      * If true, when the `AppBar` gets pinned, it will stand over the `Drawer`.
      * @default false
      */
    var clipped: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The breakpoint at which the drawer is automatically pinned.
      */
    var permanentAt: js.UndefOr[sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl] = js.undefined
    
    /**
      * If true, the drawer will be pinned open. pinned takes precedence over active.
      * @default false
      */
    var pinned: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[NavDrawerTheme] = js.undefined
  }
  object NavDrawerProps {
    
    inline def apply(): NavDrawerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavDrawerProps]
    }
    
    extension [Self <: NavDrawerProps](x: Self) {
      
      inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      inline def setPermanentAt(value: sm | smTablet | md | lg | lgTablet | xl | xxl | xxxl): Self = StObject.set(x, "permanentAt", value.asInstanceOf[js.Any])
      
      inline def setPermanentAtUndefined: Self = StObject.set(x, "permanentAt", js.undefined)
      
      inline def setPinned(value: Boolean): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
      
      inline def setTheme(value: NavDrawerTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait NavDrawerTheme extends StObject {
    
    /**
      * Added to the root class when it is clipped.
      */
    var clipped: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root class when it is pinned.
      */
    var pinned: js.UndefOr[String] = js.undefined
  }
  object NavDrawerTheme {
    
    inline def apply(): NavDrawerTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavDrawerTheme]
    }
    
    extension [Self <: NavDrawerTheme](x: Self) {
      
      inline def setClipped(value: String): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
      
      inline def setClippedUndefined: Self = StObject.set(x, "clipped", js.undefined)
      
      inline def setPinned(value: String): Self = StObject.set(x, "pinned", value.asInstanceOf[js.Any])
      
      inline def setPinnedUndefined: Self = StObject.set(x, "pinned", js.undefined)
    }
  }
}
