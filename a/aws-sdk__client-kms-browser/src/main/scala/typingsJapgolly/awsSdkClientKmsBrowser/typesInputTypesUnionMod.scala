package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.CreateGrant
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Decrypt
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.DescribeKey
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.Encrypt
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKey
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.GenerateDataKeyWithoutPlaintext
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_1
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_OAEP_SHA_256
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSAES_PKCS1_V1_5
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RSA_2048
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptFrom
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.ReEncryptTo
import typingsJapgolly.awsSdkClientKmsBrowser.awsSdkClientKmsBrowserStrings.RetireGrant
import typingsJapgolly.awsSdkClientKmsBrowser.typesTagMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput
    - typingsJapgolly.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def CancelKeyDeletionInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    inline def CreateAliasInput(AliasName: String, TargetKeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    inline def CreateGrantInput(
      GranteePrincipal: String,
      KeyId: String,
      Operations: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): typingsJapgolly.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    inline def CreateKeyInput(): typingsJapgolly.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    inline def DecryptInput(CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsJapgolly.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDecryptInputMod.DecryptInput]
    }
    
    inline def DeleteAliasInput(AliasName: String): typingsJapgolly.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    inline def DeleteImportedKeyMaterialInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    inline def DescribeKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    inline def DisableKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    inline def DisableKeyRotationInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    inline def EnableKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    inline def EnableKeyRotationInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    inline def EncryptInput(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsJapgolly.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput]
    }
    
    inline def GenerateDataKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    inline def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    inline def GenerateRandomInput(): typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    inline def GetKeyPolicyInput(KeyId: String, PolicyName: String): typingsJapgolly.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    inline def GetKeyRotationStatusInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    inline def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typingsJapgolly.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    inline def ImportKeyMaterialInput(
      EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      KeyId: String
    ): typingsJapgolly.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    inline def ListAliasesInput(): typingsJapgolly.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesListAliasesInputMod.ListAliasesInput]
    }
    
    inline def ListGrantsInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesListGrantsInputMod.ListGrantsInput]
    }
    
    inline def ListKeyPoliciesInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    inline def ListKeysInput(): typingsJapgolly.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesListKeysInputMod.ListKeysInput]
    }
    
    inline def ListResourceTagsInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    inline def ListRetirableGrantsInput(RetiringPrincipal: String): typingsJapgolly.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    inline def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typingsJapgolly.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    inline def ReEncryptInput(
      CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      DestinationKeyId: String
    ): typingsJapgolly.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesReEncryptInputMod.ReEncryptInput]
    }
    
    inline def RetireGrantInput(): typingsJapgolly.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    inline def RevokeGrantInput(GrantId: String, KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    inline def ScheduleKeyDeletionInput(KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    inline def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsJapgolly.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateAliasInput(AliasName: String, TargetKeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    inline def UpdateKeyDescriptionInput(Description: String, KeyId: String): typingsJapgolly.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsBrowser.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
