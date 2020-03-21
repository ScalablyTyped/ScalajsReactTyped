package typingsJapgolly.uirouterCore

import typingsJapgolly.uirouterCore.resolveContextMod.ResolveContext
import typingsJapgolly.uirouterCore.resolveInterfaceMod.ResolvableLiteral
import typingsJapgolly.uirouterCore.resolveInterfaceMod.ResolvePolicy
import typingsJapgolly.uirouterCore.stateObjectMod.StateObject
import typingsJapgolly.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/resolve/resolvable", JSImport.Namespace)
@js.native
object resolvableMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.uirouterCore.stateInterfaceMod.ResolveTypes because Already inherited */ @js.native
  class Resolvable protected () extends ResolvableLiteral {
    /** This constructor creates a Resolvable copy */
    def this(resolvable: Resolvable) = this()
    /** This constructor creates a new Resolvable from the plain old [[ResolvableLiteral]] javascript object */
    def this(resolvable: ResolvableLiteral) = this()
    /**
      * This constructor creates a new `Resolvable`
      *
      * #### Example:
      * ```js
      * var resolvable1 = new Resolvable('mytoken', http => http.get('foo.json').toPromise(), [Http]);
      *
      * var resolvable2 = new Resolvable(UserService, dep => new UserService(dep.data), [SomeDependency]);
      *
      * var resolvable1Clone = new Resolvable(resolvable1);
      * ```
      *
      * @param token The new resolvable's injection token, such as `"userList"` (a string) or `UserService` (a class).
      *              When this token is used during injection, the resolved value will be injected.
      * @param resolveFn The function that returns the resolved value, or a promise for the resolved value
      * @param deps An array of dependencies, which will be injected into the `resolveFn`
      * @param policy the [[ResolvePolicy]] defines when and how the Resolvable is processed
      * @param data Pre-resolved data. If the resolve value is already known, it may be provided here.
      */
    def this(token: js.Any, resolveFn: js.Function) = this()
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_]) = this()
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: ResolvePolicy) = this()
    def this(token: js.Any, resolveFn: js.Function, deps: js.Array[_], policy: ResolvePolicy, data: js.Any) = this()
    @JSName("deps")
    var deps_Resolvable: js.Array[_] = js.native
    @JSName("policy")
    var policy_Resolvable: ResolvePolicy = js.native
    var promise: js.Promise[_] = js.native
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
    /* CompleteClass */
    override var resolveFn: js.Function = js.native
    var resolved: Boolean = js.native
    /**
      * A Dependency Injection token
      *
      * This Resolvable's DI token.
      * The Resolvable will be injectable elsewhere using the token.
      */
    /* CompleteClass */
    override var token: js.Any = js.native
    /**
      * Gets a promise for this Resolvable's data.
      *
      * Fetches the data and returns a promise.
      * Returns the existing promise if it has already been fetched once.
      */
    def get(resolveContext: ResolveContext): js.Promise[_] = js.native
    def get(resolveContext: ResolveContext, trans: Transition): js.Promise[_] = js.native
    def getPolicy(state: StateObject): ResolvePolicy = js.native
    /**
      * Asynchronously resolve this Resolvable's data
      *
      * Given a ResolveContext that this Resolvable is found in:
      * Wait for this Resolvable's dependencies, then invoke this Resolvable's function
      * and update the Resolvable's state
      */
    def resolve(resolveContext: ResolveContext): js.Promise[_] = js.native
    def resolve(resolveContext: ResolveContext, trans: Transition): js.Promise[_] = js.native
  }
  
  var defaultResolvePolicy: ResolvePolicy = js.native
  /* static members */
  @js.native
  object Resolvable extends js.Object {
    def fromData(token: js.Any, data: js.Any): Resolvable = js.native
  }
  
}

