package typingsJapgolly.rrule

import typingsJapgolly.rrule.distEsmIterresultMod.default
import typingsJapgolly.rrule.distEsmRruleMod.RRule
import typingsJapgolly.rrule.distEsmTypesMod.IterResultType
import typingsJapgolly.rrule.distEsmTypesMod.QueryMethodTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmItersetMod {
  
  @JSImport("rrule/dist/esm/iterset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[RRule],
    _exrule: js.Array[RRule],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date]
  ): IterResultType[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterSet")(iterResult.asInstanceOf[js.Any], _rrule.asInstanceOf[js.Any], _exrule.asInstanceOf[js.Any], _rdate.asInstanceOf[js.Any], _exdate.asInstanceOf[js.Any])).asInstanceOf[IterResultType[M]]
  inline def iterSet[M /* <: QueryMethodTypes */](
    iterResult: default[M],
    _rrule: js.Array[RRule],
    _exrule: js.Array[RRule],
    _rdate: js.Array[js.Date],
    _exdate: js.Array[js.Date],
    tzid: String
  ): IterResultType[M] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterSet")(iterResult.asInstanceOf[js.Any], _rrule.asInstanceOf[js.Any], _exrule.asInstanceOf[js.Any], _rdate.asInstanceOf[js.Any], _exdate.asInstanceOf[js.Any], tzid.asInstanceOf[js.Any])).asInstanceOf[IterResultType[M]]
}
