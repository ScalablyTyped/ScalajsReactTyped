package typingsJapgolly.mangopay2NodejsSdk.anon

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DECLARATIVE
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NATURAL
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NORMAL
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.IncomeRange
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.KYCLevel
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.UserNaturalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.RequiredUserNaturalOwnerData> */
trait MakeKeysRequiredPartialUsCapacity extends StObject {
  
  var Address: js.UndefOr[String | AddressData] = js.undefined
  
  var Birthday: Timestamp
  
  var Capacity: js.UndefOr[NORMAL | DECLARATIVE] = js.undefined
  
  var CountryOfResidence: CountryISO
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var Email: String
  
  var FirstName: String
  
  var Id: js.UndefOr[String] = js.undefined
  
  var IncomeRange: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.IncomeRange] = js.undefined
  
  var KYCLevel: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.KYCLevel] = js.undefined
  
  var LastName: String
  
  var Nationality: CountryISO
  
  var Occupation: js.UndefOr[String] = js.undefined
  
  var PersonType: js.UndefOr[NATURAL] = js.undefined
  
  var ProofOfAddress: js.UndefOr[String | Null] = js.undefined
  
  var ProofOfIdentity: js.UndefOr[String | Null] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var TermsAndConditionsAccepted: Boolean
  
  var UserCategory: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory] = js.undefined
}
object MakeKeysRequiredPartialUsCapacity {
  
  inline def apply(
    Birthday: Timestamp,
    CountryOfResidence: CountryISO,
    Email: String,
    FirstName: String,
    LastName: String,
    Nationality: CountryISO,
    TermsAndConditionsAccepted: Boolean
  ): MakeKeysRequiredPartialUsCapacity = {
    val __obj = js.Dynamic.literal(Birthday = Birthday.asInstanceOf[js.Any], CountryOfResidence = CountryOfResidence.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], FirstName = FirstName.asInstanceOf[js.Any], LastName = LastName.asInstanceOf[js.Any], Nationality = Nationality.asInstanceOf[js.Any], TermsAndConditionsAccepted = TermsAndConditionsAccepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUsCapacity]
  }
  
  extension [Self <: MakeKeysRequiredPartialUsCapacity](x: Self) {
    
    inline def setAddress(value: String | AddressData): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setBirthday(value: Timestamp): Self = StObject.set(x, "Birthday", value.asInstanceOf[js.Any])
    
    inline def setCapacity(value: NORMAL | DECLARATIVE): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setCountryOfResidence(value: CountryISO): Self = StObject.set(x, "CountryOfResidence", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIncomeRange(value: IncomeRange): Self = StObject.set(x, "IncomeRange", value.asInstanceOf[js.Any])
    
    inline def setIncomeRangeUndefined: Self = StObject.set(x, "IncomeRange", js.undefined)
    
    inline def setKYCLevel(value: KYCLevel): Self = StObject.set(x, "KYCLevel", value.asInstanceOf[js.Any])
    
    inline def setKYCLevelUndefined: Self = StObject.set(x, "KYCLevel", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setNationality(value: CountryISO): Self = StObject.set(x, "Nationality", value.asInstanceOf[js.Any])
    
    inline def setOccupation(value: String): Self = StObject.set(x, "Occupation", value.asInstanceOf[js.Any])
    
    inline def setOccupationUndefined: Self = StObject.set(x, "Occupation", js.undefined)
    
    inline def setPersonType(value: NATURAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    inline def setPersonTypeUndefined: Self = StObject.set(x, "PersonType", js.undefined)
    
    inline def setProofOfAddress(value: String): Self = StObject.set(x, "ProofOfAddress", value.asInstanceOf[js.Any])
    
    inline def setProofOfAddressNull: Self = StObject.set(x, "ProofOfAddress", null)
    
    inline def setProofOfAddressUndefined: Self = StObject.set(x, "ProofOfAddress", js.undefined)
    
    inline def setProofOfIdentity(value: String): Self = StObject.set(x, "ProofOfIdentity", value.asInstanceOf[js.Any])
    
    inline def setProofOfIdentityNull: Self = StObject.set(x, "ProofOfIdentity", null)
    
    inline def setProofOfIdentityUndefined: Self = StObject.set(x, "ProofOfIdentity", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setTermsAndConditionsAccepted(value: Boolean): Self = StObject.set(x, "TermsAndConditionsAccepted", value.asInstanceOf[js.Any])
    
    inline def setUserCategory(value: UserCategory): Self = StObject.set(x, "UserCategory", value.asInstanceOf[js.Any])
    
    inline def setUserCategoryUndefined: Self = StObject.set(x, "UserCategory", js.undefined)
  }
}
