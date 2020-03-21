package typingsJapgolly.restIo.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.express.mod.Application_
import typingsJapgolly.restIo.AnonADMIN
import typingsJapgolly.restIo.TypeofResource
import typingsJapgolly.restIo.TypeofauthorizedResource
import typingsJapgolly.restIo.authorizedSubResourceMod.ISubResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io", JSImport.Default)
@js.native
class default protected () extends RestIO {
  def this(app: Application_) = this()
  def this(app: Application_, config: IRestIOConfig) = this()
}

/* static members */
@JSImport("rest-io", JSImport.Default)
@js.native
object default extends js.Object {
  var AuthorizedResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof authorizedResource.AuthorizedResource */ js.Any = js.native
  var AuthorizedSubResource: Instantiable1[
    /* subResDef */ ISubResource, 
    typingsJapgolly.restIo.authorizedSubResourceMod.default
  ] = js.native
  var ROLES: AnonADMIN = js.native
  var Resource: TypeofResource = js.native
  var SubResource: Instantiable1[
    /* subResDef */ typingsJapgolly.restIo.subResourceMod.ISubResource, 
    typingsJapgolly.restIo.subResourceMod.default
  ] = js.native
  var UserResource: Instantiable0[typingsJapgolly.restIo.userResourceMod.default] = js.native
  var authorizedResource: TypeofauthorizedResource = js.native
}

