package typingsJapgolly.reactMdBadge

import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBadgeMod {
  
  @JSImport("@react-md/badge/types/Badge", "Badge")
  @js.native
  val Badge: ForwardRefExoticComponent[BadgeProps & RefAttributes[HTMLSpanElement]] = js.native
  
  trait BadgeProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    /**
      * Boolean if the badge should still display if the children is set to `0`, or
      * `null`.  The default behavior is to render null for these cases since it
      * isn't extremely helpful to display an "empty" badge.
      */
    var disableNullOnZero: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The id for the badge. This is required for a11y since the element that the
      * badge is fixed to should include this id in the `aria-describedby` list.
      */
    @JSName("id")
    var id_BadgeProps: String
    
    /**
      * The theme to use for the badge.
      */
    var theme: js.UndefOr[BadgeTheme] = js.undefined
  }
  object BadgeProps {
    
    inline def apply(id: String): BadgeProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadgeProps]
    }
    
    extension [Self <: BadgeProps](x: Self) {
      
      inline def setDisableNullOnZero(value: Boolean): Self = StObject.set(x, "disableNullOnZero", value.asInstanceOf[js.Any])
      
      inline def setDisableNullOnZeroUndefined: Self = StObject.set(x, "disableNullOnZero", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: BadgeTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdBadge.reactMdBadgeStrings.primary
    - typingsJapgolly.reactMdBadge.reactMdBadgeStrings.secondary
    - typingsJapgolly.reactMdBadge.reactMdBadgeStrings.default
    - typingsJapgolly.reactMdBadge.reactMdBadgeStrings.clear
  */
  trait BadgeTheme extends StObject
  object BadgeTheme {
    
    inline def default: typingsJapgolly.reactMdBadge.reactMdBadgeStrings.default = "default".asInstanceOf[typingsJapgolly.reactMdBadge.reactMdBadgeStrings.default]
    
    inline def clear: typingsJapgolly.reactMdBadge.reactMdBadgeStrings.clear = "clear".asInstanceOf[typingsJapgolly.reactMdBadge.reactMdBadgeStrings.clear]
    
    inline def primary: typingsJapgolly.reactMdBadge.reactMdBadgeStrings.primary = "primary".asInstanceOf[typingsJapgolly.reactMdBadge.reactMdBadgeStrings.primary]
    
    inline def secondary: typingsJapgolly.reactMdBadge.reactMdBadgeStrings.secondary = "secondary".asInstanceOf[typingsJapgolly.reactMdBadge.reactMdBadgeStrings.secondary]
  }
}
