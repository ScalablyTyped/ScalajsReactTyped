package typingsJapgolly.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkillDetails extends StObject {
  
  /**
    * The details about what the skill supports organized as bullet points.
    */
  var BulletPoints: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.BulletPoints] = js.undefined
  
  /**
    * The details about the developer that published the skill.
    */
  var DeveloperInfo: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.DeveloperInfo] = js.undefined
  
  /**
    * The URL of the end user license agreement.
    */
  var EndUserLicenseAgreement: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.EndUserLicenseAgreement] = js.undefined
  
  /**
    * The generic keywords associated with the skill that can be used to find a skill.
    */
  var GenericKeywords: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.GenericKeywords] = js.undefined
  
  /**
    * The phrase used to trigger the skill.
    */
  var InvocationPhrase: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.InvocationPhrase] = js.undefined
  
  /**
    * The updates added in bullet points.
    */
  var NewInThisVersionBulletPoints: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.NewInThisVersionBulletPoints] = js.undefined
  
  /**
    * The description of the product.
    */
  var ProductDescription: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ProductDescription] = js.undefined
  
  /**
    * The date when the skill was released.
    */
  var ReleaseDate: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.ReleaseDate] = js.undefined
  
  /**
    *  This member has been deprecated.  The list of reviews for the skill, including Key and Value pair.
    */
  var Reviews: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.Reviews] = js.undefined
  
  /**
    * The types of skills.
    */
  var SkillTypes: js.UndefOr[typingsJapgolly.awsSdk.clientsAlexaforbusinessMod.SkillTypes] = js.undefined
}
object SkillDetails {
  
  inline def apply(): SkillDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkillDetails]
  }
  
  extension [Self <: SkillDetails](x: Self) {
    
    inline def setBulletPoints(value: BulletPoints): Self = StObject.set(x, "BulletPoints", value.asInstanceOf[js.Any])
    
    inline def setBulletPointsUndefined: Self = StObject.set(x, "BulletPoints", js.undefined)
    
    inline def setBulletPointsVarargs(value: BulletPoint*): Self = StObject.set(x, "BulletPoints", js.Array(value*))
    
    inline def setDeveloperInfo(value: DeveloperInfo): Self = StObject.set(x, "DeveloperInfo", value.asInstanceOf[js.Any])
    
    inline def setDeveloperInfoUndefined: Self = StObject.set(x, "DeveloperInfo", js.undefined)
    
    inline def setEndUserLicenseAgreement(value: EndUserLicenseAgreement): Self = StObject.set(x, "EndUserLicenseAgreement", value.asInstanceOf[js.Any])
    
    inline def setEndUserLicenseAgreementUndefined: Self = StObject.set(x, "EndUserLicenseAgreement", js.undefined)
    
    inline def setGenericKeywords(value: GenericKeywords): Self = StObject.set(x, "GenericKeywords", value.asInstanceOf[js.Any])
    
    inline def setGenericKeywordsUndefined: Self = StObject.set(x, "GenericKeywords", js.undefined)
    
    inline def setGenericKeywordsVarargs(value: GenericKeyword*): Self = StObject.set(x, "GenericKeywords", js.Array(value*))
    
    inline def setInvocationPhrase(value: InvocationPhrase): Self = StObject.set(x, "InvocationPhrase", value.asInstanceOf[js.Any])
    
    inline def setInvocationPhraseUndefined: Self = StObject.set(x, "InvocationPhrase", js.undefined)
    
    inline def setNewInThisVersionBulletPoints(value: NewInThisVersionBulletPoints): Self = StObject.set(x, "NewInThisVersionBulletPoints", value.asInstanceOf[js.Any])
    
    inline def setNewInThisVersionBulletPointsUndefined: Self = StObject.set(x, "NewInThisVersionBulletPoints", js.undefined)
    
    inline def setNewInThisVersionBulletPointsVarargs(value: BulletPoint*): Self = StObject.set(x, "NewInThisVersionBulletPoints", js.Array(value*))
    
    inline def setProductDescription(value: ProductDescription): Self = StObject.set(x, "ProductDescription", value.asInstanceOf[js.Any])
    
    inline def setProductDescriptionUndefined: Self = StObject.set(x, "ProductDescription", js.undefined)
    
    inline def setReleaseDate(value: ReleaseDate): Self = StObject.set(x, "ReleaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateUndefined: Self = StObject.set(x, "ReleaseDate", js.undefined)
    
    inline def setReviews(value: Reviews): Self = StObject.set(x, "Reviews", value.asInstanceOf[js.Any])
    
    inline def setReviewsUndefined: Self = StObject.set(x, "Reviews", js.undefined)
    
    inline def setSkillTypes(value: SkillTypes): Self = StObject.set(x, "SkillTypes", value.asInstanceOf[js.Any])
    
    inline def setSkillTypesUndefined: Self = StObject.set(x, "SkillTypes", js.undefined)
    
    inline def setSkillTypesVarargs(value: SkillStoreType*): Self = StObject.set(x, "SkillTypes", js.Array(value*))
  }
}
