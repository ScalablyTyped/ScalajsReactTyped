package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRecommenderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender to delete.
    */
  var recommenderArn: Arn
}
object DeleteRecommenderRequest {
  
  inline def apply(recommenderArn: Arn): DeleteRecommenderRequest = {
    val __obj = js.Dynamic.literal(recommenderArn = recommenderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRecommenderRequest]
  }
  
  extension [Self <: DeleteRecommenderRequest](x: Self) {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
  }
}
