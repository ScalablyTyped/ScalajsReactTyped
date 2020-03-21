package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.IAccessControlList
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IObjectVersionAndProperties
import typingsJapgolly.mfiles.IPropertyValues
import typingsJapgolly.mfiles.IVaultExternalObjectOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultExternalObjectOperations")
@js.native
class VaultExternalObjectOperations () extends IVaultExternalObjectOperations {
  /* CompleteClass */
  override def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties = js.native
}

@JSGlobal("MFiles.VaultExternalObjectOperations")
@js.native
object VaultExternalObjectOperations extends Instantiable0[IVaultExternalObjectOperations]

