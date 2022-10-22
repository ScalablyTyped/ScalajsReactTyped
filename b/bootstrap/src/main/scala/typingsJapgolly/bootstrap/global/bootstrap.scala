package typingsJapgolly.bootstrap.global

import typingsJapgolly.bootstrap.anon.PartialOptions
import typingsJapgolly.bootstrap.anon.PartialOptionsAllowList
import typingsJapgolly.bootstrap.anon.PartialOptionsAnimation
import typingsJapgolly.bootstrap.anon.PartialOptionsAutoClose
import typingsJapgolly.bootstrap.anon.PartialOptionsBackdrop
import typingsJapgolly.bootstrap.anon.PartialOptionsBoundary
import typingsJapgolly.bootstrap.anon.PartialOptionsKeyboard
import typingsJapgolly.bootstrap.anon.PartialOptionsMethod
import typingsJapgolly.bootstrap.anon.PartialOptionsParent
import typingsJapgolly.bootstrap.bootstrapStrings.alert
import typingsJapgolly.bootstrap.bootstrapStrings.popover
import typingsJapgolly.bootstrap.bootstrapStrings.tooltip
import typingsJapgolly.bootstrap.jsDistAlertMod.Alert.jQueryInterface
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.Options
import typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.SetContentFunction
import typingsJapgolly.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bootstrap {
  
  @JSGlobal("bootstrap.Alert")
  @js.native
  open class Alert ()
    extends typingsJapgolly.bootstrap.mod.Alert
  object Alert {
    
    @JSGlobal("bootstrap.Alert")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("bootstrap.Alert.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistAlertMod.Alert.Events & String] = js.native
      
      /* "close.bs.alert" */ val close: typingsJapgolly.bootstrap.jsDistAlertMod.Alert.Events.close & String = js.native
      
      /* "closed.bs.alert" */ val closed: typingsJapgolly.bootstrap.jsDistAlertMod.Alert.Events.closed & String = js.native
    }
    
    /* static member */
    @JSGlobal("bootstrap.Alert.NAME")
    @js.native
    def NAME: alert = js.native
    inline def NAME_=(x: alert): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the alert instance associated to a
      * DOM element, you can use it like this: getInstance(alert)
      */
    /* static member */
    @JSGlobal("bootstrap.Alert.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistAlertMod.Alert] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistAlertMod.Alert]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which returns an alert instance associated to a DOM element
      *  or create a new one in case it wasn't initialised.
      * You can use it like this: bootstrap.Alert.getOrCreateInstance(element)
      */
    /* static member */
    @JSGlobal("bootstrap.Alert.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistAlertMod.Alert, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistAlertMod.Alert, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Alert.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistAlertMod.Alert.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Button")
  @js.native
  open class Button ()
    extends typingsJapgolly.bootstrap.mod.Button
  object Button {
    
    @JSGlobal("bootstrap.Button")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("bootstrap.Button.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistButtonMod.Button] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistButtonMod.Button]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Button.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistButtonMod.Button, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistButtonMod.Button, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Button.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistButtonMod.Button.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistButtonMod.Button.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Carousel")
  @js.native
  open class Carousel protected ()
    extends typingsJapgolly.bootstrap.mod.Carousel {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptions) = this()
    def this(element: Element, options: PartialOptions) = this()
  }
  object Carousel {
    
    @JSGlobal("bootstrap.Carousel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.Carousel.Default")
    @js.native
    def Default: Options = js.native
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSGlobal("bootstrap.Carousel.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.Events & String] = js.native
      
      /* "slid.bs.carousel" */ val slid: typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.Events.slid & String = js.native
      
      /* "slide.bs.carousel" */ val slide: typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.Events.slide & String = js.native
    }
    
    /* static member */
    /* was `typeof Carousel.getOrCreateInstance` */
    @JSGlobal("bootstrap.Carousel.carouselInstance")
    @js.native
    def carouselInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel, PartialOptions] = js.native
    inline def carouselInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel, PartialOptions]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("carouselInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the carousel instance associated
      * with a DOM element.
      */
    /* static member */
    @JSGlobal("bootstrap.Carousel.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Carousel.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel, PartialOptions] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel, PartialOptions]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Carousel.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistCarouselMod.Carousel.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Collapse")
  @js.native
  open class Collapse protected ()
    extends typingsJapgolly.bootstrap.mod.Collapse {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsParent) = this()
    def this(element: Element, options: PartialOptionsParent) = this()
  }
  object Collapse {
    
    @JSGlobal("bootstrap.Collapse")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.Collapse.Default")
    @js.native
    def Default: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Options = js.native
    inline def Default_=(x: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSGlobal("bootstrap.Collapse.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Events & String] = js.native
      
      /* "hidden.bs.collapse" */ val hidden: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Events.hidden & String = js.native
      
      /* "hide.bs.collapse" */ val hide: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Events.hide & String = js.native
      
      /* "show.bs.collapse" */ val show: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Events.show & String = js.native
      
      /* "shown.bs.collapse" */ val shown: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the collapse instance associated
      * with a DOM element.
      */
    /* static member */
    @JSGlobal("bootstrap.Collapse.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which returns a collapse instance associated to a DOM element
      *  or create a new one in case it wasn't initialised.
      * You can use it like this: bootstrap.Collapse.getOrCreateInstance(element)
      */
    /* static member */
    @JSGlobal("bootstrap.Collapse.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse, PartialOptionsParent] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse, PartialOptionsParent]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Collapse.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Dropdown")
  @js.native
  open class Dropdown protected ()
    extends typingsJapgolly.bootstrap.mod.Dropdown {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsAutoClose) = this()
    def this(element: Element, options: PartialOptionsAutoClose) = this()
  }
  object Dropdown {
    
    @JSGlobal("bootstrap.Dropdown")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.Dropdown.Default")
    @js.native
    def Default: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Options = js.native
    
    /* static member */
    /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/dropdown.Dropdown.Options, string> */
    object DefaultType {
      
      @JSGlobal("bootstrap.Dropdown.DefaultType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("bootstrap.Dropdown.DefaultType.autoClose")
      @js.native
      def autoClose: String = js.native
      inline def autoClose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Dropdown.DefaultType.boundary")
      @js.native
      def boundary: String = js.native
      inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Dropdown.DefaultType.display")
      @js.native
      def display: String = js.native
      inline def display_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("display")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Dropdown.DefaultType.offset")
      @js.native
      def offset: String = js.native
      inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Dropdown.DefaultType.popperConfig")
      @js.native
      def popperConfig: js.UndefOr[String] = js.native
      inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Dropdown.DefaultType.reference")
      @js.native
      def reference: String = js.native
      inline def reference_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
    }
    
    inline def Default_=(x: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSGlobal("bootstrap.Dropdown.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Events & String] = js.native
      
      /* "hidden.bs.dropdown" */ val hidden: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Events.hidden & String = js.native
      
      /* "hide.bs.dropdown" */ val hide: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Events.hide & String = js.native
      
      /* "show.bs.dropdown" */ val show: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Events.show & String = js.native
      
      /* "shown.bs.dropdown" */ val shown: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the dropdown instance associated
      * with a DOM element.
      */
    /* static member */
    @JSGlobal("bootstrap.Dropdown.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which returns a dropdown instance associated to a DOM element or
      *  create a new one in case it wasn't initialised.
      * You can use it like this: bootstrap.Dropdown.getOrCreateInstance(element)
      */
    /* static member */
    @JSGlobal("bootstrap.Dropdown.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown, PartialOptionsAutoClose] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown, PartialOptionsAutoClose]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Dropdown.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Modal")
  @js.native
  open class Modal protected ()
    extends typingsJapgolly.bootstrap.mod.Modal {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsBackdrop) = this()
    def this(element: Element, options: PartialOptionsBackdrop) = this()
  }
  object Modal {
    
    @JSGlobal("bootstrap.Modal")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.Modal.Default")
    @js.native
    def Default: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Options = js.native
    inline def Default_=(x: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSGlobal("bootstrap.Modal.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events & String] = js.native
      
      /* "hidden.bs.modal" */ val hidden: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events.hidden & String = js.native
      
      /* "hide.bs.modal" */ val hide: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events.hide & String = js.native
      
      /* "hidePrevented.bs.modal" */ val hidePrevented: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events.hidePrevented & String = js.native
      
      /* "show.bs.modal" */ val show: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events.show & String = js.native
      
      /* "shown.bs.modal" */ val shown: typingsJapgolly.bootstrap.jsDistModalMod.Modal.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the modal instance associated with
      * a DOM element
      */
    /* static member */
    @JSGlobal("bootstrap.Modal.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistModalMod.Modal] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistModalMod.Modal]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the modal instance associated with
      * a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSGlobal("bootstrap.Modal.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistModalMod.Modal, PartialOptionsBackdrop] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistModalMod.Modal, PartialOptionsBackdrop]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Modal.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistModalMod.Modal.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistModalMod.Modal.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Offcanvas")
  @js.native
  open class Offcanvas protected ()
    extends typingsJapgolly.bootstrap.mod.Offcanvas {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsKeyboard) = this()
    def this(element: Element, options: PartialOptionsKeyboard) = this()
  }
  object Offcanvas {
    
    @JSGlobal("bootstrap.Offcanvas")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("bootstrap.Offcanvas.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.Events & String] = js.native
      
      /* "hidden.bs.offcanvas" */ val hidden: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.Events.hidden & String = js.native
      
      /* "hide.bs.offcanvas" */ val hide: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.Events.hide & String = js.native
      
      /* "show.bs.offcanvas" */ val show: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.Events.show & String = js.native
      
      /* "shown.bs.offcanvas" */ val shown: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the offcanvas instance associated with a DOM element
      */
    /* static member */
    @JSGlobal("bootstrap.Offcanvas.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the offcanvas instance associated with
      *  a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSGlobal("bootstrap.Offcanvas.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas, PartialOptionsKeyboard] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas, PartialOptionsKeyboard]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Offcanvas.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Popover")
  @js.native
  open class Popover protected ()
    extends typingsJapgolly.bootstrap.mod.Popover {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsAllowList) = this()
    def this(element: Element, options: PartialOptionsAllowList) = this()
  }
  object Popover {
    
    @JSGlobal("bootstrap.Popover")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.Popover.Default")
    @js.native
    def Default: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Options = js.native
    
    /* static member */
    /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/popover.Popover.Options, string> */
    object DefaultType {
      
      @JSGlobal("bootstrap.Popover.DefaultType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("bootstrap.Popover.DefaultType.allowList")
      @js.native
      def allowList: String = js.native
      inline def allowList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowList")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.animation")
      @js.native
      def animation: String = js.native
      inline def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.boundary")
      @js.native
      def boundary: String = js.native
      inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.container")
      @js.native
      def container: String = js.native
      inline def container_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.content")
      @js.native
      def content: String = js.native
      inline def content_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("content")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.customClass")
      @js.native
      def customClass: js.UndefOr[String] = js.native
      inline def customClass_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customClass")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.delay")
      @js.native
      def delay: String = js.native
      inline def delay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.fallbackPlacements")
      @js.native
      def fallbackPlacements: String = js.native
      inline def fallbackPlacements_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacements")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.html")
      @js.native
      def html: String = js.native
      inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.offset")
      @js.native
      def offset: String = js.native
      inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.popperConfig")
      @js.native
      def popperConfig: js.UndefOr[String] = js.native
      inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.sanitize")
      @js.native
      def sanitize: String = js.native
      
      @JSGlobal("bootstrap.Popover.DefaultType.sanitizeFn")
      @js.native
      def sanitizeFn: String = js.native
      inline def sanitizeFn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(x.asInstanceOf[js.Any])
      
      inline def sanitize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.selector")
      @js.native
      def selector: String = js.native
      inline def selector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.template")
      @js.native
      def template: String = js.native
      inline def template_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.title")
      @js.native
      def title: String = js.native
      inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.DefaultType.trigger")
      @js.native
      def trigger: String = js.native
      inline def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
    }
    
    inline def Default_=(x: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* Inlined std.Record<'CLICK' | 'FOCUSIN' | 'FOCUSOUT' | 'HIDDEN' | 'HIDE' | 'INSERTED' | 'MOUSEENTER' | 'MOUSELEAVE' | 'SHOW' | 'SHOWN', string> */
    object Event {
      
      @JSGlobal("bootstrap.Popover.Event")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("bootstrap.Popover.Event.CLICK")
      @js.native
      def CLICK: String = js.native
      inline def CLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.FOCUSIN")
      @js.native
      def FOCUSIN: String = js.native
      inline def FOCUSIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSIN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.FOCUSOUT")
      @js.native
      def FOCUSOUT: String = js.native
      inline def FOCUSOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSOUT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.HIDDEN")
      @js.native
      def HIDDEN: String = js.native
      inline def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.HIDE")
      @js.native
      def HIDE: String = js.native
      inline def HIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.INSERTED")
      @js.native
      def INSERTED: String = js.native
      inline def INSERTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.MOUSEENTER")
      @js.native
      def MOUSEENTER: String = js.native
      inline def MOUSEENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSEENTER")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.MOUSELEAVE")
      @js.native
      def MOUSELEAVE: String = js.native
      inline def MOUSELEAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSELEAVE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Popover.Event.SHOW")
      @js.native
      def SHOW: String = js.native
      
      @JSGlobal("bootstrap.Popover.Event.SHOWN")
      @js.native
      def SHOWN: String = js.native
      inline def SHOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOWN")(x.asInstanceOf[js.Any])
      
      inline def SHOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("bootstrap.Popover.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Events & String] = js.native
      
      /* "hidden.bs.popover" */ val hidden: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Events.hidden & String = js.native
      
      /* "hide.bs.popover" */ val hide: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Events.hide & String = js.native
      
      /* "inserted.bs.popover" */ val inserted: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Events.inserted & String = js.native
      
      /* "show.bs.popover" */ val show: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Events.show & String = js.native
      
      /* "shown.bs.popover" */ val shown: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.Events.shown & String = js.native
    }
    
    /* static member */
    @JSGlobal("bootstrap.Popover.NAME")
    @js.native
    def NAME: popover = js.native
    inline def NAME_=(x: popover): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Popover.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistPopoverMod.Popover] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistPopoverMod.Popover]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the popover instance associated with
      *  a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSGlobal("bootstrap.Popover.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistPopoverMod.Popover, PartialOptionsAllowList] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistPopoverMod.Popover, PartialOptionsAllowList]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Popover.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistPopoverMod.Popover.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.ScrollSpy")
  @js.native
  open class ScrollSpy protected ()
    extends typingsJapgolly.bootstrap.mod.ScrollSpy {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsMethod) = this()
    def this(element: Element, options: PartialOptionsMethod) = this()
  }
  object ScrollSpy {
    
    @JSGlobal("bootstrap.ScrollSpy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.ScrollSpy.Default")
    @js.native
    def Default: typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy.Options = js.native
    inline def Default_=(x: typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy.Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSGlobal("bootstrap.ScrollSpy.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy.Events & String] = js.native
      
      /* "activate.bs.scrollspy" */ val activate: typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy.Events.activate & String = js.native
    }
    
    /**
      * Static method which allows you to get the scrollspy instance associated
      * with a DOM element
      */
    /* static member */
    @JSGlobal("bootstrap.ScrollSpy.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the scrollspy instance associated with
      * a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSGlobal("bootstrap.ScrollSpy.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy, PartialOptionsMethod] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy, PartialOptionsMethod]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.ScrollSpy.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistScrollspyMod.ScrollSpy.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Tab")
  @js.native
  open class Tab ()
    extends typingsJapgolly.bootstrap.mod.Tab
  object Tab {
    
    @JSGlobal("bootstrap.Tab")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("bootstrap.Tab.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistTabMod.Tab.Events & String] = js.native
      
      /* "hidden.bs.tab" */ val hidden: typingsJapgolly.bootstrap.jsDistTabMod.Tab.Events.hidden & String = js.native
      
      /* "hide.bs.tab" */ val hide: typingsJapgolly.bootstrap.jsDistTabMod.Tab.Events.hide & String = js.native
      
      /* "show.bs.tab" */ val show: typingsJapgolly.bootstrap.jsDistTabMod.Tab.Events.show & String = js.native
      
      /* "shown.bs.tab" */ val shown: typingsJapgolly.bootstrap.jsDistTabMod.Tab.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the tab instance associated with a
      * DOM element
      */
    /* static member */
    @JSGlobal("bootstrap.Tab.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the tab instance associated with a
      * DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSGlobal("bootstrap.Tab.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Tab.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistTabMod.Tab.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistTabMod.Tab.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Toast")
  @js.native
  open class Toast protected ()
    extends typingsJapgolly.bootstrap.mod.Toast {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsAnimation) = this()
    def this(element: Element, options: PartialOptionsAnimation) = this()
  }
  object Toast {
    
    @JSGlobal("bootstrap.Toast")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.Toast.Default")
    @js.native
    def Default: typingsJapgolly.bootstrap.jsDistToastMod.Toast.Options = js.native
    inline def Default_=(x: typingsJapgolly.bootstrap.jsDistToastMod.Toast.Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSGlobal("bootstrap.Toast.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistToastMod.Toast.Events & String] = js.native
      
      /* "hidden.bs.toast" */ val hidden: typingsJapgolly.bootstrap.jsDistToastMod.Toast.Events.hidden & String = js.native
      
      /* "hide.bs.toast" */ val hide: typingsJapgolly.bootstrap.jsDistToastMod.Toast.Events.hide & String = js.native
      
      /* "show.bs.toast" */ val show: typingsJapgolly.bootstrap.jsDistToastMod.Toast.Events.show & String = js.native
      
      /* "shown.bs.toast" */ val shown: typingsJapgolly.bootstrap.jsDistToastMod.Toast.Events.shown & String = js.native
    }
    
    /**
      * Static method which allows you to get the toast instance associated
      * with a DOM element
      */
    /* static member */
    @JSGlobal("bootstrap.Toast.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistToastMod.Toast] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistToastMod.Toast]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the scrollspy instance associated with a
      * DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSGlobal("bootstrap.Toast.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistToastMod.Toast, PartialOptionsAnimation] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistToastMod.Toast, PartialOptionsAnimation]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Toast.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistToastMod.Toast.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistToastMod.Toast.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("bootstrap.Tooltip")
  @js.native
  open class Tooltip protected ()
    extends typingsJapgolly.bootstrap.mod.Tooltip {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsBoundary) = this()
    def this(element: Element, options: PartialOptionsBoundary) = this()
  }
  object Tooltip {
    
    @JSGlobal("bootstrap.Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSGlobal("bootstrap.Tooltip.Default")
    @js.native
    def Default: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Options = js.native
    
    /* static member */
    /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/tooltip.Tooltip.Options, string> */
    object DefaultType {
      
      @JSGlobal("bootstrap.Tooltip.DefaultType")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.allowList")
      @js.native
      def allowList: String = js.native
      inline def allowList_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("allowList")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.animation")
      @js.native
      def animation: String = js.native
      inline def animation_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animation")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.boundary")
      @js.native
      def boundary: String = js.native
      inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.container")
      @js.native
      def container: String = js.native
      inline def container_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.customClass")
      @js.native
      def customClass: js.UndefOr[String] = js.native
      inline def customClass_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customClass")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.delay")
      @js.native
      def delay: String = js.native
      inline def delay_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delay")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.fallbackPlacements")
      @js.native
      def fallbackPlacements: String = js.native
      inline def fallbackPlacements_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbackPlacements")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.html")
      @js.native
      def html: String = js.native
      inline def html_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("html")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.offset")
      @js.native
      def offset: String = js.native
      inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.popperConfig")
      @js.native
      def popperConfig: js.UndefOr[String] = js.native
      inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.sanitize")
      @js.native
      def sanitize: String = js.native
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.sanitizeFn")
      @js.native
      def sanitizeFn: String = js.native
      inline def sanitizeFn_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitizeFn")(x.asInstanceOf[js.Any])
      
      inline def sanitize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sanitize")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.selector")
      @js.native
      def selector: String = js.native
      inline def selector_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selector")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.template")
      @js.native
      def template: String = js.native
      inline def template_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("template")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.title")
      @js.native
      def title: String = js.native
      inline def title_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.DefaultType.trigger")
      @js.native
      def trigger: String = js.native
      inline def trigger_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trigger")(x.asInstanceOf[js.Any])
    }
    
    inline def Default_=(x: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* Inlined std.Record<'CLICK' | 'FOCUSIN' | 'FOCUSOUT' | 'HIDDEN' | 'HIDE' | 'INSERTED' | 'MOUSEENTER' | 'MOUSELEAVE' | 'SHOW' | 'SHOWN', string> */
    object Event {
      
      @JSGlobal("bootstrap.Tooltip.Event")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("bootstrap.Tooltip.Event.CLICK")
      @js.native
      def CLICK: String = js.native
      inline def CLICK_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLICK")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.FOCUSIN")
      @js.native
      def FOCUSIN: String = js.native
      inline def FOCUSIN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSIN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.FOCUSOUT")
      @js.native
      def FOCUSOUT: String = js.native
      inline def FOCUSOUT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSOUT")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.HIDDEN")
      @js.native
      def HIDDEN: String = js.native
      inline def HIDDEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDDEN")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.HIDE")
      @js.native
      def HIDE: String = js.native
      inline def HIDE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HIDE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.INSERTED")
      @js.native
      def INSERTED: String = js.native
      inline def INSERTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSERTED")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.MOUSEENTER")
      @js.native
      def MOUSEENTER: String = js.native
      inline def MOUSEENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSEENTER")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.MOUSELEAVE")
      @js.native
      def MOUSELEAVE: String = js.native
      inline def MOUSELEAVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOUSELEAVE")(x.asInstanceOf[js.Any])
      
      @JSGlobal("bootstrap.Tooltip.Event.SHOW")
      @js.native
      def SHOW: String = js.native
      
      @JSGlobal("bootstrap.Tooltip.Event.SHOWN")
      @js.native
      def SHOWN: String = js.native
      inline def SHOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOWN")(x.asInstanceOf[js.Any])
      
      inline def SHOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("bootstrap.Tooltip.Events")
    @js.native
    object Events extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Events & String] = js.native
      
      /* "hidden.bs.tooltip" */ val hidden: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Events.hidden & String = js.native
      
      /* "hide.bs.tooltip" */ val hide: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Events.hide & String = js.native
      
      /* "inserted.bs.tooltip" */ val inserted: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Events.inserted & String = js.native
      
      /* "show.bs.tooltip" */ val show: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Events.show & String = js.native
      
      /* "shown.bs.tooltip" */ val shown: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.Events.shown & String = js.native
    }
    
    /* static member */
    @JSGlobal("bootstrap.Tooltip.NAME")
    @js.native
    def NAME: tooltip = js.native
    inline def NAME_=(x: tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Tooltip.SetContentFunction")
    @js.native
    def SetContentFunction: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.SetContentFunction = js.native
    inline def SetContentFunction_=(x: SetContentFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SetContentFunction")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Tooltip.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip] = js.native
    inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which allows you to get the tooltip instance associated with
      * a DOM element, or create a new one in case it wasn’t initialised
      */
    /* static member */
    @JSGlobal("bootstrap.Tooltip.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(
      x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip, ComponentOptions]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("bootstrap.Tooltip.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.jQueryInterface = js.native
    inline def jQueryInterface_=(x: typingsJapgolly.bootstrap.jsDistTooltipMod.Tooltip.jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
}
