package typingsJapgolly.msportalfxMock

import typingsJapgolly.msportalfxMock.libSrcMockFxMod.MockFx.Context
import typingsJapgolly.msportalfxMock.libSrcMockFxMod.MockFx.Finalization
import typingsJapgolly.msportalfxMock.libSrcMockFxMod.MockFx.LogLevel
import typingsJapgolly.msportalfxMock.libSrcMockFxMod.MockFx.Stage
import typingsJapgolly.msportalfxMock.libSrcMockFxMod.MockFx.Telemetry
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.addListener
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.constructor
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.debug
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.emit
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.error
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.eventNames
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.finalizeStage
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.finalizeTest
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.getMaxListeners
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.info
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.listenerCount
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.listeners
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.off
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.on
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.once
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.prependListener
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.prependOnceListener
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.rawListeners
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.registerStage
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.registerTest
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.removeAllListeners
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.removeListener
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.setMaxListeners
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.telemetry
import typingsJapgolly.msportalfxMock.msportalfxMockStrings.warn
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.std.Exclude
import typingsJapgolly.strictEventEmitterTypes.mod.OverriddenKeys
import typingsJapgolly.strictEventEmitterTypes.mod.StrictEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcMockFxLoggerMod {
  
  @JSImport("msportalfx-mock/lib/src/MockFx/logger", "logger")
  @js.native
  val logger: LoggerType = js.native
  
  @js.native
  trait Events extends StObject {
    
    def error(error: js.Error): Unit = js.native
    def error(error: js.Error, testContext: Context): Unit = js.native
    
    def finalizeStage(data: Stage): Unit = js.native
    
    def finalizeTest(data: Finalization): Unit = js.native
    
    def log(level: LogLevel, message: String): Unit = js.native
    def log(level: LogLevel, message: String, testContext: Context): Unit = js.native
    
    def registerStage(data: Stage): Unit = js.native
    
    def registerTest(data: Context): Unit = js.native
    
    def telemetry(telemetry: Telemetry): Unit = js.native
  }
  
  type LoggerType = StrictEventEmitter[
    Logger_, 
    Events, 
    Events, 
    Exclude[
      OverriddenKeys, 
      /* keyof msportalfx-mock.msportalfx-mock/lib/src/MockFx/logger.Logger */ debug | info | warn | error | telemetry | finalizeStage | finalizeTest | registerStage | registerTest | constructor | addListener | on | once | removeListener | off | removeAllListeners | setMaxListeners | getMaxListeners | listeners | rawListeners | emit | listenerCount | prependListener | prependOnceListener | eventNames
    ], 
    Exclude[
      OverriddenKeys, 
      Exclude[
        OverriddenKeys, 
        /* keyof msportalfx-mock.msportalfx-mock/lib/src/MockFx/logger.Logger */ debug | info | warn | error | telemetry | finalizeStage | finalizeTest | registerStage | registerTest | constructor | addListener | on | once | removeListener | off | removeAllListeners | setMaxListeners | getMaxListeners | listeners | rawListeners | emit | listenerCount | prependListener | prependOnceListener | eventNames
      ]
    ]
  ]
  
  @js.native
  trait Logger_ extends EventEmitter {
    
    def debug(message: String): Unit = js.native
    def debug(message: String, testContext: Context): Unit = js.native
    
    def error(error: js.Error): Unit = js.native
    def error(error: js.Error, testContext: Context): Unit = js.native
    
    def finalizeStage(data: Stage): Unit = js.native
    
    def finalizeTest(data: Finalization): Unit = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, testContext: Context): Unit = js.native
    
    def registerStage(data: Stage): Unit = js.native
    
    def registerTest(data: Context): Unit = js.native
    
    def telemetry(telemetry: Telemetry): Unit = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, testContext: Context): Unit = js.native
  }
}
