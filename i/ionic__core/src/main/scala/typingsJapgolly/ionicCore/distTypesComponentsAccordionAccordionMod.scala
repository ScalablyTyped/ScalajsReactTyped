package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreInts.`1`
import typingsJapgolly.ionicCore.ionicCoreInts.`2`
import typingsJapgolly.ionicCore.ionicCoreInts.`4`
import typingsJapgolly.ionicCore.ionicCoreInts.`8`
import typingsJapgolly.ionicCore.ionicCoreStrings.end
import typingsJapgolly.ionicCore.ionicCoreStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAccordionAccordionMod {
  
  @JSImport("@ionic/core/dist/types/components/accordion/accordion", "Accordion")
  @js.native
  open class Accordion ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var accordionGroupEl: Any = js.native
    
    /* private */ var collapseAccordion: Any = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MAccordion(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MAccordion(): Unit = js.native
    
    /* private */ var contentEl: Any = js.native
    
    /* private */ var contentElWrapper: Any = js.native
    
    /* private */ var currentRaf: Any = js.native
    
    /**
      * If `true`, the accordion cannot be interacted with.
      */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MAccordion(): Unit = js.native
    
    var el: js.UndefOr[HTMLElement] = js.native
    
    /* private */ var expandAccordion: Any = js.native
    
    /* private */ var getNextSibling: Any = js.native
    
    /* private */ var getPreviousSibling: Any = js.native
    
    /* private */ var getSlottedHeaderIonItem: Any = js.native
    
    /* private */ var headerEl: Any = js.native
    
    var isNext: Boolean = js.native
    
    var isPrevious: Boolean = js.native
    
    /**
      * If `true`, the accordion cannot be interacted with,
      * but does not alter the opacity.
      */
    var readonly: Boolean = js.native
    
    @JSName("render")
    def render_MAccordion(): Any = js.native
    
    /* private */ var setAria: Any = js.native
    
    /* private */ var setItemDefaults: Any = js.native
    
    /**
      * Helper function to determine if
      * something should animate.
      * If prefers-reduced-motion is set
      * then we should not animate, regardless
      * of what is set in the config.
      */
    /* private */ var shouldAnimate: Any = js.native
    
    /* private */ var slotToggleIcon: Any = js.native
    
    var state: AccordionState = js.native
    
    /* private */ var toggleExpanded: Any = js.native
    
    /**
      * The toggle icon to use. This icon will be
      * rotated when the accordion is expanded
      * or collapsed.
      */
    var toggleIcon: String = js.native
    
    /**
      * The slot inside of `ion-item` to
      * place the toggle icon. Defaults to `'end'`.
      */
    var toggleIconSlot: start | end = js.native
    
    /* private */ var updateListener: Any = js.native
    
    /* private */ var updateState: Any = js.native
    
    /**
      * The value of the accordion. Defaults to an autogenerated
      * value.
      */
    var value: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreInts.`1`
    - typingsJapgolly.ionicCore.ionicCoreInts.`2`
    - typingsJapgolly.ionicCore.ionicCoreInts.`4`
    - typingsJapgolly.ionicCore.ionicCoreInts.`8`
  */
  trait AccordionState extends StObject
  object AccordionState {
    
    inline def Collapsed: `1` = 1.asInstanceOf[`1`]
    
    inline def Collapsing: `2` = 2.asInstanceOf[`2`]
    
    inline def Expanded: `4` = 4.asInstanceOf[`4`]
    
    inline def Expanding: `8` = 8.asInstanceOf[`8`]
  }
}
