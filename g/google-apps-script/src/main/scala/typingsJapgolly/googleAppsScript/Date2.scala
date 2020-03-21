package typingsJapgolly.googleAppsScript

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Date
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.DateConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Date2")
@js.native
class Date2 () extends Date {
  def this(value: String) = this()
  def this(value: Double) = this()
  def this(year: Double, month: Double) = this()
  def this(year: Double, month: Double, date: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
  def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
  def this(
    year: Double,
    month: Double,
    date: Double,
    hours: Double,
    minutes: Double,
    seconds: Double,
    ms: Double
  ) = this()
}

// The name `Date` conflicts with lib.es5.d.ts.
// - We cannot include lib.es5.d.ts with Apps Script though because Apps Script is ES3
//   and doesn't include all ES5+ features.
//   Thus developers using the Date class must alias the type in their own TS projects.
// - We cannot use lib.es3.d.ts because it is no longer by dtslint.
@JSGlobal("Date2")
@js.native
object Date2 extends TopLevel[DateConstructor]

