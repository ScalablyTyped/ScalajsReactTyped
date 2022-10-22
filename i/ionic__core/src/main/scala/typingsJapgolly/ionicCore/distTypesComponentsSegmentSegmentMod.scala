package typingsJapgolly.ionicCore

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonSegmentElement
import typingsJapgolly.ionicCore.distTypesComponentsSegmentSegmentInterfaceMod.SegmentChangeEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.distTypesUtilsGestureMod.GestureDetail
import typingsJapgolly.ionicCore.mod.Color
import typingsJapgolly.ionicCore.mod.StyleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsSegmentSegmentMod {
  
  @JSImport("@ionic/core/dist/types/components/segment/segment", "Segment")
  @js.native
  open class Segment ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var activate: Any = js.native
    
    var activated: Boolean = js.native
    
    /**
      * The gesture blocks the segment button ripple. This
      * function adds the ripple based on the checked segment
      * and where the cursor ended.
      */
    /* private */ var addRipple: Any = js.native
    
    /* private */ var checkButton: Any = js.native
    
    /* private */ var checked: Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    /* protected */ def colorChanged(): Unit = js.native
    /* protected */ def colorChanged(value: Unit, oldValue: Color): Unit = js.native
    /* protected */ def colorChanged(value: Color): Unit = js.native
    /* protected */ def colorChanged(value: Color, oldValue: Color): Unit = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MSegment(): js.Promise[Unit] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MSegment(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MSegment(): Unit = js.native
    
    /* private */ var didInit: Any = js.native
    
    /**
      * If `true`, the user cannot interact with the segment.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    var el: HTMLIonSegmentElement = js.native
    
    /* private */ var emitStyle: Any = js.native
    
    /* private */ var ensureFocusable: Any = js.native
    
    /* private */ var gesture: Any = js.native
    
    /* private */ var gestureChanged: Any = js.native
    
    /* private */ var getButtons: Any = js.native
    
    /* private */ var getIndicator: Any = js.native
    
    /* private */ var getSegmentButton: Any = js.native
    
    /**
      * Emitted when the value property has changed and any
      * dragging pointer has been released from `ion-segment`.
      */
    var ionChange: EventEmitter[SegmentChangeEventDetail] = js.native
    
    /**
      * Emitted when user has dragged over a new button
      * @internal
      */
    var ionSelect: EventEmitter[SegmentChangeEventDetail] = js.native
    
    /**
      * Emitted when the styles change.
      * @internal
      */
    var ionStyle: EventEmitter[StyleEventDetail] = js.native
    
    /* private */ var onClick: Any = js.native
    
    def onEnd(detail: GestureDetail): Unit = js.native
    
    def onKeyDown(ev: KeyboardEvent): Unit = js.native
    
    def onMove(detail: GestureDetail): Unit = js.native
    
    def onStart(detail: GestureDetail): Unit = js.native
    
    @JSName("render")
    def render_MSegment(): Any = js.native
    
    /**
      * If `true`, the segment buttons will overflow and the user can swipe to see them.
      * In addition, this will disable the gesture to drag the indicator between the buttons
      * in order to swipe to see hidden buttons.
      */
    var scrollable: Boolean = js.native
    
    /**
      * If `true`, navigating to an `ion-segment-button` with the keyboard will focus and select the element.
      * If `false`, keyboard navigation will only focus the `ion-segment-button` element.
      */
    var selectOnFocus: Boolean = js.native
    
    /* private */ var setActivated: Any = js.native
    
    /* private */ var setCheckedClasses: Any = js.native
    
    /* private */ var setNextIndex: Any = js.native
    
    /**
      * If `true`, users will be able to swipe between segment buttons to activate them.
      */
    var swipeGesture: Boolean = js.native
    
    def swipeGestureChanged(): Unit = js.native
    
    /**
      * the value of the segment.
      */
    var value: js.UndefOr[String | Null] = js.native
    
    /* private */ var valueAfterGesture: Any = js.native
    
    /* protected */ def valueChanged(): Unit = js.native
    /* protected */ def valueChanged(value: String): Unit = js.native
    /* protected */ def valueChanged(value: String, oldValue: String): Unit = js.native
    /* protected */ def valueChanged(value: Unit, oldValue: String): Unit = js.native
  }
}
