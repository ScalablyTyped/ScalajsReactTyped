package typingsJapgolly.ionicCore

import org.scalajs.dom.HTMLElement
import typingsJapgolly.ionicCore.distTypesComponentsReorderGroupReorderGroupInterfaceMod.ItemReorderEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreInts.`0`
import typingsJapgolly.ionicCore.ionicCoreInts.`1`
import typingsJapgolly.ionicCore.ionicCoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsReorderGroupReorderGroupMod {
  
  @JSImport("@ionic/core/dist/types/components/reorder-group/reorder-group", "ReorderGroup")
  @js.native
  open class ReorderGroup ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var autoscroll: Any = js.native
    
    /* private */ var cachedHeights: Any = js.native
    
    /* private */ var canStart: Any = js.native
    
    /**
      * Completes the reorder operation. Must be called by the `ionItemReorder` event.
      *
      * If a list of items is passed, the list will be reordered and returned in the
      * proper order.
      *
      * If no parameters are passed or if `true` is passed in, the reorder will complete
      * and the item will remain in the position it was dragged to. If `false` is passed,
      * the reorder will complete and the item will bounce back to its original position.
      *
      * @param listOrReorder A list of items to be sorted and returned in the new order or a
      * boolean of whether or not the reorder should reposition the item.
      */
    def complete(): js.Promise[Any] = js.native
    def complete(listOrReorder: js.Array[Any]): js.Promise[Any] = js.native
    def complete(listOrReorder: Boolean): js.Promise[Any] = js.native
    
    /* private */ var completeSync: Any = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MReorderGroup(): js.Promise[Unit] = js.native
    
    /* private */ var containerBottom: Any = js.native
    
    /* private */ var containerTop: Any = js.native
    
    /**
      * If `true`, the reorder will be hidden.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MReorderGroup(): Unit = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var gesture: Any = js.native
    
    /**
      * Event that needs to be listened to in order to complete the reorder action.
      * Once the event has been emitted, the `complete()` method then needs
      * to be called in order to finalize the reorder action.
      */
    var ionItemReorder: EventEmitter[ItemReorderEventDetail] = js.native
    
    /* private */ var itemIndexForTop: Any = js.native
    
    /* private */ var lastToIndex: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onMove: Any = js.native
    
    /* private */ var onStart: Any = js.native
    
    @JSName("render")
    def render_MReorderGroup(): Any = js.native
    
    /********* DOM WRITE ********* */
    /* private */ var reorderMove: Any = js.native
    
    /* private */ var scrollEl: Any = js.native
    
    /* private */ var scrollElBottom: Any = js.native
    
    /* private */ var scrollElInitial: Any = js.native
    
    /* private */ var scrollElTop: Any = js.native
    
    /* private */ var selectedItemEl: Any = js.native
    
    /* private */ var selectedItemHeight: Any = js.native
    
    var state: ReorderGroupState = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreInts.`0`
    - typingsJapgolly.ionicCore.ionicCoreInts.`1`
    - typingsJapgolly.ionicCore.ionicCoreInts.`2`
  */
  trait ReorderGroupState extends StObject
  object ReorderGroupState {
    
    inline def Active: `1` = 1.asInstanceOf[`1`]
    
    inline def Complete: `2` = 2.asInstanceOf[`2`]
    
    inline def Idle: `0` = 0.asInstanceOf[`0`]
  }
}
