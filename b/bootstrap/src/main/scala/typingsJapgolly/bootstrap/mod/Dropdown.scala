package typingsJapgolly.bootstrap.mod

import typingsJapgolly.bootstrap.anon.PartialOptionsAutoClose
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.Options
import typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface
import typingsJapgolly.bootstrap.jsDistDropdownMod.default
import typingsJapgolly.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Dropdown")
@js.native
open class Dropdown protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsAutoClose) = this()
  def this(element: Element, options: PartialOptionsAutoClose) = this()
}
object Dropdown {
  
  @JSImport("bootstrap", "Dropdown")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Dropdown.Default")
  @js.native
  def Default: Options = js.native
  
  /* static member */
  /* Inlined std.Record<keyof bootstrap.bootstrap/js/dist/dropdown.Dropdown.Options, string> */
  object DefaultType {
    
    @JSImport("bootstrap", "Dropdown.DefaultType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bootstrap", "Dropdown.DefaultType.autoClose")
    @js.native
    def autoClose: String = js.native
    inline def autoClose_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Dropdown.DefaultType.boundary")
    @js.native
    def boundary: String = js.native
    inline def boundary_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boundary")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Dropdown.DefaultType.display")
    @js.native
    def display: String = js.native
    inline def display_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("display")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Dropdown.DefaultType.offset")
    @js.native
    def offset: String = js.native
    inline def offset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Dropdown.DefaultType.popperConfig")
    @js.native
    def popperConfig: js.UndefOr[String] = js.native
    inline def popperConfig_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
    
    @JSImport("bootstrap", "Dropdown.DefaultType.reference")
    @js.native
    def reference: String = js.native
    inline def reference_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reference")(x.asInstanceOf[js.Any])
  }
  
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  @JSImport("bootstrap", "Dropdown.Events")
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
  @JSImport("bootstrap", "Dropdown.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which returns a dropdown instance associated to a DOM element or
    *  create a new one in case it wasn't initialised.
    * You can use it like this: bootstrap.Dropdown.getOrCreateInstance(element)
    */
  /* static member */
  @JSImport("bootstrap", "Dropdown.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown, PartialOptionsAutoClose] = js.native
  inline def getOrCreateInstance_=(
    x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown, PartialOptionsAutoClose]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Dropdown.jQueryInterface")
  @js.native
  def jQueryInterface: typingsJapgolly.bootstrap.jsDistDropdownMod.Dropdown.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
