package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently
    - typingsJapgolly.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists
  */
  trait CreateQueueExceptionsUnion extends StObject
  object CreateQueueExceptionsUnion {
    
    inline def QueueDeletedRecently(): typingsJapgolly.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently = {
      val __obj = js.Dynamic.literal(name = "QueueDeletedRecently")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesQueueDeletedRecentlyMod.QueueDeletedRecently]
    }
    
    inline def QueueNameExists(): typingsJapgolly.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists = {
      val __obj = js.Dynamic.literal(name = "QueueNameExists")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesQueueNameExistsMod.QueueNameExists]
    }
  }
}
