package typingsJapgolly.chainsafeLibp2pGossipsub.anon

import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcMetricsMod.TopicLabel
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcTypesMod.MessageStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: MessageStatus
  
  var topic: TopicLabel
}
object Status {
  
  inline def apply(status: MessageStatus, topic: TopicLabel): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  extension [Self <: Status](x: Self) {
    
    inline def setStatus(value: MessageStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: TopicLabel): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
