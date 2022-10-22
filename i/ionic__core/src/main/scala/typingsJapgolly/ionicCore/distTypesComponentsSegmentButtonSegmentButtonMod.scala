package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsSegmentSegmentInterfaceMod.SegmentButtonLayout
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesUtilsElementInterfaceMod.ButtonInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSegmentButtonSegmentButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/segment-button/segment-button", "SegmentButton")
  @js.native
  open class SegmentButton ()
    extends StObject
       with ComponentInterface
       with ButtonInterface {
    
    var checked: Boolean = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSegmentButton(): Unit = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MSegmentButton(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ def hasIcon: Any = js.native
    
    /* private */ def hasLabel: Any = js.native
    
    /**
      * Set the layout of the text and icon in the segment.
      */
    var layout: js.UndefOr[SegmentButtonLayout] = js.native
    
    @JSName("render")
    def render_MSegmentButton(): Any = js.native
    
    /* private */ var segmentEl: Any = js.native
    
    /* private */ def tabIndex: Any = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
    
    /* private */ var updateState: Any = js.native
    
    /* private */ var updateStyle: Any = js.native
    
    /**
      * The value of the segment button.
      */
    var value: String = js.native
  }
}
