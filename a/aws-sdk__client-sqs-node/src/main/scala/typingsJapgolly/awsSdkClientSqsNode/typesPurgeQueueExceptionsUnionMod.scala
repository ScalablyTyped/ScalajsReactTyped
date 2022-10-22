package typingsJapgolly.awsSdkClientSqsNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPurgeQueueExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist
    - typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress
  */
  trait PurgeQueueExceptionsUnion extends StObject
  object PurgeQueueExceptionsUnion {
    
    inline def PurgeQueueInProgress(): typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress = {
      val __obj = js.Dynamic.literal(name = "PurgeQueueInProgress")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesPurgeQueueInProgressMod.PurgeQueueInProgress]
    }
    
    inline def QueueDoesNotExist(): typingsJapgolly.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist = {
      val __obj = js.Dynamic.literal(name = "QueueDoesNotExist")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientSqsNode.typesQueueDoesNotExistMod.QueueDoesNotExist]
    }
  }
}
