package typingsJapgolly.sipJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLogMod {
  
  @JSImport("sip.js/lib/core/log", "Levels")
  @js.native
  object Levels extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels & Double] = js.native
    
    /* 3 */ val debug: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.debug & Double = js.native
    
    /* 0 */ val error: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.error & Double = js.native
    
    /* 2 */ val log: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.log & Double = js.native
    
    /* 1 */ val warn: typingsJapgolly.sipJs.libCoreLogLevelsMod.Levels.warn & Double = js.native
  }
  
  @JSImport("sip.js/lib/core/log", "Logger")
  @js.native
  open class Logger protected ()
    extends typingsJapgolly.sipJs.libCoreLogLoggerMod.Logger {
    def this(logger: typingsJapgolly.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory, category: String) = this()
    def this(
      logger: typingsJapgolly.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory,
      category: String,
      label: String
    ) = this()
  }
  
  @JSImport("sip.js/lib/core/log", "LoggerFactory")
  @js.native
  open class LoggerFactory ()
    extends typingsJapgolly.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory
}
