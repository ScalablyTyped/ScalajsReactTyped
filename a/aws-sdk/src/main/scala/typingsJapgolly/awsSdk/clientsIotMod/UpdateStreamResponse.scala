package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateStreamResponse extends StObject {
  
  /**
    * A description of the stream.
    */
  var description: js.UndefOr[StreamDescription] = js.undefined
  
  /**
    * The stream ARN.
    */
  var streamArn: js.UndefOr[StreamArn] = js.undefined
  
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
  
  /**
    * The stream version.
    */
  var streamVersion: js.UndefOr[StreamVersion] = js.undefined
}
object UpdateStreamResponse {
  
  inline def apply(): UpdateStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateStreamResponse]
  }
  
  extension [Self <: UpdateStreamResponse](x: Self) {
    
    inline def setDescription(value: StreamDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStreamArn(value: StreamArn): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "streamArn", js.undefined)
    
    inline def setStreamId(value: StreamId): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamVersion(value: StreamVersion): Self = StObject.set(x, "streamVersion", value.asInstanceOf[js.Any])
    
    inline def setStreamVersionUndefined: Self = StObject.set(x, "streamVersion", js.undefined)
  }
}
