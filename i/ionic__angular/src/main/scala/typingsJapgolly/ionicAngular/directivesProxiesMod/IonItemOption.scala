package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.Download
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-item-option`
import typingsJapgolly.ionicCore.ionicCoreStrings.button
import typingsJapgolly.ionicCore.ionicCoreStrings.reset
import typingsJapgolly.ionicCore.ionicCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonItemOption")
@js.native
open class IonItemOption protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonItemOption {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /**
    * If `true`, the user cannot interact with the item option.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If `true`, the option will expand to take up the available width and cover any other options.
    */
  /* CompleteClass */
  var expandable: Boolean = js.native
  
  /**
    * The type of the button.
    */
  /* CompleteClass */
  var `type`: submit | reset | button = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonItemOption {
  
  @JSImport("@ionic/angular/directives/proxies", "IonItemOption")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonItemOption.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonItemOption, 
    `ion-item-option`, 
    scala.Nothing, 
    Download, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonItemOption, 
      `ion-item-option`, 
      scala.Nothing, 
      Download, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonItemOption.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonItemOption, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonItemOption, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
