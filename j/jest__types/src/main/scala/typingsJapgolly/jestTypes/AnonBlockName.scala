package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.BlockMode
import typingsJapgolly.jestTypes.circusMod.BlockName
import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.jestTypesStrings.finish_describe_definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlockName extends Event {
  var blockName: BlockName
  var mode: BlockMode
  var name: finish_describe_definition
}

object AnonBlockName {
  @scala.inline
  def apply(blockName: BlockName, mode: BlockMode, name: finish_describe_definition): AnonBlockName = {
    val __obj = js.Dynamic.literal(blockName = blockName.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBlockName]
  }
}

