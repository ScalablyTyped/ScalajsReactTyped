package typingsJapgolly.angularFormly.AngularFormly

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object which has at least two properties called expression and listener. The watch.expression
	 * is added to the formly-form directive's scope (to allow it to run even when hide is true). You
	 * can specify a type ($watchCollection or $watchGroup) via the watcher.type property (defaults to
	 * $watch) and whether you want it to be a deep watch via the watcher.deep property (defaults to false).
	 *
	 * see http://docs.angular-formly.com/docs/field-configuration-object#watcher-objectarray-of-watches
	 */
trait IWatcher extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
   //Defaults to false
  var expression: js.UndefOr[
    String | (js.Function2[/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope, Boolean])
  ] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  def listener(
    field: IFieldRuntimeObject,
    newValue: js.Any,
    oldValue: js.Any,
    scope: ITemplateScope,
    stopWatching: js.Function
  ): Unit
}

object IWatcher {
  @scala.inline
  def apply(
    listener: (IFieldRuntimeObject, js.Any, js.Any, ITemplateScope, js.Function) => Callback,
    deep: js.UndefOr[Boolean] = js.undefined,
    expression: String | (js.Function2[/* field */ IFieldRuntimeObject, /* scope */ ITemplateScope, Boolean]) = null,
    `type`: String = null
  ): IWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("listener")(js.Any.fromFunction5((t0: typingsJapgolly.angularFormly.AngularFormly.IFieldRuntimeObject, t1: js.Any, t2: js.Any, t3: typingsJapgolly.angularFormly.AngularFormly.ITemplateScope, t4: js.Function) => listener(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWatcher]
  }
}

