package typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineCriteriaStatusCode extends StObject
@JSImport("vso-node-api/interfaces/WorkInterfaces", "TimelineCriteriaStatusCode")
@js.native
object TimelineCriteriaStatusCode extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineCriteriaStatusCode & Double] = js.native
  
  /**
    * One of the filter clause is invalid.
    */
  @js.native
  sealed trait InvalidFilterClause
    extends StObject
       with TimelineCriteriaStatusCode
  /* 1 */ val InvalidFilterClause: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.InvalidFilterClause & Double = js.native
  
  /**
    * No error - filter is good.
    */
  @js.native
  sealed trait OK
    extends StObject
       with TimelineCriteriaStatusCode
  /* 0 */ val OK: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.OK & Double = js.native
  
  /**
    * Unknown error.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with TimelineCriteriaStatusCode
  /* 2 */ val Unknown: typingsJapgolly.vsoNodeApi.interfacesWorkInterfacesMod.TimelineCriteriaStatusCode.Unknown & Double = js.native
}
