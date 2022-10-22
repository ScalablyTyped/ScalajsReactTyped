package typingsJapgolly.awsSdkClientS3Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateBucketExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists
    - typingsJapgolly.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou
  */
  trait CreateBucketExceptionsUnion extends StObject
  object CreateBucketExceptionsUnion {
    
    inline def BucketAlreadyExists(): typingsJapgolly.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists = {
      val __obj = js.Dynamic.literal(name = "BucketAlreadyExists")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesBucketAlreadyExistsMod.BucketAlreadyExists]
    }
    
    inline def BucketAlreadyOwnedByYou(): typingsJapgolly.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou = {
      val __obj = js.Dynamic.literal(name = "BucketAlreadyOwnedByYou")
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientS3Browser.typesBucketAlreadyOwnedByYouMod.BucketAlreadyOwnedByYou]
    }
  }
}
