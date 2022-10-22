package typingsJapgolly.materialSwitch

import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialSwitch.adapterMod.MDCSwitchAdapter
import typingsJapgolly.materialSwitch.anon.PartialMDCSwitchAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/switch", "CssClasses")
  @js.native
  object CssClasses extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialSwitch.constantsMod.CssClasses & String] = js.native
    
    /* "mdc-switch--processing" */ val PROCESSING: typingsJapgolly.materialSwitch.constantsMod.CssClasses.PROCESSING & String = js.native
    
    /* "mdc-switch--selected" */ val SELECTED: typingsJapgolly.materialSwitch.constantsMod.CssClasses.SELECTED & String = js.native
    
    /* "mdc-switch--unselected" */ val UNSELECTED: typingsJapgolly.materialSwitch.constantsMod.CssClasses.UNSELECTED & String = js.native
  }
  
  @JSImport("@material/switch", "MDCSwitch")
  @js.native
  open class MDCSwitch protected ()
    extends typingsJapgolly.materialSwitch.componentMod.MDCSwitch {
    def this(root: HTMLButtonElement) = this()
    def this(
      root: HTMLButtonElement,
      foundation: typingsJapgolly.materialSwitch.foundationMod.MDCSwitchRenderFoundation
    ) = this()
  }
  /* static members */
  object MDCSwitch {
    
    @JSImport("@material/switch", "MDCSwitch")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `MDCSwitch` and attaches it to the given root element.
      * @param root The root to attach to.
      * @return the new component instance.
      */
    inline def attachTo(root: HTMLButtonElement): typingsJapgolly.materialSwitch.componentMod.MDCSwitch = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialSwitch.componentMod.MDCSwitch]
  }
  
  @JSImport("@material/switch", "MDCSwitchFoundation")
  @js.native
  open class MDCSwitchFoundation protected ()
    extends typingsJapgolly.materialSwitch.foundationMod.MDCSwitchFoundation {
    def this(adapter: MDCSwitchAdapter) = this()
  }
  
  @JSImport("@material/switch", "MDCSwitchRenderFoundation")
  @js.native
  open class MDCSwitchRenderFoundation protected ()
    extends typingsJapgolly.materialSwitch.foundationMod.MDCSwitchRenderFoundation {
    def this(adapter: MDCSwitchAdapter) = this()
  }
  
  @JSImport("@material/switch", "Selectors")
  @js.native
  object Selectors extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.materialSwitch.constantsMod.Selectors & String] = js.native
    
    /* ".mdc-switch__ripple" */ val RIPPLE: typingsJapgolly.materialSwitch.constantsMod.Selectors.RIPPLE & String = js.native
  }
  
  object deprecated {
    
    @JSImport("@material/switch", "deprecated.default")
    @js.native
    open class default ()
      extends typingsJapgolly.materialSwitch.deprecatedMod.default {
      def this(adapter: PartialMDCSwitchAdapter) = this()
    }
    
    @JSImport("@material/switch", "deprecated.MDCSwitch")
    @js.native
    open class MDCSwitch protected ()
      extends typingsJapgolly.materialSwitch.deprecatedMod.MDCSwitch {
      def this(root: Element, foundation: Unit, args: Any*) = this()
      def this(
        root: Element,
        foundation: typingsJapgolly.materialSwitch.deprecatedFoundationMod.MDCSwitchFoundation,
        args: Any*
      ) = this()
    }
    /* static members */
    object MDCSwitch {
      
      @JSImport("@material/switch", "deprecated.MDCSwitch")
      @js.native
      val ^ : js.Any = js.native
      
      inline def attachTo(root: HTMLElement): typingsJapgolly.materialSwitch.deprecatedComponentMod.MDCSwitch = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialSwitch.deprecatedComponentMod.MDCSwitch]
    }
    
    @JSImport("@material/switch", "deprecated.MDCSwitchFoundation")
    @js.native
    open class MDCSwitchFoundation ()
      extends typingsJapgolly.materialSwitch.deprecatedMod.MDCSwitchFoundation {
      def this(adapter: PartialMDCSwitchAdapter) = this()
    }
    
    object cssClasses {
      
      @JSImport("@material/switch", "deprecated.cssClasses")
      @js.native
      val ^ : js.Any = js.native
      
      /** Class used for a switch that is in the "checked" (on) position. */
      @JSImport("@material/switch", "deprecated.cssClasses.CHECKED")
      @js.native
      def CHECKED: String = js.native
      inline def CHECKED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKED")(x.asInstanceOf[js.Any])
      
      /** Class used for a switch that is disabled. */
      @JSImport("@material/switch", "deprecated.cssClasses.DISABLED")
      @js.native
      def DISABLED: String = js.native
      inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    }
    
    /** String constants used by the switch. */
    object strings {
      
      @JSImport("@material/switch", "deprecated.strings")
      @js.native
      val ^ : js.Any = js.native
      
      /** Aria attribute for checked or unchecked state of switch */
      @JSImport("@material/switch", "deprecated.strings.ARIA_CHECKED_ATTR")
      @js.native
      def ARIA_CHECKED_ATTR: String = js.native
      inline def ARIA_CHECKED_ATTR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARIA_CHECKED_ATTR")(x.asInstanceOf[js.Any])
      
      /** A CSS selector used to locate the native HTML control for the switch.  */
      @JSImport("@material/switch", "deprecated.strings.NATIVE_CONTROL_SELECTOR")
      @js.native
      def NATIVE_CONTROL_SELECTOR: String = js.native
      inline def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
      
      /** A CSS selector used to locate the ripple surface element for the switch. */
      @JSImport("@material/switch", "deprecated.strings.RIPPLE_SURFACE_SELECTOR")
      @js.native
      def RIPPLE_SURFACE_SELECTOR: String = js.native
      inline def RIPPLE_SURFACE_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RIPPLE_SURFACE_SELECTOR")(x.asInstanceOf[js.Any])
    }
  }
}
