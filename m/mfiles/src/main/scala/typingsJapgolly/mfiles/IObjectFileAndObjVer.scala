package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileAndObjVer extends js.Object {
  val ObjVer: IObjVer
  val ObjectFile: IObjectFile
  def Clone(): IObjectFileAndObjVer
  def ToJSON(): String
}

object IObjectFileAndObjVer {
  @scala.inline
  def apply(
    Clone: CallbackTo[IObjectFileAndObjVer],
    ObjVer: IObjVer,
    ObjectFile: IObjectFile,
    ToJSON: CallbackTo[String]
  ): IObjectFileAndObjVer = {
    val __obj = js.Dynamic.literal(ObjVer = ObjVer.asInstanceOf[js.Any], ObjectFile = ObjectFile.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("ToJSON")(ToJSON.toJsFn)
    __obj.asInstanceOf[IObjectFileAndObjVer]
  }
}

