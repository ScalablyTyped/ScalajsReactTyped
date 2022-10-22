package typingsJapgolly.materialSelect

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialSelect.anon.PartialMDCSelectIconAdapt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@material/select/icon", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialSelect.iconFoundationMod.default {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  @JSImport("@material/select/icon", "MDCSelectIcon")
  @js.native
  open class MDCSelectIcon protected ()
    extends typingsJapgolly.materialSelect.iconComponentMod.MDCSelectIcon {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialSelect.iconFoundationMod.MDCSelectIconFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCSelectIcon {
    
    @JSImport("@material/select/icon", "MDCSelectIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialSelect.iconComponentMod.MDCSelectIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialSelect.iconComponentMod.MDCSelectIcon]
  }
  
  @JSImport("@material/select/icon", "MDCSelectIconFoundation")
  @js.native
  open class MDCSelectIconFoundation ()
    extends typingsJapgolly.materialSelect.iconFoundationMod.MDCSelectIconFoundation {
    def this(adapter: PartialMDCSelectIconAdapt) = this()
  }
  
  object iconStrings {
    
    @JSImport("@material/select/icon", "iconStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/select/icon", "iconStrings.ICON_EVENT")
    @js.native
    def ICON_EVENT: String = js.native
    inline def ICON_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/select/icon", "iconStrings.ICON_ROLE")
    @js.native
    def ICON_ROLE: String = js.native
    inline def ICON_ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_ROLE")(x.asInstanceOf[js.Any])
  }
}
