package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonItemSlidingElement
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import typingsJapgolly.ionicCore.ionicCoreInts.`16`
import typingsJapgolly.ionicCore.ionicCoreInts.`2`
import typingsJapgolly.ionicCore.ionicCoreInts.`32`
import typingsJapgolly.ionicCore.ionicCoreInts.`4`
import typingsJapgolly.ionicCore.ionicCoreInts.`64`
import typingsJapgolly.ionicCore.ionicCoreInts.`8`
import typingsJapgolly.ionicCore.mod.Side
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsItemSlidingItemSlidingMod {
  
  @JSImport("@ionic/core/dist/types/components/item-sliding/item-sliding", "ItemSliding")
  @js.native
  open class ItemSliding ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var calculateOptsWidth: Any = js.native
    
    /* private */ var canStart: Any = js.native
    
    /**
      * Close the sliding item. Items can also be closed from the [List](./list).
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Close all of the sliding items in the list. Items can also be closed from the [List](./list).
      */
    def closeOpened(): js.Promise[Boolean] = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MItemSliding(): js.Promise[Unit] = js.native
    
    /* private */ var contentEl: Any = js.native
    
    /**
      * If `true`, the user cannot interact with the sliding item.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MItemSliding(): Unit = js.native
    
    var el: HTMLIonItemSlidingElement = js.native
    
    /* private */ var gesture: Any = js.native
    
    /**
      * Get the amount the item is open in pixels.
      */
    def getOpenAmount(): js.Promise[Double] = js.native
    
    /**
      * Given an optional side, return the ion-item-options element.
      *
      * @param side This side of the options to get. If a side is not provided it will
      * return the first one available.
      */
    /* private */ var getOptions: Any = js.native
    
    /**
      * Get the ratio of the open amount of the item compared to the width of the options.
      * If the number returned is positive, then the options on the right side are open.
      * If the number returned is negative, then the options on the left side are open.
      * If the absolute value of the number is greater than 1, the item is open more than
      * the width of the options.
      */
    def getSlidingRatio(): js.Promise[Double] = js.native
    
    /* private */ var getSlidingRatioSync: Any = js.native
    
    /* private */ var initialContentScrollY: Any = js.native
    
    /* private */ var initialOpenAmount: Any = js.native
    
    /**
      * Emitted when the sliding position changes.
      */
    var ionDrag: EventEmitter[Any] = js.native
    
    /* private */ var item: Any = js.native
    
    /* private */ var leftOptions: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onMove: Any = js.native
    
    /* private */ var onStart: Any = js.native
    
    /**
      * Open the sliding item.
      *
      * @param side The side of the options to open. If a side is not provided, it will open the first set of options it finds within the item.
      */
    def open(): js.Promise[Unit] = js.native
    def open(side: Side): js.Promise[Unit] = js.native
    
    /* private */ var openAmount: Any = js.native
    
    /* private */ var optsDirty: Any = js.native
    
    /* private */ var optsWidthLeftSide: Any = js.native
    
    /* private */ var optsWidthRightSide: Any = js.native
    
    @JSName("render")
    def render_MItemSliding(): Any = js.native
    
    /* private */ var rightOptions: Any = js.native
    
    /* private */ var setOpenAmount: Any = js.native
    
    /* private */ var sides: Any = js.native
    
    var state: SlidingState = js.native
    
    /* private */ var tmr: Any = js.native
    
    /* private */ var updateOptions: Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ionicCore.ionicCoreInts.`2`
    - typingsJapgolly.ionicCore.ionicCoreInts.`4`
    - typingsJapgolly.ionicCore.ionicCoreInts.`8`
    - typingsJapgolly.ionicCore.ionicCoreInts.`16`
    - typingsJapgolly.ionicCore.ionicCoreInts.`32`
    - typingsJapgolly.ionicCore.ionicCoreInts.`64`
  */
  trait SlidingState extends StObject
  object SlidingState {
    
    inline def Disabled: `2` = 2.asInstanceOf[`2`]
    
    inline def Enabled: `4` = 4.asInstanceOf[`4`]
    
    inline def End: `8` = 8.asInstanceOf[`8`]
    
    inline def Start: `16` = 16.asInstanceOf[`16`]
    
    inline def SwipeEnd: `32` = 32.asInstanceOf[`32`]
    
    inline def SwipeStart: `64` = 64.asInstanceOf[`64`]
  }
}
