package typingsJapgolly.loaderRunner.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedLoaderContext extends js.Object {
  var async: js.Function0[js.UndefOr[js.Function0[Unit]]] | Null
  var callback: js.Function0[Unit] | Null
  var context: String | Null
  var currentRequest: String
  var data: js.Any
  var loaderIndex: Double
  var loaders: js.Array[Loader]
  var previousRequest: String
  var query: StringDictionary[js.Any] | String
  var remainingRequest: String
  var request: String
  var resource: String
  var resourcePath: js.UndefOr[String] = js.undefined
  var resourceQuery: js.UndefOr[String] = js.undefined
  def addContextDependency(context: String): Unit
  def addDependency(file: String): Unit
  def cacheable(flag: Boolean): Unit
  def clearDependencies(): Unit
  def dependency(file: String): Unit
  def getContextDependencies(): js.Array[String]
  def getDependencies(): js.Array[String]
}

object ExtendedLoaderContext {
  @scala.inline
  def apply(
    addContextDependency: String => Callback,
    addDependency: String => Callback,
    cacheable: Boolean => Callback,
    clearDependencies: Callback,
    currentRequest: String,
    data: js.Any,
    dependency: String => Callback,
    getContextDependencies: CallbackTo[js.Array[String]],
    getDependencies: CallbackTo[js.Array[String]],
    loaderIndex: Double,
    loaders: js.Array[Loader],
    previousRequest: String,
    query: StringDictionary[js.Any] | String,
    remainingRequest: String,
    request: String,
    resource: String,
    async: js.UndefOr[CallbackTo[js.UndefOr[js.Function0[Unit]]]] = js.undefined,
    callback: js.UndefOr[Callback] = js.undefined,
    context: String = null,
    resourcePath: String = null,
    resourceQuery: String = null
  ): ExtendedLoaderContext = {
    val __obj = js.Dynamic.literal(currentRequest = currentRequest.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], loaderIndex = loaderIndex.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], previousRequest = previousRequest.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], remainingRequest = remainingRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("addContextDependency")(js.Any.fromFunction1((t0: java.lang.String) => addContextDependency(t0).runNow()))
    __obj.updateDynamic("addDependency")(js.Any.fromFunction1((t0: java.lang.String) => addDependency(t0).runNow()))
    __obj.updateDynamic("cacheable")(js.Any.fromFunction1((t0: scala.Boolean) => cacheable(t0).runNow()))
    __obj.updateDynamic("clearDependencies")(clearDependencies.toJsFn)
    __obj.updateDynamic("dependency")(js.Any.fromFunction1((t0: java.lang.String) => dependency(t0).runNow()))
    __obj.updateDynamic("getContextDependencies")(getContextDependencies.toJsFn)
    __obj.updateDynamic("getDependencies")(getDependencies.toJsFn)
    async.foreach(p => __obj.updateDynamic("async")(p.toJsFn))
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath.asInstanceOf[js.Any])
    if (resourceQuery != null) __obj.updateDynamic("resourceQuery")(resourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedLoaderContext]
  }
}

