package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.Autocomplete
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-searchbar`
import typingsJapgolly.ionicCore.ionicCoreStrings.always
import typingsJapgolly.ionicCore.ionicCoreStrings.email
import typingsJapgolly.ionicCore.ionicCoreStrings.focus
import typingsJapgolly.ionicCore.ionicCoreStrings.never
import typingsJapgolly.ionicCore.ionicCoreStrings.number
import typingsJapgolly.ionicCore.ionicCoreStrings.off
import typingsJapgolly.ionicCore.ionicCoreStrings.on
import typingsJapgolly.ionicCore.ionicCoreStrings.password
import typingsJapgolly.ionicCore.ionicCoreStrings.search
import typingsJapgolly.ionicCore.ionicCoreStrings.tel
import typingsJapgolly.ionicCore.ionicCoreStrings.text
import typingsJapgolly.ionicCore.ionicCoreStrings.url
import typingsJapgolly.ionicCore.mod.AutocompleteTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonSearchbar")
@js.native
open class IonSearchbar protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonSearchbar {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /**
    * If `true`, enable searchbar animation.
    */
  /* CompleteClass */
  var animated: Boolean = js.native
  
  /**
    * Set the input's autocomplete property.
    */
  /* CompleteClass */
  var autocomplete: AutocompleteTypes = js.native
  
  /**
    * Set the input's autocorrect property.
    */
  /* CompleteClass */
  var autocorrect: on | off = js.native
  
  /**
    * Set the cancel button icon. Only applies to `md` mode. Defaults to `arrow-back-sharp`.
    */
  /* CompleteClass */
  var cancelButtonIcon: String = js.native
  
  /**
    * Set the the cancel button text. Only applies to `ios` mode.
    */
  /* CompleteClass */
  var cancelButtonText: String = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the input.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * Returns the native `<input>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLInputElement] = js.native
  
  /**
    * Emitted when the input loses focus.
    */
  var ionBlur: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the cancel button is clicked.
    */
  var ionCancel: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the value has changed.
    */
  var ionChange: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the clear input button is clicked.
    */
  var ionClear: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the input has focus.
    */
  var ionFocus: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when a keyboard input occurred.
    */
  var ionInput: EventEmitter[CustomEvent] = js.native
  
  /**
    * Set the input's placeholder. `placeholder` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  /* CompleteClass */
  var placeholder: String = js.native
  
  /**
    * Sets focus on the specified `ion-searchbar`. Use this method instead of the global `input.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * Sets the behavior for the cancel button. Defaults to `"never"`. Setting to `"focus"` shows the cancel button on focus. Setting to `"never"` hides the cancel button. Setting to `"always"` shows the cancel button regardless of focus state.
    */
  /* CompleteClass */
  var showCancelButton: never | focus | always = js.native
  
  /**
    * Sets the behavior for the clear button. Defaults to `"focus"`. Setting to `"focus"` shows the clear button on focus if the input is not empty. Setting to `"never"` hides the clear button. Setting to `"always"` shows the clear button regardless of focus state, but only if the input is not empty.
    */
  /* CompleteClass */
  var showClearButton: never | focus | always = js.native
  
  /**
    * If `true`, enable spellcheck on the input.
    */
  /* CompleteClass */
  var spellcheck: Boolean = js.native
  
  /**
    * Set the type of the input.
    */
  /* CompleteClass */
  var `type`: text | password | email | number | search | tel | url = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonSearchbar {
  
  @JSImport("@ionic/angular/directives/proxies", "IonSearchbar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonSearchbar.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonSearchbar, 
    `ion-searchbar`, 
    scala.Nothing, 
    Autocomplete, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonSearchbar, 
      `ion-searchbar`, 
      scala.Nothing, 
      Autocomplete, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonSearchbar.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonSearchbar, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonSearchbar, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
