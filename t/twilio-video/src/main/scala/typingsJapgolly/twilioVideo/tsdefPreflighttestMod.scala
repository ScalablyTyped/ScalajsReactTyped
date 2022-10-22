package typingsJapgolly.twilioVideo

import typingsJapgolly.events.mod.EventEmitter
import typingsJapgolly.twilioVideo.tsdefPreflightTypesMod.PreflightTestReport
import typingsJapgolly.twilioVideo.twilioVideoStrings.completed
import typingsJapgolly.twilioVideo.twilioVideoStrings.failed
import typingsJapgolly.twilioVideo.twilioVideoStrings.progress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefPreflighttestMod {
  
  @JSImport("twilio-video/tsdef/preflighttest", "PreflightTest")
  @js.native
  open class PreflightTest () extends EventEmitter {
    
    @JSName("on")
    def on_completed(event: completed, listener: js.Function1[/* report */ PreflightTestReport, Unit]): this.type = js.native
    @JSName("on")
    def on_failed(
      event: failed,
      listener: js.Function2[/* error */ js.Error, /* report */ PreflightTestReport, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_progress(event: progress, listener: js.Function1[/* progress */ String, Unit]): this.type = js.native
    
    /**
      * Stops the test
      */
    def stop(): Unit = js.native
  }
}
