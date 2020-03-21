package typingsJapgolly.toJsonSchema

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.toJsonSchema.mod.JSONSchema3or4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalProperties extends js.Object {
  /**
    * if set to `false`, all object schemas will include JSON schema
    * property `additionalProperties: false` which makes generated schema
    * to perevent any extra properties.
    *
    * @default true
    */
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  /**
    * By providing `postProcessFnc`, you can modify or replace generated
    * schema. This function will be called recursively for all the
    * properties and sub-properties and array items from leaves to the root
    * of the `obj` object.
    *
    * @param schema Generated JSON schema
    * @param obj input value
    * @param defaultFunc standard function that is used to post-process
    *                    generated schema. Takes the `schema`, `obj`
    *                    params.
    */
  var postProcessFnc: js.UndefOr[
    js.Function3[
      /* schema */ JSONSchema3or4, 
      /* obj */ js.Any, 
      /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ js.Any, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.undefined
  /**
    * By providing custom function you will be able to modify any object
    * value (including nested ones) and pre-process it before it gets
    * converted into schema or modify generated schema or do the schema
    * conversion entirely by yourself.
    *
    * @param obj input object value that is supposed to be converted into
    *            JSON schema
    * @param defaultFunc standard function that is used to generate schema
    *                    from object. Takes just the `obj` param.
    */
  var preProcessFnc: js.UndefOr[
    js.Function2[
      /* obj */ js.Any, 
      /* defaultFunc */ js.Function1[/* obj */ js.Any, JSONSchema3or4], 
      JSONSchema3or4
    ]
  ] = js.undefined
}

object AnonAdditionalProperties {
  @scala.inline
  def apply(
    additionalProperties: js.UndefOr[Boolean] = js.undefined,
    postProcessFnc: (/* schema */ JSONSchema3or4, /* obj */ js.Any, /* defaultFnc */ js.Function2[/* schema */ JSONSchema3or4, /* obj */ js.Any, JSONSchema3or4]) => CallbackTo[JSONSchema3or4] = null,
    preProcessFnc: (/* obj */ js.Any, /* defaultFunc */ js.Function1[/* obj */ js.Any, JSONSchema3or4]) => CallbackTo[JSONSchema3or4] = null
  ): AnonAdditionalProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(additionalProperties)) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (postProcessFnc != null) __obj.updateDynamic("postProcessFnc")(js.Any.fromFunction3((t0: /* schema */ typingsJapgolly.toJsonSchema.mod.JSONSchema3or4, t1: /* obj */ js.Any, t2: /* defaultFnc */ js.Function2[
  /* schema */ typingsJapgolly.toJsonSchema.mod.JSONSchema3or4, 
  /* obj */ js.Any, 
  typingsJapgolly.toJsonSchema.mod.JSONSchema3or4]) => postProcessFnc(t0, t1, t2).runNow()))
    if (preProcessFnc != null) __obj.updateDynamic("preProcessFnc")(js.Any.fromFunction2((t0: /* obj */ js.Any, t1: /* defaultFunc */ js.Function1[/* obj */ js.Any, typingsJapgolly.toJsonSchema.mod.JSONSchema3or4]) => preProcessFnc(t0, t1).runNow()))
    __obj.asInstanceOf[AnonAdditionalProperties]
  }
}

