package typingsJapgolly.remixRunRouter.distUtilsMod

import typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.data
import typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.deferred
import typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.remixRunRouter.distUtilsMod.SuccessResult
  - typingsJapgolly.remixRunRouter.distUtilsMod.DeferredResult
  - typingsJapgolly.remixRunRouter.distUtilsMod.RedirectResult
  - typingsJapgolly.remixRunRouter.distUtilsMod.ErrorResult
*/
trait DataResult extends StObject
object DataResult {
  
  inline def DeferredResult(deferredData: DeferredData, `type`: deferred): typingsJapgolly.remixRunRouter.distUtilsMod.DeferredResult = {
    val __obj = js.Dynamic.literal(deferredData = deferredData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.remixRunRouter.distUtilsMod.DeferredResult]
  }
  
  inline def ErrorResult(error: Any, `type`: error): typingsJapgolly.remixRunRouter.distUtilsMod.ErrorResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.remixRunRouter.distUtilsMod.ErrorResult]
  }
  
  inline def RedirectResult(
    location: String,
    revalidate: Boolean,
    status: Double,
    `type`: typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.redirect
  ): typingsJapgolly.remixRunRouter.distUtilsMod.RedirectResult = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.remixRunRouter.distUtilsMod.RedirectResult]
  }
  
  inline def SuccessResult(data: Any, `type`: data): typingsJapgolly.remixRunRouter.distUtilsMod.SuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.remixRunRouter.distUtilsMod.SuccessResult]
  }
}
