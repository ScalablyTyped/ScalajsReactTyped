package typingsJapgolly.newman.mod

import typingsJapgolly.newman.newmanStrings.auto
import typingsJapgolly.newman.newmanStrings.failure
import typingsJapgolly.newman.newmanStrings.folder
import typingsJapgolly.newman.newmanStrings.off
import typingsJapgolly.newman.newmanStrings.on
import typingsJapgolly.postmanCollection.mod.Collection
import typingsJapgolly.postmanCollection.mod.CollectionDefinition
import typingsJapgolly.postmanCollection.mod.VariableScope
import typingsJapgolly.postmanCollection.mod.VariableScopeDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewmanRunOptions extends js.Object {
  /**
    * Specify whether or not to stop a collection run on encountering the
    * first test script error.
    *
    * "folder" allows you to skip the entire collection run in case an invalid
    * folder was specified using the `folder` option or an error was
    * encountered in general.
    *
    * "failure" would gracefully stop a collection run after completing the
    * current test script.
    *
    * Default value: false
    */
  var bail: js.UndefOr[Boolean | (js.Array[folder | failure])] = js.undefined
  /** A JSON / Collection / String representing the collection. */
  var collection: Collection | CollectionDefinition | String
  /**
    * Enable or Disable colored CLI output.
    *
    * Default value: auto
    */
  var color: js.UndefOr[on | off | auto] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for between subsequent
    * requests.
    *
    * Default value: 0
    */
  var delayRequest: js.UndefOr[Double] = js.undefined
  /** An environment JSON / file path for the current collection run. */
  var environment: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.undefined
  /**
    * The name or ID of the folder (ItemGroup) in the collection which would
    * be run instead of the entire collection.
    */
  var folder: js.UndefOr[String | js.Array[String]] = js.undefined
  /** A globals JSON / file path for the current collection run. */
  var globals: js.UndefOr[VariableScope | VariableScopeDefinition | String] = js.undefined
  /**
    * This specifies whether newman would automatically follow 3xx responses
    * from servers.
    *
    * Default value: false
    */
  var ignoreRedirects: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables SSL verification checks and allows self-signed SSL certificates.
    *
    * Default value: false
    */
  var insecure: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow reading files outside of working directory.
    */
  var insecureFileRead: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the number of iterations to run on the collection. This is
    * usually accompanied by providing a data file reference as
    * iterationData
    */
  var iterationCount: js.UndefOr[Double] = js.undefined
  /**
    * Path to the JSON or CSV file or URL to be used as data source when
    * running multiple iterations on a collection.
    */
  var iterationData: js.UndefOr[js.Any] = js.undefined
  /**
    * Specify options for the reporter(s) declared in options.reporters.
    */
  var reporter: js.UndefOr[js.Any] = js.undefined
  /** Available reporters: cli, json, html and junit. */
  var reporters: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The path to the public client certificate file.
    */
  var sslClientCert: js.UndefOr[String] = js.undefined
  /**
    * The path to the private client key file.
    */
  var sslClientKey: js.UndefOr[String] = js.undefined
  /**
    * The secret client key passphrase.
    */
  var sslClientPassphrase: js.UndefOr[String] = js.undefined
  /**
    * If present, allows overriding the default exit code from the current
    * collection run, useful for bypassing collection result failures.
    *
    * Default value: false
    */
  var suppressExitCode: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for the entire collection run
    * to complete execution.
    *
    * Default value: Infinity
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for requests to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutRequest: js.UndefOr[Double] = js.undefined
  /**
    * Specify the time (in milliseconds) to wait for scripts to return a
    * response.
    *
    * Default value: Infinity
    */
  var timeoutScript: js.UndefOr[Double] = js.undefined
  /**
    * The path of the directory to be used as working directory.
    */
  var workingDir: js.UndefOr[String] = js.undefined
}

object NewmanRunOptions {
  @scala.inline
  def apply(
    collection: Collection | CollectionDefinition | String,
    bail: Boolean | (js.Array[folder | failure]) = null,
    color: on | off | auto = null,
    delayRequest: Int | Double = null,
    environment: VariableScope | VariableScopeDefinition | String = null,
    folder: String | js.Array[String] = null,
    globals: VariableScope | VariableScopeDefinition | String = null,
    ignoreRedirects: js.UndefOr[Boolean] = js.undefined,
    insecure: js.UndefOr[Boolean] = js.undefined,
    insecureFileRead: js.UndefOr[Boolean] = js.undefined,
    iterationCount: Int | Double = null,
    iterationData: js.Any = null,
    reporter: js.Any = null,
    reporters: String | js.Array[String] = null,
    sslClientCert: String = null,
    sslClientKey: String = null,
    sslClientPassphrase: String = null,
    suppressExitCode: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    timeoutRequest: Int | Double = null,
    timeoutScript: Int | Double = null,
    workingDir: String = null
  ): NewmanRunOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    if (bail != null) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (delayRequest != null) __obj.updateDynamic("delayRequest")(delayRequest.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreRedirects)) __obj.updateDynamic("ignoreRedirects")(ignoreRedirects.asInstanceOf[js.Any])
    if (!js.isUndefined(insecure)) __obj.updateDynamic("insecure")(insecure.asInstanceOf[js.Any])
    if (!js.isUndefined(insecureFileRead)) __obj.updateDynamic("insecureFileRead")(insecureFileRead.asInstanceOf[js.Any])
    if (iterationCount != null) __obj.updateDynamic("iterationCount")(iterationCount.asInstanceOf[js.Any])
    if (iterationData != null) __obj.updateDynamic("iterationData")(iterationData.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (sslClientCert != null) __obj.updateDynamic("sslClientCert")(sslClientCert.asInstanceOf[js.Any])
    if (sslClientKey != null) __obj.updateDynamic("sslClientKey")(sslClientKey.asInstanceOf[js.Any])
    if (sslClientPassphrase != null) __obj.updateDynamic("sslClientPassphrase")(sslClientPassphrase.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressExitCode)) __obj.updateDynamic("suppressExitCode")(suppressExitCode.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (timeoutRequest != null) __obj.updateDynamic("timeoutRequest")(timeoutRequest.asInstanceOf[js.Any])
    if (timeoutScript != null) __obj.updateDynamic("timeoutScript")(timeoutScript.asInstanceOf[js.Any])
    if (workingDir != null) __obj.updateDynamic("workingDir")(workingDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewmanRunOptions]
  }
}

