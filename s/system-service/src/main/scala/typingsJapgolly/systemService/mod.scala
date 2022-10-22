package typingsJapgolly.systemService

import typingsJapgolly.systemLogger.mod.FileConfiguration
import typingsJapgolly.systemLogger.mod.LoggerConfiguration
import typingsJapgolly.systemLogger.mod.SourcesConfiguration
import typingsJapgolly.systemLogger.mod.fileRotateType
import typingsJapgolly.systemLogger.mod.level
import typingsJapgolly.systemService.anon.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("system-service", "FileRotateType")
  @js.native
  object FileRotateType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[fileRotateType & Double] = js.native
    
    /* 2 */ val daily: typingsJapgolly.systemLogger.mod.fileRotateType.daily & Double = js.native
    
    /* 3 */ val hourly: typingsJapgolly.systemLogger.mod.fileRotateType.hourly & Double = js.native
    
    /* 4 */ val minutely: typingsJapgolly.systemLogger.mod.fileRotateType.minutely & Double = js.native
    
    /* 0 */ val monthly: typingsJapgolly.systemLogger.mod.fileRotateType.monthly & Double = js.native
    
    /* 1 */ val weekly: typingsJapgolly.systemLogger.mod.fileRotateType.weekly & Double = js.native
  }
  
  @JSImport("system-service", "Level")
  @js.native
  object Level extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[level & Double] = js.native
    
    /* 4 */ val debug: typingsJapgolly.systemLogger.mod.level.debug & Double = js.native
    
    /* 0 */ val error: typingsJapgolly.systemLogger.mod.level.error & Double = js.native
    
    /* 2 */ val info: typingsJapgolly.systemLogger.mod.level.info & Double = js.native
    
    /* 5 */ val silly: typingsJapgolly.systemLogger.mod.level.silly & Double = js.native
    
    /* 3 */ val verbose: typingsJapgolly.systemLogger.mod.level.verbose & Double = js.native
    
    /* 1 */ val warn: typingsJapgolly.systemLogger.mod.level.warn & Double = js.native
  }
  
  @JSImport("system-service", "Logger")
  @js.native
  open class Logger ()
    extends typingsJapgolly.systemLogger.mod.Logger {
    def this(configuration: LoggerConfiguration) = this()
    def this(configuration: Unit, fileConfig: FileConfiguration) = this()
    def this(configuration: LoggerConfiguration, fileConfig: FileConfiguration) = this()
    def this(configuration: Unit, fileConfig: Unit, sourceConfig: SourcesConfiguration) = this()
    def this(configuration: Unit, fileConfig: FileConfiguration, sourceConfig: SourcesConfiguration) = this()
    def this(configuration: LoggerConfiguration, fileConfig: Unit, sourceConfig: SourcesConfiguration) = this()
    def this(
      configuration: LoggerConfiguration,
      fileConfig: FileConfiguration,
      sourceConfig: SourcesConfiguration
    ) = this()
  }
  
  @JSImport("system-service", "MessageConsumer")
  @js.native
  open class MessageConsumer () extends StObject {
    
    def cleanup(): Unit = js.native
    
    def create(): Unit = js.native
    
    var logger: typingsJapgolly.systemLogger.mod.Logger = js.native
    
    def process(message: Any): Unit = js.native
    
    def service(): Unit = js.native
    
    def setup(systemService: SystemService): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def validate(message: Any): Unit = js.native
  }
  
  @JSImport("system-service", "SystemService")
  @js.native
  open class SystemService () extends StObject {
    def this(config: ServiceConfiguration) = this()
    def this(config: Unit, messageConsumer: MessageConsumer) = this()
    def this(config: ServiceConfiguration, messageConsumer: MessageConsumer) = this()
    
    var config: ServiceConfiguration = js.native
    
    var logger: typingsJapgolly.systemLogger.mod.Logger = js.native
    
    var messageConsumer: MessageConsumer = js.native
    
    def processMessage(message: Any): Unit = js.native
    
    def start(): Unit = js.native
    
    def stop(): Unit = js.native
    
    def validateMessage(message: Any): Unit = js.native
  }
  
  trait ServiceConfiguration extends StObject {
    
    var log: Config
  }
  object ServiceConfiguration {
    
    inline def apply(log: Config): ServiceConfiguration = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceConfiguration]
    }
    
    extension [Self <: ServiceConfiguration](x: Self) {
      
      inline def setLog(value: Config): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
}
