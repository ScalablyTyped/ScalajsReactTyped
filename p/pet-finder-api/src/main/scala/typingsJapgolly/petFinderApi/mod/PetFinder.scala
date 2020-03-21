package typingsJapgolly.petFinderApi.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PetFinder extends js.Object {
  def findPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]): Unit
  def findShelter(
    location: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
  ): Unit
  def getBreedList(animal: String, callback: js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]): Unit
  def getPet(petId: Double, options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit
  def getPetsInShelter(
    shelterId: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]
  ): Unit
  def getRandomPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit
  def getShelter(
    shelterId: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]
  ): Unit
  def getSheltersWithBreeds(
    animal: String,
    breed: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
  ): Unit
}

object PetFinder {
  @scala.inline
  def apply(
    findPet: (js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Callback,
    findShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Callback,
    getBreedList: (String, js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]) => Callback,
    getPet: (Double, js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Callback,
    getPetsInShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Callback,
    getRandomPet: (js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Callback,
    getShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]) => Callback,
    getSheltersWithBreeds: (String, String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Callback
  ): PetFinder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("findPet")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[
  /* error */ js.Any, 
  /* pets */ js.Array[typingsJapgolly.petFinderApi.mod.Pet], 
  scala.Unit]) => findPet(t0, t1).runNow()))
    __obj.updateDynamic("findShelter")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function2[
  /* error */ js.Any, 
  /* shelters */ js.Array[typingsJapgolly.petFinderApi.mod.Shelter], 
  scala.Unit]) => findShelter(t0, t1, t2).runNow()))
    __obj.updateDynamic("getBreedList")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[/* err */ js.Any, /* breedArray */ js.Array[java.lang.String], scala.Unit]) => getBreedList(t0, t1).runNow()))
    __obj.updateDynamic("getPet")(js.Any.fromFunction3((t0: scala.Double, t1: js.Any, t2: js.Function2[/* error */ js.Any, /* pet */ typingsJapgolly.petFinderApi.mod.Pet, scala.Unit]) => getPet(t0, t1, t2).runNow()))
    __obj.updateDynamic("getPetsInShelter")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function2[
  /* error */ js.Any, 
  /* pets */ js.Array[typingsJapgolly.petFinderApi.mod.Pet], 
  scala.Unit]) => getPetsInShelter(t0, t1, t2).runNow()))
    __obj.updateDynamic("getRandomPet")(js.Any.fromFunction2((t0: js.Any, t1: js.Function2[/* error */ js.Any, /* pet */ typingsJapgolly.petFinderApi.mod.Pet, scala.Unit]) => getRandomPet(t0, t1).runNow()))
    __obj.updateDynamic("getShelter")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: js.Function2[
  /* error */ js.Any, 
  /* shelter */ typingsJapgolly.petFinderApi.mod.Shelter, 
  scala.Unit]) => getShelter(t0, t1, t2).runNow()))
    __obj.updateDynamic("getSheltersWithBreeds")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: js.Any, t3: js.Function2[
  /* error */ js.Any, 
  /* shelters */ js.Array[typingsJapgolly.petFinderApi.mod.Shelter], 
  scala.Unit]) => getSheltersWithBreeds(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[PetFinder]
  }
}

