package typingsJapgolly.annyang.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.annyang.annyangStrings.start
  - typingsJapgolly.annyang.annyangStrings.soundstart
  - typingsJapgolly.annyang.annyangStrings.error
  - typingsJapgolly.annyang.annyangStrings.end
  - typingsJapgolly.annyang.annyangStrings.result
  - typingsJapgolly.annyang.annyangStrings.resultMatch
  - typingsJapgolly.annyang.annyangStrings.resultNoMatch
  - typingsJapgolly.annyang.annyangStrings.errorNetwork
  - typingsJapgolly.annyang.annyangStrings.errorPermissionBlocked
  - typingsJapgolly.annyang.annyangStrings.errorPermissionDenied
*/
trait Events extends js.Object

object Events {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def end: typingsJapgolly.annyang.annyangStrings.end = this.cast("end")
  @scala.inline
  def error: typingsJapgolly.annyang.annyangStrings.error = this.cast("error")
  @scala.inline
  def errorNetwork: typingsJapgolly.annyang.annyangStrings.errorNetwork = this.cast("errorNetwork")
  @scala.inline
  def errorPermissionBlocked: typingsJapgolly.annyang.annyangStrings.errorPermissionBlocked = this.cast("errorPermissionBlocked")
  @scala.inline
  def errorPermissionDenied: typingsJapgolly.annyang.annyangStrings.errorPermissionDenied = this.cast("errorPermissionDenied")
  @scala.inline
  def result: typingsJapgolly.annyang.annyangStrings.result = this.cast("result")
  @scala.inline
  def resultMatch: typingsJapgolly.annyang.annyangStrings.resultMatch = this.cast("resultMatch")
  @scala.inline
  def resultNoMatch: typingsJapgolly.annyang.annyangStrings.resultNoMatch = this.cast("resultNoMatch")
  @scala.inline
  def soundstart: typingsJapgolly.annyang.annyangStrings.soundstart = this.cast("soundstart")
  @scala.inline
  def start: typingsJapgolly.annyang.annyangStrings.start = this.cast("start")
}

