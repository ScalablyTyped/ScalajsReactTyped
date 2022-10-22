package typingsJapgolly.bootstrap

import typingsJapgolly.bootstrap.bootstrapStrings.dispose
import typingsJapgolly.bootstrap.bootstrapStrings.toggle
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.ComponentOptions
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetInstanceFactory
import typingsJapgolly.bootstrap.jsDistBaseComponentMod.GetOrCreateInstanceFactory
import typingsJapgolly.bootstrap.jsDistButtonMod.Button.jQueryInterface
import typingsJapgolly.bootstrap.mod.global.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsDistButtonMod {
  
  @JSImport("bootstrap/js/dist/button", JSImport.Default)
  @js.native
  open class default () extends Button
  object default {
    
    @JSImport("bootstrap/js/dist/button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("bootstrap/js/dist/button", "default.getInstance")
    @js.native
    def getInstance: GetInstanceFactory[Button] = js.native
    inline def getInstance_=(x: GetInstanceFactory[Button]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/button", "default.getOrCreateInstance")
    @js.native
    def getOrCreateInstance: GetOrCreateInstanceFactory[Button, ComponentOptions] = js.native
    inline def getOrCreateInstance_=(x: GetOrCreateInstanceFactory[Button, ComponentOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getOrCreateInstance")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("bootstrap/js/dist/button", "default.jQueryInterface")
    @js.native
    def jQueryInterface: typingsJapgolly.bootstrap.jsDistButtonMod.Button.jQueryInterface = js.native
    inline def jQueryInterface_=(x: jQueryInterface): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("jQueryInterface")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Button
    extends typingsJapgolly.bootstrap.jsDistBaseComponentMod.default {
    
    /**
      * Toggles push state. Gives the button the appearance that it has been activated.
      */
    def toggle(): Unit = js.native
  }
  object Button {
    
    type jQueryInterface = js.Function1[/* config */ js.UndefOr[toggle | dispose], JQuery]
  }
}
