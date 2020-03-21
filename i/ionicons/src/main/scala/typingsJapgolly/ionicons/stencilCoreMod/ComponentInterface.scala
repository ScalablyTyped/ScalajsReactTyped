package typingsJapgolly.ionicons.stencilCoreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentInterface
  extends /* memberName */ StringDictionary[js.Any] {
  /**
    * The component has loaded and has already rendered.
    *
    * Updating data in this method will cause the
    * component to re-render.
    *
    * componentDidLoad will only be called once.
    */
  var componentDidLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var componentDidRender: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The component has just re-rendered.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the
    * first render.
    */
  var componentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * The component is about to load and it has not
    * rendered yet.
    *
    * This is the best place to make any data updates
    * before the first render.
    *
    * componentWillLoad will only be called once.
    */
  var componentWillLoad: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var componentWillRender: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  /**
    * The component is about to update and re-render.
    *
    * Called multiple times throughout the life of
    * the component as it updates.
    *
    * componentWillUpdate is not called on the first render.
    */
  var componentWillUpdate: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
  var connectedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disconnectedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var render: js.UndefOr[js.Function0[_]] = js.undefined
}

object ComponentInterface {
  @scala.inline
  def apply(
    StringDictionary: /* memberName */ StringDictionary[js.Any] = null,
    componentDidLoad: js.UndefOr[Callback] = js.undefined,
    componentDidRender: js.UndefOr[Callback] = js.undefined,
    componentDidUpdate: js.UndefOr[Callback] = js.undefined,
    componentWillLoad: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    componentWillRender: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    componentWillUpdate: js.UndefOr[CallbackTo[js.Promise[Unit] | Unit]] = js.undefined,
    connectedCallback: js.UndefOr[Callback] = js.undefined,
    disconnectedCallback: js.UndefOr[Callback] = js.undefined,
    render: js.UndefOr[CallbackTo[js.Any]] = js.undefined
  ): ComponentInterface = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    componentDidLoad.foreach(p => __obj.updateDynamic("componentDidLoad")(p.toJsFn))
    componentDidRender.foreach(p => __obj.updateDynamic("componentDidRender")(p.toJsFn))
    componentDidUpdate.foreach(p => __obj.updateDynamic("componentDidUpdate")(p.toJsFn))
    componentWillLoad.foreach(p => __obj.updateDynamic("componentWillLoad")(p.toJsFn))
    componentWillRender.foreach(p => __obj.updateDynamic("componentWillRender")(p.toJsFn))
    componentWillUpdate.foreach(p => __obj.updateDynamic("componentWillUpdate")(p.toJsFn))
    connectedCallback.foreach(p => __obj.updateDynamic("connectedCallback")(p.toJsFn))
    disconnectedCallback.foreach(p => __obj.updateDynamic("disconnectedCallback")(p.toJsFn))
    render.foreach(p => __obj.updateDynamic("render")(p.toJsFn))
    __obj.asInstanceOf[ComponentInterface]
  }
}

