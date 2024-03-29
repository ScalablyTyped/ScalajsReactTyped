package typingsJapgolly.smartFoxServer.SFS2X.Entities

import typingsJapgolly.smartFoxServer.SFS2X.Requests.Game.CreateSFSGameRequest
import typingsJapgolly.smartFoxServer.SFS2X.Requests.System.FindRoomsRequest
import typingsJapgolly.smartFoxServer.SFS2X.Requests.System.FindUsersRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Match
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Match.html
object Match {
  
  trait BoolMatch extends StObject
  
  trait LogicOperator extends StObject
  
  @js.native
  trait MatchExpression extends StObject {
    
    def and(varName: String, condition: BoolMatch, value: Any): MatchExpression = js.native
    def and(varName: String, condition: NumberMatch, value: Any): MatchExpression = js.native
    /**
      * Concatenates the current expression with a new one using the logical AND operator.
      * @param  {string}            varName Name of the additional variable or property to match.
      * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
      * @param  {any}               value   The value to compare against the additional variable or property during the matching.
      * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
      */
    def and(varName: String, condition: RoomProperties, value: Any): MatchExpression = js.native
    def and(varName: String, condition: StringMatch, value: Any): MatchExpression = js.native
    def and(varName: String, condition: UserProperties, value: Any): MatchExpression = js.native
    def and(varName: String, condition: CreateSFSGameRequest, value: Any): MatchExpression = js.native
    def and(varName: String, condition: FindRoomsRequest, value: Any): MatchExpression = js.native
    def and(varName: String, condition: FindUsersRequest, value: Any): MatchExpression = js.native
    
    /** @type {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} Returns the matching criteria used during values comparison among those provided by the BoolMatch, NumberMatch and StringMatch classes. */
    var condition: RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | CreateSFSGameRequest | FindRoomsRequest | FindUsersRequest = js.native
    
    /**
      * Checks if the current matching expression is concatenated to another one through a logical operator.
      * @return {boolean} Returns: true if the current matching expression is concatenated to another one.
      */
    def hasNext(): Boolean = js.native
    
    /** @type {LogicOperator} In case of concatenated expressions, returns the current logical operator. */
    var loginOp: LogicOperator = js.native
    
    /** @type {MatchExpression} Returns the next matching expression concatenated to the current one, if existing. */
    var next: MatchExpression = js.native
    
    def or(varName: String, condition: BoolMatch, value: Any): MatchExpression = js.native
    def or(varName: String, condition: NumberMatch, value: Any): MatchExpression = js.native
    /**
      * Concatenates the current expression with a new one using the logical OR operator.
      * @param  {string}            varName Name of the additional variable or property to match.
      * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
      * @param  {any}               value   The value to compare against the additional variable or property during the matching.
      * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
      */
    def or(varName: String, condition: RoomProperties, value: Any): MatchExpression = js.native
    def or(varName: String, condition: StringMatch, value: Any): MatchExpression = js.native
    def or(varName: String, condition: UserProperties, value: Any): MatchExpression = js.native
    def or(varName: String, condition: CreateSFSGameRequest, value: Any): MatchExpression = js.native
    def or(varName: String, condition: FindRoomsRequest, value: Any): MatchExpression = js.native
    def or(varName: String, condition: FindUsersRequest, value: Any): MatchExpression = js.native
    
    /**
      * Moves the iterator cursor to the first matching expression in the chain.
      * @return {MatchExpression} The MatchExpression object at the top of the chain of matching expressions.
      */
    def rewind(): MatchExpression = js.native
    
    /** @type {any} Returns the value against which the variable or property corresponding to varName is compared. */
    var value: Any = js.native
    
    /** @type {string} Returns the name of the variable or property against which the comparison is made. */
    var varName: String = js.native
  }
  
  trait NumberMatch extends StObject
  
  trait RoomProperties extends StObject
  
  trait StringMatch extends StObject
  
  trait UserProperties extends StObject
}
