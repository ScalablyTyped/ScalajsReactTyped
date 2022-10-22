package typingsJapgolly.smartFoxServer.SFS2X.Entities

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFSBuddy extends StObject {
  
  /**
    * Indicates whether this user has the specified Buddy Variable set or not.
    * @param  {string}  varName The name of the Buddy Variable whose existance must be checked.
    * @return {boolean}         Returns: true if a Buddy Variable with the passed name is set for this buddy.
    */
  def containsVariable(varName: String): Boolean
  
  /**
    * Returns the nickname of this buddy. If the nickname is not set, null is returned.
    * @return {string} Returns: The nickname of the buddy.
    */
  def getNickName(): String
  
  /**
    * Retrieves the list of persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOfflineVariables(): js.Array[SFSBuddyVariable]
  
  /**
    * Retrieves the list of non-persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOnlineVariables(): js.Array[SFSBuddyVariable]
  
  /**
    * Returns the custom state of this buddy. Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state is not set, null is returned.
    * @return {string} Returns: The custom state of the buddy.
    */
  def getState(): String
  
  /**
    * Retrieves a Buddy Variable from its name.
    * @param  {string}                     varName The name of the Buddy Variable to be retrieved.
    * @return {Variables.SFSBuddyVariable}         Returns: The object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to this buddy.
    */
  def getVariable(varName: String): SFSBuddyVariable
  
  /**
    * Retrieves all the Buddy Variables of this user.
    * @return {Variables.SFSBuddyVariable[]} Returns: The list of SFSBuddyVariable objects associated to the buddy.
    */
  def getVariables(): js.Array[SFSBuddyVariable]
  
  /** @type {number} Indicates the id of this buddy. */
  var id: Double
  
  /**
    * Indicates whether this buddy is blocked in the current user's buddy list or not. A buddy can be blocked by means of a BlockBuddyRequest request.
    * @return {boolean} Returns: true if the buddy is blocked.
    */
  def isBlocked(): Boolean
  
  /**
    * Indicates whether this buddy is online in the Buddy List system or not.
    * @return {boolean} Returns: true if the buddy is online.
    */
  def isOnline(): Boolean
  
  /**
    * Indicates whether this buddy is temporary (non-persistent) in the current user's buddy list or not.
    * @return {boolean} Returns: true if the buddy is temporary.
    */
  def isTemp(): Boolean
  
  /** @type {string} Indicates the name of this buddy. */
  var name: String
}
object SFSBuddy {
  
  inline def apply(
    containsVariable: String => Boolean,
    getNickName: CallbackTo[String],
    getOfflineVariables: CallbackTo[js.Array[SFSBuddyVariable]],
    getOnlineVariables: CallbackTo[js.Array[SFSBuddyVariable]],
    getState: CallbackTo[String],
    getVariable: String => SFSBuddyVariable,
    getVariables: CallbackTo[js.Array[SFSBuddyVariable]],
    id: Double,
    isBlocked: CallbackTo[Boolean],
    isOnline: CallbackTo[Boolean],
    isTemp: CallbackTo[Boolean],
    name: String
  ): SFSBuddy = {
    val __obj = js.Dynamic.literal(containsVariable = js.Any.fromFunction1(containsVariable), getNickName = getNickName.toJsFn, getOfflineVariables = getOfflineVariables.toJsFn, getOnlineVariables = getOnlineVariables.toJsFn, getState = getState.toJsFn, getVariable = js.Any.fromFunction1(getVariable), getVariables = getVariables.toJsFn, id = id.asInstanceOf[js.Any], isBlocked = isBlocked.toJsFn, isOnline = isOnline.toJsFn, isTemp = isTemp.toJsFn, name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSBuddy]
  }
  
  extension [Self <: SFSBuddy](x: Self) {
    
    inline def setContainsVariable(value: String => Boolean): Self = StObject.set(x, "containsVariable", js.Any.fromFunction1(value))
    
    inline def setGetNickName(value: CallbackTo[String]): Self = StObject.set(x, "getNickName", value.toJsFn)
    
    inline def setGetOfflineVariables(value: CallbackTo[js.Array[SFSBuddyVariable]]): Self = StObject.set(x, "getOfflineVariables", value.toJsFn)
    
    inline def setGetOnlineVariables(value: CallbackTo[js.Array[SFSBuddyVariable]]): Self = StObject.set(x, "getOnlineVariables", value.toJsFn)
    
    inline def setGetState(value: CallbackTo[String]): Self = StObject.set(x, "getState", value.toJsFn)
    
    inline def setGetVariable(value: String => SFSBuddyVariable): Self = StObject.set(x, "getVariable", js.Any.fromFunction1(value))
    
    inline def setGetVariables(value: CallbackTo[js.Array[SFSBuddyVariable]]): Self = StObject.set(x, "getVariables", value.toJsFn)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsBlocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBlocked", value.toJsFn)
    
    inline def setIsOnline(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOnline", value.toJsFn)
    
    inline def setIsTemp(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTemp", value.toJsFn)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
