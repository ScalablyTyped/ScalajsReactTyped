package typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TezosBallotType extends StObject
@JSImport("trezor-connect/lib/typescript/trezor/protobuf", "TezosBallotType")
@js.native
object TezosBallotType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TezosBallotType & Double] = js.native
  
  @js.native
  sealed trait Nay
    extends StObject
       with TezosBallotType
  /* 1 */ val Nay: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.TezosBallotType.Nay & Double = js.native
  
  @js.native
  sealed trait Pass
    extends StObject
       with TezosBallotType
  /* 2 */ val Pass: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.TezosBallotType.Pass & Double = js.native
  
  @js.native
  sealed trait Yay
    extends StObject
       with TezosBallotType
  /* 0 */ val Yay: typingsJapgolly.trezorConnect.libTypescriptTrezorProtobufMod.TezosBallotType.Yay & Double = js.native
}
