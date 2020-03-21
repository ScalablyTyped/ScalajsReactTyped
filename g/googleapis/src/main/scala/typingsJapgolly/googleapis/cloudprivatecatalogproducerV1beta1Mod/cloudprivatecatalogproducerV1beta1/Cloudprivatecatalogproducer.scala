package typingsJapgolly.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import typingsJapgolly.googleapisCommon.apiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.apiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Private Catalog Producer API
  *
  * Enables cloud users to manage and share enterprise catalogs intheir
  * organizations.
  *
  * @example
  * const {google} = require('googleapis');
  * const cloudprivatecatalogproducer =
  * google.cloudprivatecatalogproducer('v1beta1');
  *
  * @namespace cloudprivatecatalogproducer
  * @type {Function}
  * @version v1beta1
  * @variation v1beta1
  * @param {object=} options Options for Cloudprivatecatalogproducer
  */
@JSImport("googleapis/build/src/apis/cloudprivatecatalogproducer/v1beta1", "cloudprivatecatalogproducer_v1beta1.Cloudprivatecatalogproducer")
@js.native
class Cloudprivatecatalogproducer protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var catalogs: ResourceCatalogs = js.native
  var context: APIRequestContext = js.native
  var operations: ResourceOperations = js.native
}

