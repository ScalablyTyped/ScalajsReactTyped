package typingsJapgolly.apptimizeApptimizeWebSdk

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_DEBUG
import typingsJapgolly.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_ERROR
import typingsJapgolly.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_INFO
import typingsJapgolly.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_NONE
import typingsJapgolly.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_VERBOSE
import typingsJapgolly.apptimizeApptimizeWebSdk.apptimizeApptimizeWebSdkStrings.LOG_LEVEL_WARN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@apptimize/apptimize-web-sdk", JSImport.Default)
  @js.native
  val default: Apptimize = js.native
  
  @js.native
  trait Apptimize extends StObject {
    
    def flushTracking(): Unit = js.native
    
    def getApptimizeAnonUserId(): String = js.native
    
    def getApptimizeSDKPlatform(): String = js.native
    
    def getApptimizeSDKVersion(): String = js.native
    
    def getBool(name: String, defaultValue: Boolean): Boolean = js.native
    
    def getBoolArray(name: String, defaultValue: js.Array[Boolean]): js.Array[Boolean] = js.native
    
    def getBoolDictionary(name: String, defaultValue: Dictionary[Boolean]): Dictionary[Boolean] = js.native
    
    def getCustomAttributes(): Dictionary[simpleData] = js.native
    
    def getCustomerUserId(): String = js.native
    
    def getDouble(name: String, defaultValue: Double): Double = js.native
    
    def getDoubleArray(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getDoubleDictionary(name: String, defaultValue: Dictionary[Double]): Dictionary[Double] = js.native
    
    def getInt(name: String, defaultValue: Double): Double = js.native
    
    def getIntArray(name: String, defaultValue: js.Array[Double]): js.Array[Double] = js.native
    
    def getIntDictionary(name: String, defaultValue: Dictionary[Double]): Dictionary[Double] = js.native
    
    def getString(name: String, defaultValue: String): String = js.native
    
    def getStringArray(name: String, defaultValue: js.Array[String]): js.Array[String] = js.native
    
    def getStringDictionary(name: String, defaultValue: Dictionary[String]): Dictionary[String] = js.native
    
    def getVariantInfo(): js.Array[VariantInfo] = js.native
    
    def isFeatureFlagEnabled(name: String): Boolean = js.native
    
    def runCodeBlock(codeBlockVariableName: String, callback: Dictionary[callback]): Unit = js.native
    
    def setAppName(name: String): Unit = js.native
    
    def setAppVersion(version: String): Unit = js.native
    
    def setCustomAttributes(attributes: Dictionary[simpleData]): Unit = js.native
    
    def setCustomerUserId(id: String): Unit = js.native
    
    def setOnApptimizeInitializedCallback(callback: callback): Unit = js.native
    
    def setOnEnrolledInExperimentCallback(callback: variantInfoCallback): Unit = js.native
    
    def setOnMetadataUpdatedCallback(callback: callback): Unit = js.native
    
    def setOnParticipatedInExperimentCallback(callback: variantInfoCallback): Unit = js.native
    
    def setOnUnenrolledInExperimentCallback(callback: unenrollmentCallback): Unit = js.native
    
    def setPilotTargetingId(id: String): Unit = js.native
    
    def setup(appKey: String): Unit = js.native
    def setup(appKey: String, configAttributes: ConfigAttributes): Unit = js.native
    
    def track(eventName: String): Unit = js.native
    
    def trackValue(eventName: String, value: Double): Unit = js.native
    
    def updateApptimizeMetadataOnce(): Unit = js.native
  }
  
  trait ConfigAttributes extends StObject {
    
    var log_level: js.UndefOr[
        LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
      ] = js.undefined
    
    var result_post_delay_ms: js.UndefOr[Double] = js.undefined
  }
  object ConfigAttributes {
    
    inline def apply(): ConfigAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigAttributes]
    }
    
    extension [Self <: ConfigAttributes](x: Self) {
      
      inline def setLog_level(
        value: LOG_LEVEL_VERBOSE | LOG_LEVEL_DEBUG | LOG_LEVEL_INFO | LOG_LEVEL_WARN | LOG_LEVEL_ERROR | LOG_LEVEL_NONE
      ): Self = StObject.set(x, "log_level", value.asInstanceOf[js.Any])
      
      inline def setLog_levelUndefined: Self = StObject.set(x, "log_level", js.undefined)
      
      inline def setResult_post_delay_ms(value: Double): Self = StObject.set(x, "result_post_delay_ms", value.asInstanceOf[js.Any])
      
      inline def setResult_post_delay_msUndefined: Self = StObject.set(x, "result_post_delay_ms", js.undefined)
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  trait VariantInfo extends StObject {
    
    def getAnonymousUserId(): String
    
    def getCurrentPhase(): Double
    
    def getCycle(): Double
    
    def getExperimentId(): Double
    
    def getExperimentName(): String
    
    def getExperimentType(): Double
    
    def getExperimentTypeName(): String
    
    def getParticipationPhase(): Double
    
    def getUserHasParticipated(): Boolean
    
    def getUserId(): String
    
    def getVariantId(): Double
    
    def getVariantName(): String
  }
  object VariantInfo {
    
    inline def apply(
      getAnonymousUserId: CallbackTo[String],
      getCurrentPhase: CallbackTo[Double],
      getCycle: CallbackTo[Double],
      getExperimentId: CallbackTo[Double],
      getExperimentName: CallbackTo[String],
      getExperimentType: CallbackTo[Double],
      getExperimentTypeName: CallbackTo[String],
      getParticipationPhase: CallbackTo[Double],
      getUserHasParticipated: CallbackTo[Boolean],
      getUserId: CallbackTo[String],
      getVariantId: CallbackTo[Double],
      getVariantName: CallbackTo[String]
    ): VariantInfo = {
      val __obj = js.Dynamic.literal(getAnonymousUserId = getAnonymousUserId.toJsFn, getCurrentPhase = getCurrentPhase.toJsFn, getCycle = getCycle.toJsFn, getExperimentId = getExperimentId.toJsFn, getExperimentName = getExperimentName.toJsFn, getExperimentType = getExperimentType.toJsFn, getExperimentTypeName = getExperimentTypeName.toJsFn, getParticipationPhase = getParticipationPhase.toJsFn, getUserHasParticipated = getUserHasParticipated.toJsFn, getUserId = getUserId.toJsFn, getVariantId = getVariantId.toJsFn, getVariantName = getVariantName.toJsFn)
      __obj.asInstanceOf[VariantInfo]
    }
    
    extension [Self <: VariantInfo](x: Self) {
      
      inline def setGetAnonymousUserId(value: CallbackTo[String]): Self = StObject.set(x, "getAnonymousUserId", value.toJsFn)
      
      inline def setGetCurrentPhase(value: CallbackTo[Double]): Self = StObject.set(x, "getCurrentPhase", value.toJsFn)
      
      inline def setGetCycle(value: CallbackTo[Double]): Self = StObject.set(x, "getCycle", value.toJsFn)
      
      inline def setGetExperimentId(value: CallbackTo[Double]): Self = StObject.set(x, "getExperimentId", value.toJsFn)
      
      inline def setGetExperimentName(value: CallbackTo[String]): Self = StObject.set(x, "getExperimentName", value.toJsFn)
      
      inline def setGetExperimentType(value: CallbackTo[Double]): Self = StObject.set(x, "getExperimentType", value.toJsFn)
      
      inline def setGetExperimentTypeName(value: CallbackTo[String]): Self = StObject.set(x, "getExperimentTypeName", value.toJsFn)
      
      inline def setGetParticipationPhase(value: CallbackTo[Double]): Self = StObject.set(x, "getParticipationPhase", value.toJsFn)
      
      inline def setGetUserHasParticipated(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUserHasParticipated", value.toJsFn)
      
      inline def setGetUserId(value: CallbackTo[String]): Self = StObject.set(x, "getUserId", value.toJsFn)
      
      inline def setGetVariantId(value: CallbackTo[Double]): Self = StObject.set(x, "getVariantId", value.toJsFn)
      
      inline def setGetVariantName(value: CallbackTo[String]): Self = StObject.set(x, "getVariantName", value.toJsFn)
    }
  }
  
  type _To = Apptimize
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Apptimize = default
  
  type callback = js.Function0[Unit]
  
  type simpleData = String | Double | Boolean
  
  type unenrollmentCallback = js.Function2[/* variantInfo */ VariantInfo, /* unenrollmentReason */ String, Unit]
  
  type variantInfoCallback = js.Function1[/* variantInfo */ VariantInfo, Unit]
}
