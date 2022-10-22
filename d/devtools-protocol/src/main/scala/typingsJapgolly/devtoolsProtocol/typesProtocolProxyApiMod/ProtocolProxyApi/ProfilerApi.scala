package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.consoleProfileFinished
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.consoleProfileStarted
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.preciseCoverageDeltaUpdate
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileFinishedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.ConsoleProfileStartedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.GetBestEffortCoverageResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.PreciseCoverageDeltaUpdateEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.SetSamplingIntervalRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.StopResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Profiler.TakePreciseCoverageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerApi extends StObject {
  
  def disable(): js.Promise[Unit] = js.native
  
  def enable(): js.Promise[Unit] = js.native
  
  /**
    * Collect coverage data for the current isolate. The coverage data may be incomplete due to
    * garbage collection.
    */
  def getBestEffortCoverage(): js.Promise[GetBestEffortCoverageResponse] = js.native
  
  @JSName("on")
  def on_consoleProfileFinished(
    event: consoleProfileFinished,
    listener: js.Function1[/* params */ ConsoleProfileFinishedEvent, Unit]
  ): Unit = js.native
  /**
    * Sent when new profile recording is started using console.profile() call.
    */
  @JSName("on")
  def on_consoleProfileStarted(
    event: consoleProfileStarted,
    listener: js.Function1[/* params */ ConsoleProfileStartedEvent, Unit]
  ): Unit = js.native
  /**
    * Reports coverage delta since the last poll (either from an event like this, or from
    * `takePreciseCoverage` for the current isolate. May only be sent if precise code
    * coverage has been started. This event can be trigged by the embedder to, for example,
    * trigger collection of coverage data immediately at a certain point in time.
    */
  @JSName("on")
  def on_preciseCoverageDeltaUpdate(
    event: preciseCoverageDeltaUpdate,
    listener: js.Function1[/* params */ PreciseCoverageDeltaUpdateEvent, Unit]
  ): Unit = js.native
  
  /**
    * Changes CPU profiler sampling interval. Must be called before CPU profiles recording started.
    */
  def setSamplingInterval(params: SetSamplingIntervalRequest): js.Promise[Unit] = js.native
  
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Enable precise code coverage. Coverage data for JavaScript executed before enabling precise code
    * coverage may be incomplete. Enabling prevents running optimized code and resets execution
    * counters.
    */
  def startPreciseCoverage(params: StartPreciseCoverageRequest): js.Promise[StartPreciseCoverageResponse] = js.native
  
  def stop(): js.Promise[StopResponse] = js.native
  
  /**
    * Disable precise code coverage. Disabling releases unnecessary execution count records and allows
    * executing optimized code.
    */
  def stopPreciseCoverage(): js.Promise[Unit] = js.native
  
  /**
    * Collect coverage data for the current isolate, and resets execution counters. Precise code
    * coverage needs to have started.
    */
  def takePreciseCoverage(): js.Promise[TakePreciseCoverageResponse] = js.native
}
