package typingsJapgolly.mongodb

import typingsJapgolly.mongodb.mod.ClientSession
import typingsJapgolly.mongodb.mongodbStrings.majority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mongodb.mongodb.CommonOptions & {  maxTimeMS ? :number} */
trait CommonOptionsmaxTimeMSnum extends js.Object {
  /**
    * requests acknowledgement from MongoDB that the write operation has
    * been written to the journal
    * @default false
    */
  var j: js.UndefOr[Boolean] = js.undefined
  var maxTimeMS: js.UndefOr[Double] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  /**
    * requests acknowledgement that the write operation has
    * propagated to a specified number of mongod hosts
    * @default 1
    */
  var w: js.UndefOr[Double | majority | String] = js.undefined
  /**
    * a time limit, in milliseconds, for the write concern
    */
  var wtimeout: js.UndefOr[Double] = js.undefined
}

object CommonOptionsmaxTimeMSnum {
  @scala.inline
  def apply(
    j: js.UndefOr[Boolean] = js.undefined,
    maxTimeMS: Int | Double = null,
    session: ClientSession = null,
    w: Double | majority | String = null,
    wtimeout: Int | Double = null
  ): CommonOptionsmaxTimeMSnum = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(j)) __obj.updateDynamic("j")(j.asInstanceOf[js.Any])
    if (maxTimeMS != null) __obj.updateDynamic("maxTimeMS")(maxTimeMS.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (wtimeout != null) __obj.updateDynamic("wtimeout")(wtimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptionsmaxTimeMSnum]
  }
}

