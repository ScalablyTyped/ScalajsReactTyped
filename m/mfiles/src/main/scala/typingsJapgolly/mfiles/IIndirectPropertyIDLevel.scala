package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFIndirectPropertyIDLevelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIndirectPropertyIDLevel extends js.Object {
  var ID: Double
  var LevelType: MFIndirectPropertyIDLevelType
  def Clone(): IIndirectPropertyIDLevel
  def ToJSON(): String
}

object IIndirectPropertyIDLevel {
  @scala.inline
  def apply(
    Clone: CallbackTo[IIndirectPropertyIDLevel],
    ID: Double,
    LevelType: MFIndirectPropertyIDLevelType,
    ToJSON: CallbackTo[String]
  ): IIndirectPropertyIDLevel = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], LevelType = LevelType.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.asInstanceOf[IIndirectPropertyIDLevel]
  }
}

