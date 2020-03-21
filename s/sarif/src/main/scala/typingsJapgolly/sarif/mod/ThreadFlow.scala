package typingsJapgolly.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadFlow extends js.Object {
  /**
    * An string that uniquely identifies the threadFlow within the codeFlow in which it occurs.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Values of relevant expressions at the start of the thread flow that remain constant.
    */
  var immutableState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * Values of relevant expressions at the start of the thread flow that may change during thread flow execution.
    */
  var initialState: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.undefined
  /**
    * A temporally ordered array of 'threadFlowLocation' objects, each of which describes a location visited by the
    * tool while producing the result.
    */
  var locations: js.Array[ThreadFlowLocation]
  /**
    * A message relevant to the thread flow.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * Key/value pairs that provide additional information about the thread flow.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
}

object ThreadFlow {
  @scala.inline
  def apply(
    locations: js.Array[ThreadFlowLocation],
    id: String = null,
    immutableState: StringDictionary[MultiformatMessageString] = null,
    initialState: StringDictionary[MultiformatMessageString] = null,
    message: Message = null,
    properties: PropertyBag = null
  ): ThreadFlow = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (immutableState != null) __obj.updateDynamic("immutableState")(immutableState.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadFlow]
  }
}

