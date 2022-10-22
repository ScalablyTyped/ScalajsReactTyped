package typingsJapgolly.smartFoxServer.SFS2X.Entities

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Variables
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Variables.html
object Variables {
  
  trait MMOItemVariable
    extends StObject
       with SFSUserVariable
  object MMOItemVariable {
    
    inline def apply(getTypeName: Double => String, isNull: CallbackTo[Boolean], name: String, value: Double): MMOItemVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = isNull.toJsFn, name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MMOItemVariable]
    }
  }
  
  trait ReservedBuddyVariables extends StObject
  
  trait ReservedRoomVariables extends StObject
  
  trait SFSBuddyVariable
    extends StObject
       with SFSUserVariable {
    
    /**
      * Indicates whether the Buddy Variable is persistent or not.
      * @return {boolean} Returns: true if the Buddy Variable is persistent.
      */
    def isOffline(): Boolean
  }
  object SFSBuddyVariable {
    
    inline def apply(
      getTypeName: Double => String,
      isNull: CallbackTo[Boolean],
      isOffline: CallbackTo[Boolean],
      name: String,
      value: Double
    ): SFSBuddyVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = isNull.toJsFn, isOffline = isOffline.toJsFn, name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSBuddyVariable]
    }
    
    extension [Self <: SFSBuddyVariable](x: Self) {
      
      inline def setIsOffline(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOffline", value.toJsFn)
    }
  }
  
  trait SFSRoomVariable
    extends StObject
       with SFSUserVariable {
    
    /** @type {boolean} Indicates whether this Room Variable is persistent or not. */
    var isPersistent: Boolean
    
    /** @type {boolean} Indicates whether this Room Variable is private or not. */
    var isPrivate: Boolean
  }
  object SFSRoomVariable {
    
    inline def apply(
      getTypeName: Double => String,
      isNull: CallbackTo[Boolean],
      isPersistent: Boolean,
      isPrivate: Boolean,
      name: String,
      value: Double
    ): SFSRoomVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = isNull.toJsFn, isPersistent = isPersistent.asInstanceOf[js.Any], isPrivate = isPrivate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSRoomVariable]
    }
    
    extension [Self <: SFSRoomVariable](x: Self) {
      
      inline def setIsPersistent(value: Boolean): Self = StObject.set(x, "isPersistent", value.asInstanceOf[js.Any])
      
      inline def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    }
  }
  
  trait SFSUserVariable extends StObject {
    
    /**
      * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
      * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
      * @return {string}        Returns: The variable type name.
      */
    def getTypeName(typeId: Double): String
    
    /**
      * Indicates if the variable is null.
      * @return {boolean} Returns: true if the variable has a null value.
      */
    def isNull(): Boolean
    
    /** @type {string} Indicates the name of this variable. */
    var name: String
    
    /** @type {number} Returns the value of this variable. */
    var value: Double
  }
  object SFSUserVariable {
    
    inline def apply(getTypeName: Double => String, isNull: CallbackTo[Boolean], name: String, value: Double): SFSUserVariable = {
      val __obj = js.Dynamic.literal(getTypeName = js.Any.fromFunction1(getTypeName), isNull = isNull.toJsFn, name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SFSUserVariable]
    }
    
    extension [Self <: SFSUserVariable](x: Self) {
      
      inline def setGetTypeName(value: Double => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction1(value))
      
      inline def setIsNull(value: CallbackTo[Boolean]): Self = StObject.set(x, "isNull", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait VariableType extends StObject
}
