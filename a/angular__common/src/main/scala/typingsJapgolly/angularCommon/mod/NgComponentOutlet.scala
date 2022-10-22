package typingsJapgolly.angularCommon.mod

import typingsJapgolly.angularCommon.angularCommonBooleans.`true`
import typingsJapgolly.angularCommon.angularCommonStrings.`[ngComponentOutlet]`
import typingsJapgolly.angularCore.mod.Injector
import typingsJapgolly.angularCore.mod.NgModuleFactory
import typingsJapgolly.angularCore.mod.OnChanges
import typingsJapgolly.angularCore.mod.OnDestroy
import typingsJapgolly.angularCore.mod.SimpleChanges
import typingsJapgolly.angularCore.mod.Type
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgComponentOutlet")
@js.native
open class NgComponentOutlet protected ()
  extends StObject
     with OnChanges
     with OnDestroy {
  def this(_viewContainerRef: ViewContainerRef) = this()
  
  /* private */ var _componentRef: Any = js.native
  
  /* private */ var _moduleRef: Any = js.native
  
  /* private */ var _viewContainerRef: Any = js.native
  
  var ngComponentOutlet: Type[Any] | Null = js.native
  
  var ngComponentOutletContent: js.UndefOr[js.Array[js.Array[Any]]] = js.native
  
  var ngComponentOutletInjector: js.UndefOr[Injector] = js.native
  
  var ngComponentOutletNgModule: js.UndefOr[Type[Any]] = js.native
  
  /**
    * @deprecated This input is deprecated, use `ngComponentOutletNgModule` instead.
    */
  var ngComponentOutletNgModuleFactory: js.UndefOr[NgModuleFactory[Any]] = js.native
  
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
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}
/* static members */
object NgComponentOutlet {
  
  @JSImport("@angular/common", "NgComponentOutlet")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgComponentOutlet.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgComponentOutlet, 
    `[ngComponentOutlet]`, 
    scala.Nothing, 
    typingsJapgolly.angularCommon.anon.NgComponentOutlet, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgComponentOutlet, 
      `[ngComponentOutlet]`, 
      scala.Nothing, 
      typingsJapgolly.angularCommon.anon.NgComponentOutlet, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgComponentOutlet.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgComponentOutlet, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgComponentOutlet, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
