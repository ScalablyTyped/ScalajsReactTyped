package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultElectronicSignatureOperations extends js.Object {
  def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties
  def AddEmptySignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties
  def DisconnectSignatureEx(ObjVer: IObjVer, SignatureIdentifier: String, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties
  def DisconnectSignatures(ObjVer: IObjVer): IObjectVersionAndProperties
  def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties
}

object IVaultElectronicSignatureOperations {
  @scala.inline
  def apply(
    AddEmptySignature: (IObjVer, String) => CallbackTo[IObjectVersionAndProperties],
    AddEmptySignatures: IObjVer => CallbackTo[IObjectVersionAndProperties],
    DisconnectSignature: (IObjVer, String) => CallbackTo[IObjectVersionAndProperties],
    DisconnectSignatureEx: (IObjVer, String, Boolean) => CallbackTo[IObjectVersionAndProperties],
    DisconnectSignatures: IObjVer => CallbackTo[IObjectVersionAndProperties],
    DisconnectSignaturesEx: (IObjVer, Boolean) => CallbackTo[IObjectVersionAndProperties]
  ): IVaultElectronicSignatureOperations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AddEmptySignature")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: java.lang.String) => AddEmptySignature(t0, t1).runNow()))
    __obj.updateDynamic("AddEmptySignatures")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => AddEmptySignatures(t0).runNow()))
    __obj.updateDynamic("DisconnectSignature")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: java.lang.String) => DisconnectSignature(t0, t1).runNow()))
    __obj.updateDynamic("DisconnectSignatureEx")(js.Any.fromFunction3((t0: typingsJapgolly.mfiles.IObjVer, t1: java.lang.String, t2: scala.Boolean) => DisconnectSignatureEx(t0, t1, t2).runNow()))
    __obj.updateDynamic("DisconnectSignatures")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IObjVer) => DisconnectSignatures(t0).runNow()))
    __obj.updateDynamic("DisconnectSignaturesEx")(js.Any.fromFunction2((t0: typingsJapgolly.mfiles.IObjVer, t1: scala.Boolean) => DisconnectSignaturesEx(t0, t1).runNow()))
    __obj.asInstanceOf[IVaultElectronicSignatureOperations]
  }
}

