package typingsJapgolly.sharedb

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sharedb.mod.ExtraDB
import typingsJapgolly.sharedb.mod.PubSub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDb extends js.Object {
  var db: js.UndefOr[js.Any] = js.undefined
  var disableDocAction: js.UndefOr[Boolean] = js.undefined
  var disableSpaceDelimitedActions: js.UndefOr[Boolean] = js.undefined
  var extraDbs: js.UndefOr[StringDictionary[ExtraDB]] = js.undefined
  var pubsub: js.UndefOr[PubSub] = js.undefined
}

object AnonDb {
  @scala.inline
  def apply(
    db: js.Any = null,
    disableDocAction: js.UndefOr[Boolean] = js.undefined,
    disableSpaceDelimitedActions: js.UndefOr[Boolean] = js.undefined,
    extraDbs: StringDictionary[ExtraDB] = null,
    pubsub: PubSub = null
  ): AnonDb = {
    val __obj = js.Dynamic.literal()
    if (db != null) __obj.updateDynamic("db")(db.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDocAction)) __obj.updateDynamic("disableDocAction")(disableDocAction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSpaceDelimitedActions)) __obj.updateDynamic("disableSpaceDelimitedActions")(disableSpaceDelimitedActions.asInstanceOf[js.Any])
    if (extraDbs != null) __obj.updateDynamic("extraDbs")(extraDbs.asInstanceOf[js.Any])
    if (pubsub != null) __obj.updateDynamic("pubsub")(pubsub.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDb]
  }
}

