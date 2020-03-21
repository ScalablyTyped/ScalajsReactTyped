package typingsJapgolly.egg.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoot extends js.Object {
  /**
    * Do some thing before app close
    */
  var beforeClose: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * Config, plugin files have loaded
    */
  var configDidLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Ready to call configDidLoad,
    * Config, plugin files are referred,
    * this is the last chance to modify the config.
    */
  var configWillLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * All files have loaded, start plugin here
    */
  var didLoad: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * Worker is ready, can do some things,
    * don't need to block the app boot
    */
  var didReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * Server is listening
    */
  var serverDidReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
  /**
    * All plugins have started, can do some thing before app ready
    */
  var willReady: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
}

object IBoot {
  @scala.inline
  def apply(
    beforeClose: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    configDidLoad: js.UndefOr[Callback] = js.undefined,
    configWillLoad: js.UndefOr[Callback] = js.undefined,
    didLoad: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    didReady: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    serverDidReady: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined,
    willReady: js.UndefOr[CallbackTo[js.Promise[Unit]]] = js.undefined
  ): IBoot = {
    val __obj = js.Dynamic.literal()
    beforeClose.foreach(p => __obj.updateDynamic("beforeClose")(p.toJsFn))
    configDidLoad.foreach(p => __obj.updateDynamic("configDidLoad")(p.toJsFn))
    configWillLoad.foreach(p => __obj.updateDynamic("configWillLoad")(p.toJsFn))
    didLoad.foreach(p => __obj.updateDynamic("didLoad")(p.toJsFn))
    didReady.foreach(p => __obj.updateDynamic("didReady")(p.toJsFn))
    serverDidReady.foreach(p => __obj.updateDynamic("serverDidReady")(p.toJsFn))
    willReady.foreach(p => __obj.updateDynamic("willReady")(p.toJsFn))
    __obj.asInstanceOf[IBoot]
  }
}

