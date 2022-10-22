package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.anon.PartialCountryAuthorizati
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsCountryAuthorizationMod.countryAuthorization.AuthorizationData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsCountryAuthorizationMod.countryAuthorization.CountryAuthorizationData
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.CountryAuthorization")
@js.native
open class CountryAuthorization ()
  extends EntityBase[CountryAuthorizationData]
     with CountryAuthorizationData {
  def this(data: PartialCountryAuthorizati) = this()
  
  /* CompleteClass */
  var Authorization: AuthorizationData = js.native
  
  /* CompleteClass */
  var CountryCode: CountryISO = js.native
  
  /* CompleteClass */
  var CountryName: String = js.native
  
  /* CompleteClass */
  var LastUpdate: Double = js.native
}
