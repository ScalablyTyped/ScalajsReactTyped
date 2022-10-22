package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojmessagingMod {
  
  @JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Message {
    def this(summary: String, detail: String) = this()
    def this(summary: String, detail: String, severity: SEVERITY_LEVEL) = this()
    def this(summary: String, detail: String, severity: SEVERITY_TYPE) = this()
    
    /* CompleteClass */
    var detail: String = js.native
    
    /* CompleteClass */
    var severity: SEVERITY_TYPE | SEVERITY_LEVEL = js.native
    
    /* CompleteClass */
    var summary: String = js.native
  }
  @JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getMaxSeverity(): SEVERITY_LEVEL | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxSeverity")().asInstanceOf[SEVERITY_LEVEL | `-1`]
  inline def getMaxSeverity(messages: js.Array[Message]): SEVERITY_LEVEL | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxSeverity")(messages.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_LEVEL | `-1`]
  
  /* static member */
  inline def getSeverityLevel(): SEVERITY_LEVEL = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityLevel")().asInstanceOf[SEVERITY_LEVEL]
  inline def getSeverityLevel(severity: SEVERITY_LEVEL): SEVERITY_LEVEL = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityLevel")(severity.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_LEVEL]
  inline def getSeverityLevel(severity: SEVERITY_TYPE): SEVERITY_LEVEL = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityLevel")(severity.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_LEVEL]
  
  /* static member */
  inline def getSeverityType(): SEVERITY_TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityType")().asInstanceOf[SEVERITY_TYPE]
  inline def getSeverityType(level: SEVERITY_LEVEL): SEVERITY_TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityType")(level.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_TYPE]
  inline def getSeverityType(level: SEVERITY_TYPE): SEVERITY_TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityType")(level.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_TYPE]
  
  /* static member */
  inline def isValid(messages: js.Array[Message]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(messages.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Message extends StObject {
    
    var detail: String
    
    var severity: SEVERITY_TYPE | SEVERITY_LEVEL
    
    var summary: String
  }
  object Message {
    
    inline def apply(detail: String, severity: SEVERITY_TYPE | SEVERITY_LEVEL, summary: String): Message = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: SEVERITY_TYPE | SEVERITY_LEVEL): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`5`
    - typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`4`
    - typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`3`
    - typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`2`
    - typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`1`
  */
  trait SEVERITY_LEVEL extends StObject
  object SEVERITY_LEVEL {
    
    inline def `1`: typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`1` = 1.asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`1`]
    
    inline def `2`: typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`2` = 2.asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`2`]
    
    inline def `3`: typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`3` = 3.asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`3`]
    
    inline def `4`: typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`4` = 4.asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`4`]
    
    inline def `5`: typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`5` = 5.asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetInts.`5`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.confirmation
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.info
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.warning
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.error
    - typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fatal
  */
  trait SEVERITY_TYPE extends StObject
  object SEVERITY_TYPE {
    
    inline def confirmation: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.confirmation = "confirmation".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.confirmation]
    
    inline def error: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.error = "error".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.error]
    
    inline def fatal: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fatal = "fatal".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.fatal]
    
    inline def info: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.info = "info".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.info]
    
    inline def warning: typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.warning = "warning".asInstanceOf[typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.warning]
  }
}
