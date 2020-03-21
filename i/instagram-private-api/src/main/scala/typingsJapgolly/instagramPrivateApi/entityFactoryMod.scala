package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.entitiesMod.DirectThreadEntity
import typingsJapgolly.instagramPrivateApi.entitiesMod.ProfileEntity
import typingsJapgolly.instagramPrivateApi.repositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instagram-private-api/dist/core/entity.factory", JSImport.Namespace)
@js.native
object entityFactoryMod extends js.Object {
  @js.native
  class EntityFactory () extends Repository {
    def directThread(id: String): DirectThreadEntity = js.native
    def directThread(id: js.Array[String]): DirectThreadEntity = js.native
    def profile(pk: String): ProfileEntity = js.native
  }
  
}

