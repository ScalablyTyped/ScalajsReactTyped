package typingsJapgolly.bootstrap

import typingsJapgolly.bootstrap.anon.PartialOptionsParent
import typingsJapgolly.bootstrap.bootstrapStrings.dispose
import typingsJapgolly.bootstrap.bootstrapStrings.hide
import typingsJapgolly.bootstrap.bootstrapStrings.show
import typingsJapgolly.bootstrap.bootstrapStrings.toggle
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Options
import typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface
import typingsJapgolly.bootstrap.mod.global.Element
import typingsJapgolly.bootstrap.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistCollapseMod {
  
  @JSImport("bootstrap/js/dist/collapse", JSImport.Default)
  @js.native
  open class default protected () extends Collapse {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: PartialOptionsParent) = this()
    def this(element: Element, options: PartialOptionsParent) = this()
  }
  object default {
    
    @JSImport("bootstrap/js/dist/collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Default settings of this plugin
      *
      * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
      */
    /* static member */
    @JSImport("bootstrap/js/dist/collapse", "default.Default")
    @js.native
    def Default: Options = js.native
    inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap/js/dist/collapse", "default.Events")
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
    @JSImport("bootstrap/js/dist/collapse", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Collapse] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Collapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Static method which returns a collapse instance associated to a DOM element
      *  or create a new one in case it wasn't initialised.
      * You can use it like this: bootstrap.Collapse.getOrCreateInstance(element)
      */
    /* static member */
    @JSImport("bootstrap/js/dist/collapse", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Collapse, PartialOptionsParent] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Collapse, PartialOptionsParent]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/collapse", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Collapse
    extends typingsJapgolly.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Hides a collapsible element. Returns to the caller before the collapsible
      * element has actually been hidden (e.g., before the hidden.bs.collapse
      * event occurs).
      */
    def hide(): Unit = js.native
    
    /**
      * Shows a collapsible element. Returns to the caller before the collapsible
      * element has actually been shown (e.g., before the shown.bs.collapse event
      * occurs).
      */
    def show(): Unit = js.native
    
    /**
      * Toggles a collapsible element to shown or hidden. Returns to the caller
      * before the collapsible element has actually been shown or hidden (i.e.
      * before the shown.bs.collapse or hidden.bs.collapse event occurs).
      */
    def toggle(): Unit = js.native
  }
  object Collapse {
    
    @js.native
    sealed trait Events extends StObject
    @JSImport("bootstrap/js/dist/collapse", "Collapse.Events")
    @js.native
    object Events extends StObject {
      
      /**
        * This event is fired when a collapse element has been hidden from the
        * user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait hidden
        extends StObject
           with Events
      
      /**
        * This event is fired immediately when the hide method has been called.
        */
      @js.native
      sealed trait hide
        extends StObject
           with Events
      
      /**
        * This event fires immediately when the show instance method is called.
        */
      @js.native
      sealed trait show
        extends StObject
           with Events
      
      /**
        * This event is fired when a collapse element has been made visible to the user (will wait for CSS transitions to complete).
        */
      @js.native
      sealed trait shown
        extends StObject
           with Events
    }
    
    trait Options extends StObject {
      
      /**
        * If parent is provided, then all collapsible elements under the specified
        * parent will be closed when this collapsible item is shown. (similar to
        * traditional accordion behavior - this is dependent on the card class).
        * The attribute has to be set on the target collapsible area.
        *
        * @default false
        */
      var parent: String | Element | JQuery
      
      /**
        * Toggles the collapsible element on invocation
        *
        * @default true
        */
      var toggle: Boolean
    }
    object Options {
      
      inline def apply(parent: String | Element | JQuery, toggle: Boolean): Options = {
        val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setParent(value: String | Element | JQuery): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setToggle(value: Boolean): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
      }
    }
    
    type jQueryInterface = js.Function1[
        /* config */ js.UndefOr[PartialOptionsParent | show | hide | toggle | dispose], 
        JQuery
      ]
  }
}
