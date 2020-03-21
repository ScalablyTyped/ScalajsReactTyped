package typingsJapgolly.gsap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gsap", "TimelineLite")
@js.native
class TimelineLite ()
  extends typingsJapgolly.gsap.gsap.TimelineLite {
  def this(vars: js.Object) = this()
}

/* static members */
@JSImport("gsap", "TimelineLite")
@js.native
object TimelineLite extends js.Object {
  /**
    * Seamlessly transfers all tweens, timelines, and [optionally] delayed calls from the root timeline into a new TimelineLite so that you can perform advanced tasks on a seemingly global
    * basis without affecting tweens/timelines that you create after the export.
    */
  def exportRoot(): typingsJapgolly.gsap.gsap.TimelineLite = js.native
  def exportRoot(vars: js.Object): typingsJapgolly.gsap.gsap.TimelineLite = js.native
  def exportRoot(vars: js.Object, omitDelayedCalls: Boolean): typingsJapgolly.gsap.gsap.TimelineLite = js.native
}

