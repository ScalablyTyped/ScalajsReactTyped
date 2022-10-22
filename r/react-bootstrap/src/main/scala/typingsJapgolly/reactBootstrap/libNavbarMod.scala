package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.reactBootstrap.mod.Sizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarMod {
  
  @JSImport("react-bootstrap/lib/Navbar", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarProps, js.Object, Any]
  @JSImport("react-bootstrap/lib/Navbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Brand")
  @js.native
  open class Brand ()
    extends typingsJapgolly.reactBootstrap.libNavbarBrandMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Brand")
  @js.native
  def Brand: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarBrandMod.^] = js.native
  inline def Brand_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarBrandMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brand")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Collapse")
  @js.native
  open class Collapse ()
    extends typingsJapgolly.reactBootstrap.libNavbarCollapseMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Collapse")
  @js.native
  def Collapse: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarCollapseMod.^] = js.native
  inline def Collapse_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarCollapseMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Collapse")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Form")
  @js.native
  open class Form ()
    extends Component[NavbarFormProps, js.Object, Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Form")
  @js.native
  def Form: Instantiable0[
    japgolly.scalajs.react.facade.React.Component[NavbarFormProps & js.Object, js.Object]
  ] = js.native
  inline def Form_=(
    x: Instantiable0[
      japgolly.scalajs.react.facade.React.Component[NavbarFormProps & js.Object, js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Form")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Header")
  @js.native
  open class Header ()
    extends typingsJapgolly.reactBootstrap.libNavbarHeaderMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Header")
  @js.native
  def Header: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarHeaderMod.^] = js.native
  inline def Header_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarHeaderMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  open class Link ()
    extends Component[NavbarLinkProps, js.Object, Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Link")
  @js.native
  def Link: Instantiable0[
    japgolly.scalajs.react.facade.React.Component[NavbarLinkProps & js.Object, js.Object]
  ] = js.native
  inline def Link_=(
    x: Instantiable0[
      japgolly.scalajs.react.facade.React.Component[NavbarLinkProps & js.Object, js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Text")
  @js.native
  open class Text ()
    extends Component[NavbarTextProps, js.Object, Any]
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Text")
  @js.native
  def Text: Instantiable0[
    japgolly.scalajs.react.facade.React.Component[NavbarTextProps & js.Object, js.Object]
  ] = js.native
  inline def Text_=(
    x: Instantiable0[
      japgolly.scalajs.react.facade.React.Component[NavbarTextProps & js.Object, js.Object]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap/lib/Navbar", "Toggle")
  @js.native
  open class Toggle ()
    extends typingsJapgolly.reactBootstrap.libNavbarToggleMod.^
  /* static member */
  @JSImport("react-bootstrap/lib/Navbar", "Toggle")
  @js.native
  def Toggle: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarToggleMod.^] = js.native
  inline def Toggle_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libNavbarToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
  
  type Navbar = japgolly.scalajs.react.facade.React.Component[NavbarProps & js.Object, js.Object]
  
  type NavbarForm = japgolly.scalajs.react.facade.React.Component[NavbarFormProps & js.Object, js.Object]
  
  trait NavbarFormProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarFormProps & js.Object, js.Object]
        ] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
    
    var pullLeft: js.UndefOr[Boolean] = js.undefined
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarFormProps {
    
    inline def apply(): NavbarFormProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarFormProps]
    }
    
    extension [Self <: NavbarFormProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setPullLeft(value: Boolean): Self = StObject.set(x, "pullLeft", value.asInstanceOf[js.Any])
      
      inline def setPullLeftUndefined: Self = StObject.set(x, "pullLeft", js.undefined)
      
      inline def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      inline def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
  
  type NavbarLink = japgolly.scalajs.react.facade.React.Component[NavbarLinkProps & js.Object, js.Object]
  
  /**
    * the classes below aren't present in lib/
    */
  trait NavbarLinkProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarLinkProps & js.Object, js.Object]
        ] {
    
    @JSName("href")
    var href_NavbarLinkProps: String
    
    @JSName("onClick")
    var onClick_NavbarLinkProps: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  }
  object NavbarLinkProps {
    
    inline def apply(href: String): NavbarLinkProps = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavbarLinkProps]
    }
    
    extension [Self <: NavbarLinkProps](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: ReactMouseEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  trait NavbarProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarProps & js.Object, js.Object]
        ] {
    
    var brand: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var bsSize: js.UndefOr[Sizes] = js.undefined
    
    var bsStyle: js.UndefOr[String] = js.undefined
    
    var collapseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
    
    var defaultNavExpanded: js.UndefOr[Boolean] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var fixedBottom: js.UndefOr[Boolean] = js.undefined
    
    var fixedTop: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var onToggle: js.UndefOr[js.Function] = js.undefined
    
    var staticTop: js.UndefOr[Boolean] = js.undefined
    
    var toggleButton: js.UndefOr[Any] = js.undefined
    
    // TODO: Add more specific type
    var toggleNavKey: js.UndefOr[String | Double] = js.undefined
  }
  object NavbarProps {
    
    inline def apply(): NavbarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarProps]
    }
    
    extension [Self <: NavbarProps](x: Self) {
      
      inline def setBrand(value: Any): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setBsSize(value: Sizes): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setBsStyle(value: String): Self = StObject.set(x, "bsStyle", value.asInstanceOf[js.Any])
      
      inline def setBsStyleUndefined: Self = StObject.set(x, "bsStyle", js.undefined)
      
      inline def setCollapseOnSelect(value: Boolean): Self = StObject.set(x, "collapseOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCollapseOnSelectUndefined: Self = StObject.set(x, "collapseOnSelect", js.undefined)
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setDefaultNavExpanded(value: Boolean): Self = StObject.set(x, "defaultNavExpanded", value.asInstanceOf[js.Any])
      
      inline def setDefaultNavExpandedUndefined: Self = StObject.set(x, "defaultNavExpanded", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setFixedBottom(value: Boolean): Self = StObject.set(x, "fixedBottom", value.asInstanceOf[js.Any])
      
      inline def setFixedBottomUndefined: Self = StObject.set(x, "fixedBottom", js.undefined)
      
      inline def setFixedTop(value: Boolean): Self = StObject.set(x, "fixedTop", value.asInstanceOf[js.Any])
      
      inline def setFixedTopUndefined: Self = StObject.set(x, "fixedTop", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setOnToggle(value: js.Function): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
      
      inline def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
      
      inline def setStaticTop(value: Boolean): Self = StObject.set(x, "staticTop", value.asInstanceOf[js.Any])
      
      inline def setStaticTopUndefined: Self = StObject.set(x, "staticTop", js.undefined)
      
      inline def setToggleButton(value: Any): Self = StObject.set(x, "toggleButton", value.asInstanceOf[js.Any])
      
      inline def setToggleButtonUndefined: Self = StObject.set(x, "toggleButton", js.undefined)
      
      inline def setToggleNavKey(value: String | Double): Self = StObject.set(x, "toggleNavKey", value.asInstanceOf[js.Any])
      
      inline def setToggleNavKeyUndefined: Self = StObject.set(x, "toggleNavKey", js.undefined)
    }
  }
  
  type NavbarText = japgolly.scalajs.react.facade.React.Component[NavbarTextProps & js.Object, js.Object]
  
  trait NavbarTextProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarTextProps & js.Object, js.Object]
        ] {
    
    var pullRight: js.UndefOr[Boolean] = js.undefined
  }
  object NavbarTextProps {
    
    inline def apply(): NavbarTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarTextProps]
    }
    
    extension [Self <: NavbarTextProps](x: Self) {
      
      inline def setPullRight(value: Boolean): Self = StObject.set(x, "pullRight", value.asInstanceOf[js.Any])
      
      inline def setPullRightUndefined: Self = StObject.set(x, "pullRight", js.undefined)
    }
  }
}
