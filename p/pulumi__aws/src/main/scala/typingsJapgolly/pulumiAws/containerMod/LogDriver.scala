package typingsJapgolly.pulumiAws.containerMod

import typingsJapgolly.pulumiAws.pulumiAwsStrings.syslog_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.`json-file`
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.syslog_
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.journald
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.gelf
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.fluentd
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.awslogs
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.splunk
  - typingsJapgolly.pulumiAws.pulumiAwsStrings.awsfirelens
*/
trait LogDriver extends js.Object

object LogDriver {
  @scala.inline
  def awsfirelens: typingsJapgolly.pulumiAws.pulumiAwsStrings.awsfirelens = this.cast("awsfirelens")
  @scala.inline
  def awslogs: typingsJapgolly.pulumiAws.pulumiAwsStrings.awslogs = this.cast("awslogs")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fluentd: typingsJapgolly.pulumiAws.pulumiAwsStrings.fluentd = this.cast("fluentd")
  @scala.inline
  def gelf: typingsJapgolly.pulumiAws.pulumiAwsStrings.gelf = this.cast("gelf")
  @scala.inline
  def journald: typingsJapgolly.pulumiAws.pulumiAwsStrings.journald = this.cast("journald")
  @scala.inline
  def `json-file`: typingsJapgolly.pulumiAws.pulumiAwsStrings.`json-file` = this.cast("json-file")
  @scala.inline
  def splunk: typingsJapgolly.pulumiAws.pulumiAwsStrings.splunk = this.cast("splunk")
  @scala.inline
  def syslog: syslog_ = this.cast("syslog")
}

