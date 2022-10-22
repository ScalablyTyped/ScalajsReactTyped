package typingsJapgolly.ionicAngular.directivesProxiesMod

import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.angularCore.mod.ChangeDetectorRef
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.EventEmitter
import typingsJapgolly.angularCore.mod.NgZone
import typingsJapgolly.angularCore.mod.ɵɵComponentDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.ionicAngular.anon.AutoGrow
import typingsJapgolly.ionicAngular.ionicAngularBooleans.`false`
import typingsJapgolly.ionicAngular.ionicAngularStrings.Asterisk
import typingsJapgolly.ionicAngular.ionicAngularStrings.`ion-textarea`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonTextarea")
@js.native
open class IonTextarea protected ()
  extends StObject
     with typingsJapgolly.ionicCore.distTypesComponentsMod.Components.IonTextarea {
  def this(c: ChangeDetectorRef, r: ElementRef[Any], z: NgZone) = this()
  
  /**
    * If `true`, the textarea container will grow and shrink based on the contents of the textarea.
    */
  /* CompleteClass */
  var autoGrow: Boolean = js.native
  
  /**
    * Indicates whether and how the text value should be automatically capitalized as it is entered/edited by the user. Available options: `"off"`, `"none"`, `"on"`, `"sentences"`, `"words"`, `"characters"`.
    */
  /* CompleteClass */
  var autocapitalize: String = js.native
  
  /**
    * This Boolean attribute lets you specify that a form control should have input focus when the page loads.
    */
  /* CompleteClass */
  var autofocus: Boolean = js.native
  
  /**
    * If `true`, the value will be cleared after focus upon edit. Defaults to `true` when `type` is `"password"`, `false` for all other types.
    */
  /* CompleteClass */
  var clearOnEdit: Boolean = js.native
  
  /**
    * Set the amount of time, in milliseconds, to wait to trigger the `ionChange` event after each keystroke. This also impacts form bindings such as `ngModel` or `v-model`.
    */
  /* CompleteClass */
  var debounce: Double = js.native
  
  /**
    * If `true`, the user cannot interact with the textarea.
    */
  /* CompleteClass */
  var disabled: Boolean = js.native
  
  /* protected */ var el: HTMLElement = js.native
  
  /**
    * This is required for a WebKit bug which requires us to blur and focus an input to properly focus the input in an item with delegatesFocus. It will no longer be needed with iOS 14.
    */
  /* CompleteClass */
  var fireFocusEvents: Boolean = js.native
  
  /**
    * Returns the native `<textarea>` element used under the hood.
    */
  /* CompleteClass */
  override def getInputElement(): js.Promise[HTMLTextAreaElement] = js.native
  
  /**
    * Emitted when the input loses focus.
    */
  var ionBlur: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the input value has changed.
    */
  var ionChange: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when the input has focus.
    */
  var ionFocus: EventEmitter[CustomEvent] = js.native
  
  /**
    * Emitted when a keyboard input occurred.
    */
  var ionInput: EventEmitter[CustomEvent] = js.native
  
  /**
    * The name of the control, which is submitted with the form data.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * If `true`, the user cannot modify the value.
    */
  /* CompleteClass */
  var readonly: Boolean = js.native
  
  /**
    * If `true`, the user must fill in a value before submitting a form.
    */
  /* CompleteClass */
  var required: Boolean = js.native
  
  /**
    * Sets blur on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.blur()`.
    */
  /* CompleteClass */
  override def setBlur(): js.Promise[Unit] = js.native
  
  /**
    * Sets focus on the native `textarea` in `ion-textarea`. Use this method instead of the global `textarea.focus()`.
    */
  /* CompleteClass */
  override def setFocus(): js.Promise[Unit] = js.native
  
  /**
    * If `true`, the element will have its spelling and grammar checked.
    */
  /* CompleteClass */
  var spellcheck: Boolean = js.native
  
  /* protected */ var z: NgZone = js.native
}
/* static members */
object IonTextarea {
  
  @JSImport("@ionic/angular/directives/proxies", "IonTextarea")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/angular/directives/proxies", "IonTextarea.\u0275cmp")
  @js.native
  def ɵcmp: ɵɵComponentDeclaration[
    IonTextarea, 
    `ion-textarea`, 
    scala.Nothing, 
    AutoGrow, 
    js.Object, 
    scala.Nothing, 
    js.Array[Asterisk], 
    `false`
  ] = js.native
  inline def ɵcmp_=(
    x: ɵɵComponentDeclaration[
      IonTextarea, 
      `ion-textarea`, 
      scala.Nothing, 
      AutoGrow, 
      js.Object, 
      scala.Nothing, 
      js.Array[Asterisk], 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275cmp")(x.asInstanceOf[js.Any])
  
  @JSImport("@ionic/angular/directives/proxies", "IonTextarea.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[IonTextarea, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[IonTextarea, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
