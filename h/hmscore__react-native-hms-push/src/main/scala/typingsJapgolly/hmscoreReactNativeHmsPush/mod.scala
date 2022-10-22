package typingsJapgolly.hmscoreReactNativeHmsPush

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hmscoreReactNativeHmsPush.anon.AnalyticInfo
import typingsJapgolly.hmscoreReactNativeHmsPush.anon.BADGENUMBER
import typingsJapgolly.hmscoreReactNativeHmsPush.anon.kinkeyofLocalNotification
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`0`
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`1`
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushInts.`2`
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.HCM
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.analyticInfo
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.analyticInfoMap
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.collapseKey
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.data
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.dataOfMap
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.from
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.messageId
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.messageType
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.originalUrgency
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.sentTime
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.to
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.token
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.ttl
import typingsJapgolly.hmscoreReactNativeHmsPush.hmscoreReactNativeHmsPushStrings.urgency
import typingsJapgolly.hmscoreReactNativeHmsPush.srcHmsPushEventMod.HmsPushEventType
import typingsJapgolly.hmscoreReactNativeHmsPush.srcHmsPushResultCodeMod.HmsPushResultCodeInterface
import typingsJapgolly.hmscoreReactNativeHmsPush.srcRemoteMessageBuilderMod.RemoteMessageBuilderInterface
import typingsJapgolly.hmscoreReactNativeHmsPush.srcResultResponseMod.ResultResponse
import typingsJapgolly.hmscoreReactNativeHmsPush.srcRnremotemessageMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@hmscore/react-native-hms-push", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def deleteAAID(): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteAAID")().asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteToken(value: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteToken")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def deleteTokenWithSubjectId(subjectId: String): js.Promise[ResultResponse[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteTokenWithSubjectId")(subjectId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[Boolean]]]
    
    inline def getAAID(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAAID")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getCreationTime(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreationTime")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getId(): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getId")().asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getToken(value: String): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getToken")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[String]]]
    
    inline def getTokenWithSubjectId(subjectId: String): js.Promise[ResultResponse[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokenWithSubjectId")(subjectId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ResultResponse[String]]]
  }
  
  @JSImport("@hmscore/react-native-hms-push", "HmsPushEvent")
  @js.native
  val HmsPushEvent: HmsPushEventType = js.native
  
  @JSImport("@hmscore/react-native-hms-push", "HmsPushResultCode")
  @js.native
  val HmsPushResultCode: HmsPushResultCodeInterface = js.native
  
  @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage")
  @js.native
  open class RNRemoteMessage protected () extends default {
    def this(options: AnalyticInfo) = this()
  }
  /* static members */
  object RNRemoteMessage {
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.ANALYTIC_INFO")
    @js.native
    def ANALYTIC_INFO: analyticInfo = js.native
    inline def ANALYTIC_INFO_=(x: analyticInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANALYTIC_INFO")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.ANALYTIC_INFO_MAP")
    @js.native
    def ANALYTIC_INFO_MAP: analyticInfoMap = js.native
    inline def ANALYTIC_INFO_MAP_=(x: analyticInfoMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANALYTIC_INFO_MAP")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.COLLAPSEKEY")
    @js.native
    def COLLAPSEKEY: collapseKey = js.native
    inline def COLLAPSEKEY_=(x: collapseKey): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COLLAPSEKEY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.DATA")
    @js.native
    def DATA: data = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.DATAOFMAP")
    @js.native
    def DATAOFMAP: dataOfMap = js.native
    inline def DATAOFMAP_=(x: dataOfMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATAOFMAP")(x.asInstanceOf[js.Any])
    
    inline def DATA_=(x: data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.FROM")
    @js.native
    def FROM: from = js.native
    inline def FROM_=(x: from): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.INSTANCE_ID_SCOPE")
    @js.native
    def INSTANCE_ID_SCOPE: HCM = js.native
    inline def INSTANCE_ID_SCOPE_=(x: HCM): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTANCE_ID_SCOPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.MESSAGEID")
    @js.native
    def MESSAGEID: messageId = js.native
    inline def MESSAGEID_=(x: messageId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGEID")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.MESSAGETYPE")
    @js.native
    def MESSAGETYPE: messageType = js.native
    inline def MESSAGETYPE_=(x: messageType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGETYPE")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.NOTIFICATION")
    @js.native
    def NOTIFICATION: BADGENUMBER = js.native
    inline def NOTIFICATION_=(x: BADGENUMBER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOTIFICATION")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.ORIGINALURGENCY")
    @js.native
    def ORIGINALURGENCY: originalUrgency = js.native
    inline def ORIGINALURGENCY_=(x: originalUrgency): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGINALURGENCY")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.PRIORITY_HIG")
    @js.native
    def PRIORITY_HIG: `1` = js.native
    inline def PRIORITY_HIG_=(x: `1`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY_HIG")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.PRIORITY_NORMAL")
    @js.native
    def PRIORITY_NORMAL: `2` = js.native
    inline def PRIORITY_NORMAL_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY_NORMAL")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.PRIORITY_UNKNOWN")
    @js.native
    def PRIORITY_UNKNOWN: `0` = js.native
    inline def PRIORITY_UNKNOWN_=(x: `0`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY_UNKNOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.SENTTIME")
    @js.native
    def SENTTIME: sentTime = js.native
    inline def SENTTIME_=(x: sentTime): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SENTTIME")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.TO")
    @js.native
    def TO: to = js.native
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.TOKEN")
    @js.native
    def TOKEN: token = js.native
    inline def TOKEN_=(x: token): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOKEN")(x.asInstanceOf[js.Any])
    
    inline def TO_=(x: to): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TO")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.TTL")
    @js.native
    def TTL: ttl = js.native
    inline def TTL_=(x: ttl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TTL")(x.asInstanceOf[js.Any])
    
    @JSImport("@hmscore/react-native-hms-push", "RNRemoteMessage.URGENCY")
    @js.native
    def URGENCY: urgency = js.native
    inline def URGENCY_=(x: urgency): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URGENCY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@hmscore/react-native-hms-push", "RemoteMessageBuilder")
  @js.native
  val RemoteMessageBuilder: RemoteMessageBuilderInterface = js.native
  
  type LocalNotificationOptions = kinkeyofLocalNotification | StringDictionary[Any]
}
