package typingsJapgolly.formatjsIntlUtils.diffMod

import typingsJapgolly.formatjsIntlUtils.AnonUnit
import typingsJapgolly.formatjsIntlUtils.PartialThresholds
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/diff", "selectUnit")
@js.native
object selectUnit extends js.Object {
  def apply(from: Double): AnonUnit = js.native
  def apply(from: Double, to: Double): AnonUnit = js.native
  def apply(from: Double, to: Double, thresholds: PartialThresholds): AnonUnit = js.native
  def apply(from: Double, to: Date): AnonUnit = js.native
  def apply(from: Double, to: Date, thresholds: PartialThresholds): AnonUnit = js.native
  def apply(from: Date): AnonUnit = js.native
  def apply(from: Date, to: Double): AnonUnit = js.native
  def apply(from: Date, to: Double, thresholds: PartialThresholds): AnonUnit = js.native
  def apply(from: Date, to: Date): AnonUnit = js.native
  def apply(from: Date, to: Date, thresholds: PartialThresholds): AnonUnit = js.native
}

