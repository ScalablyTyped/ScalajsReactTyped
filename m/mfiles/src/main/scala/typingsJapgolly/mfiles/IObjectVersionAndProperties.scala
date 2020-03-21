package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectVersionAndProperties extends js.Object {
  val ObjVer: IObjVer
  val Properties: IPropertyValues
  val Vault: IVault
  val VersionData: IObjectVersion
  def Clone(): IObjectVersionAndProperties
}

object IObjectVersionAndProperties {
  @scala.inline
  def apply(
    Clone: CallbackTo[IObjectVersionAndProperties],
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Vault: IVault,
    VersionData: IObjectVersion
  ): IObjectVersionAndProperties = {
    val __obj = js.Dynamic.literal(ObjVer = ObjVer.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Vault = Vault.asInstanceOf[js.Any], VersionData = VersionData.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IObjectVersionAndProperties]
  }
}

