package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreStrings.fixed
import typingsJapgolly.ionicCore.ionicCoreStrings.floating
import typingsJapgolly.ionicCore.ionicCoreStrings.stacked
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsLabelLabelMod {
  
  @JSImport("@ionic/core/dist/types/components/label/label", "Label")
  @js.native
  open class Label ()
    extends StObject
       with ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    def colorChanged(): Unit = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MLabel(): Unit = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MLabel(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var emitColor: Any = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /* private */ var inRange: Any = js.native
    
    /**
      * Emitted when the color changes.
      * @internal
      */
    var ionColor: EventEmitter[StyleEventDetail] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    var noAnimate: Boolean = js.native
    
    /**
      * The position determines where and how the label behaves inside an item.
      */
    var position: js.UndefOr[fixed | stacked | floating] = js.native
    
    def positionChanged(): Unit = js.native
    
    @JSName("render")
    def render_MLabel(): Any = js.native
  }
}
