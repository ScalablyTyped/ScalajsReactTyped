package typingsJapgolly.angularCommon.mod

import typingsJapgolly.angularCommon.angularCommonBooleans.`true`
import typingsJapgolly.angularCommon.angularCommonStrings.`[ngTemplateOutlet]`
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.TemplateRef
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgTemplateOutlet")
@js.native
open class NgTemplateOutlet protected ()
  extends StObject
     with OnChanges {
  def this(_viewContainerRef: ViewContainerRef) = this()
  
  /* private */ var _viewContainerRef: Any = js.native
  
  /* private */ var _viewRef: Any = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /**
    * A string defining the template reference and optionally the context object for the template.
    */
  var ngTemplateOutlet: TemplateRef[Any] | Null = js.native
  
  /**
    * A context object to attach to the {@link EmbeddedViewRef}. This should be an
    * object, the object's keys will be available for binding by the local template `let`
    * declarations.
    * Using the key `$implicit` in the context object will set its value as default.
    */
  var ngTemplateOutletContext: js.Object | Null = js.native
  
  /** Injector to be used within the embedded view. */
  var ngTemplateOutletInjector: Injector | Null = js.native
}
/* static members */
object NgTemplateOutlet {
  
  @JSImport("@angular/common", "NgTemplateOutlet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgTemplateOutlet.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgTemplateOutlet, 
    `[ngTemplateOutlet]`, 
    scala.Nothing, 
    typingsJapgolly.angularCommon.anon.NgTemplateOutlet, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgTemplateOutlet, 
      `[ngTemplateOutlet]`, 
      scala.Nothing, 
      typingsJapgolly.angularCommon.anon.NgTemplateOutlet, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgTemplateOutlet.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgTemplateOutlet, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgTemplateOutlet, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
