package typingsJapgolly.toJsonSchema

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.toJsonSchema.mod.JSONSchema3or4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetectFormat extends js.Object {
  /**
    * When set to true format of the strings values may be detected based
    * on it's content.
    *
    * These JSON schema string formats can be detected:
    *
    * * date-time
    * * date
    * * time
    * * utc-millisec
    * * color
    * * style
    * * phone
    * * uri
    * * email
    * * ip-address
    * * ipv6
    *
    * @default true
    */
  var detectFormat: js.UndefOr[Boolean] = js.undefined
  /**
    * By providing custom function you will be able to modify any string
    * value (including nested ones) and pre-process it before it gets
    * converted to schema, modify generated schema or do the schema
    * conversion entirely by yourself.
    *
    * @param value `string` to be converted into JSON schema
    * @param defaultFnc default function that normally generates the
    *                   schema. This function receives only `string` to be
    *                   converted to JSON schema
    */
  var preProcessFnc: js.UndefOr[
    js.Function2[
      /* value */ String, 
      /* defaultFnc */ js.Function1[/* value */ String, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.undefined
}

object AnonDetectFormat {
  @scala.inline
  def apply(
    detectFormat: js.UndefOr[Boolean] = js.undefined,
    preProcessFnc: (/* value */ String, /* defaultFnc */ js.Function1[/* value */ String, JSONSchema3or4]) => CallbackTo[JSONSchema3or4] = null
  ): AnonDetectFormat = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectFormat)) __obj.updateDynamic("detectFormat")(detectFormat.asInstanceOf[js.Any])
    if (preProcessFnc != null) __obj.updateDynamic("preProcessFnc")(js.Any.fromFunction2((t0: /* value */ java.lang.String, t1: /* defaultFnc */ js.Function1[/* value */ java.lang.String, typingsJapgolly.toJsonSchema.mod.JSONSchema3or4]) => preProcessFnc(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDetectFormat]
  }
}

