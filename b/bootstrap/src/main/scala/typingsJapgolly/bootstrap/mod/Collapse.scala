package typingsJapgolly.bootstrap.mod

import typingsJapgolly.bootstrap.anon.PartialOptionsParent
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.Options
import typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface
import typingsJapgolly.bootstrap.jsDistCollapseMod.default
import typingsJapgolly.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Collapse")
@js.native
open class Collapse protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsParent) = this()
  def this(element: Element, options: PartialOptionsParent) = this()
}
object Collapse {
  
  @JSImport("bootstrap", "Collapse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Default settings of this plugin
    *
    * @link https://getbootstrap.com/docs/5.0/getting-started/javascript/#default-settings
    */
  /* static member */
  @JSImport("bootstrap", "Collapse.Default")
  @js.native
  def Default: Options = js.native
  inline def Default_=(x: Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Default")(x.asInstanceOf[js.Any])
  
  @JSImport("bootstrap", "Collapse.Events")
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
  @JSImport("bootstrap", "Collapse.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which returns a collapse instance associated to a DOM element
    *  or create a new one in case it wasn't initialised.
    * You can use it like this: bootstrap.Collapse.getOrCreateInstance(element)
    */
  /* static member */
  @JSImport("bootstrap", "Collapse.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse, PartialOptionsParent] = js.native
  inline def getOrCreateInstance_=(
    x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse, PartialOptionsParent]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Collapse.jQueryInterface")
  @js.native
  def jQueryInterface: typingsJapgolly.bootstrap.jsDistCollapseMod.Collapse.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
