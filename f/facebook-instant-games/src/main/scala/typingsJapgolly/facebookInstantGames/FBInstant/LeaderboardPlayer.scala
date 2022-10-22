package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about the player associated with a score entry.
  */
trait LeaderboardPlayer extends StObject {
  
  /**
    * Gets the game's unique identifier for the player.
    *
    * @returns The game-scoped identifier for the player.
    */
  def getID(): String | Null
  
  /**
    * Gets the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): String
  
  /**
    * Returns a url to the player's public profile photo.
    *
    * @returns Url to the player's public profile photo.
    */
  def getPhoto(): String | Null
}
object LeaderboardPlayer {
  
  inline def apply(getID: CallbackTo[String | Null], getName: CallbackTo[String], getPhoto: CallbackTo[String | Null]): LeaderboardPlayer = {
    val __obj = js.Dynamic.literal(getID = getID.toJsFn, getName = getName.toJsFn, getPhoto = getPhoto.toJsFn)
    __obj.asInstanceOf[LeaderboardPlayer]
  }
  
  extension [Self <: LeaderboardPlayer](x: Self) {
    
    inline def setGetID(value: CallbackTo[String | Null]): Self = StObject.set(x, "getID", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPhoto(value: CallbackTo[String | Null]): Self = StObject.set(x, "getPhoto", value.toJsFn)
  }
}
