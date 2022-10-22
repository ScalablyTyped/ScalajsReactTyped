package typingsJapgolly.angularCommon.mod

import typingsJapgolly.angularCommon.angularCommonBooleans.`true`
import typingsJapgolly.angularCommon.angularCommonStrings.`[ngSwitchDefault]`
import typingsJapgolly.angularCommon.anon.Host
import typingsJapgolly.angularCore.mod.TemplateRef
import typingsJapgolly.angularCore.mod.ViewContainerRef
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgSwitchDefault")
@js.native
open class NgSwitchDefault protected () extends StObject {
  def this(viewContainer: ViewContainerRef, templateRef: TemplateRef[js.Object], ngSwitch: NgSwitch) = this()
}
/* static members */
object NgSwitchDefault {
  
  @JSImport("@angular/common", "NgSwitchDefault")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgSwitchDefault.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgSwitchDefault, 
    `[ngSwitchDefault]`, 
    scala.Nothing, 
    js.Object, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgSwitchDefault, 
      `[ngSwitchDefault]`, 
      scala.Nothing, 
      js.Object, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgSwitchDefault.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgSwitchDefault, js.Tuple3[Null, Null, Host]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgSwitchDefault, js.Tuple3[Null, Null, Host]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
