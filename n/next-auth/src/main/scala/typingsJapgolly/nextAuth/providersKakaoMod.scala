package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.Agerange
import typingsJapgolly.nextAuth.anon.Msgblocked
import typingsJapgolly.nextAuth.providersOauthMod.OAuthConfig
import typingsJapgolly.nextAuth.providersOauthMod.OAuthUserConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersKakaoMod {
  
  @JSImport("next-auth/providers/kakao", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: KakaoProfile */](options: OAuthUserConfig[P]): OAuthConfig[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[P]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nextAuth.nextAuthStrings.`1-9`
    - typingsJapgolly.nextAuth.nextAuthStrings.`10-14`
    - typingsJapgolly.nextAuth.nextAuthStrings.`15-19`
    - typingsJapgolly.nextAuth.nextAuthStrings.`20-29`
    - typingsJapgolly.nextAuth.nextAuthStrings.`30-39`
    - typingsJapgolly.nextAuth.nextAuthStrings.`40-49`
    - typingsJapgolly.nextAuth.nextAuthStrings.`50-59`
    - typingsJapgolly.nextAuth.nextAuthStrings.`60-69`
    - typingsJapgolly.nextAuth.nextAuthStrings.`70-79`
    - typingsJapgolly.nextAuth.nextAuthStrings.`80-89`
    - typingsJapgolly.nextAuth.nextAuthStrings.`90-`
  */
  trait AgeRange extends StObject
  object AgeRange {
    
    inline def `1-9`: typingsJapgolly.nextAuth.nextAuthStrings.`1-9` = "1-9".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`1-9`]
    
    inline def `10-14`: typingsJapgolly.nextAuth.nextAuthStrings.`10-14` = "10-14".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`10-14`]
    
    inline def `15-19`: typingsJapgolly.nextAuth.nextAuthStrings.`15-19` = "15-19".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`15-19`]
    
    inline def `20-29`: typingsJapgolly.nextAuth.nextAuthStrings.`20-29` = "20-29".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`20-29`]
    
    inline def `30-39`: typingsJapgolly.nextAuth.nextAuthStrings.`30-39` = "30-39".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`30-39`]
    
    inline def `40-49`: typingsJapgolly.nextAuth.nextAuthStrings.`40-49` = "40-49".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`40-49`]
    
    inline def `50-59`: typingsJapgolly.nextAuth.nextAuthStrings.`50-59` = "50-59".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`50-59`]
    
    inline def `60-69`: typingsJapgolly.nextAuth.nextAuthStrings.`60-69` = "60-69".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`60-69`]
    
    inline def `70-79`: typingsJapgolly.nextAuth.nextAuthStrings.`70-79` = "70-79".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`70-79`]
    
    inline def `80-89`: typingsJapgolly.nextAuth.nextAuthStrings.`80-89` = "80-89".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`80-89`]
    
    inline def `90-`: typingsJapgolly.nextAuth.nextAuthStrings.`90-` = "90-".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.`90-`]
  }
  
  type DateTime = String
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nextAuth.nextAuthStrings.female
    - typingsJapgolly.nextAuth.nextAuthStrings.male
  */
  trait Gender extends StObject
  object Gender {
    
    inline def female: typingsJapgolly.nextAuth.nextAuthStrings.female = "female".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.female]
    
    inline def male: typingsJapgolly.nextAuth.nextAuthStrings.male = "male".asInstanceOf[typingsJapgolly.nextAuth.nextAuthStrings.male]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in string ]: any} */ trait KakaoProfile extends StObject {
    
    var connected_at: js.UndefOr[DateTime] = js.undefined
    
    var has_signed_up: js.UndefOr[Boolean] = js.undefined
    
    var id: Double
    
    var kakao_account: js.UndefOr[Agerange] = js.undefined
    
    var properties: js.UndefOr[Msgblocked] = js.undefined
    
    var synched_at: js.UndefOr[DateTime] = js.undefined
  }
  object KakaoProfile {
    
    inline def apply(id: Double): KakaoProfile = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[KakaoProfile]
    }
    
    extension [Self <: KakaoProfile](x: Self) {
      
      inline def setConnected_at(value: DateTime): Self = StObject.set(x, "connected_at", value.asInstanceOf[js.Any])
      
      inline def setConnected_atUndefined: Self = StObject.set(x, "connected_at", js.undefined)
      
      inline def setHas_signed_up(value: Boolean): Self = StObject.set(x, "has_signed_up", value.asInstanceOf[js.Any])
      
      inline def setHas_signed_upUndefined: Self = StObject.set(x, "has_signed_up", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setKakao_account(value: Agerange): Self = StObject.set(x, "kakao_account", value.asInstanceOf[js.Any])
      
      inline def setKakao_accountUndefined: Self = StObject.set(x, "kakao_account", js.undefined)
      
      inline def setProperties(value: Msgblocked): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSynched_at(value: DateTime): Self = StObject.set(x, "synched_at", value.asInstanceOf[js.Any])
      
      inline def setSynched_atUndefined: Self = StObject.set(x, "synched_at", js.undefined)
    }
  }
}
