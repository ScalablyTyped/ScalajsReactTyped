package typingsJapgolly.keystonejsKeystone.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.keystonejsKeystone.OmitResolveInputHooksOpti
import typingsJapgolly.keystonejsKeystone.OmitResolveInputHooksOptiAddFieldValidationError
import typingsJapgolly.keystonejsKeystone.OmitResolveInputHooksOptiContext
import typingsJapgolly.keystonejsKeystone.PickResolveInputHooksOpti
import typingsJapgolly.keystonejsKeystone.PickResolveInputHooksOptiAddFieldValidationError
import typingsJapgolly.keystonejsKeystone.PickResolveInputHooksOptiContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{resolveInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError' | 'updatedItem'>): any, validateInput (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem'>): void, beforeChange (opts : std.Omit<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'addFieldValidationError'>): void, afterChange (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'updatedItem' | 'existingItem' | 'originalInput' | 'context' | 'list'>): void, beforeDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void, validateDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list' | 'addFieldValidationError'>): void, afterDelete (opts : std.Pick<@keystonejs/keystone.@keystonejs/keystone.ResolveInputHooksOptions<any>, 'existingItem' | 'context' | 'list'>): void}> */
trait Hooks extends js.Object {
  var afterChange: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOpti, Unit]] = js.undefined
  var afterDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiContext, Unit]] = js.undefined
  var beforeChange: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOpti, Unit]] = js.undefined
  var beforeDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiContext, Unit]] = js.undefined
  var resolveInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiContext, _]] = js.undefined
  var validateDelete: js.UndefOr[js.Function1[/* opts */ PickResolveInputHooksOptiAddFieldValidationError, Unit]] = js.undefined
  var validateInput: js.UndefOr[js.Function1[/* opts */ OmitResolveInputHooksOptiAddFieldValidationError, Unit]] = js.undefined
}

object Hooks {
  @scala.inline
  def apply(
    afterChange: /* opts */ PickResolveInputHooksOpti => Callback = null,
    afterDelete: /* opts */ PickResolveInputHooksOptiContext => Callback = null,
    beforeChange: /* opts */ OmitResolveInputHooksOpti => Callback = null,
    beforeDelete: /* opts */ PickResolveInputHooksOptiContext => Callback = null,
    resolveInput: /* opts */ OmitResolveInputHooksOptiContext => CallbackTo[js.Any] = null,
    validateDelete: /* opts */ PickResolveInputHooksOptiAddFieldValidationError => Callback = null,
    validateInput: /* opts */ OmitResolveInputHooksOptiAddFieldValidationError => Callback = null
  ): Hooks = {
    val __obj = js.Dynamic.literal()
    if (afterChange != null) __obj.updateDynamic("afterChange")(js.Any.fromFunction1((t0: /* opts */ typingsJapgolly.keystonejsKeystone.PickResolveInputHooksOpti) => afterChange(t0).runNow()))
    if (afterDelete != null) __obj.updateDynamic("afterDelete")(js.Any.fromFunction1((t0: /* opts */ typingsJapgolly.keystonejsKeystone.PickResolveInputHooksOptiContext) => afterDelete(t0).runNow()))
    if (beforeChange != null) __obj.updateDynamic("beforeChange")(js.Any.fromFunction1((t0: /* opts */ typingsJapgolly.keystonejsKeystone.OmitResolveInputHooksOpti) => beforeChange(t0).runNow()))
    if (beforeDelete != null) __obj.updateDynamic("beforeDelete")(js.Any.fromFunction1((t0: /* opts */ typingsJapgolly.keystonejsKeystone.PickResolveInputHooksOptiContext) => beforeDelete(t0).runNow()))
    if (resolveInput != null) __obj.updateDynamic("resolveInput")(js.Any.fromFunction1((t0: /* opts */ typingsJapgolly.keystonejsKeystone.OmitResolveInputHooksOptiContext) => resolveInput(t0).runNow()))
    if (validateDelete != null) __obj.updateDynamic("validateDelete")(js.Any.fromFunction1((t0: /* opts */ typingsJapgolly.keystonejsKeystone.PickResolveInputHooksOptiAddFieldValidationError) => validateDelete(t0).runNow()))
    if (validateInput != null) __obj.updateDynamic("validateInput")(js.Any.fromFunction1((t0: /* opts */ typingsJapgolly.keystonejsKeystone.OmitResolveInputHooksOptiAddFieldValidationError) => validateInput(t0).runNow()))
    __obj.asInstanceOf[Hooks]
  }
}

