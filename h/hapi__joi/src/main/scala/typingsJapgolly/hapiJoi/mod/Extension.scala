package typingsJapgolly.hapiJoi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hapiJoi.AnonBuild
import typingsJapgolly.hapiJoi.AnonTo
import typingsJapgolly.std.Record
import typingsJapgolly.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var args: js.UndefOr[js.Function1[/* repeated */ SchemaLike, Schema]] = js.undefined
  var base: js.UndefOr[Schema] = js.undefined
  /**
    * undocumented options
    */
  var cast: js.UndefOr[Record[String, AnonTo]] = js.undefined
  var coerce: js.UndefOr[CoerceFunction | CoerceObject] = js.undefined
  var flags: js.UndefOr[Record[String, ExtensionFlag]] = js.undefined
  var manifest: js.UndefOr[AnonBuild] = js.undefined
  var messages: js.UndefOr[LanguageMessages | String] = js.undefined
  var modifiers: js.UndefOr[Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]]] = js.undefined
  var overrides: js.UndefOr[Record[String, js.Function1[/* value */ _, Schema]]] = js.undefined
  var prepare: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.undefined
  var properties: js.UndefOr[Record[String, _]] = js.undefined
  var rebuild: js.UndefOr[js.Function1[/* schema */ ExtensionBoundSchema, Unit]] = js.undefined
  var rules: js.UndefOr[Record[String, ExtensionRule with ThisType[SchemaInternals]]] = js.undefined
  var terms: js.UndefOr[Record[String, ExtensionTerm]] = js.undefined
  var `type`: String
  var validate: js.UndefOr[js.Function2[/* value */ js.Any, /* helpers */ CustomHelpers[_], _]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    `type`: String,
    args: /* repeated */ SchemaLike => CallbackTo[Schema] = null,
    base: Schema = null,
    cast: Record[String, AnonTo] = null,
    coerce: CoerceFunction | CoerceObject = null,
    flags: Record[String, ExtensionFlag] = null,
    manifest: AnonBuild = null,
    messages: LanguageMessages | String = null,
    modifiers: Record[String, js.Function2[/* rule */ _, /* enabled */ js.UndefOr[Boolean], _]] = null,
    overrides: Record[String, js.Function1[/* value */ _, Schema]] = null,
    prepare: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CallbackTo[js.Any] = null,
    properties: Record[String, _] = null,
    rebuild: /* schema */ ExtensionBoundSchema => Callback = null,
    rules: Record[String, ExtensionRule with ThisType[SchemaInternals]] = null,
    terms: Record[String, ExtensionTerm] = null,
    validate: (/* value */ js.Any, /* helpers */ CustomHelpers[js.Any]) => CallbackTo[js.Any] = null
  ): Extension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.hapiJoi.mod.SchemaLike) => args(t0).runNow()))
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (cast != null) __obj.updateDynamic("cast")(cast.asInstanceOf[js.Any])
    if (coerce != null) __obj.updateDynamic("coerce")(coerce.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (prepare != null) __obj.updateDynamic("prepare")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* helpers */ typingsJapgolly.hapiJoi.mod.CustomHelpers[js.Any]) => prepare(t0, t1).runNow()))
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (rebuild != null) __obj.updateDynamic("rebuild")(js.Any.fromFunction1((t0: /* schema */ typingsJapgolly.hapiJoi.mod.ExtensionBoundSchema) => rebuild(t0).runNow()))
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (terms != null) __obj.updateDynamic("terms")(terms.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* helpers */ typingsJapgolly.hapiJoi.mod.CustomHelpers[js.Any]) => validate(t0, t1).runNow()))
    __obj.asInstanceOf[Extension]
  }
}

