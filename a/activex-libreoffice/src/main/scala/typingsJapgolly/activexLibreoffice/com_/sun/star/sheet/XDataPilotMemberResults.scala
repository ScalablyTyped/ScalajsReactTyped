package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a sequence of results of a data pilot source level.
  *
  * These results are used to fill the data area for the level in a data pilot table.
  * @see com.sun.star.sheet.DataPilotSourceLevel
  * @see com.sun.star.sheet.DataPilotSource
  * @see com.sun.star.sheet.XDataPilotResults
  */
trait XDataPilotMemberResults
  extends StObject
     with XInterface {
  
  /** returns the sequence of results for the regarding data pilot source level. */
  val Results: SafeArray[MemberResult]
  
  /** returns the sequence of results for the regarding data pilot source level. */
  def getResults(): SafeArray[MemberResult]
}
object XDataPilotMemberResults {
  
  inline def apply(
    Results: SafeArray[MemberResult],
    acquire: Callback,
    getResults: CallbackTo[SafeArray[MemberResult]],
    queryInterface: `type` => Any,
    release: Callback
  ): XDataPilotMemberResults = {
    val __obj = js.Dynamic.literal(Results = Results.asInstanceOf[js.Any], acquire = acquire.toJsFn, getResults = getResults.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataPilotMemberResults]
  }
  
  extension [Self <: XDataPilotMemberResults](x: Self) {
    
    inline def setGetResults(value: CallbackTo[SafeArray[MemberResult]]): Self = StObject.set(x, "getResults", value.toJsFn)
    
    inline def setResults(value: SafeArray[MemberResult]): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
  }
}
