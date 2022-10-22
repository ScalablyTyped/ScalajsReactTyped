package typingsJapgolly.onfleetNodeOnfleet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.onfleetNodeOnfleet.metadataMod.MatchMetadata
import typingsJapgolly.onfleetNodeOnfleet.metadataMod.MatchMetadataResult
import typingsJapgolly.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.`super`
import typingsJapgolly.onfleetNodeOnfleet.onfleetNodeOnfleetStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourcesAdministratorsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Administrators", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Admin {
    
    /* CompleteClass */
    override def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin] = js.native
    
    /* CompleteClass */
    override def deleteOne(id: String): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def get(): js.Promise[js.Array[OnfleetAdmin]] = js.native
    
    /* CompleteClass */
    override def matchMetadata(obj: OnfleetMetadata): js.Promise[js.Array[MatchMetadataResult]] = js.native
    /* CompleteClass */
    @JSName("matchMetadata")
    var matchMetadata_Original: MatchMetadata[OnfleetMetadata] = js.native
    
    /* CompleteClass */
    override def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin] = js.native
  }
  
  trait Admin extends StObject {
    
    def create(obj: CreateAdminProps): js.Promise[OnfleetAdmin]
    
    def deleteOne(id: String): js.Promise[Unit]
    
    def get(): js.Promise[js.Array[OnfleetAdmin]]
    
    def matchMetadata(obj: OnfleetMetadata): js.Promise[js.Array[MatchMetadataResult]]
    @JSName("matchMetadata")
    var matchMetadata_Original: MatchMetadata[OnfleetMetadata]
    
    def update(id: String, obj: UpdateAdminProps): js.Promise[OnfleetAdmin]
  }
  object Admin {
    
    inline def apply(
      create: CreateAdminProps => js.Promise[OnfleetAdmin],
      deleteOne: String => js.Promise[Unit],
      get: CallbackTo[js.Promise[js.Array[OnfleetAdmin]]],
      matchMetadata: OnfleetMetadata => js.Promise[js.Array[MatchMetadataResult]],
      update: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]
    ): Admin = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), deleteOne = js.Any.fromFunction1(deleteOne), get = get.toJsFn, matchMetadata = js.Any.fromFunction1(matchMetadata), update = js.Any.fromFunction2(update))
      __obj.asInstanceOf[Admin]
    }
    
    extension [Self <: Admin](x: Self) {
      
      inline def setCreate(value: CreateAdminProps => js.Promise[OnfleetAdmin]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setDeleteOne(value: String => js.Promise[Unit]): Self = StObject.set(x, "deleteOne", js.Any.fromFunction1(value))
      
      inline def setGet(value: CallbackTo[js.Promise[js.Array[OnfleetAdmin]]]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setMatchMetadata(value: OnfleetMetadata => js.Promise[js.Array[MatchMetadataResult]]): Self = StObject.set(x, "matchMetadata", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: (String, UpdateAdminProps) => js.Promise[OnfleetAdmin]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * @prop email - The administrator’s complete name.
    * @prop name - The administrator’s email address.
    * @prop phone - Optional. The administrator's phone number.
    * @prop isReadOnly - Optional. Whether this administrator can perform write operations.
    */
  trait CreateAdminProps extends StObject {
    
    var email: String
    
    var isReadOnly: js.UndefOr[Boolean] = js.undefined
    
    var name: String
    
    var phone: js.UndefOr[String] = js.undefined
  }
  object CreateAdminProps {
    
    inline def apply(email: String, name: String): CreateAdminProps = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAdminProps]
    }
    
    extension [Self <: CreateAdminProps](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
      
      inline def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    }
  }
  
  trait OnfleetAdmin extends StObject {
    
    var email: String
    
    var id: String
    
    var isActive: Boolean
    
    var metadata: OnfleetMetadata
    
    var name: String
    
    var organization: String
    
    var phone: String
    
    var timeCreated: Double
    
    var timeLastModified: Double
    
    var `type`: `super` | standard
  }
  object OnfleetAdmin {
    
    inline def apply(
      email: String,
      id: String,
      isActive: Boolean,
      metadata: OnfleetMetadata,
      name: String,
      organization: String,
      phone: String,
      timeCreated: Double,
      timeLastModified: Double,
      `type`: `super` | standard
    ): OnfleetAdmin = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetAdmin]
    }
    
    extension [Self <: OnfleetAdmin](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: OnfleetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      inline def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
      
      inline def setType(value: `super` | standard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdateAdminProps extends StObject {
    
    var email: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[OnfleetMetadata] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object UpdateAdminProps {
    
    inline def apply(): UpdateAdminProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAdminProps]
    }
    
    extension [Self <: UpdateAdminProps](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setMetadata(value: OnfleetMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
