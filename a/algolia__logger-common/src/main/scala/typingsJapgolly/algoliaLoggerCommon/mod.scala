package typingsJapgolly.algoliaLoggerCommon

import typingsJapgolly.algoliaLoggerCommon.anon.ReadonlyPromisevoid
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/logger-common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@algolia/logger-common", "LogLevelEnum")
  @js.native
  val LogLevelEnum: Record[String, LogLevelType] = js.native
  
  inline def createNullLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createNullLogger")().asInstanceOf[Logger]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`1`
    - typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`2`
    - typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`3`
  */
  trait LogLevelType extends StObject
  object LogLevelType {
    
    inline def `1`: typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`1` = 1.asInstanceOf[typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`1`]
    
    inline def `2`: typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`2` = 2.asInstanceOf[typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`2`]
    
    inline def `3`: typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`3` = 3.asInstanceOf[typingsJapgolly.algoliaLoggerCommon.algoliaLoggerCommonInts.`3`]
  }
  
  @js.native
  trait Logger extends StObject {
    
    /**
      * Logs debug messages.
      */
    def debug(message: String): ReadonlyPromisevoid = js.native
    def debug(message: String, args: Any): ReadonlyPromisevoid = js.native
    
    /**
      * Logs error messages.
      */
    def error(message: String): ReadonlyPromisevoid = js.native
    def error(message: String, args: Any): ReadonlyPromisevoid = js.native
    
    /**
      * Logs info messages.
      */
    def info(message: String): ReadonlyPromisevoid = js.native
    def info(message: String, args: Any): ReadonlyPromisevoid = js.native
  }
}
