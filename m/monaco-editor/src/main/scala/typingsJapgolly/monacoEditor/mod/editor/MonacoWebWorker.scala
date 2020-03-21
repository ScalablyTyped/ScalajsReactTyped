package typingsJapgolly.monacoEditor.mod.editor

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.monacoEditor.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonacoWebWorker[T] extends js.Object {
  /**
    * Terminate the web worker, thus invalidating the returned proxy.
    */
  def dispose(): Unit
  /**
    * Get a proxy to the arbitrary loaded code.
    */
  def getProxy(): js.Promise[T]
  /**
    * Synchronize (send) the models at `resources` to the web worker,
    * making them available in the monaco.worker.getMirrorModels().
    */
  def withSyncedResources(resources: js.Array[Uri]): js.Promise[T]
}

object MonacoWebWorker {
  @scala.inline
  def apply[T](
    dispose: Callback,
    getProxy: CallbackTo[js.Promise[T]],
    withSyncedResources: js.Array[Uri] => CallbackTo[js.Promise[T]]
  ): MonacoWebWorker[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.updateDynamic("getProxy")(getProxy.toJsFn)
    __obj.updateDynamic("withSyncedResources")(js.Any.fromFunction1((t0: js.Array[typingsJapgolly.monacoEditor.mod.Uri]) => withSyncedResources(t0).runNow()))
    __obj.asInstanceOf[MonacoWebWorker[T]]
  }
}

