package typingsJapgolly.materialRadio

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialRadio.anon.PartialMDCRadioAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/radio", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialRadio.foundationMod.default {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  @JSImport("@material/radio", "MDCRadio")
  @js.native
  open class MDCRadio protected ()
    extends typingsJapgolly.materialRadio.componentMod.MDCRadio {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialRadio.foundationMod.MDCRadioFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCRadio {
    
    @JSImport("@material/radio", "MDCRadio")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialRadio.componentMod.MDCRadio = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialRadio.componentMod.MDCRadio]
  }
  
  @JSImport("@material/radio", "MDCRadioFoundation")
  @js.native
  open class MDCRadioFoundation ()
    extends typingsJapgolly.materialRadio.foundationMod.MDCRadioFoundation {
    def this(adapter: PartialMDCRadioAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/radio", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/radio", "cssClasses.DISABLED")
    @js.native
    def DISABLED: String = js.native
    inline def DISABLED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/radio", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/radio", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/radio", "strings.NATIVE_CONTROL_SELECTOR")
    @js.native
    def NATIVE_CONTROL_SELECTOR: String = js.native
    inline def NATIVE_CONTROL_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NATIVE_CONTROL_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
