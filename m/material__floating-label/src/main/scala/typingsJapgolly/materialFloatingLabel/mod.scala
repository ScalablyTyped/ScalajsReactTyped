package typingsJapgolly.materialFloatingLabel

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialFloatingLabel.anon.PartialMDCFloatingLabelAd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/floating-label", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialFloatingLabel.foundationMod.default {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  
  @JSImport("@material/floating-label", "MDCFloatingLabel")
  @js.native
  open class MDCFloatingLabel protected ()
    extends typingsJapgolly.materialFloatingLabel.componentMod.MDCFloatingLabel {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCFloatingLabel {
    
    @JSImport("@material/floating-label", "MDCFloatingLabel")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialFloatingLabel.componentMod.MDCFloatingLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialFloatingLabel.componentMod.MDCFloatingLabel]
  }
  
  @JSImport("@material/floating-label", "MDCFloatingLabelFoundation")
  @js.native
  open class MDCFloatingLabelFoundation ()
    extends typingsJapgolly.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/floating-label", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/floating-label", "cssClasses.LABEL_FLOAT_ABOVE")
    @js.native
    def LABEL_FLOAT_ABOVE: String = js.native
    inline def LABEL_FLOAT_ABOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_FLOAT_ABOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/floating-label", "cssClasses.LABEL_REQUIRED")
    @js.native
    def LABEL_REQUIRED: String = js.native
    inline def LABEL_REQUIRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_REQUIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/floating-label", "cssClasses.LABEL_SHAKE")
    @js.native
    def LABEL_SHAKE: String = js.native
    inline def LABEL_SHAKE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SHAKE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/floating-label", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
}
