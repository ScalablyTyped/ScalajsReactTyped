package typingsJapgolly.mangopay2NodejsSdk.anon

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.LEGAL
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.KYCLevel
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.LegalPersonType
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.MakeKeysRequired<std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.UserLegalData>, mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/user.user.RequiredUserLegalData> */
trait MakeKeysRequiredPartialUs extends StObject {
  
  var CompanyNumber: js.UndefOr[String] = js.undefined
  
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  var Email: String
  
  var HeadquartersAddress: js.UndefOr[AddressType] = js.undefined
  
  var Id: js.UndefOr[String] = js.undefined
  
  var KYCLevel: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.KYCLevel] = js.undefined
  
  var LegalPersonType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.LegalPersonType
  
  var LegalRepresentativeAddress: AddressType
  
  var LegalRepresentativeBirthday: Timestamp
  
  var LegalRepresentativeCountryOfResidence: CountryISO
  
  var LegalRepresentativeEmail: js.UndefOr[String] = js.undefined
  
  var LegalRepresentativeFirstName: String
  
  var LegalRepresentativeLastName: String
  
  var LegalRepresentativeNationality: CountryISO
  
  var Name: String
  
  var PersonType: js.UndefOr[LEGAL] = js.undefined
  
  var ProofOfIdentity: js.UndefOr[String | Null] = js.undefined
  
  var ProofOfRegistration: js.UndefOr[String | Null] = js.undefined
  
  var ShareholderDeclaration: js.UndefOr[String | Null] = js.undefined
  
  var Statute: js.UndefOr[String | Null] = js.undefined
  
  var Tag: js.UndefOr[String] = js.undefined
  
  var TermsAndConditionsAccepted: js.UndefOr[Boolean] = js.undefined
  
  var UserCategory: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.UserCategory] = js.undefined
}
object MakeKeysRequiredPartialUs {
  
  inline def apply(
    Email: String,
    LegalPersonType: LegalPersonType,
    LegalRepresentativeAddress: AddressType,
    LegalRepresentativeBirthday: Timestamp,
    LegalRepresentativeCountryOfResidence: CountryISO,
    LegalRepresentativeFirstName: String,
    LegalRepresentativeLastName: String,
    LegalRepresentativeNationality: CountryISO,
    Name: String
  ): MakeKeysRequiredPartialUs = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], LegalPersonType = LegalPersonType.asInstanceOf[js.Any], LegalRepresentativeAddress = LegalRepresentativeAddress.asInstanceOf[js.Any], LegalRepresentativeBirthday = LegalRepresentativeBirthday.asInstanceOf[js.Any], LegalRepresentativeCountryOfResidence = LegalRepresentativeCountryOfResidence.asInstanceOf[js.Any], LegalRepresentativeFirstName = LegalRepresentativeFirstName.asInstanceOf[js.Any], LegalRepresentativeLastName = LegalRepresentativeLastName.asInstanceOf[js.Any], LegalRepresentativeNationality = LegalRepresentativeNationality.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeKeysRequiredPartialUs]
  }
  
  extension [Self <: MakeKeysRequiredPartialUs](x: Self) {
    
    inline def setCompanyNumber(value: String): Self = StObject.set(x, "CompanyNumber", value.asInstanceOf[js.Any])
    
    inline def setCompanyNumberUndefined: Self = StObject.set(x, "CompanyNumber", js.undefined)
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setHeadquartersAddress(value: AddressType): Self = StObject.set(x, "HeadquartersAddress", value.asInstanceOf[js.Any])
    
    inline def setHeadquartersAddressUndefined: Self = StObject.set(x, "HeadquartersAddress", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setKYCLevel(value: KYCLevel): Self = StObject.set(x, "KYCLevel", value.asInstanceOf[js.Any])
    
    inline def setKYCLevelUndefined: Self = StObject.set(x, "KYCLevel", js.undefined)
    
    inline def setLegalPersonType(value: LegalPersonType): Self = StObject.set(x, "LegalPersonType", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeAddress(value: AddressType): Self = StObject.set(x, "LegalRepresentativeAddress", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeBirthday(value: Timestamp): Self = StObject.set(x, "LegalRepresentativeBirthday", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeCountryOfResidence(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeCountryOfResidence", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeEmail(value: String): Self = StObject.set(x, "LegalRepresentativeEmail", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeEmailUndefined: Self = StObject.set(x, "LegalRepresentativeEmail", js.undefined)
    
    inline def setLegalRepresentativeFirstName(value: String): Self = StObject.set(x, "LegalRepresentativeFirstName", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeLastName(value: String): Self = StObject.set(x, "LegalRepresentativeLastName", value.asInstanceOf[js.Any])
    
    inline def setLegalRepresentativeNationality(value: CountryISO): Self = StObject.set(x, "LegalRepresentativeNationality", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPersonType(value: LEGAL): Self = StObject.set(x, "PersonType", value.asInstanceOf[js.Any])
    
    inline def setPersonTypeUndefined: Self = StObject.set(x, "PersonType", js.undefined)
    
    inline def setProofOfIdentity(value: String): Self = StObject.set(x, "ProofOfIdentity", value.asInstanceOf[js.Any])
    
    inline def setProofOfIdentityNull: Self = StObject.set(x, "ProofOfIdentity", null)
    
    inline def setProofOfIdentityUndefined: Self = StObject.set(x, "ProofOfIdentity", js.undefined)
    
    inline def setProofOfRegistration(value: String): Self = StObject.set(x, "ProofOfRegistration", value.asInstanceOf[js.Any])
    
    inline def setProofOfRegistrationNull: Self = StObject.set(x, "ProofOfRegistration", null)
    
    inline def setProofOfRegistrationUndefined: Self = StObject.set(x, "ProofOfRegistration", js.undefined)
    
    inline def setShareholderDeclaration(value: String): Self = StObject.set(x, "ShareholderDeclaration", value.asInstanceOf[js.Any])
    
    inline def setShareholderDeclarationNull: Self = StObject.set(x, "ShareholderDeclaration", null)
    
    inline def setShareholderDeclarationUndefined: Self = StObject.set(x, "ShareholderDeclaration", js.undefined)
    
    inline def setStatute(value: String): Self = StObject.set(x, "Statute", value.asInstanceOf[js.Any])
    
    inline def setStatuteNull: Self = StObject.set(x, "Statute", null)
    
    inline def setStatuteUndefined: Self = StObject.set(x, "Statute", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
    
    inline def setTermsAndConditionsAccepted(value: Boolean): Self = StObject.set(x, "TermsAndConditionsAccepted", value.asInstanceOf[js.Any])
    
    inline def setTermsAndConditionsAcceptedUndefined: Self = StObject.set(x, "TermsAndConditionsAccepted", js.undefined)
    
    inline def setUserCategory(value: UserCategory): Self = StObject.set(x, "UserCategory", value.asInstanceOf[js.Any])
    
    inline def setUserCategoryUndefined: Self = StObject.set(x, "UserCategory", js.undefined)
  }
}
