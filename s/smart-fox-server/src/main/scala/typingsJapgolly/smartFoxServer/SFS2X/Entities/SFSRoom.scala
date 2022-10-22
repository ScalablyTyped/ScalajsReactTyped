package typingsJapgolly.smartFoxServer.SFS2X.Entities

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typingsJapgolly.smartFoxServer.SFS2X.Managers.RoomManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFSRoom extends StObject {
  
  /**
    * Indicates whether the specified user is currently inside this Room or not.
    * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
    * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
    */
  def containsUser(user: SFSUser): Boolean
  
  /**
    * Indicates whether this Room has the specified Room Variable set or not.
    * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
    * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
    */
  def containsVariable(varName: String): Boolean
  
  /**
    * Returns the maximum amount of users, including spectators, that can be contained in this Room.
    * @return {number} Returns: Maximum number of users that can enter the Room.
    */
  def getCapacity(): Double
  
  /**
    * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
    */
  def getPlayerList(): js.Array[SFSUser]
  
  /**
    * Retrieves a reference to the Room Manager which manages this Room.
    * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
    */
  def getRoomManager(): RoomManager
  
  /**
    * Returns the current number of spectators in this Room (Game Rooms only).
    * @return {number} Returns: Current number of spectators in the Room.
    */
  def getSpectatorCount(): Double
  
  /**
    * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
    */
  def getSpectatorList(): js.Array[SFSUser]
  
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}  id The id of the user to be found.
    * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
    */
  def getUserById(id: Double): SFSUser
  
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}  name The name of the user to be found.
    * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
    */
  def getUserByName(name: String): SFSUser
  
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {number} Returns: Current number of users in the Room.
    */
  def getUserCount(): Double
  
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {SFSUser[]} Returns: Current number of users in the Room.
    */
  def getUserList(): js.Array[SFSUser]
  
  /**
    * Retrieves a Room Variable from its name.
    * @param  {string}                    varName The name of the Room Variable to be retrieved.
    * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
    */
  def getVariable(varName: String): SFSRoomVariable
  
  /**
    * Retrieves all the Room Variables of this Room.
    * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
    */
  def getVariables(): js.Array[SFSRoomVariable]
  
  /** @type {string} Returns the Room Group name. */
  var groupId: String
  
  /** @type {number} Indicates the id of this Room. */
  var id: Double
  
  /** @type {boolean} Indicates whether this is a Game Room or not. */
  var isGame: Boolean
  
  /** @type {boolean} Indicates whether this Room is hidden or not. */
  var isHidden: Boolean
  
  /** @type {boolean} Indicates whether the client joined this Room or not. */
  var isJoined: Boolean
  
  /** @type {boolean} Indicates whether this Room requires a password to be joined or not. */
  var isPasswordProtected: Boolean
  
  /** @type {number} Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
  var maxSpectators: Double
  
  /** @type {number} Returns the maximum number of users allowed in this Room. */
  var maxUsers: Double
  
  /** @type {string} Indicates the name of this Room. */
  var name: String
  
  /** @type {Object} Defines a generic utility object that can be used to store custom Room data. */
  var properties: js.Object
}
object SFSRoom {
  
  inline def apply(
    containsUser: SFSUser => Boolean,
    containsVariable: String => Boolean,
    getCapacity: CallbackTo[Double],
    getPlayerList: CallbackTo[js.Array[SFSUser]],
    getRoomManager: CallbackTo[RoomManager],
    getSpectatorCount: CallbackTo[Double],
    getSpectatorList: CallbackTo[js.Array[SFSUser]],
    getUserById: Double => SFSUser,
    getUserByName: String => SFSUser,
    getUserCount: CallbackTo[Double],
    getUserList: CallbackTo[js.Array[SFSUser]],
    getVariable: String => SFSRoomVariable,
    getVariables: CallbackTo[js.Array[SFSRoomVariable]],
    groupId: String,
    id: Double,
    isGame: Boolean,
    isHidden: Boolean,
    isJoined: Boolean,
    isPasswordProtected: Boolean,
    maxSpectators: Double,
    maxUsers: Double,
    name: String,
    properties: js.Object
  ): SFSRoom = {
    val __obj = js.Dynamic.literal(containsUser = js.Any.fromFunction1(containsUser), containsVariable = js.Any.fromFunction1(containsVariable), getCapacity = getCapacity.toJsFn, getPlayerList = getPlayerList.toJsFn, getRoomManager = getRoomManager.toJsFn, getSpectatorCount = getSpectatorCount.toJsFn, getSpectatorList = getSpectatorList.toJsFn, getUserById = js.Any.fromFunction1(getUserById), getUserByName = js.Any.fromFunction1(getUserByName), getUserCount = getUserCount.toJsFn, getUserList = getUserList.toJsFn, getVariable = js.Any.fromFunction1(getVariable), getVariables = getVariables.toJsFn, groupId = groupId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isGame = isGame.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isJoined = isJoined.asInstanceOf[js.Any], isPasswordProtected = isPasswordProtected.asInstanceOf[js.Any], maxSpectators = maxSpectators.asInstanceOf[js.Any], maxUsers = maxUsers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSRoom]
  }
  
  extension [Self <: SFSRoom](x: Self) {
    
    inline def setContainsUser(value: SFSUser => Boolean): Self = StObject.set(x, "containsUser", js.Any.fromFunction1(value))
    
    inline def setContainsVariable(value: String => Boolean): Self = StObject.set(x, "containsVariable", js.Any.fromFunction1(value))
    
    inline def setGetCapacity(value: CallbackTo[Double]): Self = StObject.set(x, "getCapacity", value.toJsFn)
    
    inline def setGetPlayerList(value: CallbackTo[js.Array[SFSUser]]): Self = StObject.set(x, "getPlayerList", value.toJsFn)
    
    inline def setGetRoomManager(value: CallbackTo[RoomManager]): Self = StObject.set(x, "getRoomManager", value.toJsFn)
    
    inline def setGetSpectatorCount(value: CallbackTo[Double]): Self = StObject.set(x, "getSpectatorCount", value.toJsFn)
    
    inline def setGetSpectatorList(value: CallbackTo[js.Array[SFSUser]]): Self = StObject.set(x, "getSpectatorList", value.toJsFn)
    
    inline def setGetUserById(value: Double => SFSUser): Self = StObject.set(x, "getUserById", js.Any.fromFunction1(value))
    
    inline def setGetUserByName(value: String => SFSUser): Self = StObject.set(x, "getUserByName", js.Any.fromFunction1(value))
    
    inline def setGetUserCount(value: CallbackTo[Double]): Self = StObject.set(x, "getUserCount", value.toJsFn)
    
    inline def setGetUserList(value: CallbackTo[js.Array[SFSUser]]): Self = StObject.set(x, "getUserList", value.toJsFn)
    
    inline def setGetVariable(value: String => SFSRoomVariable): Self = StObject.set(x, "getVariable", js.Any.fromFunction1(value))
    
    inline def setGetVariables(value: CallbackTo[js.Array[SFSRoomVariable]]): Self = StObject.set(x, "getVariables", value.toJsFn)
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsGame(value: Boolean): Self = StObject.set(x, "isGame", value.asInstanceOf[js.Any])
    
    inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
    
    inline def setIsJoined(value: Boolean): Self = StObject.set(x, "isJoined", value.asInstanceOf[js.Any])
    
    inline def setIsPasswordProtected(value: Boolean): Self = StObject.set(x, "isPasswordProtected", value.asInstanceOf[js.Any])
    
    inline def setMaxSpectators(value: Double): Self = StObject.set(x, "maxSpectators", value.asInstanceOf[js.Any])
    
    inline def setMaxUsers(value: Double): Self = StObject.set(x, "maxUsers", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
