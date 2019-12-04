package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlatformReflectionCapabilities extends js.Object {
  /**
    * Return a list of annotations declared on the class
    */
  def annotations(`type`: Type[_]): js.Array[_]
  def factory(`type`: Type[_]): js.Function
  def getter(name: String): ɵGetterFn
  def guards(`type`: js.Any): StringDictionary[js.Any]
  def hasLifecycleHook(`type`: js.Any, lcProperty: String): Boolean
  def importUri(`type`: Type[_]): String
  def isReflectionEnabled(): Boolean
  def method(name: String): ɵMethodFn
  /**
    * Return a list of annotations/types for constructor parameters
    */
  def parameters(`type`: Type[_]): js.Array[js.Array[_]]
  /**
    * Return a object literal which describes the annotations on Class fields/properties.
    */
  def propMetadata(typeOrFunc: Type[_]): StringDictionary[js.Array[_]]
  def resolveEnum(enumIdentifier: js.Any, name: String): js.Any
  def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: js.Any): js.Any
  def resourceUri(`type`: Type[_]): String
  def setter(name: String): ɵSetterFn
}

object PlatformReflectionCapabilities {
  @scala.inline
  def apply(
    annotations: Type[js.Any] => CallbackTo[js.Array[js.Any]],
    factory: Type[js.Any] => CallbackTo[js.Function],
    getter: String => CallbackTo[ɵGetterFn],
    guards: js.Any => CallbackTo[StringDictionary[js.Any]],
    hasLifecycleHook: (js.Any, String) => CallbackTo[Boolean],
    importUri: Type[js.Any] => CallbackTo[String],
    isReflectionEnabled: CallbackTo[Boolean],
    method: String => CallbackTo[ɵMethodFn],
    parameters: Type[js.Any] => CallbackTo[js.Array[js.Array[js.Any]]],
    propMetadata: Type[js.Any] => CallbackTo[StringDictionary[js.Array[js.Any]]],
    resolveEnum: (js.Any, String) => CallbackTo[js.Any],
    resolveIdentifier: (String, String, js.Array[String], js.Any) => CallbackTo[js.Any],
    resourceUri: Type[js.Any] => CallbackTo[String],
    setter: String => CallbackTo[ɵSetterFn]
  ): PlatformReflectionCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotations")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.Type[js.Any]) => annotations(t0).runNow()))
    __obj.updateDynamic("factory")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.Type[js.Any]) => factory(t0).runNow()))
    __obj.updateDynamic("getter")(js.Any.fromFunction1((t0: java.lang.String) => getter(t0).runNow()))
    __obj.updateDynamic("guards")(js.Any.fromFunction1((t0: js.Any) => guards(t0).runNow()))
    __obj.updateDynamic("hasLifecycleHook")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => hasLifecycleHook(t0, t1).runNow()))
    __obj.updateDynamic("importUri")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.Type[js.Any]) => importUri(t0).runNow()))
    __obj.updateDynamic("isReflectionEnabled")(isReflectionEnabled.toJsFn)
    __obj.updateDynamic("method")(js.Any.fromFunction1((t0: java.lang.String) => method(t0).runNow()))
    __obj.updateDynamic("parameters")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.Type[js.Any]) => parameters(t0).runNow()))
    __obj.updateDynamic("propMetadata")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.Type[js.Any]) => propMetadata(t0).runNow()))
    __obj.updateDynamic("resolveEnum")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => resolveEnum(t0, t1).runNow()))
    __obj.updateDynamic("resolveIdentifier")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: js.Array[java.lang.String], t3: js.Any) => resolveIdentifier(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("resourceUri")(js.Any.fromFunction1((t0: typingsJapgolly.atAngularCore.atAngularCoreMod.Type[js.Any]) => resourceUri(t0).runNow()))
    __obj.updateDynamic("setter")(js.Any.fromFunction1((t0: java.lang.String) => setter(t0).runNow()))
    __obj.asInstanceOf[PlatformReflectionCapabilities]
  }
}

