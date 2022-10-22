package typingsJapgolly.mqtt

import typingsJapgolly.mqtt.mqttStrings.mqtts
import typingsJapgolly.mqtt.mqttStrings.ssl
import typingsJapgolly.mqtt.mqttStrings.tcp
import typingsJapgolly.mqtt.mqttStrings.ws
import typingsJapgolly.mqtt.mqttStrings.wss
import typingsJapgolly.mqtt.mqttStrings.wx
import typingsJapgolly.mqtt.mqttStrings.wxs
import typingsJapgolly.mqttPacket.mod.QoS
import typingsJapgolly.mqttPacket.mod.UserProperties
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AuthenticationData extends StObject {
    
    var authenticationData: js.UndefOr[Buffer] = js.undefined
    
    var authenticationMethod: js.UndefOr[String] = js.undefined
    
    var maximumPacketSize: js.UndefOr[Double] = js.undefined
    
    var receiveMaximum: js.UndefOr[Double] = js.undefined
    
    var requestProblemInformation: js.UndefOr[Boolean] = js.undefined
    
    var requestResponseInformation: js.UndefOr[Boolean] = js.undefined
    
    var sessionExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var topicAliasMaximum: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[UserProperties] = js.undefined
  }
  object AuthenticationData {
    
    inline def apply(): AuthenticationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticationData]
    }
    
    extension [Self <: AuthenticationData](x: Self) {
      
      inline def setAuthenticationData(value: Buffer): Self = StObject.set(x, "authenticationData", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationDataUndefined: Self = StObject.set(x, "authenticationData", js.undefined)
      
      inline def setAuthenticationMethod(value: String): Self = StObject.set(x, "authenticationMethod", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationMethodUndefined: Self = StObject.set(x, "authenticationMethod", js.undefined)
      
      inline def setMaximumPacketSize(value: Double): Self = StObject.set(x, "maximumPacketSize", value.asInstanceOf[js.Any])
      
      inline def setMaximumPacketSizeUndefined: Self = StObject.set(x, "maximumPacketSize", js.undefined)
      
      inline def setReceiveMaximum(value: Double): Self = StObject.set(x, "receiveMaximum", value.asInstanceOf[js.Any])
      
      inline def setReceiveMaximumUndefined: Self = StObject.set(x, "receiveMaximum", js.undefined)
      
      inline def setRequestProblemInformation(value: Boolean): Self = StObject.set(x, "requestProblemInformation", value.asInstanceOf[js.Any])
      
      inline def setRequestProblemInformationUndefined: Self = StObject.set(x, "requestProblemInformation", js.undefined)
      
      inline def setRequestResponseInformation(value: Boolean): Self = StObject.set(x, "requestResponseInformation", value.asInstanceOf[js.Any])
      
      inline def setRequestResponseInformationUndefined: Self = StObject.set(x, "requestResponseInformation", js.undefined)
      
      inline def setSessionExpiryInterval(value: Double): Self = StObject.set(x, "sessionExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setSessionExpiryIntervalUndefined: Self = StObject.set(x, "sessionExpiryInterval", js.undefined)
      
      inline def setTopicAliasMaximum(value: Double): Self = StObject.set(x, "topicAliasMaximum", value.asInstanceOf[js.Any])
      
      inline def setTopicAliasMaximumUndefined: Self = StObject.set(x, "topicAliasMaximum", js.undefined)
      
      inline def setUserProperties(value: UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait ContentType extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var correlationData: js.UndefOr[Buffer] = js.undefined
    
    var messageExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined
    
    var responseTopic: js.UndefOr[String] = js.undefined
    
    var userProperties: js.UndefOr[UserProperties] = js.undefined
    
    var willDelayInterval: js.UndefOr[Double] = js.undefined
  }
  object ContentType {
    
    inline def apply(): ContentType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentType]
    }
    
    extension [Self <: ContentType](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      inline def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      inline def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      inline def setPayloadFormatIndicator(value: Boolean): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      inline def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      inline def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      inline def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      inline def setUserProperties(value: UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
      
      inline def setWillDelayInterval(value: Double): Self = StObject.set(x, "willDelayInterval", value.asInstanceOf[js.Any])
      
      inline def setWillDelayIntervalUndefined: Self = StObject.set(x, "willDelayInterval", js.undefined)
    }
  }
  
  trait CorrelationData extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var correlationData: js.UndefOr[Buffer] = js.undefined
    
    var messageExpiryInterval: js.UndefOr[Double] = js.undefined
    
    var payloadFormatIndicator: js.UndefOr[Boolean] = js.undefined
    
    var responseTopic: js.UndefOr[String] = js.undefined
    
    var subscriptionIdentifier: js.UndefOr[Double] = js.undefined
    
    var topicAlias: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[UserProperties] = js.undefined
  }
  object CorrelationData {
    
    inline def apply(): CorrelationData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CorrelationData]
    }
    
    extension [Self <: CorrelationData](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCorrelationData(value: Buffer): Self = StObject.set(x, "correlationData", value.asInstanceOf[js.Any])
      
      inline def setCorrelationDataUndefined: Self = StObject.set(x, "correlationData", js.undefined)
      
      inline def setMessageExpiryInterval(value: Double): Self = StObject.set(x, "messageExpiryInterval", value.asInstanceOf[js.Any])
      
      inline def setMessageExpiryIntervalUndefined: Self = StObject.set(x, "messageExpiryInterval", js.undefined)
      
      inline def setPayloadFormatIndicator(value: Boolean): Self = StObject.set(x, "payloadFormatIndicator", value.asInstanceOf[js.Any])
      
      inline def setPayloadFormatIndicatorUndefined: Self = StObject.set(x, "payloadFormatIndicator", js.undefined)
      
      inline def setResponseTopic(value: String): Self = StObject.set(x, "responseTopic", value.asInstanceOf[js.Any])
      
      inline def setResponseTopicUndefined: Self = StObject.set(x, "responseTopic", js.undefined)
      
      inline def setSubscriptionIdentifier(value: Double): Self = StObject.set(x, "subscriptionIdentifier", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdentifierUndefined: Self = StObject.set(x, "subscriptionIdentifier", js.undefined)
      
      inline def setTopicAlias(value: Double): Self = StObject.set(x, "topicAlias", value.asInstanceOf[js.Any])
      
      inline def setTopicAliasUndefined: Self = StObject.set(x, "topicAlias", js.undefined)
      
      inline def setUserProperties(value: UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var port: Double
    
    var protocol: js.UndefOr[wss | ws | typingsJapgolly.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs] = js.undefined
  }
  object Host {
    
    inline def apply(host: String, port: Double): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    extension [Self <: Host](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: wss | ws | typingsJapgolly.mqtt.mqttStrings.mqtt | mqtts | tcp | ssl | wx | wxs): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
  
  trait Nl extends StObject {
    
    var nl: js.UndefOr[Boolean] = js.undefined
    
    var qos: QoS
    
    var rap: js.UndefOr[Boolean] = js.undefined
    
    var rh: js.UndefOr[Double] = js.undefined
  }
  object Nl {
    
    inline def apply(qos: QoS): Nl = {
      val __obj = js.Dynamic.literal(qos = qos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nl]
    }
    
    extension [Self <: Nl](x: Self) {
      
      inline def setNl(value: Boolean): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
      
      inline def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
      
      inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRap(value: Boolean): Self = StObject.set(x, "rap", value.asInstanceOf[js.Any])
      
      inline def setRapUndefined: Self = StObject.set(x, "rap", js.undefined)
      
      inline def setRh(value: Double): Self = StObject.set(x, "rh", value.asInstanceOf[js.Any])
      
      inline def setRhUndefined: Self = StObject.set(x, "rh", js.undefined)
    }
  }
  
  trait Payload extends StObject {
    
    /**
      * the message to publish
      */
    var payload: Buffer | String
    
    /*
      *  properies object of will
      * */
    var properties: js.UndefOr[ContentType] = js.undefined
    
    /**
      * the QoS
      */
    var qos: QoS
    
    /**
      * the retain flag
      */
    var retain: Boolean
    
    /**
      * the topic to publish
      */
    var topic: String
  }
  object Payload {
    
    inline def apply(payload: Buffer | String, qos: QoS, retain: Boolean, topic: String): Payload = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], qos = qos.asInstanceOf[js.Any], retain = retain.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setPayload(value: Buffer | String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: ContentType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setQos(value: QoS): Self = StObject.set(x, "qos", value.asInstanceOf[js.Any])
      
      inline def setRetain(value: Boolean): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionIdentifier extends StObject {
    
    var subscriptionIdentifier: js.UndefOr[Double] = js.undefined
    
    var userProperties: js.UndefOr[UserProperties] = js.undefined
  }
  object SubscriptionIdentifier {
    
    inline def apply(): SubscriptionIdentifier = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubscriptionIdentifier]
    }
    
    extension [Self <: SubscriptionIdentifier](x: Self) {
      
      inline def setSubscriptionIdentifier(value: Double): Self = StObject.set(x, "subscriptionIdentifier", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionIdentifierUndefined: Self = StObject.set(x, "subscriptionIdentifier", js.undefined)
      
      inline def setUserProperties(value: UserProperties): Self = StObject.set(x, "userProperties", value.asInstanceOf[js.Any])
      
      inline def setUserPropertiesUndefined: Self = StObject.set(x, "userProperties", js.undefined)
    }
  }
}
