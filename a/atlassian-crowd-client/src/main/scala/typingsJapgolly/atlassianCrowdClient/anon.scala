package typingsJapgolly.atlassianCrowdClient

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atlassianCrowdClient.libModelsUserMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var attributes: Any
    
    var description: js.UndefOr[String] = js.undefined
    
    var name: String
  }
  object Active {
    
    inline def apply(attributes: Any, name: String): Active = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Add extends StObject {
    
    def add(groupname: String, childname: String): js.Promise[Unit] = js.native
    
    def get(groupname: String, childname: String): js.Promise[String] = js.native
    def get(groupname: String, childname: String, nested: Boolean): js.Promise[String] = js.native
    
    def list(groupname: String): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String]] = js.native
    
    def remove(groupname: String, childname: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait AddGet extends StObject {
    
    def add(groupname: String, parentname: String): js.Promise[Unit] = js.native
    
    def get(groupname: String, parentname: String): js.Promise[String] = js.native
    def get(groupname: String, parentname: String, nested: Boolean): js.Promise[String] = js.native
    
    def list(groupname: String): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double, maxResults: Double): js.Promise[js.Array[String]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String]] = js.native
  }
  
  @js.native
  trait Attributes extends StObject {
    
    var attributes: typingsJapgolly.atlassianCrowdClient.anon.List = js.native
    
    def create(user: ^): js.Promise[^] = js.native
    
    def get(username: String): js.Promise[^] = js.native
    def get(username: String, withAttributes: Boolean): js.Promise[^] = js.native
    
    var groups: Add = js.native
    
    def remove(username: String): js.Promise[Unit] = js.native
    
    def rename(oldname: String, newname: String): js.Promise[Unit] = js.native
    
    def update(username: String, user: ^): js.Promise[^] = js.native
  }
  
  trait Authenticate extends StObject {
    
    def authenticate(username: String, password: String): js.Promise[^]
  }
  object Authenticate {
    
    inline def apply(authenticate: (String, String) => js.Promise[^]): Authenticate = {
      val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate))
      __obj.asInstanceOf[Authenticate]
    }
    
    extension [Self <: Authenticate](x: Self) {
      
      inline def setAuthenticate(value: (String, String) => js.Promise[^]): Self = StObject.set(x, "authenticate", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var attributes: Remove = js.native
    
    var children: Add = js.native
    
    def create(group: typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^] = js.native
    
    def get(groupname: String): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^] = js.native
    def get(groupname: String, withAttributes: Boolean): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^] = js.native
    
    def membership(): js.Promise[String] = js.native
    
    var parents: AddGet = js.native
    
    def remove(groupname: String): js.Promise[Unit] = js.native
    
    def update(groupname: String, group: typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^] = js.native
    
    var users: Get = js.native
  }
  
  trait Cookie extends StObject {
    
    def cookie(): js.Promise[Any]
  }
  object Cookie {
    
    inline def apply(cookie: CallbackTo[js.Promise[Any]]): Cookie = {
      val __obj = js.Dynamic.literal(cookie = cookie.toJsFn)
      __obj.asInstanceOf[Cookie]
    }
    
    extension [Self <: Cookie](x: Self) {
      
      inline def setCookie(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "cookie", value.toJsFn)
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(username: String, password: String): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    def create(username: String, password: String, validationFactors: Unit, duration: Double): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    def create(
      username: String,
      password: String,
      validationFactors: typingsJapgolly.atlassianCrowdClient.libModelsValidationFactorsMod.^
    ): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    def create(
      username: String,
      password: String,
      validationFactors: typingsJapgolly.atlassianCrowdClient.libModelsValidationFactorsMod.^,
      duration: Double
    ): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    
    def createUnvalidated(username: String): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    def createUnvalidated(username: String, validationFactors: Unit, duration: Double): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    def createUnvalidated(
      username: String,
      validationFactors: typingsJapgolly.atlassianCrowdClient.libModelsValidationFactorsMod.^
    ): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    def createUnvalidated(
      username: String,
      validationFactors: typingsJapgolly.atlassianCrowdClient.libModelsValidationFactorsMod.^,
      duration: Double
    ): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    
    def getUser(token: String): js.Promise[^] = js.native
    
    def remove(token: String): js.Promise[Unit] = js.native
    
    def removeAll(username: String): js.Promise[Unit] = js.native
    def removeAll(username: String, exclude: String): js.Promise[Unit] = js.native
    
    def validate(token: String): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
    def validate(
      token: String,
      validationFactors: typingsJapgolly.atlassianCrowdClient.libModelsValidationFactorsMod.^
    ): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsSessionMod.^] = js.native
  }
  
  @js.native
  trait Get extends StObject {
    
    def add(groupname: String, username: String): js.Promise[Unit] = js.native
    
    def get(groupname: String, username: String): js.Promise[String] = js.native
    def get(groupname: String, username: String, nested: Boolean): js.Promise[String] = js.native
    
    def list(groupname: String): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Double, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Double, maxResults: Unit, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Unit, maxResults: Double, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Boolean, startIndex: Unit, maxResults: Unit, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double, maxResults: Double, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Double, maxResults: Unit, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Unit, maxResults: Double, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def list(groupname: String, nested: Unit, startIndex: Unit, maxResults: Unit, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    
    def remove(groupname: String, username: String): js.Promise[Unit] = js.native
  }
  
  @js.native
  trait Group extends StObject {
    
    def group(restriction: String): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    def group(restriction: String, expand: Boolean): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    def group(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    def group(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    def group(restriction: String, expand: Boolean, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    def group(restriction: String, expand: Unit, startIndex: Double): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    def group(restriction: String, expand: Unit, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    def group(restriction: String, expand: Unit, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String | typingsJapgolly.atlassianCrowdClient.libModelsGroupMod.^]] = js.native
    
    def user(restriction: String): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean, startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Boolean, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Unit, startIndex: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Unit, startIndex: Double, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
    def user(restriction: String, expand: Unit, startIndex: Unit, maxResults: Double): js.Promise[js.Array[String | ^]] = js.native
  }
  
  trait List extends StObject {
    
    def list(username: String): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]
    
    var password: Reset
    
    def remove(username: String, attributename: String): js.Promise[Unit]
    
    def set(username: String, attributes: typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]
    
    var username: Request
  }
  object List {
    
    inline def apply(
      list: String => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^],
      password: Reset,
      remove: (String, String) => js.Promise[Unit],
      set: (String, typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^) => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^],
      username: Request
    ): typingsJapgolly.atlassianCrowdClient.anon.List = {
      val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), password = password.asInstanceOf[js.Any], remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set), username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.atlassianCrowdClient.anon.List]
    }
    
    extension [Self <: typingsJapgolly.atlassianCrowdClient.anon.List](x: Self) {
      
      inline def setList(value: String => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      inline def setPassword(value: Reset): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setRemove(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setSet(
        value: (String, typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^) => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setUsername(value: Request): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Password extends StObject {
    
    val name: String
    
    val password: String
  }
  object Password {
    
    inline def apply(name: String, password: String): Password = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait Remove extends StObject {
    
    def list(groupname: String): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]
    
    def remove(groupname: String, attributename: String): js.Promise[Unit]
    
    def set(groupname: String, attributes: typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^): js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]
  }
  object Remove {
    
    inline def apply(
      list: String => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^],
      remove: (String, String) => js.Promise[Unit],
      set: (String, typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^) => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]
    ): Remove = {
      val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Remove]
    }
    
    extension [Self <: Remove](x: Self) {
      
      inline def setList(value: String => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      inline def setRemove(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
      
      inline def setSet(
        value: (String, typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^) => js.Promise[typingsJapgolly.atlassianCrowdClient.libModelsAttributesMod.^]
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Request extends StObject {
    
    def request(email: String): js.Promise[Unit]
  }
  object Request {
    
    inline def apply(request: String => js.Promise[Unit]): Request = {
      val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request))
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: String => js.Promise[Unit]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    }
  }
  
  trait Reset extends StObject {
    
    def reset(username: String): js.Promise[Unit]
    
    def set(username: String, password: String): js.Promise[Unit]
  }
  object Reset {
    
    inline def apply(reset: String => js.Promise[Unit], set: (String, String) => js.Promise[Unit]): Reset = {
      val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Reset]
    }
    
    extension [Self <: Reset](x: Self) {
      
      inline def setReset(value: String => js.Promise[Unit]): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
