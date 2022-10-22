package typingsJapgolly.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the connection to be created. The ARN is used as the connection reference when the connection is shared between AWS services.  The ARN is never reused if the connection is deleted. 
    */
  var ConnectionArn: typingsJapgolly.awsSdk.clientsCodestarconnectionsMod.ConnectionArn
  
  /**
    * Specifies the tags applied to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectionOutput {
  
  inline def apply(ConnectionArn: ConnectionArn): CreateConnectionOutput = {
    val __obj = js.Dynamic.literal(ConnectionArn = ConnectionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionOutput]
  }
  
  extension [Self <: CreateConnectionOutput](x: Self) {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
