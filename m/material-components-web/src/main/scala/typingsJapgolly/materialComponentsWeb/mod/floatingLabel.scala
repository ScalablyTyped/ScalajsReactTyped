package typingsJapgolly.materialComponentsWeb.mod

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialFloatingLabel.anon.PartialMDCFloatingLabelAd
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingLabel {
  
  @JSImport("material-components-web", "floatingLabel.default")
  @js.native
  open class default ()
    extends typingsJapgolly.materialFloatingLabel.mod.default {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  
  @JSImport("material-components-web", "floatingLabel.MDCFloatingLabel")
  @js.native
  open class MDCFloatingLabel protected ()
    extends typingsJapgolly.materialFloatingLabel.mod.MDCFloatingLabel {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCFloatingLabel {
    
    @JSImport("material-components-web", "floatingLabel.MDCFloatingLabel")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialFloatingLabel.componentMod.MDCFloatingLabel = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialFloatingLabel.componentMod.MDCFloatingLabel]
  }
  
  @JSImport("material-components-web", "floatingLabel.MDCFloatingLabelFoundation")
  @js.native
  open class MDCFloatingLabelFoundation ()
    extends typingsJapgolly.materialFloatingLabel.mod.MDCFloatingLabelFoundation {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "floatingLabel.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.LABEL_FLOAT_ABOVE")
    @js.native
    def LABEL_FLOAT_ABOVE: String = js.native
    inline def LABEL_FLOAT_ABOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_FLOAT_ABOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.LABEL_REQUIRED")
    @js.native
    def LABEL_REQUIRED: String = js.native
    inline def LABEL_REQUIRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_REQUIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.LABEL_SHAKE")
    @js.native
    def LABEL_SHAKE: String = js.native
    inline def LABEL_SHAKE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SHAKE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
}
