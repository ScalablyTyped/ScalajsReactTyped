package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.CloseDuration
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-refresher`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonRefresher")
@js.native
open class IonRefresher protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonRefresher {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /**
    * Changes the refresher's state from `refreshing` to `cancelling`.
    */
  /* CompleteClass */
  override def cancel(): js.Promise[Unit] = js.native
  
  /**
    * Time it takes to close the refresher. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var closeDuration: String = js.native
  
  /**
    * Call `complete()` when your async operation has completed. For example, the `refreshing` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request. Once the data has been received, you then call this method to signify that the refreshing has completed and to close the refresher. This method also changes the refresher's state from `refreshing` to `completing`.
    */
  /* CompleteClass */
  override def complete(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the refresher will be hidden.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * A number representing how far down the user has pulled. The number `0` represents the user hasn't pulled down at all. The number `1`, and anything greater than `1`, represents that the user has pulled far enough down that when they let go then the refresh will happen. If they let go and the number is less than `1`, then the refresh will not happen, and the content will return to it's original position.
    */
  /* CompleteClass */
  override def getProgress(): js.Promise[Double] = js.native
  
  /**
    * Emitted while the user is pulling down the content and exposing the refresher.
    */
  var ionPull: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user lets go of the content and has pulled down
    further than the `pullMin` or pulls the content down and exceeds the pullMax.
    Updates the refresher state to `refreshing`. The `complete()` method should be
    called when the async operation has completed.
    */
  var ionRefresh: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the user begins to start pulling down.
    */
  var ionStart: EventEmitter[CustomEvent] = js.native
  
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.  Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var pullFactor: Double = js.native
  
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`. Does not apply when  the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var pullMax: Double = js.native
  
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var pullMin: Double = js.native
  
  /**
    * Time it takes the refresher to snap back to the `refreshing` state. Does not apply when the refresher content uses a spinner, enabling the native refresher.
    */
  /* CompleteClass */
  var snapbackDuration: String = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonRefresher {
  
  @JSImport("@ionic/angular/directives/proxies", "IonRefresher")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonRefresher.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonRefresher, 
    `ion-refresher`, 
    scala.Nothing, 
    CloseDuration, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonRefresher, 
      `ion-refresher`, 
      scala.Nothing, 
      CloseDuration, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonRefresher.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonRefresher, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonRefresher, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
