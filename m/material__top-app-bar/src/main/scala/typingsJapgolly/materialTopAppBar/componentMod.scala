package typingsJapgolly.materialTopAppBar

import org.scalajs.dom.EventTarget
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialBase.componentMod.MDCComponent
import typingsJapgolly.materialRipple.componentMod.MDCRippleFactory
import typingsJapgolly.materialTopAppBar.foundationMod.MDCTopAppBarBaseFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/top-app-bar/component", "MDCTopAppBar")
  @js.native
  open class MDCTopAppBar protected () extends MDCComponent[MDCTopAppBarBaseFoundation] {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(root: Element, foundation: MDCTopAppBarBaseFoundation, args: Any*) = this()
    
    /* private */ var handleNavigationClick: Any = js.native
    
    /* private */ var handleTargetScroll: Any = js.native
    
    /* private */ var handleWindowResize: Any = js.native
    
    /* private */ var iconRipples: Any = js.native
    
    def initialize(): Unit = js.native
    def initialize(rippleFactory: MDCRippleFactory): Unit = js.native
    
    /* private */ var navIcon: Any = js.native
    
    /* private */ var scrollTarget: Any = js.native
    
    def setScrollTarget(target: EventTarget): Unit = js.native
  }
  /* static members */
  object MDCTopAppBar {
    
    @JSImport("@material/top-app-bar/component", "MDCTopAppBar")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): MDCTopAppBar = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[MDCTopAppBar]
  }
}
