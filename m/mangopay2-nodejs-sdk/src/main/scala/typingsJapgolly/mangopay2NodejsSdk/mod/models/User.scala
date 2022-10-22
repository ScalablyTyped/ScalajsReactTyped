package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.UserData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.User")
@js.native
open class User protected ()
  extends EntityBase[UserData]
     with UserData {
  def this(data: UserData) = this()
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The person's email address (not more than 12 consecutive numbers) - must be a valid email
    */
  /* CompleteClass */
  var Email: String = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * KYC Level (LIGHT or REGULAR)
    */
  /* CompleteClass */
  var KYCLevel: typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.KYCLevel = js.native
  
  /**
    * Type of user
    */
  /* CompleteClass */
  var PersonType: typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.PersonType = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * Sets the person type for the model
    * @param personType
    */
  def setPersonType(`type`: typingsJapgolly.mangopay2NodejsSdk.typingsModelsUserMod.user.PersonType): Unit = js.native
}
