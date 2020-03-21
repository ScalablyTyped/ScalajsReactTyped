package typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentEventStreamMod

import typingsJapgolly.awsSdkClientS3Node.typesContinuationEventMod.ContinuationEvent
import typingsJapgolly.awsSdkClientS3Node.typesEndEventMod.EndEvent
import typingsJapgolly.awsSdkClientS3Node.typesProgressEventMod.ProgressEvent
import typingsJapgolly.awsSdkClientS3Node.typesRecordsEventMod.RecordsEvent
import typingsJapgolly.awsSdkClientS3Node.typesStatsEventMod.StatsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectObjectContentEventStream extends js.Object {
  /**
    * <p>The Continuation Event.</p>
    */
  var Cont: js.UndefOr[ContinuationEvent] = js.undefined
  /**
    * <p>The End Event.</p>
    */
  var End: js.UndefOr[EndEvent] = js.undefined
  /**
    * <p>The Progress Event.</p>
    */
  var Progress: js.UndefOr[ProgressEvent] = js.undefined
  /**
    * <p>The Records Event.</p>
    */
  var Records: js.UndefOr[RecordsEvent] = js.undefined
  /**
    * <p>The Stats Event.</p>
    */
  var Stats: js.UndefOr[StatsEvent] = js.undefined
}

object SelectObjectContentEventStream {
  @scala.inline
  def apply(
    Cont: ContinuationEvent = null,
    End: EndEvent = null,
    Progress: ProgressEvent = null,
    Records: RecordsEvent = null,
    Stats: StatsEvent = null
  ): SelectObjectContentEventStream = {
    val __obj = js.Dynamic.literal()
    if (Cont != null) __obj.updateDynamic("Cont")(Cont.asInstanceOf[js.Any])
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Progress != null) __obj.updateDynamic("Progress")(Progress.asInstanceOf[js.Any])
    if (Records != null) __obj.updateDynamic("Records")(Records.asInstanceOf[js.Any])
    if (Stats != null) __obj.updateDynamic("Stats")(Stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectObjectContentEventStream]
  }
}

