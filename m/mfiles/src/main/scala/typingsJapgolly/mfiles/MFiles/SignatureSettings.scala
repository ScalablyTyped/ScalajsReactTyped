package typingsJapgolly.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.mfiles.ISignaturePromptInfo
import typingsJapgolly.mfiles.ISignaturePromptInfoMetadataBased
import typingsJapgolly.mfiles.ISignaturePromptInfoSelectable
import typingsJapgolly.mfiles.ISignatureSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SignatureSettings")
@js.native
class SignatureSettings () extends ISignatureSettings {
  /* CompleteClass */
  override var AdditionalInfo: String = js.native
  /* CompleteClass */
  override var FreeFormTextPropertyID: Double = js.native
  /* CompleteClass */
  override var IsFreeFormTextPrompted: Boolean = js.native
  /* CompleteClass */
  override var IsRequired: Boolean = js.native
  /* CompleteClass */
  override var IsSeparateSignatureObject: Boolean = js.native
  /* CompleteClass */
  override var ManifestationPropertyID: Double = js.native
  /* CompleteClass */
  override val PromptInfoType: MFSignaturePromptInfoType = js.native
  /* CompleteClass */
  override var SignatureIdentifier: String = js.native
  /* CompleteClass */
  override var SignaturePromptInfoFixed: ISignaturePromptInfo = js.native
  /* CompleteClass */
  override var SignaturePromptInfoMetadataBased: ISignaturePromptInfoMetadataBased = js.native
  /* CompleteClass */
  override var SignaturePromptInfoSelectable: ISignaturePromptInfoSelectable = js.native
  /* CompleteClass */
  override def Clone(): ISignatureSettings = js.native
}

@JSGlobal("MFiles.SignatureSettings")
@js.native
object SignatureSettings extends Instantiable0[ISignatureSettings]

