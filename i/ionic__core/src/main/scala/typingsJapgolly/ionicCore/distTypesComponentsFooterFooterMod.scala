package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonFooterElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.fade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsFooterFooterMod {
  
  @JSImport("@ionic/core/dist/types/components/footer/footer", "Footer")
  @js.native
  open class Footer ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var checkCollapsibleFooter: Any = js.native
    
    /**
      * Describes the scroll effect that will be applied to the footer.
      * Only applies in iOS mode.
      */
    var collapse: js.UndefOr[fade] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MFooter(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MFooter(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MFooter(): Unit = js.native
    
    /* private */ var contentScrollCallback: Any = js.native
    
    /* private */ var destroyCollapsibleFooter: Any = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MFooter(): Unit = js.native
    
    var el: HTMLIonFooterElement = js.native
    
    /* private */ var keyboardCtrl: Any = js.native
    
    /* private */ var keyboardVisible: Any = js.native
    
    @JSName("render")
    def render_MFooter(): Any = js.native
    
    /* private */ var scrollEl: Any = js.native
    
    /* private */ var setupFadeFooter: Any = js.native
    
    /**
      * If `true`, the footer will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      *
      * Note: In order to scroll content behind the footer, the `fullscreen`
      * attribute needs to be set on the content.
      */
    var translucent: Boolean = js.native
  }
}
