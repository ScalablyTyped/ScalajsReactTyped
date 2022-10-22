package typingsJapgolly.materialSelect

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextComponentMod {
  
  @JSImport("@material/select/helper-text/component", "MDCSelectHelperText")
  @js.native
  open class MDCSelectHelperText protected () extends MDCComponent[MDCSelectHelperTextFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCSelectHelperTextFoundation, args: Any*) = this()
    
    def foundationForSelect: MDCSelectHelperTextFoundation = js.native
  }
  /* static members */
  object MDCSelectHelperText {
    
    @JSImport("@material/select/helper-text/component", "MDCSelectHelperText")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCSelectHelperText = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCSelectHelperText]
  }
  
  type MDCSelectHelperTextFactory = js.Function2[
    /* el */ org.scalajs.dom.Element, 
    /* foundation */ js.UndefOr[MDCSelectHelperTextFoundation], 
    MDCSelectHelperText
  ]
}
