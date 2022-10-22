package typingsJapgolly.angularCommon.mod

import typingsJapgolly.angularCommon.angularCommonBooleans.`true`
import typingsJapgolly.angularCommon.angularCommonStrings.`[ngSwitch]`
import typingsJapgolly.angularCore.mod.ɵɵDirectiveDeclaration
import typingsJapgolly.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgSwitch")
@js.native
open class NgSwitch () extends StObject {
  
  /* private */ var _caseCount: Any = js.native
  
  /* private */ var _defaultUsed: Any = js.native
  
  /* private */ var _defaultViews: Any = js.native
  
  /* private */ var _lastCaseCheckIndex: Any = js.native
  
  /* private */ var _lastCasesMatched: Any = js.native
  
  /* private */ var _ngSwitch: Any = js.native
  
  /* private */ var _updateDefaultCases: Any = js.native
  
  def ngSwitch_=(newValue: Any): Unit = js.native
}
/* static members */
object NgSwitch {
  
  @JSImport("@angular/common", "NgSwitch")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common", "NgSwitch.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgSwitch, 
    `[ngSwitch]`, 
    scala.Nothing, 
    typingsJapgolly.angularCommon.anon.NgSwitch, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgSwitch, 
      `[ngSwitch]`, 
      scala.Nothing, 
      typingsJapgolly.angularCommon.anon.NgSwitch, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/common", "NgSwitch.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgSwitch, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgSwitch, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
