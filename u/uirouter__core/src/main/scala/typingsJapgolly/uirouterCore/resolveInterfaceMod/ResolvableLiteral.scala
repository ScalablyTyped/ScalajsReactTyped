package typingsJapgolly.uirouterCore.resolveInterfaceMod

import typingsJapgolly.uirouterCore.stateInterfaceMod.ResolveTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvableLiteral extends ResolveTypes {
  /** Pre-resolved data. */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * The Dependency Injection tokens
    *
    * This is an array of Dependency Injection tokens for the dependencies of the [[resolveFn]].
    *
    * The DI tokens are references to other `Resolvables`, or to other
    * services from the native DI system.
    */
  var deps: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Defines the Resolve Policy
    *
    * A policy that defines when to invoke the resolve,
    * and whether to wait for async and unwrap the data
    */
  var policy: js.UndefOr[ResolvePolicy] = js.undefined
  /**
    * A function which fetches the Resolvable's data
    *
    * A function which returns one of:
    *
    * - The resolved value (synchronously)
    * - A promise for the resolved value
    * - An Observable of the resolved value(s)
    *
    * This function will be provided the dependencies listed in [[deps]] as its arguments.
    * The resolve system will asynchronously fetch the dependencies before invoking this function.
    */
  var resolveFn: js.Function
  /**
    * A Dependency Injection token
    *
    * This Resolvable's DI token.
    * The Resolvable will be injectable elsewhere using the token.
    */
  var token: js.Any
}

object ResolvableLiteral {
  @scala.inline
  def apply(
    resolveFn: js.Function,
    token: js.Any,
    data: js.Any = null,
    deps: js.Array[_] = null,
    policy: ResolvePolicy = null
  ): ResolvableLiteral = {
    val __obj = js.Dynamic.literal(resolveFn = resolveFn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (deps != null) __obj.updateDynamic("deps")(deps.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvableLiteral]
  }
}

