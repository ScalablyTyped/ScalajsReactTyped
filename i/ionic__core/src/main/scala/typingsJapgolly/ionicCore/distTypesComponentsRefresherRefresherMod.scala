package typingsJapgolly.ionicCore

import typingsJapgolly.ionicCore.distTypesComponentsMod.global.HTMLIonRefresherElement
import typingsJapgolly.ionicCore.distTypesComponentsRefresherRefresherInterfaceMod.RefresherEventDetail
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.ComponentInterface
import typingsJapgolly.ionicCore.distTypesStencilPublicRuntimeMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsRefresherRefresherMod {
  
  @JSImport("@ionic/core/dist/types/components/refresher/refresher", "Refresher")
  @js.native
  open class Refresher ()
    extends StObject
       with ComponentInterface {
    
    /* private */ var animations: Any = js.native
    
    /* private */ var appliedStyles: Any = js.native
    
    /* private */ var backgroundContentEl: Any = js.native
    
    /* private */ var beginRefresh: Any = js.native
    
    /* private */ var canStart: Any = js.native
    
    /**
      * Changes the refresher's state from `refreshing` to `cancelling`.
      */
    def cancel(): js.Promise[Unit] = js.native
    
    /* private */ var checkNativeRefresher: Any = js.native
    
    /* private */ var close: Any = js.native
    
    /**
      * Time it takes to close the refresher.
      * Does not apply when the refresher content uses a spinner,
      * enabling the native refresher.
      */
    var closeDuration: String = js.native
    
    /**
      * Call `complete()` when your async operation has completed.
      * For example, the `refreshing` state is while the app is performing
      * an asynchronous operation, such as receiving more data from an
      * AJAX request. Once the data has been received, you then call this
      * method to signify that the refreshing has completed and to close
      * the refresher. This method also changes the refresher's state from
      * `refreshing` to `completing`.
      */
    def complete(): js.Promise[Unit] = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MRefresher(): Unit = js.native
    
    @JSName("connectedCallback")
    def connectedCallback_MRefresher(): js.Promise[Unit] = js.native
    
    /* private */ var destroyNativeRefresher: Any = js.native
    
    /* private */ var didRefresh: Any = js.native
    
    /* private */ var didStart: Any = js.native
    
    /**
      * If `true`, the refresher will be hidden.
      */
    var disabled: Boolean = js.native
    
    def disabledChanged(): Unit = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MRefresher(): Unit = js.native
    
    var el: HTMLIonRefresherElement = js.native
    
    /* private */ var elementToTransform: Any = js.native
    
    /* private */ var gesture: Any = js.native
    
    /**
      * A number representing how far down the user has pulled.
      * The number `0` represents the user hasn't pulled down at all. The
      * number `1`, and anything greater than `1`, represents that the user
      * has pulled far enough down that when they let go then the refresh will
      * happen. If they let go and the number is less than `1`, then the
      * refresh will not happen, and the content will return to it's original
      * position.
      */
    def getProgress(): js.Promise[Double] = js.native
    
    /**
      * Emitted while the user is pulling down the content and exposing the refresher.
      */
    var ionPull: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the user lets go of the content and has pulled down
      * further than the `pullMin` or pulls the content down and exceeds the pullMax.
      * Updates the refresher state to `refreshing`. The `complete()` method should be
      * called when the async operation has completed.
      */
    var ionRefresh: EventEmitter[RefresherEventDetail] = js.native
    
    /**
      * Emitted when the user begins to start pulling down.
      */
    var ionStart: EventEmitter[Unit] = js.native
    
    /* private */ var lastVelocityY: Any = js.native
    
    /* private */ var nativeRefresher: Any = js.native
    
    /* private */ var needsCompletion: Any = js.native
    
    /* private */ var onEnd: Any = js.native
    
    /* private */ var onMove: Any = js.native
    
    /* private */ var onStart: Any = js.native
    
    /* private */ var pointerDown: Any = js.native
    
    /* private */ var progress: Any = js.native
    
    /**
      * How much to multiply the pull speed by. To slow the pull animation down,
      * pass a number less than `1`. To speed up the pull, pass a number greater
      * than `1`. The default value is `1` which is equal to the speed of the cursor.
      * If a negative value is passed in, the factor will be `1` instead.
      *
      * For example: If the value passed is `1.2` and the content is dragged by
      * `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels
      * (an increase of 20 percent). If the value passed is `0.8`, the dragged amount
      * will be `8` pixels, less than the amount the cursor has moved.
      *
      * Does not apply when the refresher content uses a spinner,
      * enabling the native refresher.
      */
    var pullFactor: Double = js.native
    
    /**
      * The maximum distance of the pull until the refresher
      * will automatically go into the `refreshing` state.
      * Defaults to the result of `pullMin + 60`.
      * Does not apply when  the refresher content uses a spinner,
      * enabling the native refresher.
      */
    var pullMax: Double = js.native
    
    /**
      * The minimum distance the user must pull down until the
      * refresher will go into the `refreshing` state.
      * Does not apply when the refresher content uses a spinner,
      * enabling the native refresher.
      */
    var pullMin: Double = js.native
    
    @JSName("render")
    def render_MRefresher(): Any = js.native
    
    /* private */ var resetNativeRefresher: Any = js.native
    
    /* private */ var scrollEl: Any = js.native
    
    /* private */ var scrollListenerCallback: Any = js.native
    
    /* private */ var setCss: Any = js.native
    
    /* private */ var setupMDNativeRefresher: Any = js.native
    
    /* private */ var setupNativeRefresher: Any = js.native
    
    /* private */ var setupiOSNativeRefresher: Any = js.native
    
    /**
      * Time it takes the refresher to snap back to the `refreshing` state.
      * Does not apply when the refresher content uses a spinner,
      * enabling the native refresher.
      */
    var snapbackDuration: String = js.native
    
    /**
      * The current state which the refresher is in. The refresher's states include:
      *
      * - `inactive` - The refresher is not being pulled down or refreshing and is currently hidden.
      * - `pulling` - The user is actively pulling down the refresher, but has not reached the point yet that if the user lets go, it'll refresh.
      * - `cancelling` - The user pulled down the refresher and let go, but did not pull down far enough to kick off the `refreshing` state. After letting go, the refresher is in the `cancelling` state while it is closing, and will go back to the `inactive` state once closed.
      * - `ready` - The user has pulled down the refresher far enough that if they let go, it'll begin the `refreshing` state.
      * - `refreshing` - The refresher is actively waiting on the async operation to end. Once the refresh handler calls `complete()` it will begin the `completing` state.
      * - `completing` - The `refreshing` state has finished and the refresher is in the way of closing itself. Once closed, the refresher will go back to the `inactive` state.
      */
    /* private */ var state: Any = js.native
  }
}
