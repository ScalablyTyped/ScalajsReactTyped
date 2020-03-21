package typingsJapgolly.reactJsonTree.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactJsonTree.mod.JSONTreeProps
import typingsJapgolly.reactJsonTree.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactJsonTree {
  def apply(
    data: js.Array[_] | js.Object,
    collectionLimit: Int | Double = null,
    getItemString: (/* type */ String, /* data */ js.Array[js.Any] | js.Object, /* itemType */ String, /* itemString */ String) => CallbackTo[Element] = null,
    hideRoot: js.UndefOr[Boolean] = js.undefined,
    invertTheme: js.UndefOr[Boolean] = js.undefined,
    isCustomNode: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    keyPath: js.Array[String | Double] = null,
    labelRenderer: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => CallbackTo[Element] = null,
    postprocessValue: /* raw */ String => CallbackTo[Element] = null,
    shouldExpandNode: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[js.Any] | js.Object, /* level */ Double) => CallbackTo[Boolean] = null,
    sortObjectKeys: js.Function | Boolean = null,
    theme: js.Object | String = null,
    valueRenderer: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => CallbackTo[Element] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[JSONTreeProps, default, Unit, JSONTreeProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (collectionLimit != null) __obj.updateDynamic("collectionLimit")(collectionLimit.asInstanceOf[js.Any])
    if (getItemString != null) __obj.updateDynamic("getItemString")(js.Any.fromFunction4((t0: /* type */ java.lang.String, t1: /* data */ js.Array[js.Any] | js.Object, t2: /* itemType */ java.lang.String, t3: /* itemString */ java.lang.String) => getItemString(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(hideRoot)) __obj.updateDynamic("hideRoot")(hideRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(invertTheme)) __obj.updateDynamic("invertTheme")(invertTheme.asInstanceOf[js.Any])
    isCustomNode.foreach(p => __obj.updateDynamic("isCustomNode")(p.toJsFn))
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(js.Any.fromFunction4((t0: /* keyPath */ js.Array[java.lang.String], t1: /* nodeType */ js.UndefOr[java.lang.String], t2: /* expanded */ js.UndefOr[scala.Boolean], t3: /* expandable */ js.UndefOr[scala.Boolean]) => labelRenderer(t0, t1, t2, t3).runNow()))
    if (postprocessValue != null) __obj.updateDynamic("postprocessValue")(js.Any.fromFunction1((t0: /* raw */ java.lang.String) => postprocessValue(t0).runNow()))
    if (shouldExpandNode != null) __obj.updateDynamic("shouldExpandNode")(js.Any.fromFunction3((t0: /* keyPath */ js.Array[java.lang.String | scala.Double], t1: /* data */ js.Array[js.Any] | js.Object, t2: /* level */ scala.Double) => shouldExpandNode(t0, t1, t2).runNow()))
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueRenderer != null) __obj.updateDynamic("valueRenderer")(js.Any.fromFunction3((t0: /* displayValue */ java.lang.String | scala.Double, t1: /* rawValue */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null], t2: /* repeated */ java.lang.String | scala.Double) => valueRenderer(t0, t1, t2).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactJsonTree.mod.JSONTreeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactJsonTree.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactJsonTree.mod.JSONTreeProps])(children: _*)
  }
  @JSImport("react-json-tree", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

