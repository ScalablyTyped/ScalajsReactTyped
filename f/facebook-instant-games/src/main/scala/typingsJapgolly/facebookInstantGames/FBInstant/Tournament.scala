package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instant game tournament.
  */
trait Tournament extends StObject {
  
  /**
    * The unique context ID that is associated with this instant tournament.
    *
    * @returns A unique identifier for the game context.
    */
  def getContextID(): String
  
  /**
    * Timestamp when the instant tournament ends. If the end time is in the past, then the instant tournament is already finished and has expired.
    *
    * @returns A unix timestamp of when the tournament will end.
    * @example
    * FBInstant.getTournamentAsync()
    *   .then((tournament) => {
    *     console.log(tournament.getEndTime());
    *   });
    */
  def getEndTime(): Double
  
  /**
    * The unique ID that is associated with this instant tournament.
    *
    * @returns A unique identifier for the instant tournament.
    */
  def getID(): String
  
  /**
    * Payload of the tournament provided upon the creation of the tournament.
    *
    * This is an optional field that can be set by creating the tournament using the FBInstant.tournament.createAsync() API.
    */
  def getPayload(): Any
  
  /**
    * Title of the tournament provided upon the creation of the tournament.
    *
    * This is an optional field that can be set by creating the tournament using the FBInstant.tournament.createAsync() API.
    * @example
    * FBInstant.getTournamentAsync()
    *   .then((tournament) => {
    *     console.log(tournament.getTitle());
    *   });
    */
  def getTitle(): js.UndefOr[String]
}
object Tournament {
  
  inline def apply(
    getContextID: CallbackTo[String],
    getEndTime: CallbackTo[Double],
    getID: CallbackTo[String],
    getPayload: CallbackTo[Any],
    getTitle: CallbackTo[js.UndefOr[String]]
  ): Tournament = {
    val __obj = js.Dynamic.literal(getContextID = getContextID.toJsFn, getEndTime = getEndTime.toJsFn, getID = getID.toJsFn, getPayload = getPayload.toJsFn, getTitle = getTitle.toJsFn)
    __obj.asInstanceOf[Tournament]
  }
  
  extension [Self <: Tournament](x: Self) {
    
    inline def setGetContextID(value: CallbackTo[String]): Self = StObject.set(x, "getContextID", value.toJsFn)
    
    inline def setGetEndTime(value: CallbackTo[Double]): Self = StObject.set(x, "getEndTime", value.toJsFn)
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
    
    inline def setGetPayload(value: CallbackTo[Any]): Self = StObject.set(x, "getPayload", value.toJsFn)
    
    inline def setGetTitle(value: CallbackTo[js.UndefOr[String]]): Self = StObject.set(x, "getTitle", value.toJsFn)
  }
}
