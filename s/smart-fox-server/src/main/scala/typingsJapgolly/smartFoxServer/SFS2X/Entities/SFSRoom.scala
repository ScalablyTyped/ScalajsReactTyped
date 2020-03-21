package typingsJapgolly.smartFoxServer.SFS2X.Entities

import typingsJapgolly.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typingsJapgolly.smartFoxServer.SFS2X.Managers.RoomManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.SFSRoom")
@js.native
class SFSRoom protected () extends js.Object {
  /**
    * Creates a new SFSRoom instance.
    * @param {number} id      The Room id.
    * @param {string} name    The Room name.
    * @param {string} [groupId="default"] The id of the Group to which the Room belongs.
    */
  def this(id: Double, name: String) = this()
  def this(id: Double, name: String, groupId: String) = this()
  /** @type {string} Returns the Room Group name. */
  var groupId: String = js.native
  /** @type {number} Indicates the id of this Room. */
  var id: Double = js.native
  /** @type {boolean} Indicates whether this is a Game Room or not. */
  var isGame: Boolean = js.native
  /** @type {boolean} Indicates whether this Room is hidden or not. */
  var isHidden: Boolean = js.native
  /** @type {boolean} Indicates whether the client joined this Room or not. */
  var isJoined: Boolean = js.native
  /** @type {boolean} Indicates whether this Room requires a password to be joined or not. */
  var isPasswordProtected: Boolean = js.native
  /** @type {number} Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
  var maxSpectators: Double = js.native
  /** @type {number} Returns the maximum number of users allowed in this Room. */
  var maxUsers: Double = js.native
  /** @type {string} Indicates the name of this Room. */
  var name: String = js.native
  /** @type {Object} Defines a generic utility object that can be used to store custom Room data. */
  var properties: js.Object = js.native
  /**
    * Indicates whether the specified user is currently inside this Room or not.
    * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
    * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
    */
  def containsUser(user: SFSUser): Boolean = js.native
  /**
    * Indicates whether this Room has the specified Room Variable set or not.
    * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
    * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
    */
  def containsVariable(varName: String): Boolean = js.native
  /**
    * Returns the maximum amount of users, including spectators, that can be contained in this Room.
    * @return {number} Returns: Maximum number of users that can enter the Room.
    */
  def getCapacity(): Double = js.native
  /**
    * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
    */
  def getPlayerList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a reference to the Room Manager which manages this Room.
    * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
    */
  def getRoomManager(): RoomManager = js.native
  /**
    * Returns the current number of spectators in this Room (Game Rooms only).
    * @return {number} Returns: Current number of spectators in the Room.
    */
  def getSpectatorCount(): Double = js.native
  /**
    * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
    * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
    */
  def getSpectatorList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}  id The id of the user to be found.
    * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
    */
  def getUserById(id: Double): SFSUser = js.native
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}  name The name of the user to be found.
    * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
    */
  def getUserByName(name: String): SFSUser = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {number} Returns: Current number of users in the Room.
    */
  def getUserCount(): Double = js.native
  /**
    * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
    * @return {SFSUser[]} Returns: Current number of users in the Room.
    */
  def getUserList(): js.Array[SFSUser] = js.native
  /**
    * Retrieves a Room Variable from its name.
    * @param  {string}                    varName The name of the Room Variable to be retrieved.
    * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
    */
  def getVariable(varName: String): SFSRoomVariable = js.native
  /**
    * Retrieves all the Room Variables of this Room.
    * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
    */
  def getVariables(): js.Array[SFSRoomVariable] = js.native
}

