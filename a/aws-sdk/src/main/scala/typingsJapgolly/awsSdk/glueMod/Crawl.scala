package typingsJapgolly.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Crawl extends js.Object {
  /**
    * The date and time on which the crawl completed.
    */
  var CompletedOn: js.UndefOr[js.Date] = js.native
  /**
    * The error message associated with the crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.native
  /**
    * The log group associated with the crawl.
    */
  var LogGroup: js.UndefOr[typingsJapgolly.awsSdk.glueMod.LogGroup] = js.native
  /**
    * The log stream associated with the crawl.
    */
  var LogStream: js.UndefOr[typingsJapgolly.awsSdk.glueMod.LogStream] = js.native
  /**
    * The date and time on which the crawl started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.native
  /**
    * The state of the crawler.
    */
  var State: js.UndefOr[CrawlState] = js.native
}

object Crawl {
  @scala.inline
  def apply(
    CompletedOn: js.Date = null,
    ErrorMessage: DescriptionString = null,
    LogGroup: LogGroup = null,
    LogStream: LogStream = null,
    StartedOn: js.Date = null,
    State: CrawlState = null
  ): Crawl = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup.asInstanceOf[js.Any])
    if (LogStream != null) __obj.updateDynamic("LogStream")(LogStream.asInstanceOf[js.Any])
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crawl]
  }
}

