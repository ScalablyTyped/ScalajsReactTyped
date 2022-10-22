package typingsJapgolly.materialComponentsWeb.mod

import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialTabIndicator.anon.PartialMDCTabIndicatorAda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabIndicator {
  
  @JSImport("material-components-web", "tabIndicator.default")
  @js.native
  open class default ()
    extends typingsJapgolly.materialTabIndicator.mod.default {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("material-components-web", "tabIndicator.MDCFadingTabIndicatorFoundation")
  @js.native
  open class MDCFadingTabIndicatorFoundation ()
    extends typingsJapgolly.materialTabIndicator.mod.MDCFadingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("material-components-web", "tabIndicator.MDCSlidingTabIndicatorFoundation")
  @js.native
  open class MDCSlidingTabIndicatorFoundation ()
    extends typingsJapgolly.materialTabIndicator.mod.MDCSlidingTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  @JSImport("material-components-web", "tabIndicator.MDCTabIndicator")
  @js.native
  open class MDCTabIndicator protected ()
    extends typingsJapgolly.materialTabIndicator.mod.MDCTabIndicator {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCTabIndicator {
    
    @JSImport("material-components-web", "tabIndicator.MDCTabIndicator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialTabIndicator.componentMod.MDCTabIndicator = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialTabIndicator.componentMod.MDCTabIndicator]
  }
  
  /* note: abstract class */ @JSImport("material-components-web", "tabIndicator.MDCTabIndicatorFoundation")
  @js.native
  open class MDCTabIndicatorFoundation ()
    extends typingsJapgolly.materialTabIndicator.mod.MDCTabIndicatorFoundation {
    def this(adapter: PartialMDCTabIndicatorAda) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "tabIndicator.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tabIndicator.cssClasses.ACTIVE")
    @js.native
    def ACTIVE: String = js.native
    inline def ACTIVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTIVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabIndicator.cssClasses.FADE")
    @js.native
    def FADE: String = js.native
    inline def FADE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FADE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "tabIndicator.cssClasses.NO_TRANSITION")
    @js.native
    def NO_TRANSITION: String = js.native
    inline def NO_TRANSITION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_TRANSITION")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "tabIndicator.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "tabIndicator.strings.CONTENT_SELECTOR")
    @js.native
    def CONTENT_SELECTOR: String = js.native
    inline def CONTENT_SELECTOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTENT_SELECTOR")(x.asInstanceOf[js.Any])
  }
}
