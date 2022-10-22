package typingsJapgolly.materialIconButton

import org.scalajs.dom.HTMLElement
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialIconButton.foundationMod.MDCIconButtonToggleFoundation
import typingsJapgolly.materialRipple.componentMod.MDCRipple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/icon-button/component", "MDCIconButtonToggle")
  @js.native
  open class MDCIconButtonToggle protected () extends MDCComponent[MDCIconButtonToggleFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCIconButtonToggleFoundation, args: Any*) = this()
    
    /* private */ var createRipple: Any = js.native
    
    /* private */ var handleClick: Any = js.native
    
    def on: Boolean = js.native
    def on_=(isOn: Boolean): Unit = js.native
    
    def ripple: MDCRipple = js.native
    
    /* private */ val rippleComponent: Any = js.native
  }
  /* static members */
  object MDCIconButtonToggle {
    
    @JSImport("@material/icon-button/component", "MDCIconButtonToggle")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: HTMLElement): MDCIconButtonToggle = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCIconButtonToggle]
  }
}
