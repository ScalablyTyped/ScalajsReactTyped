package typingsJapgolly.octokitOpenapiTypes.anon

import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.`private`
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.all
import typingsJapgolly.octokitOpenapiTypes.octokitOpenapiTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encryptedvalue extends StObject {
  
  /** @description The value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/reference/codespaces#get-an-organization-public-key) endpoint. */
  var encrypted_value: js.UndefOr[String] = js.undefined
  
  /** @description The ID of the key you used to encrypt the secret. */
  var key_id: js.UndefOr[String] = js.undefined
  
  /** @description An array of repository IDs that can access the organization secret. You can only provide a list of repository IDs when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/reference/codespaces#remove-selected-repository-from-an-organization-secret) endpoints. */
  var selected_repository_ids: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * @description Which type of organization repositories have access to the organization secret. `selected` means only the repositories specified by `selected_repository_ids` can access the secret.
    * @enum {string}
    */
  var visibility: all | `private` | selected
}
object Encryptedvalue {
  
  inline def apply(visibility: all | `private` | selected): Encryptedvalue = {
    val __obj = js.Dynamic.literal(visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encryptedvalue]
  }
  
  extension [Self <: Encryptedvalue](x: Self) {
    
    inline def setEncrypted_value(value: String): Self = StObject.set(x, "encrypted_value", value.asInstanceOf[js.Any])
    
    inline def setEncrypted_valueUndefined: Self = StObject.set(x, "encrypted_value", js.undefined)
    
    inline def setKey_id(value: String): Self = StObject.set(x, "key_id", value.asInstanceOf[js.Any])
    
    inline def setKey_idUndefined: Self = StObject.set(x, "key_id", js.undefined)
    
    inline def setSelected_repository_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_repository_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_repository_idsUndefined: Self = StObject.set(x, "selected_repository_ids", js.undefined)
    
    inline def setSelected_repository_idsVarargs(value: Double*): Self = StObject.set(x, "selected_repository_ids", js.Array(value*))
    
    inline def setVisibility(value: all | `private` | selected): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
