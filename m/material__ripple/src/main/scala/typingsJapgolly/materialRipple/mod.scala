package typingsJapgolly.materialRipple

import org.scalajs.dom.DOMRect
import org.scalajs.dom.Event
import typingsJapgolly.materialBase.Element
import typingsJapgolly.materialRipple.adapterMod.MDCRippleAdapter
import typingsJapgolly.materialRipple.anon.PartialMDCRippleAdapter
import typingsJapgolly.materialRipple.typesMod.MDCRippleAttachOpts
import typingsJapgolly.materialRipple.typesMod.MDCRippleCapableSurface
import typingsJapgolly.materialRipple.typesMod.MDCRipplePoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material/ripple", JSImport.Default)
  @js.native
  open class default ()
    extends typingsJapgolly.materialRipple.foundationMod.default {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  
  @JSImport("@material/ripple", "MDCRipple")
  @js.native
  open class MDCRipple protected ()
    extends typingsJapgolly.materialRipple.componentMod.MDCRipple {
    def this(root: Element, foundation: Unit, args: Any*) = this()
    def this(
      root: Element,
      foundation: typingsJapgolly.materialRipple.foundationMod.MDCRippleFoundation,
      args: Any*
    ) = this()
  }
  /* static members */
  object MDCRipple {
    
    @JSImport("@material/ripple", "MDCRipple")
    @js.native
    val ^ : js.Any = js.native
    
    inline def attachTo(root: org.scalajs.dom.Element): typingsJapgolly.materialRipple.componentMod.MDCRipple = ^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materialRipple.componentMod.MDCRipple]
    inline def attachTo(root: org.scalajs.dom.Element, opts: MDCRippleAttachOpts): typingsJapgolly.materialRipple.componentMod.MDCRipple = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTo")(root.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materialRipple.componentMod.MDCRipple]
    
    inline def createAdapter(instance: MDCRippleCapableSurface): MDCRippleAdapter = ^.asInstanceOf[js.Dynamic].applyDynamic("createAdapter")(instance.asInstanceOf[js.Any]).asInstanceOf[MDCRippleAdapter]
  }
  
  @JSImport("@material/ripple", "MDCRippleFoundation")
  @js.native
  open class MDCRippleFoundation ()
    extends typingsJapgolly.materialRipple.foundationMod.MDCRippleFoundation {
    def this(adapter: PartialMDCRippleAdapter) = this()
  }
  
  object cssClasses {
    
    @JSImport("@material/ripple", "cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/ripple", "cssClasses.BG_FOCUSED")
    @js.native
    def BG_FOCUSED: String = js.native
    inline def BG_FOCUSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BG_FOCUSED")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.FG_ACTIVATION")
    @js.native
    def FG_ACTIVATION: String = js.native
    inline def FG_ACTIVATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FG_ACTIVATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.FG_DEACTIVATION")
    @js.native
    def FG_DEACTIVATION: String = js.native
    inline def FG_DEACTIVATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FG_DEACTIVATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    inline def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "cssClasses.UNBOUNDED")
    @js.native
    def UNBOUNDED: String = js.native
    inline def UNBOUNDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNBOUNDED")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("@material/ripple", "numbers")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/ripple", "numbers.DEACTIVATION_TIMEOUT_MS")
    @js.native
    def DEACTIVATION_TIMEOUT_MS: Double = js.native
    inline def DEACTIVATION_TIMEOUT_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEACTIVATION_TIMEOUT_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.FG_DEACTIVATION_MS")
    @js.native
    def FG_DEACTIVATION_MS: Double = js.native
    inline def FG_DEACTIVATION_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FG_DEACTIVATION_MS")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.INITIAL_ORIGIN_SCALE")
    @js.native
    def INITIAL_ORIGIN_SCALE: Double = js.native
    inline def INITIAL_ORIGIN_SCALE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INITIAL_ORIGIN_SCALE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.PADDING")
    @js.native
    def PADDING: Double = js.native
    inline def PADDING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PADDING")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "numbers.TAP_DELAY_MS")
    @js.native
    def TAP_DELAY_MS: Double = js.native
    inline def TAP_DELAY_MS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAP_DELAY_MS")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("@material/ripple", "strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/ripple", "strings.VAR_FG_SCALE")
    @js.native
    def VAR_FG_SCALE: String = js.native
    inline def VAR_FG_SCALE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_SCALE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_FG_SIZE")
    @js.native
    def VAR_FG_SIZE: String = js.native
    inline def VAR_FG_SIZE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_FG_TRANSLATE_END")
    @js.native
    def VAR_FG_TRANSLATE_END: String = js.native
    inline def VAR_FG_TRANSLATE_END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_TRANSLATE_END")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_FG_TRANSLATE_START")
    @js.native
    def VAR_FG_TRANSLATE_START: String = js.native
    inline def VAR_FG_TRANSLATE_START_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_FG_TRANSLATE_START")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_LEFT")
    @js.native
    def VAR_LEFT: String = js.native
    inline def VAR_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/ripple", "strings.VAR_TOP")
    @js.native
    def VAR_TOP: String = js.native
    inline def VAR_TOP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VAR_TOP")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    @JSImport("@material/ripple", "util")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getNormalizedEventCoords(evt: Event, pageOffset: MDCRipplePoint, clientRect: DOMRect): MDCRipplePoint = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedEventCoords")(evt.asInstanceOf[js.Any], pageOffset.asInstanceOf[js.Any], clientRect.asInstanceOf[js.Any])).asInstanceOf[MDCRipplePoint]
    inline def getNormalizedEventCoords(evt: Unit, pageOffset: MDCRipplePoint, clientRect: DOMRect): MDCRipplePoint = (^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedEventCoords")(evt.asInstanceOf[js.Any], pageOffset.asInstanceOf[js.Any], clientRect.asInstanceOf[js.Any])).asInstanceOf[MDCRipplePoint]
    
    inline def supportsCssVariables(windowObj: /* globalThis */ Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsCssVariables")(windowObj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def supportsCssVariables(windowObj: /* globalThis */ Any, forceRefresh: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("supportsCssVariables")(windowObj.asInstanceOf[js.Any], forceRefresh.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
