package typingsJapgolly.reactBulmaComponents

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.anon.Brand
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.bottom
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.large
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.left
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.nav
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.right
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.top
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsNavbarMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/navbar", JSImport.Default)
  @js.native
  val default: (BulmaComponent[NavbarProps, nav]) & Brand = js.native
  
  trait NavbarBurgerProps extends StObject {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NavbarBurgerProps {
    
    inline def apply(): NavbarBurgerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarBurgerProps]
    }
    
    extension [Self <: NavbarBurgerProps](x: Self) {
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait NavbarContainerProps extends StObject {
    
    var align: js.UndefOr[left | right] = js.undefined
  }
  object NavbarContainerProps {
    
    inline def apply(): NavbarContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarContainerProps]
    }
    
    extension [Self <: NavbarContainerProps](x: Self) {
      
      inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
  
  trait NavbarDropdownProps extends StObject {
    
    var boxed: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Boolean] = js.undefined
    
    var up: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarDropdownProps {
    
    inline def apply(): NavbarDropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarDropdownProps]
    }
    
    extension [Self <: NavbarDropdownProps](x: Self) {
      
      inline def setBoxed(value: Boolean): Self = StObject.set(x, "boxed", value.asInstanceOf[js.Any])
      
      inline def setBoxedUndefined: Self = StObject.set(x, "boxed", js.undefined)
      
      inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
  
  trait NavbarItemProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var hoverable: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarItemProps {
    
    inline def apply(): NavbarItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarItemProps]
    }
    
    extension [Self <: NavbarItemProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
    }
  }
  
  trait NavbarLinkProps extends StObject {
    
    var arrowless: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarLinkProps {
    
    inline def apply(): NavbarLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarLinkProps]
    }
    
    extension [Self <: NavbarLinkProps](x: Self) {
      
      inline def setArrowless(value: Boolean): Self = StObject.set(x, "arrowless", value.asInstanceOf[js.Any])
      
      inline def setArrowlessUndefined: Self = StObject.set(x, "arrowless", js.undefined)
    }
  }
  
  trait NavbarProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[Color] = js.undefined
    
    var fixed: js.UndefOr[top | bottom] = js.undefined
    
    var size: js.UndefOr[large] = js.undefined
    
    var transparent: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarProps {
    
    inline def apply(): NavbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarProps]
    }
    
    extension [Self <: NavbarProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFixed(value: top | bottom): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setSize(value: large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
      
      inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[NavbarProps, nav]) & Brand
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsNavbarMod.foo` */
  override def _to: (BulmaComponent[NavbarProps, nav]) & Brand = default
}
