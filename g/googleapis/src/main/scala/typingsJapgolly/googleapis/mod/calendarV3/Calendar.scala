package typingsJapgolly.googleapis.mod.calendarV3

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Calendar API
  *
  * Manipulates events and other calendar data.
  *
  * @example
  * const {google} = require('googleapis');
  * const calendar = google.calendar('v3');
  *
  * @namespace calendar
  * @type {Function}
  * @version v3
  * @variation v3
  * @param {object=} options Options for Calendar
  */
@JSImport("googleapis", "calendar_v3.Calendar")
@js.native
class Calendar protected ()
  extends typingsJapgolly.googleapis.calendarV3Mod.calendarV3.Calendar {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

