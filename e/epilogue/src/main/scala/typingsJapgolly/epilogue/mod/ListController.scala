package typingsJapgolly.epilogue.mod

import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.sequelize.mod.DataTypeAbstract
import typingsJapgolly.sequelize.mod.DataTypeArray
import typingsJapgolly.sequelize.mod.DataTypeBigInt
import typingsJapgolly.sequelize.mod.DataTypeBlob
import typingsJapgolly.sequelize.mod.DataTypeBoolean
import typingsJapgolly.sequelize.mod.DataTypeChar
import typingsJapgolly.sequelize.mod.DataTypeDate
import typingsJapgolly.sequelize.mod.DataTypeDateOnly
import typingsJapgolly.sequelize.mod.DataTypeDecimal
import typingsJapgolly.sequelize.mod.DataTypeDouble
import typingsJapgolly.sequelize.mod.DataTypeEnum
import typingsJapgolly.sequelize.mod.DataTypeFloat
import typingsJapgolly.sequelize.mod.DataTypeGeometry
import typingsJapgolly.sequelize.mod.DataTypeHStore
import typingsJapgolly.sequelize.mod.DataTypeInteger
import typingsJapgolly.sequelize.mod.DataTypeJSONB
import typingsJapgolly.sequelize.mod.DataTypeJSONType
import typingsJapgolly.sequelize.mod.DataTypeNow
import typingsJapgolly.sequelize.mod.DataTypeNumber
import typingsJapgolly.sequelize.mod.DataTypeRange
import typingsJapgolly.sequelize.mod.DataTypeReal
import typingsJapgolly.sequelize.mod.DataTypeString
import typingsJapgolly.sequelize.mod.DataTypeText
import typingsJapgolly.sequelize.mod.DataTypeTime
import typingsJapgolly.sequelize.mod.DataTypeUUID
import typingsJapgolly.sequelize.mod.DataTypeUUIDv1
import typingsJapgolly.sequelize.mod.DataTypeUUIDv4
import typingsJapgolly.sequelize.mod.DataTypeVirtual
import typingsJapgolly.sequelize.mod.Sequelize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("epilogue", "ListController")
@js.native
class ListController () extends BaseController {
  def _safeishParse(
    value: js.Any,
    `type`: DataTypeAbstract | DataTypeString | DataTypeChar | DataTypeText | DataTypeNumber | DataTypeInteger | DataTypeBigInt | DataTypeFloat | DataTypeTime | DataTypeDate | DataTypeDateOnly | DataTypeBoolean | DataTypeNow | DataTypeBlob | DataTypeDecimal | DataTypeUUID | DataTypeUUIDv1 | DataTypeUUIDv4 | DataTypeHStore | DataTypeJSONType | DataTypeJSONB | DataTypeVirtual | DataTypeArray | DataTypeEnum | DataTypeRange | DataTypeReal | DataTypeDouble | DataTypeGeometry,
    sequelize: Sequelize
  ): js.Any = js.native
  def fetch(req: Request_[ParamsDictionary], res: Response_, context: Context): js.Promise[js.Function0[Unit]] = js.native
}

