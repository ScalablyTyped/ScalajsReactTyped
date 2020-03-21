package typingsJapgolly.openapiFramework.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openapiFramework.AnonString
import typingsJapgolly.openapiSecurityHandler.mod.SecurityHandlers
import typingsJapgolly.openapiTypes.mod.OpenAPIV2.Document
import typingsJapgolly.tsLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIFrameworkConstructorArgs extends OpenAPIFrameworkArgs {
  var featureType: String
  var name: String
}

object OpenAPIFrameworkConstructorArgs {
  @scala.inline
  def apply(
    apiDoc: Document | typingsJapgolly.openapiTypes.mod.OpenAPIV3.Document | String,
    featureType: String,
    name: String,
    customFormats: StringDictionary[js.Function1[/* arg */ js.Any, Boolean]] = null,
    dependencies: StringDictionary[js.Any] = null,
    enableObjectCoercion: js.UndefOr[Boolean] = js.undefined,
    errorTransformer: (/* has0 */ js.Object, /* has1 */ js.Object) => CallbackTo[js.Object] = null,
    externalSchemas: AnonString = null,
    logger: Logger = null,
    operations: StringDictionary[js.Function1[/* repeated */ js.Any, _]] = null,
    pathSecurity: js.Array[PathSecurityTuple] = null,
    paths: String | js.Array[OpenAPIFrameworkPathObject] = null,
    pathsIgnore: js.RegExp = null,
    routesGlob: String = null,
    routesIndexFileRegExp: js.RegExp = null,
    securityHandlers: SecurityHandlers = null,
    validateApiDoc: js.UndefOr[Boolean] = js.undefined
  ): OpenAPIFrameworkConstructorArgs = {
    val __obj = js.Dynamic.literal(apiDoc = apiDoc.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (customFormats != null) __obj.updateDynamic("customFormats")(customFormats.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(enableObjectCoercion)) __obj.updateDynamic("enableObjectCoercion")(enableObjectCoercion.asInstanceOf[js.Any])
    if (errorTransformer != null) __obj.updateDynamic("errorTransformer")(js.Any.fromFunction2((t0: /* has0 */ js.Object, t1: /* has1 */ js.Object) => errorTransformer(t0, t1).runNow()))
    if (externalSchemas != null) __obj.updateDynamic("externalSchemas")(externalSchemas.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (pathSecurity != null) __obj.updateDynamic("pathSecurity")(pathSecurity.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (pathsIgnore != null) __obj.updateDynamic("pathsIgnore")(pathsIgnore.asInstanceOf[js.Any])
    if (routesGlob != null) __obj.updateDynamic("routesGlob")(routesGlob.asInstanceOf[js.Any])
    if (routesIndexFileRegExp != null) __obj.updateDynamic("routesIndexFileRegExp")(routesIndexFileRegExp.asInstanceOf[js.Any])
    if (securityHandlers != null) __obj.updateDynamic("securityHandlers")(securityHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(validateApiDoc)) __obj.updateDynamic("validateApiDoc")(validateApiDoc.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIFrameworkConstructorArgs]
  }
}

