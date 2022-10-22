package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsImgImgMod {
  
  @JSImport("@ionic/core/dist/types/components/img/img", "Img")
  @js.native
  open class Img ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var addIO: Any = js.native
    
    /**
      * This attribute defines the alternative text describing the image.
      * Users will see this text displayed if the image URL is wrong,
      * the image is not in one of the supported formats, or if the image is not yet downloaded.
      */
    var alt: js.UndefOr[String] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MImg(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MImg(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var inheritedAttributes: Any = js.native
    
    /* private */ var io: Any = js.native
    
    /** Emitted when the img fails to load */
    var ionError: EventEmitter[Unit] = js.native
    
    /** Emitted when the image has finished loading */
    var ionImgDidLoad: EventEmitter[Unit] = js.native
    
    /** Emitted when the img src has been set */
    var ionImgWillLoad: EventEmitter[Unit] = js.native
    
    /* private */ var load: Any = js.native
    
    var loadError: js.UndefOr[js.Function0[Unit]] = js.native
    
    var loadSrc: js.UndefOr[String] = js.native
    
    /* private */ var onError: Any = js.native
    
    /* private */ var onLoad: Any = js.native
    
    /* private */ var removeIO: Any = js.native
    
    @JSName("render")
    def render_MImg(): Any = js.native
    
    /**
      * The image URL. This attribute is mandatory for the `<img>` element.
      */
    var src: js.UndefOr[String] = js.native
    
    def srcChanged(): Unit = js.native
  }
}
