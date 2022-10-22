package typingsJapgolly.bootstrap.mod

import typingsJapgolly.bootstrap.anon.PartialOptionsKeyboard
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.jQueryInterface
import typingsJapgolly.bootstrap.jsDistOffcanvasMod.default
import typingsJapgolly.bootstrap.mod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bootstrap", "Offcanvas")
@js.native
open class Offcanvas protected () extends default {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: PartialOptionsKeyboard) = this()
  def this(element: Element, options: PartialOptionsKeyboard) = this()
}
object Offcanvas {
  
  @JSImport("bootstrap", "Offcanvas")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bootstrap", "Offcanvas.Events")
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
  @JSImport("bootstrap", "Offcanvas.getInstance")
  @js.native
  def getInstance: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas] = js.native
  inline def getInstance_=(x: GetInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
  
  /**
    * Static method which allows you to get the offcanvas instance associated with
    *  a DOM element, or create a new one in case it wasn’t initialised
    */
  /* static member */
  @JSImport("bootstrap", "Offcanvas.getOrCreateInstance")
  @js.native
  def getOrCreateInstance: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas, PartialOptionsKeyboard] = js.native
  inline def getOrCreateInstance_=(
    x: GetOrCreateInstanceFactory[typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas, PartialOptionsKeyboard]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("bootstrap", "Offcanvas.jQueryInterface")
  @js.native
  def jQueryInterface: typingsJapgolly.bootstrap.jsDistOffcanvasMod.Offcanvas.jQueryInterface = js.native
  inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
}
