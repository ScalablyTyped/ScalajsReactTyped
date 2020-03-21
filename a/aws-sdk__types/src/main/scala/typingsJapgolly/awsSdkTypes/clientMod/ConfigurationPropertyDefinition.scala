package typingsJapgolly.awsSdkTypes.clientMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationPropertyDefinition[InputType, ResolvedType /* <: InputType */, ServiceConfiguration /* <: StringDictionary[js.Any] */, ResolvedConfiguration /* <: ServiceConfiguration */] extends js.Object {
  /**
    * A function that finalizes the value supplied and/or alters the client
    * configuration or middleware stack in reaction to it.
    */
  @JSName("apply")
  var apply: js.UndefOr[ConfigApplicator[ResolvedConfiguration]] = js.undefined
  /**
    * A function that returns a default value for this property. It will be
    * called if no value is supplied.
    */
  var defaultProvider: js.UndefOr[js.Function1[/* config */ ResolvedConfiguration, ResolvedType]] = js.undefined
  /**
    * A static value to use as the default should none be supplied.
    */
  var defaultValue: js.UndefOr[ResolvedType] = js.undefined
  /**
    * A function that normalizes input to the subtype expected by the SDK.
    */
  var normalize: js.UndefOr[
    js.Function2[/* value */ InputType, /* config */ Partial[ResolvedConfiguration], ResolvedType]
  ] = js.undefined
  /**
    * Whether this property must be supplied by the user of a client. If value
    * must be resolved but a default is available, this property should be
    * `false` or undefined.
    */
  var required: js.UndefOr[Boolean] = js.undefined
}

object ConfigurationPropertyDefinition {
  @scala.inline
  def apply[InputType, ResolvedType /* <: InputType */, ServiceConfiguration /* <: StringDictionary[js.Any] */, ResolvedConfiguration /* <: ServiceConfiguration */](
    apply: (ResolvedConfiguration, /* clientMiddlewareStack */ MiddlewareStack[js.Any, js.Any, js.Any]) => Callback = null,
    defaultProvider: /* config */ ResolvedConfiguration => CallbackTo[ResolvedType] = null,
    defaultValue: ResolvedType = null,
    normalize: (/* value */ InputType, /* config */ Partial[ResolvedConfiguration]) => CallbackTo[ResolvedType] = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration] = {
    val __obj = js.Dynamic.literal()
    if (apply != null) __obj.updateDynamic("apply")(js.Any.fromFunction2((t0: ResolvedConfiguration, t1: /* clientMiddlewareStack */ typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[js.Any, js.Any, js.Any]) => apply(t0, t1).runNow()))
    if (defaultProvider != null) __obj.updateDynamic("defaultProvider")(js.Any.fromFunction1((t0: /* config */ ResolvedConfiguration) => defaultProvider(t0).runNow()))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (normalize != null) __obj.updateDynamic("normalize")(js.Any.fromFunction2((t0: /* value */ InputType, t1: /* config */ typingsJapgolly.std.Partial[ResolvedConfiguration]) => normalize(t0, t1).runNow()))
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationPropertyDefinition[InputType, ResolvedType, ServiceConfiguration, ResolvedConfiguration]]
  }
}

