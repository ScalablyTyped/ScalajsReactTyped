package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto.sax

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Mission Taker.
  *
  * This interface is used to control a mission.
  */
trait XMissionTaker
  extends StObject
     with XInterface {
  
  /**
    * Forces a mission to make an end.
    * @returns `TRUE` if the mission is completed successfully, `FALSE` otherwise.
    */
  def endMission(): Boolean
}
object XMissionTaker {
  
  inline def apply(
    acquire: Callback,
    endMission: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XMissionTaker = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, endMission = endMission.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMissionTaker]
  }
  
  extension [Self <: XMissionTaker](x: Self) {
    
    inline def setEndMission(value: CallbackTo[Boolean]): Self = StObject.set(x, "endMission", value.toJsFn)
  }
}
