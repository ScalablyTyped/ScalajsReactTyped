package typingsJapgolly.facebookInstantGames.FBInstant

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a player who is in the context that the current player is playing in.
  */
trait ContextPlayer extends StObject {
  
  /**
    * Get the id of the context player.
    *
    * @returns The ID of the context player
    */
  def getID(): String
  
  /**
    * Get the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): String | Null
  
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo
    */
  def getPhoto(): String | Null
}
object ContextPlayer {
  
  inline def apply(getID: CallbackTo[String], getName: CallbackTo[String | Null], getPhoto: CallbackTo[String | Null]): ContextPlayer = {
    val __obj = js.Dynamic.literal(getID = getID.toJsFn, getName = getName.toJsFn, getPhoto = getPhoto.toJsFn)
    __obj.asInstanceOf[ContextPlayer]
  }
  
  extension [Self <: ContextPlayer](x: Self) {
    
    inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String | Null]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPhoto(value: CallbackTo[String | Null]): Self = StObject.set(x, "getPhoto", value.toJsFn)
  }
}
