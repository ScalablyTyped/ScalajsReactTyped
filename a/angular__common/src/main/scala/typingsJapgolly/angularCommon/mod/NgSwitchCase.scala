package typingsJapgolly.angularCommon.mod

import typingsJapgolly.angularCommon.angularCommonBooleans.`true`
import typingsJapgolly.angularCommon.angularCommonStrings.`[ngSwitchCase]`
import typingsJapgolly.angularCommon.anon.Host
import typingsJapgolly.angularCore.mod.DoCheck
import typingsJapgolly.angularCore.mod.TemplateRef
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgSwitchCase")
@js.native
open class NgSwitchCase protected ()
  extends StObject
     with DoCheck {
  def this(viewContainer: ViewContainerRef, templateRef: TemplateRef[js.Object], ngSwitch: NgSwitch) = this()
  
  /* private */ var _view: Any = js.native
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
  
  /* private */ var ngSwitch: Any = js.native
  
  /**
    * Stores the HTML template to be selected on match.
    */
  var ngSwitchCase: Any = js.native
}
/* static members */
object NgSwitchCase {
  
  @JSImport("@angular/common", "NgSwitchCase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgSwitchCase.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgSwitchCase, 
    `[ngSwitchCase]`, 
    scala.Nothing, 
    typingsJapgolly.angularCommon.anon.NgSwitchCase, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgSwitchCase, 
      `[ngSwitchCase]`, 
      scala.Nothing, 
      typingsJapgolly.angularCommon.anon.NgSwitchCase, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgSwitchCase.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgSwitchCase, js.Tuple3[Null, Null, Host]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgSwitchCase, js.Tuple3[Null, Null, Host]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
