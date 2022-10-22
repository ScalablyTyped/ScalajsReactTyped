package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.FlipRtl
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-icon`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonIcon")
@js.native
open class IonIcon protected ()
  extends StObject
     with typingsJapgolly.ionicons.distTypesComponentsMod.Components.IonIcon {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * If enabled, ion-icon will be loaded lazily when it's visible in the viewport. Default, `false`.
    */
  /* CompleteClass */
  var `lazy`: Boolean = js.native
  
  /**
    * The mode determines which platform styles to use.
    */
  /* CompleteClass */
  var mode: String = js.native
  
  /**
    * When set to `false`, SVG content that is HTTP fetched will not be checked if the response SVG content has any `<script>` elements, or any attributes that start with `on`, such as `onclick`.
    * @default true
    */
  /* CompleteClass */
  var sanitize: Boolean = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonIcon {
  
  @JSImport("@ionic/angular/directives/proxies", "IonIcon")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonIcon.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonIcon, 
    `ion-icon`, 
    scala.Nothing, 
    FlipRtl, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonIcon, 
      `ion-icon`, 
      scala.Nothing, 
      FlipRtl, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonIcon.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonIcon, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonIcon, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
