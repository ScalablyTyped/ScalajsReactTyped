package typingsJapgolly.opentelemetryInstrumentation

import typingsJapgolly.opentelemetryInstrumentation.buildSrcInstrumentationMod.InstrumentationAbstract
import typingsJapgolly.opentelemetryInstrumentation.buildSrcTypesMod.InstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPlatformBrowserInstrumentationMod {
  
  /* note: abstract class */ @JSImport("@opentelemetry/instrumentation/build/src/platform/browser/instrumentation", "InstrumentationBase")
  @js.native
  open class InstrumentationBase protected () extends InstrumentationAbstract[Any] {
    def this(instrumentationName: String, instrumentationVersion: String) = this()
    def this(instrumentationName: String, instrumentationVersion: String, config: InstrumentationConfig) = this()
  }
}
