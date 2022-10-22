package typingsJapgolly.petFinderApi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(api_key: String, api_secret: String): PetFinder = (^.asInstanceOf[js.Dynamic].apply(api_key.asInstanceOf[js.Any], api_secret.asInstanceOf[js.Any])).asInstanceOf[PetFinder]
  inline def apply(api_key: String, api_secret: String, options: Any): PetFinder = (^.asInstanceOf[js.Dynamic].apply(api_key.asInstanceOf[js.Any], api_secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PetFinder]
  
  @JSImport("pet-finder-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Contact extends StObject {
    
    var address1: String
    
    var address2: String
    
    var city: String
    
    var email: String
    
    var fax: String
    
    var phone: String
    
    var state: String
    
    var zip: String
  }
  object Contact {
    
    inline def apply(
      address1: String,
      address2: String,
      city: String,
      email: String,
      fax: String,
      phone: String,
      state: String,
      zip: String
    ): Contact = {
      val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fax = fax.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    extension [Self <: Contact](x: Self) {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pet extends StObject {
    
    var age: String
    
    var animal: String
    
    var breeds: js.Array[String]
    
    var contact: Contact
    
    var description: String
    
    var id: Double
    
    var media: Any
    
    var mix: String
    
    var name: String
    
    var options: js.Array[String]
    
    var sex: String
    
    var shelterId: String
    
    var shelterPetId: String
    
    var size: String
    
    var status: String
  }
  object Pet {
    
    inline def apply(
      age: String,
      animal: String,
      breeds: js.Array[String],
      contact: Contact,
      description: String,
      id: Double,
      media: Any,
      mix: String,
      name: String,
      options: js.Array[String],
      sex: String,
      shelterId: String,
      shelterPetId: String,
      size: String,
      status: String
    ): Pet = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], animal = animal.asInstanceOf[js.Any], breeds = breeds.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sex = sex.asInstanceOf[js.Any], shelterId = shelterId.asInstanceOf[js.Any], shelterPetId = shelterPetId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pet]
    }
    
    extension [Self <: Pet](x: Self) {
      
      inline def setAge(value: String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAnimal(value: String): Self = StObject.set(x, "animal", value.asInstanceOf[js.Any])
      
      inline def setBreeds(value: js.Array[String]): Self = StObject.set(x, "breeds", value.asInstanceOf[js.Any])
      
      inline def setBreedsVarargs(value: String*): Self = StObject.set(x, "breeds", js.Array(value*))
      
      inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMix(value: String): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSex(value: String): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
      
      inline def setShelterId(value: String): Self = StObject.set(x, "shelterId", value.asInstanceOf[js.Any])
      
      inline def setShelterPetId(value: String): Self = StObject.set(x, "shelterPetId", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait PetFinder extends StObject {
    
    def findPet(options: Any, callback: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]): Unit
    
    def findShelter(
      location: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]
    ): Unit
    
    def getBreedList(animal: String, callback: js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]): Unit
    
    def getPet(petId: Double, options: Any, callback: js.Function2[/* error */ Any, /* pet */ Pet, Unit]): Unit
    
    def getPetsInShelter(
      shelterId: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]
    ): Unit
    
    def getRandomPet(options: Any, callback: js.Function2[/* error */ Any, /* pet */ Pet, Unit]): Unit
    
    def getShelter(
      shelterId: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]
    ): Unit
    
    def getSheltersWithBreeds(
      animal: String,
      breed: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]
    ): Unit
  }
  object PetFinder {
    
    inline def apply(
      findPet: (Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Callback,
      findShelter: (String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Callback,
      getBreedList: (String, js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]) => Callback,
      getPet: (Double, Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Callback,
      getPetsInShelter: (String, Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Callback,
      getRandomPet: (Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Callback,
      getShelter: (String, Any, js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]) => Callback,
      getSheltersWithBreeds: (String, String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Callback
    ): PetFinder = {
      val __obj = js.Dynamic.literal(findPet = js.Any.fromFunction2((t0: Any, t1: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => (findPet(t0, t1)).runNow()), findShelter = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => (findShelter(t0, t1, t2)).runNow()), getBreedList = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]) => (getBreedList(t0, t1)).runNow()), getPet = js.Any.fromFunction3((t0: Double, t1: Any, t2: js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => (getPet(t0, t1, t2)).runNow()), getPetsInShelter = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => (getPetsInShelter(t0, t1, t2)).runNow()), getRandomPet = js.Any.fromFunction2((t0: Any, t1: js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => (getRandomPet(t0, t1)).runNow()), getShelter = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]) => (getShelter(t0, t1, t2)).runNow()), getSheltersWithBreeds = js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => (getSheltersWithBreeds(t0, t1, t2, t3)).runNow()))
      __obj.asInstanceOf[PetFinder]
    }
    
    extension [Self <: PetFinder](x: Self) {
      
      inline def setFindPet(value: (Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Callback): Self = StObject.set(x, "findPet", js.Any.fromFunction2((t0: Any, t1: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setFindShelter(
        value: (String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Callback
      ): Self = StObject.set(x, "findShelter", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetBreedList(value: (String, js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]) => Callback): Self = StObject.set(x, "getBreedList", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetPet(value: (Double, Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Callback): Self = StObject.set(x, "getPet", js.Any.fromFunction3((t0: Double, t1: Any, t2: js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetPetsInShelter(value: (String, Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Callback): Self = StObject.set(x, "getPetsInShelter", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetRandomPet(value: (Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Callback): Self = StObject.set(x, "getRandomPet", js.Any.fromFunction2((t0: Any, t1: js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setGetShelter(value: (String, Any, js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]) => Callback): Self = StObject.set(x, "getShelter", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setGetSheltersWithBreeds(
        value: (String, String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Callback
      ): Self = StObject.set(x, "getSheltersWithBreeds", js.Any.fromFunction4((t0: String, t1: String, t2: Any, t3: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  trait Shelter extends StObject {
    
    var address1: String
    
    var address2: String
    
    var city: String
    
    var country: String
    
    var email: String
    
    var fax: String
    
    var id: String
    
    var latitude: Double
    
    var longitude: Double
    
    var name: String
    
    var phone: String
    
    var state: String
    
    var zip: String
  }
  object Shelter {
    
    inline def apply(
      address1: String,
      address2: String,
      city: String,
      country: String,
      email: String,
      fax: String,
      id: String,
      latitude: Double,
      longitude: Double,
      name: String,
      phone: String,
      state: String,
      zip: String
    ): Shelter = {
      val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fax = fax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shelter]
    }
    
    extension [Self <: Shelter](x: Self) {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
