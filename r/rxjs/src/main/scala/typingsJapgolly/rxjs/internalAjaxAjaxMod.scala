package typingsJapgolly.rxjs

import typingsJapgolly.rxjs.distTypesInternalAjaxAjaxMod.AjaxCreationMethod
import typingsJapgolly.rxjs.distTypesInternalAjaxAjaxResponseMod.AjaxResponse
import typingsJapgolly.rxjs.distTypesInternalAjaxTypesMod.AjaxConfig
import typingsJapgolly.rxjs.distTypesInternalObservableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalAjaxAjaxMod {
  
  @JSImport("rxjs/internal/ajax/ajax", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/internal/ajax/ajax", "ajax")
  @js.native
  val ajax: AjaxCreationMethod = js.native
  
  inline def fromAjax[T](init: AjaxConfig): Observable[AjaxResponse[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAjax")(init.asInstanceOf[js.Any]).asInstanceOf[Observable[AjaxResponse[T]]]
}
