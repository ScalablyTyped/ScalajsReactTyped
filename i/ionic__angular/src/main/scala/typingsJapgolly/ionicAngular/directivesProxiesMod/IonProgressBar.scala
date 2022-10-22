package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.Buffer
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-progress-bar`
import typingsJapgolly.ionicCore.ionicCoreStrings.determinate
import typingsJapgolly.ionicCore.ionicCoreStrings.indeterminate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonProgressBar")
@js.native
open class IonProgressBar protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonProgressBar {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  /* CompleteClass */
  var buffer: Double = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If true, reverse the progress bar direction.
    */
  /* CompleteClass */
  var reversed: Boolean = js.native
  
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  /* CompleteClass */
  var `type`: determinate | indeterminate = js.native
  
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  /* CompleteClass */
  var value: Double = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonProgressBar {
  
  @JSImport("@ionic/angular/directives/proxies", "IonProgressBar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonProgressBar.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonProgressBar, 
    `ion-progress-bar`, 
    scala.Nothing, 
    Buffer, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonProgressBar, 
      `ion-progress-bar`, 
      scala.Nothing, 
      Buffer, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonProgressBar.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonProgressBar, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonProgressBar, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
