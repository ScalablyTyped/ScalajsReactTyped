package typingsJapgolly.octokitPluginRestEndpointMethods

import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.TeamsUpdateParams
import typingsJapgolly.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod.TeamsUpdateParamsDeprecatedPermission
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon576 extends js.Object {
  var endpoint: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EndpointInterface */ js.Any = js.native
  def apply(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateResponse> */ _
  ] = js.native
  def apply(
    params: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any) with TeamsUpdateParamsDeprecatedPermission with TeamsUpdateParams
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OctokitResponse<TeamsUpdateResponse> */ _
  ] = js.native
}

