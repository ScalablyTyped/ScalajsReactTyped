package typingsJapgolly.umbraco.umbraco.resources

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.packageInstallResource
  * @description handles data for package installations
  **/
trait IPackageResource extends js.Object {
  def cleanUp(_package: String): Unit
  /**
    * @ngdoc method
    * @name umbraco.resources.packageInstallResource#fetchPackage
    * @methodOf umbraco.resources.packageInstallResource
    *
    * @description
    * Downloads a package file from our.umbraco.org to the website server.
    *
    * ##usage
    * <pre>
    * packageResource.download("guid-guid-guid-guid")
    *    .then(function(path) {
    *        alert('downloaded');
    *    });
    * </pre>
    *
    * @param {String} the unique package ID
    * @returns {String} path to the downloaded zip file.
    *
    */
  def fetch(id: String): String
  /**
    * @ngdoc method
    * @name umbraco.resources.packageInstallResource#createmanifest
    * @methodOf umbraco.resources.packageInstallResource
    *
    * @description
    * Creates a package manifest for a given folder of files.
    * This manifest keeps track of all installed files and data items
    * so a package can be uninstalled at a later time.
    * After creating a manifest, you can use the ID to install files and data.
    *
    * ##usage
    * <pre>
    * packageResource.createManifest("packages/id-of-install-file")
    *    .then(function(summary) {
    *        alert('unzipped');
    *    });
    * </pre>
    *
    * @param {String} folder the path to the temporary folder containing files
    * @returns {Int} the ID assigned to the saved package manifest
    *
    */
  def `import`(_package: String): Double
  def installData(_package: String): Unit
  def installFiles(_package: String): Unit
}

object IPackageResource {
  @scala.inline
  def apply(
    cleanUp: String => Callback,
    fetch: String => CallbackTo[String],
    `import`: String => CallbackTo[Double],
    installData: String => Callback,
    installFiles: String => Callback
  ): IPackageResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cleanUp")(js.Any.fromFunction1((t0: java.lang.String) => cleanUp(t0).runNow()))
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: java.lang.String) => fetch(t0).runNow()))
    __obj.updateDynamic("import")(js.Any.fromFunction1((t0: java.lang.String) => `import`(t0).runNow()))
    __obj.updateDynamic("installData")(js.Any.fromFunction1((t0: java.lang.String) => installData(t0).runNow()))
    __obj.updateDynamic("installFiles")(js.Any.fromFunction1((t0: java.lang.String) => installFiles(t0).runNow()))
    __obj.asInstanceOf[IPackageResource]
  }
}

