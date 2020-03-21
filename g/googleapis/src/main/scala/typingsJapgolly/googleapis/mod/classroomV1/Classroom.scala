package typingsJapgolly.googleapis.mod.classroomV1

import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Classroom API
  *
  * Manages classes, rosters, and invitations in Google Classroom.
  *
  * @example
  * const {google} = require('googleapis');
  * const classroom = google.classroom('v1');
  *
  * @namespace classroom
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Classroom
  */
@JSImport("googleapis", "classroom_v1.Classroom")
@js.native
class Classroom protected ()
  extends typingsJapgolly.googleapis.classroomV1Mod.classroomV1.Classroom {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
}

