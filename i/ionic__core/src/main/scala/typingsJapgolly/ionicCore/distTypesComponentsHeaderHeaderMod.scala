package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.ionicCoreStrings.condense
import typingsJapgolly.ionicCore.ionicCoreStrings.fade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsHeaderHeaderMod {
  
  @JSImport("@ionic/core/dist/types/components/header/header", "Header")
  @js.native
  open class Header ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var checkCollapsibleHeader: Any = js.native
    
    /**
      * Describes the scroll effect that will be applied to the header.
      * Only applies in iOS mode.
      *
      * Typically used for [Collapsible Large Titles](https://ionicframework.com/docs/api/title#collapsible-large-titles)
      */
    var collapse: js.UndefOr[condense | fade] = js.native
    
    /* private */ var collapsibleMainHeader: Any = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MHeader(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHeader(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MHeader(): Unit = js.native
    
    /* private */ var contentScrollCallback: Any = js.native
    
    /* private */ var destroyCollapsibleHeader: Any = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MHeader(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /* private */ var intersectionObserver: Any = js.native
    
    @JSName("render")
    def render_MHeader(): Any = js.native
    
    /* private */ var scrollEl: Any = js.native
    
    /* private */ var setupCondenseHeader: Any = js.native
    
    /* private */ var setupFadeHeader: Any = js.native
    
    /**
      * If `true`, the header will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      *
      * Note: In order to scroll content behind the header, the `fullscreen`
      * attribute needs to be set on the content.
      */
    var translucent: Boolean = js.native
  }
}
