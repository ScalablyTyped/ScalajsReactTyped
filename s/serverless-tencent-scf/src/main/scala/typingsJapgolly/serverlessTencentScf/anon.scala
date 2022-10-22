package typingsJapgolly.serverlessTencentScf

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Appid extends StObject {
    
    var appid: String
    
    var name: String
    
    var region: String
  }
  object Appid {
    
    inline def apply(appid: String, name: String, region: String): Appid = {
      val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[Appid]
    }
    
    extension [Self <: Appid](x: Self) {
      
      inline def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait CosBucket extends StObject {
    
    var cosBucket: Appid
    
    var cosNotificationId: String
    
    var cosObject: Key
    
    var cosSchemaVersion: String
  }
  object CosBucket {
    
    inline def apply(cosBucket: Appid, cosNotificationId: String, cosObject: Key, cosSchemaVersion: String): CosBucket = {
      val __obj = js.Dynamic.literal(cosBucket = cosBucket.asInstanceOf[js.Any], cosNotificationId = cosNotificationId.asInstanceOf[js.Any], cosObject = cosObject.asInstanceOf[js.Any], cosSchemaVersion = cosSchemaVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[CosBucket]
    }
    
    extension [Self <: CosBucket](x: Self) {
      
      inline def setCosBucket(value: Appid): Self = StObject.set(x, "cosBucket", value.asInstanceOf[js.Any])
      
      inline def setCosNotificationId(value: String): Self = StObject.set(x, "cosNotificationId", value.asInstanceOf[js.Any])
      
      inline def setCosObject(value: Key): Self = StObject.set(x, "cosObject", value.asInstanceOf[js.Any])
      
      inline def setCosSchemaVersion(value: String): Self = StObject.set(x, "cosSchemaVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventName extends StObject {
    
    var eventName: String
    
    var eventQueue: String
    
    var eventSource: String
    
    var eventTime: Double
    
    var eventVersion: String
    
    var reqid: Double
    
    var requestParameters: RequestHeaders
    
    var reservedInfo: String
  }
  object EventName {
    
    inline def apply(
      eventName: String,
      eventQueue: String,
      eventSource: String,
      eventTime: Double,
      eventVersion: String,
      reqid: Double,
      requestParameters: RequestHeaders,
      reservedInfo: String
    ): EventName = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], eventQueue = eventQueue.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], reqid = reqid.asInstanceOf[js.Any], requestParameters = requestParameters.asInstanceOf[js.Any], reservedInfo = reservedInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventName]
    }
    
    extension [Self <: EventName](x: Self) {
      
      inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventQueue(value: String): Self = StObject.set(x, "eventQueue", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventTime(value: Double): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setReqid(value: Double): Self = StObject.set(x, "reqid", value.asInstanceOf[js.Any])
      
      inline def setRequestParameters(value: RequestHeaders): Self = StObject.set(x, "requestParameters", value.asInstanceOf[js.Any])
      
      inline def setReservedInfo(value: String): Self = StObject.set(x, "reservedInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var meta: StringDictionary[String]
    
    var size: Double
    
    var url: String
    
    var vid: String
  }
  object Key {
    
    inline def apply(key: String, meta: StringDictionary[String], size: Double, url: String, vid: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vid = vid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: StringDictionary[String]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVid(value: String): Self = StObject.set(x, "vid", value.asInstanceOf[js.Any])
    }
  }
  
  trait MsgBody extends StObject {
    
    var msgBody: String
    
    var msgKey: String
    
    var offset: Double
    
    var partition: Double
    
    var topic: String
  }
  object MsgBody {
    
    inline def apply(msgBody: String, msgKey: String, offset: Double, partition: Double, topic: String): MsgBody = {
      val __obj = js.Dynamic.literal(msgBody = msgBody.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgBody]
    }
    
    extension [Self <: MsgBody](x: Self) {
      
      inline def setMsgBody(value: String): Self = StObject.set(x, "msgBody", value.asInstanceOf[js.Any])
      
      inline def setMsgKey(value: String): Self = StObject.set(x, "msgKey", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait MsgId extends StObject {
    
    var msgBody: String
    
    var msgId: String
    
    var msgTag: String
    
    var publishTime: String
    
    var requestId: String
    
    var subscriptionName: String
    
    var topicName: String
    
    var topicOwner: Double
    
    var `type`: String
  }
  object MsgId {
    
    inline def apply(
      msgBody: String,
      msgId: String,
      msgTag: String,
      publishTime: String,
      requestId: String,
      subscriptionName: String,
      topicName: String,
      topicOwner: Double,
      `type`: String
    ): MsgId = {
      val __obj = js.Dynamic.literal(msgBody = msgBody.asInstanceOf[js.Any], msgId = msgId.asInstanceOf[js.Any], msgTag = msgTag.asInstanceOf[js.Any], publishTime = publishTime.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], subscriptionName = subscriptionName.asInstanceOf[js.Any], topicName = topicName.asInstanceOf[js.Any], topicOwner = topicOwner.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MsgId]
    }
    
    extension [Self <: MsgId](x: Self) {
      
      inline def setMsgBody(value: String): Self = StObject.set(x, "msgBody", value.asInstanceOf[js.Any])
      
      inline def setMsgId(value: String): Self = StObject.set(x, "msgId", value.asInstanceOf[js.Any])
      
      inline def setMsgTag(value: String): Self = StObject.set(x, "msgTag", value.asInstanceOf[js.Any])
      
      inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionName(value: String): Self = StObject.set(x, "subscriptionName", value.asInstanceOf[js.Any])
      
      inline def setTopicName(value: String): Self = StObject.set(x, "topicName", value.asInstanceOf[js.Any])
      
      inline def setTopicOwner(value: Double): Self = StObject.set(x, "topicOwner", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestHeaders extends StObject {
    
    var requestHeaders: StringDictionary[String]
    
    var requestSourceIP: String
  }
  object RequestHeaders {
    
    inline def apply(requestHeaders: StringDictionary[String], requestSourceIP: String): RequestHeaders = {
      val __obj = js.Dynamic.literal(requestHeaders = requestHeaders.asInstanceOf[js.Any], requestSourceIP = requestSourceIP.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestHeaders]
    }
    
    extension [Self <: RequestHeaders](x: Self) {
      
      inline def setRequestHeaders(value: StringDictionary[String]): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestSourceIP(value: String): Self = StObject.set(x, "requestSourceIP", value.asInstanceOf[js.Any])
    }
  }
  
  trait SecretId extends StObject {
    
    var secretId: js.UndefOr[String] = js.undefined
  }
  object SecretId {
    
    inline def apply(): SecretId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SecretId]
    }
    
    extension [Self <: SecretId](x: Self) {
      
      inline def setSecretId(value: String): Self = StObject.set(x, "secretId", value.asInstanceOf[js.Any])
      
      inline def setSecretIdUndefined: Self = StObject.set(x, "secretId", js.undefined)
    }
  }
  
  trait Stage extends StObject {
    
    var stage: String
  }
  object Stage {
    
    inline def apply(stage: String): Stage = {
      val __obj = js.Dynamic.literal(stage = stage.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stage]
    }
    
    extension [Self <: Stage](x: Self) {
      
      inline def setStage(value: String): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
    }
  }
}
