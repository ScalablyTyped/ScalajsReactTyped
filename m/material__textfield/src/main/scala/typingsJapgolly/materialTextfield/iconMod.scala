package typingsJapgolly.materialTextfield

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialTextfield.anon.PartialMDCTextFieldIconAd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("@material/textfield/icon", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialTextfield.iconFoundationMod.default {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  
  @JSImport("@material/textfield/icon", "MDCTextFieldIcon")
  @js.native
  open class MDCTextFieldIcon protected ()
    extends typingsJapgolly.materialTextfield.iconComponentMod.MDCTextFieldIcon {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTextFieldIcon {
    
    @JSImport("@material/textfield/icon", "MDCTextFieldIcon")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialTextfield.iconComponentMod.MDCTextFieldIcon = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialTextfield.iconComponentMod.MDCTextFieldIcon]
  }
  
  @JSImport("@material/textfield/icon", "MDCTextFieldIconFoundation")
  @js.native
  open class MDCTextFieldIconFoundation ()
    extends typingsJapgolly.materialTextfield.iconFoundationMod.MDCTextFieldIconFoundation {
    def this(adapter: PartialMDCTextFieldIconAd) = this()
  }
  
  object iconCssClasses {
    
    @JSImport("@material/textfield/icon", "iconCssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/icon", "iconCssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object iconStrings {
    
    @JSImport("@material/textfield/icon", "iconStrings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/textfield/icon", "iconStrings.ICON_EVENT")
    @js.native
    def ICON_EVENT: String = js.native
    inline def ICON_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/textfield/icon", "iconStrings.ICON_ROLE")
    @js.native
    def ICON_ROLE: String = js.native
    inline def ICON_ROLE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ICON_ROLE")(x.asInstanceOf[js.Any])
  }
}
