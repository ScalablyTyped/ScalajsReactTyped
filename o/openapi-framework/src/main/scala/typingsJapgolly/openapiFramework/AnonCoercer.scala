package typingsJapgolly.openapiFramework

import typingsJapgolly.openapiDefaultSetter.mod.IOpenAPIDefaultSetter
import typingsJapgolly.openapiRequestCoercer.mod.IOpenAPIRequestCoercer
import typingsJapgolly.openapiRequestValidator.mod.IOpenAPIRequestValidator
import typingsJapgolly.openapiResponseValidator.mod.IOpenAPIResponseValidator
import typingsJapgolly.openapiSecurityHandler.mod.IOpenAPISecurityHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoercer extends js.Object {
  var coercer: js.UndefOr[IOpenAPIRequestCoercer] = js.undefined
  var defaultSetter: js.UndefOr[IOpenAPIDefaultSetter] = js.undefined
  var requestValidator: js.UndefOr[IOpenAPIRequestValidator] = js.undefined
  var responseValidator: js.UndefOr[IOpenAPIResponseValidator] = js.undefined
  var securityHandler: js.UndefOr[IOpenAPISecurityHandler] = js.undefined
}

object AnonCoercer {
  @scala.inline
  def apply(
    coercer: IOpenAPIRequestCoercer = null,
    defaultSetter: IOpenAPIDefaultSetter = null,
    requestValidator: IOpenAPIRequestValidator = null,
    responseValidator: IOpenAPIResponseValidator = null,
    securityHandler: IOpenAPISecurityHandler = null
  ): AnonCoercer = {
    val __obj = js.Dynamic.literal()
    if (coercer != null) __obj.updateDynamic("coercer")(coercer.asInstanceOf[js.Any])
    if (defaultSetter != null) __obj.updateDynamic("defaultSetter")(defaultSetter.asInstanceOf[js.Any])
    if (requestValidator != null) __obj.updateDynamic("requestValidator")(requestValidator.asInstanceOf[js.Any])
    if (responseValidator != null) __obj.updateDynamic("responseValidator")(responseValidator.asInstanceOf[js.Any])
    if (securityHandler != null) __obj.updateDynamic("securityHandler")(securityHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoercer]
  }
}

