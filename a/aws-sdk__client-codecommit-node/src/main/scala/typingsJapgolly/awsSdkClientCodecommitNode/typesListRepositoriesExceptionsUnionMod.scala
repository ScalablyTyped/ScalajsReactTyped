package typingsJapgolly.awsSdkClientCodecommitNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesListRepositoriesExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException
    - typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException
  */
  trait ListRepositoriesExceptionsUnion extends StObject
  object ListRepositoriesExceptionsUnion {
    
    inline def InvalidContinuationTokenException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException = {
      val __obj = js.Dynamic.literal(name = "InvalidContinuationTokenException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidContinuationTokenExceptionMod.InvalidContinuationTokenException]
    }
    
    inline def InvalidOrderException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException = {
      val __obj = js.Dynamic.literal(name = "InvalidOrderException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidOrderExceptionMod.InvalidOrderException]
    }
    
    inline def InvalidSortByException(): typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException = {
      val __obj = js.Dynamic.literal(name = "InvalidSortByException")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientCodecommitNode.typesInvalidSortByExceptionMod.InvalidSortByException]
    }
  }
}
