package typingsJapgolly.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResultType extends StObject
@JSImport("@remix-run/router/dist/utils", "ResultType")
@js.native
object ResultType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResultType & String] = js.native
  
  @js.native
  sealed trait data
    extends StObject
       with ResultType
  /* "data" */ val data: typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.data & String = js.native
  
  @js.native
  sealed trait deferred
    extends StObject
       with ResultType
  /* "deferred" */ val deferred: typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.deferred & String = js.native
  
  @js.native
  sealed trait error
    extends StObject
       with ResultType
  /* "error" */ val error: typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.error & String = js.native
  
  @js.native
  sealed trait redirect
    extends StObject
       with ResultType
  /* "redirect" */ val redirect: typingsJapgolly.remixRunRouter.distUtilsMod.ResultType.redirect & String = js.native
}
