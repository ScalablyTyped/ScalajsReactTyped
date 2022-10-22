package typingsJapgolly.bootstrap.mod

import typingsJapgolly.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typingsJapgolly.bootstrap.jsDistTabMod.Tab.jQueryInterface
import typingsJapgolly.bootstrap.jsDistTabMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Tab")
@js.native
open class Tab () extends default
object Tab {
  
  @JSImport("bootstrap", "Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bootstrap", "Tab.Events")
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
  @JSImport("bootstrap", "Tab.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the tab instance associated with a
    * DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "Tab.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab, ComponentOptions] = js.native
  inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistTabMod.Tab, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Tab.jQueryInterface")
  @js.native
  def jQueryInterface: typingsJapgolly.bootstrap.jsDistTabMod.Tab.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
