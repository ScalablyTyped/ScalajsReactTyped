package typingsJapgolly.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region Domain itself
trait CommandDefinition extends js.Object {
  /**
    * optional, only makes sense if aggregates with names are defined in the 'domainPath' structure
    */
  var aggregate: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'aggregate.id'
    * if an aggregate id is not defined in the command, the command handler will create a new aggregate instance
    */
  var aggregateId: js.UndefOr[String] = js.undefined
  /**
    * optional, only makes sense if contexts are defined in the 'domainPath' structure
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'id'
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * optional, if defined theses values will be copied to the event (can be used to transport information like userId, etc..)
    */
  var meta: js.UndefOr[String] = js.undefined
  /**
    * optional, default is 'name'
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * optional, but recommended
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * optional, if defined the command handler will check if the command can be handled
    * if you want the command to be handled in a secure/transactional way pass a revision value that matches the current aggregate revision
    */
  var revision: js.UndefOr[String] = js.undefined
  /**
    * optional, if defined the command handler will search for a handle that matches command name and version number
    */
  var version: js.UndefOr[String] = js.undefined
}

object CommandDefinition {
  @scala.inline
  def apply(
    aggregate: String = null,
    aggregateId: String = null,
    context: String = null,
    id: String = null,
    meta: String = null,
    name: String = null,
    payload: String = null,
    revision: String = null,
    version: String = null
  ): CommandDefinition = {
    val __obj = js.Dynamic.literal()
    if (aggregate != null) __obj.updateDynamic("aggregate")(aggregate.asInstanceOf[js.Any])
    if (aggregateId != null) __obj.updateDynamic("aggregateId")(aggregateId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (revision != null) __obj.updateDynamic("revision")(revision.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandDefinition]
  }
}

