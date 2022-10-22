package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContinuousBackupsOutput extends StObject {
  
  /**
    * Represents the continuous backups and point in time recovery settings on the table.
    */
  var ContinuousBackupsDescription: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.ContinuousBackupsDescription] = js.undefined
}
object UpdateContinuousBackupsOutput {
  
  inline def apply(): UpdateContinuousBackupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContinuousBackupsOutput]
  }
  
  extension [Self <: UpdateContinuousBackupsOutput](x: Self) {
    
    inline def setContinuousBackupsDescription(value: ContinuousBackupsDescription): Self = StObject.set(x, "ContinuousBackupsDescription", value.asInstanceOf[js.Any])
    
    inline def setContinuousBackupsDescriptionUndefined: Self = StObject.set(x, "ContinuousBackupsDescription", js.undefined)
  }
}
