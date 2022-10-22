package typingsJapgolly.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionStatus extends StObject {
  
  /**
    * The timestamp of when the entity was created.
    */
  var CreationDate: js.Date
  
  /**
    * Indicates whether the domain is being deleted.
    */
  var PendingDeletion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides the OptionState for the domain. 
    */
  var State: OptionState
  
  /**
    * The timestamp of the last time the entity was updated.
    */
  var UpdateDate: js.Date
  
  /**
    * The latest version of the entity.
    */
  var UpdateVersion: js.UndefOr[UIntValue] = js.undefined
}
object OptionStatus {
  
  inline def apply(CreationDate: js.Date, State: OptionState, UpdateDate: js.Date): OptionStatus = {
    val __obj = js.Dynamic.literal(CreationDate = CreationDate.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], UpdateDate = UpdateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionStatus]
  }
  
  extension [Self <: OptionStatus](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletion(value: Boolean): Self = StObject.set(x, "PendingDeletion", value.asInstanceOf[js.Any])
    
    inline def setPendingDeletionUndefined: Self = StObject.set(x, "PendingDeletion", js.undefined)
    
    inline def setState(value: OptionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setUpdateDate(value: js.Date): Self = StObject.set(x, "UpdateDate", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersion(value: UIntValue): Self = StObject.set(x, "UpdateVersion", value.asInstanceOf[js.Any])
    
    inline def setUpdateVersionUndefined: Self = StObject.set(x, "UpdateVersion", js.undefined)
  }
}
