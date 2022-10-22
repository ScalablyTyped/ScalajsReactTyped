package typingsJapgolly.firebasePerformance

import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`FB not default`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`already initialized`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid String merger input`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid custom metric name`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no api key`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no app id`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no project id`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no window`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`nonpositive trace duration`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`nonpositive trace startTime`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace started`
import typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace stopped`
import typingsJapgolly.firebaseUtil.mod.ErrorFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsErrorsMod {
  
  @JSImport("@firebase/performance/dist/src/utils/errors", "ERROR_FACTORY")
  @js.native
  val ERROR_FACTORY: ErrorFactory[ErrorCode, ErrorParams] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace started`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`trace stopped`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`nonpositive trace startTime`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`nonpositive trace duration`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no window`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no app id`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no project id`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`no api key`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid cc log`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`FB not default`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`RC response not ok`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute name`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid attribute value`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid custom metric name`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`invalid String merger input`
    - typingsJapgolly.firebasePerformance.firebasePerformanceStrings.`already initialized`
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def ALREADY_INITIALIZED: `already initialized` = ("already initialized").asInstanceOf[`already initialized`]
    
    inline def FB_NOT_DEFAULT: `FB not default` = ("FB not default").asInstanceOf[`FB not default`]
    
    inline def INVALID_ATTRIBUTE_NAME: `invalid attribute name` = ("invalid attribute name").asInstanceOf[`invalid attribute name`]
    
    inline def INVALID_ATTRIBUTE_VALUE: `invalid attribute value` = ("invalid attribute value").asInstanceOf[`invalid attribute value`]
    
    inline def INVALID_CC_LOG: `invalid cc log` = ("invalid cc log").asInstanceOf[`invalid cc log`]
    
    inline def INVALID_CUSTOM_METRIC_NAME: `invalid custom metric name` = ("invalid custom metric name").asInstanceOf[`invalid custom metric name`]
    
    inline def INVALID_STRING_MERGER_PARAMETER: `invalid String merger input` = ("invalid String merger input").asInstanceOf[`invalid String merger input`]
    
    inline def NONPOSITIVE_TRACE_DURATION: `nonpositive trace duration` = ("nonpositive trace duration").asInstanceOf[`nonpositive trace duration`]
    
    inline def NONPOSITIVE_TRACE_START_TIME: `nonpositive trace startTime` = ("nonpositive trace startTime").asInstanceOf[`nonpositive trace startTime`]
    
    inline def NO_API_KEY: `no api key` = ("no api key").asInstanceOf[`no api key`]
    
    inline def NO_APP_ID: `no app id` = ("no app id").asInstanceOf[`no app id`]
    
    inline def NO_PROJECT_ID: `no project id` = ("no project id").asInstanceOf[`no project id`]
    
    inline def NO_WINDOW: `no window` = ("no window").asInstanceOf[`no window`]
    
    inline def RC_NOT_OK: `RC response not ok` = ("RC response not ok").asInstanceOf[`RC response not ok`]
    
    inline def TRACE_STARTED_BEFORE: `trace started` = ("trace started").asInstanceOf[`trace started`]
    
    inline def TRACE_STOPPED_BEFORE: `trace stopped` = ("trace stopped").asInstanceOf[`trace stopped`]
  }
  
  @js.native
  trait ErrorParams extends StObject
}
