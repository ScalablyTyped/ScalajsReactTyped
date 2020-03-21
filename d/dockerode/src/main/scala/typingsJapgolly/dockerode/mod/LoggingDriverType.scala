package typingsJapgolly.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dockerode.dockerodeStrings.`json-file`
  - typingsJapgolly.dockerode.dockerodeStrings.syslog
  - typingsJapgolly.dockerode.dockerodeStrings.journald
  - typingsJapgolly.dockerode.dockerodeStrings.gelf
  - typingsJapgolly.dockerode.dockerodeStrings.fluentd
  - typingsJapgolly.dockerode.dockerodeStrings.awslogs
  - typingsJapgolly.dockerode.dockerodeStrings.splunk
  - typingsJapgolly.dockerode.dockerodeStrings.etwlogs
  - typingsJapgolly.dockerode.dockerodeStrings.none
*/
trait LoggingDriverType extends js.Object

object LoggingDriverType {
  @scala.inline
  def awslogs: typingsJapgolly.dockerode.dockerodeStrings.awslogs = this.cast("awslogs")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def etwlogs: typingsJapgolly.dockerode.dockerodeStrings.etwlogs = this.cast("etwlogs")
  @scala.inline
  def fluentd: typingsJapgolly.dockerode.dockerodeStrings.fluentd = this.cast("fluentd")
  @scala.inline
  def gelf: typingsJapgolly.dockerode.dockerodeStrings.gelf = this.cast("gelf")
  @scala.inline
  def journald: typingsJapgolly.dockerode.dockerodeStrings.journald = this.cast("journald")
  @scala.inline
  def `json-file`: typingsJapgolly.dockerode.dockerodeStrings.`json-file` = this.cast("json-file")
  @scala.inline
  def none: typingsJapgolly.dockerode.dockerodeStrings.none = this.cast("none")
  @scala.inline
  def splunk: typingsJapgolly.dockerode.dockerodeStrings.splunk = this.cast("splunk")
  @scala.inline
  def syslog: typingsJapgolly.dockerode.dockerodeStrings.syslog = this.cast("syslog")
}

