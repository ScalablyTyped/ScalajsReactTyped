package typingsJapgolly.jestFakeTimers

import typingsJapgolly.jestFakeTimers.jestFakeTimersMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/fake-timers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class JestFakeTimers[TimerRef] protected () extends default[TimerRef] {
    def this(hasGlobalModuleMockerTimerConfigConfigMaxLoops: AnonConfig[TimerRef]) = this()
  }
  
}

