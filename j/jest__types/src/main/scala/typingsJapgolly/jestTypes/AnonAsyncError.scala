package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.BlockMode
import typingsJapgolly.jestTypes.circusMod.BlockName
import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.jestTypesStrings.start_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncError extends Event {
  var asyncError: js.Error
  var blockName: BlockName
  var mode: BlockMode
  var name: start_describe_definition
}

object AnonAsyncError {
  @scala.inline
  def apply(asyncError: js.Error, blockName: BlockName, mode: BlockMode, name: start_describe_definition): AnonAsyncError = {
    val __obj = js.Dynamic.literal(asyncError = asyncError.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsyncError]
  }
}

