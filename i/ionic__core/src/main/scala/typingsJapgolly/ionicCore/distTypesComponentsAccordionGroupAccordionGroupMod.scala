package typingsJapgolly.ionicCore

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.ionicCore.distTypesComponentsAccordionGroupAccordionGroupInterfaceMod.AccordionGroupChangeEventDetail
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAccordionElement
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonAccordionGroupElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreStrings.compact
import typingsJapgolly.ionicCore.ionicCoreStrings.inset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAccordionGroupAccordionGroupMod {
  
  @JSImport("@ionic/core/dist/types/components/accordion-group/accordion-group", "AccordionGroup")
  @js.native
  open class AccordionGroup ()
    extends StObject
       with ComponentInterface {
    
    /**
      * If `true`, all accordions inside of the
      * accordion group will animate when expanding
      * or collapsing.
      */
    var animated: Boolean = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MAccordionGroup(): js.Promise[Unit] = js.native
    
    /**
      * If `true`, the accordion group cannot be interacted with.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): js.Promise[Unit] = js.native
    
    var el: HTMLIonAccordionGroupElement = js.native
    
    /**
      * Describes the expansion behavior for each accordion.
      * Possible values are `"compact"` and `"inset"`.
      * Defaults to `"compact"`.
      */
    var expand: compact | inset = js.native
    
    /* private */ var findNextAccordion: Any = js.native
    
    /* private */ var findPreviousAccordion: Any = js.native
    
    /**
      * @internal
      */
    def getAccordions(): js.Promise[js.Array[HTMLIonAccordionElement]] = js.native
    
    /**
      * Emitted when the value property has changed.
      */
    var ionChange: EventEmitter[AccordionGroupChangeEventDetail[Any]] = js.native
    
    /**
      * If `true`, the accordion group can have multiple
      * accordion components expanded at the same time.
      */
    var multiple: js.UndefOr[Boolean] = js.native
    
    def onKeydown(ev: KeyboardEvent): js.Promise[Unit] = js.native
    
    /**
      * If `true`, the accordion group cannot be interacted with,
      * but does not alter the opacity.
      */
    var readonly: Boolean = js.native
    
    def readonlyChanged(): js.Promise[Unit] = js.native
    
    @JSName("render")
    def render_MAccordionGroup(): Any = js.native
    
    /**
      * @internal
      */
    def requestAccordionToggle(accordionValue: String, accordionExpand: Boolean): js.Promise[Unit] = js.native
    def requestAccordionToggle(accordionValue: Unit, accordionExpand: Boolean): js.Promise[Unit] = js.native
    
    /**
      * The value of the accordion group.
      */
    var value: js.UndefOr[String | js.Array[String] | Null] = js.native
    
    def valueChanged(): Unit = js.native
  }
}
