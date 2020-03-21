package typingsJapgolly.phaser.Phaser.Types.Scenes

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSceneFromObjectConfig extends js.Object {
  /**
    * The scene's create callback.
    */
  var create: js.UndefOr[SceneCreateCallback] = js.undefined
  /**
    * Any additional properties, which will be copied to the Scene after it's created (except `data` or `sys`).
    */
  var extend: js.UndefOr[js.Any] = js.undefined
  /**
    * Any values, which will be merged into the Scene's Data Manager store.
    */
  @JSName("extend.data")
  var extendDotdata: js.UndefOr[js.Any] = js.undefined
  /**
    * The scene's init callback.
    */
  var init: js.UndefOr[SceneInitCallback] = js.undefined
  /**
    * The scene's preload callback.
    */
  var preload: js.UndefOr[ScenePreloadCallback] = js.undefined
  /**
    * The scene's update callback. See {@link Phaser.Scene#update}.
    */
  var update: js.UndefOr[js.Function] = js.undefined
}

object CreateSceneFromObjectConfig {
  @scala.inline
  def apply(
    create: /* data */ js.Object => Callback = null,
    extend: js.Any = null,
    extendDotdata: js.Any = null,
    init: /* data */ js.Object => Callback = null,
    preload: js.UndefOr[Callback] = js.undefined,
    update: js.Function = null
  ): CreateSceneFromObjectConfig = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* data */ js.Object) => create(t0).runNow()))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (extendDotdata != null) __obj.updateDynamic("extend.data")(extendDotdata.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1((t0: /* data */ js.Object) => init(t0).runNow()))
    preload.foreach(p => __obj.updateDynamic("preload")(p.toJsFn))
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSceneFromObjectConfig]
  }
}

