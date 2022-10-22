package typingsJapgolly.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRecommenderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommender to stop.
    */
  var recommenderArn: Arn
}
object StopRecommenderRequest {
  
  inline def apply(recommenderArn: Arn): StopRecommenderRequest = {
    val __obj = js.Dynamic.literal(recommenderArn = recommenderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRecommenderRequest]
  }
  
  extension [Self <: StopRecommenderRequest](x: Self) {
    
    inline def setRecommenderArn(value: Arn): Self = StObject.set(x, "recommenderArn", value.asInstanceOf[js.Any])
  }
}
