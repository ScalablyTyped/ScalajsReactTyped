package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.CreateGrant
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Decrypt
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.DescribeKey
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.Encrypt
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKey
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.GenerateDataKeyWithoutPlaintext
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_OAEP_SHA_1
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_OAEP_SHA_256
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSAES_PKCS1_V1_5
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RSA_2048
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptFrom
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.ReEncryptTo
import typingsJapgolly.awsSdkClientKmsNode.awsSdkClientKmsNodeStrings.RetireGrant
import typingsJapgolly.awsSdkClientKmsNode.typesTagMod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput
    - typingsJapgolly.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
    - typingsJapgolly.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput
    - typingsJapgolly.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput
    - typingsJapgolly.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
    - typingsJapgolly.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput
    - typingsJapgolly.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput
    - typingsJapgolly.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput
    - typingsJapgolly.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput
    - typingsJapgolly.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput
    - typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput
    - typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
    - typingsJapgolly.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput
    - typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput
    - typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput
    - typingsJapgolly.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput
    - typingsJapgolly.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
    - typingsJapgolly.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput
    - typingsJapgolly.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput
    - typingsJapgolly.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput
    - typingsJapgolly.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput
    - typingsJapgolly.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput
    - typingsJapgolly.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
    - typingsJapgolly.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput
    - typingsJapgolly.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput
    - typingsJapgolly.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput
    - typingsJapgolly.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput
    - typingsJapgolly.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput
    - typingsJapgolly.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput
    - typingsJapgolly.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput
    - typingsJapgolly.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput
    - typingsJapgolly.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput
    - typingsJapgolly.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput
    - typingsJapgolly.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput
    - typingsJapgolly.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def CancelKeyDeletionInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesCancelKeyDeletionInputMod.CancelKeyDeletionInput]
    }
    
    inline def CreateAliasInput(AliasName: String, TargetKeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    inline def CreateGrantInput(
      GranteePrincipal: String,
      KeyId: String,
      Operations: (js.Array[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ]) | (js.Iterable[
          Decrypt | Encrypt | GenerateDataKey | GenerateDataKeyWithoutPlaintext | ReEncryptFrom | ReEncryptTo | CreateGrant | RetireGrant | DescribeKey | String
        ])
    ): typingsJapgolly.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput = {
      val __obj = js.Dynamic.literal(GranteePrincipal = GranteePrincipal.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], Operations = Operations.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesCreateGrantInputMod.CreateGrantInput]
    }
    
    inline def CreateKeyInput(): typingsJapgolly.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput]
    }
    
    inline def DecryptInput(CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsJapgolly.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput]
    }
    
    inline def DeleteAliasInput(AliasName: String): typingsJapgolly.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    inline def DeleteImportedKeyMaterialInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDeleteImportedKeyMaterialInputMod.DeleteImportedKeyMaterialInput]
    }
    
    inline def DescribeKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDescribeKeyInputMod.DescribeKeyInput]
    }
    
    inline def DisableKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDisableKeyInputMod.DisableKeyInput]
    }
    
    inline def DisableKeyRotationInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesDisableKeyRotationInputMod.DisableKeyRotationInput]
    }
    
    inline def EnableKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput]
    }
    
    inline def EnableKeyRotationInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput]
    }
    
    inline def EncryptInput(KeyId: String, Plaintext: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): typingsJapgolly.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Plaintext = Plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesEncryptInputMod.EncryptInput]
    }
    
    inline def GenerateDataKeyInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput]
    }
    
    inline def GenerateDataKeyWithoutPlaintextInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyWithoutPlaintextInputMod.GenerateDataKeyWithoutPlaintextInput]
    }
    
    inline def GenerateRandomInput(): typingsJapgolly.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesGenerateRandomInputMod.GenerateRandomInput]
    }
    
    inline def GetKeyPolicyInput(KeyId: String, PolicyName: String): typingsJapgolly.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput]
    }
    
    inline def GetKeyRotationStatusInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesGetKeyRotationStatusInputMod.GetKeyRotationStatusInput]
    }
    
    inline def GetParametersForImportInput(
      KeyId: String,
      WrappingAlgorithm: RSAES_PKCS1_V1_5 | RSAES_OAEP_SHA_1 | RSAES_OAEP_SHA_256 | String,
      WrappingKeySpec: RSA_2048 | String
    ): typingsJapgolly.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesGetParametersForImportInputMod.GetParametersForImportInput]
    }
    
    inline def ImportKeyMaterialInput(
      EncryptedKeyMaterial: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      ImportToken: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      KeyId: String
    ): typingsJapgolly.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput = {
      val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesImportKeyMaterialInputMod.ImportKeyMaterialInput]
    }
    
    inline def ListAliasesInput(): typingsJapgolly.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesListAliasesInputMod.ListAliasesInput]
    }
    
    inline def ListGrantsInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesListGrantsInputMod.ListGrantsInput]
    }
    
    inline def ListKeyPoliciesInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesListKeyPoliciesInputMod.ListKeyPoliciesInput]
    }
    
    inline def ListKeysInput(): typingsJapgolly.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesListKeysInputMod.ListKeysInput]
    }
    
    inline def ListResourceTagsInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesListResourceTagsInputMod.ListResourceTagsInput]
    }
    
    inline def ListRetirableGrantsInput(RetiringPrincipal: String): typingsJapgolly.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput = {
      val __obj = js.Dynamic.literal(RetiringPrincipal = RetiringPrincipal.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesListRetirableGrantsInputMod.ListRetirableGrantsInput]
    }
    
    inline def PutKeyPolicyInput(KeyId: String, Policy: String, PolicyName: String): typingsJapgolly.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesPutKeyPolicyInputMod.PutKeyPolicyInput]
    }
    
    inline def ReEncryptInput(
      CiphertextBlob: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      DestinationKeyId: String
    ): typingsJapgolly.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput = {
      val __obj = js.Dynamic.literal(CiphertextBlob = CiphertextBlob.asInstanceOf[js.Any], DestinationKeyId = DestinationKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesReEncryptInputMod.ReEncryptInput]
    }
    
    inline def RetireGrantInput(): typingsJapgolly.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesRetireGrantInputMod.RetireGrantInput]
    }
    
    inline def RevokeGrantInput(GrantId: String, KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput = {
      val __obj = js.Dynamic.literal(GrantId = GrantId.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesRevokeGrantInputMod.RevokeGrantInput]
    }
    
    inline def ScheduleKeyDeletionInput(KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesScheduleKeyDeletionInputMod.ScheduleKeyDeletionInput]
    }
    
    inline def TagResourceInput(KeyId: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsJapgolly.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(KeyId: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateAliasInput(AliasName: String, TargetKeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(AliasName = AliasName.asInstanceOf[js.Any], TargetKeyId = TargetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    inline def UpdateKeyDescriptionInput(Description: String, KeyId: String): typingsJapgolly.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput = {
      val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientKmsNode.typesUpdateKeyDescriptionInputMod.UpdateKeyDescriptionInput]
    }
  }
}
