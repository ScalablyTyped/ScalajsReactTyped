package typingsJapgolly.angularForms.mod

import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.Renderer2
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import typingsJapgolly.angularForms.angularFormsBooleans.`false`
import typingsJapgolly.angularForms.angularFormsStrings.option
import typingsJapgolly.angularForms.anon.HostOptional
import typingsJapgolly.angularForms.anon.NgValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgSelectOption")
@js.native
open class NgSelectOption protected ()
  extends StObject
     with OnDestroy {
  def this(_element: ElementRef[Any], _renderer: Renderer2, _select: SelectControlValueAccessor) = this()
  
  /* private */ var _element: Any = js.native
  
  /* private */ var _renderer: Any = js.native
  
  /* private */ var _select: Any = js.native
  
  /**
    * @description
    * ID of the option element
    */
  var id: String = js.native
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  
  /**
    * @description
    * Tracks the value bound to the option element. Unlike the value binding,
    * ngValue supports binding to objects.
    */
  def ngValue_=(value: Any): Unit = js.native
  
  /**
    * @description
    * Tracks simple string values bound to the option element.
    * For objects, use the `ngValue` input binding.
    */
  def value_=(value: Any): Unit = js.native
}
/* static members */
object NgSelectOption {
  
  @JSImport("@angular/forms", "NgSelectOption")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "NgSelectOption.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgSelectOption, 
    option, 
    scala.Nothing, 
    NgValue, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgSelectOption, 
      option, 
      scala.Nothing, 
      NgValue, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `false`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NgSelectOption.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgSelectOption, js.Tuple3[Null, Null, HostOptional]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgSelectOption, js.Tuple3[Null, Null, HostOptional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
