package typingsJapgolly.rrule

import typingsJapgolly.rrule.distEsmIterresultMod.default
import typingsJapgolly.rrule.distEsmTypesMod.IterResultType
import typingsJapgolly.rrule.distEsmTypesMod.ParsedOptions
import typingsJapgolly.rrule.distEsmTypesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmIterMod {
  
  @JSImport("rrule/dist/esm/iter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iter[M /* <: QueryMethodTypes */](iterResult: default[M], options: ParsedOptions): IterResultType[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("iter")(iterResult.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IterResultType[M]]
}
