package typingsJapgolly.analyticsNode.mod.AnalyticsNode

import typingsJapgolly.analyticsNode.AnonAnonymousId
import typingsJapgolly.analyticsNode.AnonCategory
import typingsJapgolly.analyticsNode.AnonContext
import typingsJapgolly.analyticsNode.AnonGroupId
import typingsJapgolly.analyticsNode.AnonIntegrations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Analytics extends js.Object {
  /* alias is how you associate one identity with another. */
  def alias(message: AnonIntegrations): Analytics = js.native
  def alias(message: AnonIntegrations, callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): Analytics = js.native
  /* Flush batched calls to make sure nothing is left in the queue */
  def flush(): Analytics = js.native
  def flush(callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): Analytics = js.native
  /* Group calls can be used to associate individual users with shared
    accounts or companies. */
  def group(message: AnonGroupId): Analytics = js.native
  def group(message: AnonGroupId, callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): Analytics = js.native
  /* The identify method lets you tie a user to their actions and record
    traits about them. */
  def identify(message: AnonAnonymousId): Analytics = js.native
  def identify(message: AnonAnonymousId, callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): Analytics = js.native
  /* The page method lets you record page views on your website, along with
    optional extra information about the page being viewed. */
  def page(message: AnonCategory): Analytics = js.native
  def page(message: AnonCategory, callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): Analytics = js.native
  /* The track method lets you record the actions your users perform. */
  def track(message: AnonContext): Analytics = js.native
  def track(message: AnonContext, callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): Analytics = js.native
}

