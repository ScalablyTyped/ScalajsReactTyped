package typingsJapgolly.reactJsonTree.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONTreeProps extends Props[JSONTreeComponent] {
  var collectionLimit: js.UndefOr[Double] = js.undefined
  var data: js.Array[_] | js.Object
  var getItemString: js.UndefOr[
    js.Function4[
      /* type */ String, 
      /* data */ js.Array[_] | js.Object, 
      /* itemType */ String, 
      /* itemString */ String, 
      Element
    ]
  ] = js.undefined
  var hideRoot: js.UndefOr[Boolean] = js.undefined
  var invertTheme: js.UndefOr[Boolean] = js.undefined
  var isCustomNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var keyPath: js.UndefOr[js.Array[String | Double]] = js.undefined
  var labelRenderer: js.UndefOr[
    js.Function4[
      /* keyPath */ js.Array[String], 
      /* nodeType */ js.UndefOr[String], 
      /* expanded */ js.UndefOr[Boolean], 
      /* expandable */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.undefined
  var postprocessValue: js.UndefOr[js.Function1[/* raw */ String, Element]] = js.undefined
  var shouldExpandNode: js.UndefOr[
    js.Function3[
      /* keyPath */ js.Array[String | Double], 
      /* data */ js.Array[_] | js.Object, 
      /* level */ Double, 
      Boolean
    ]
  ] = js.undefined
  var sortObjectKeys: js.UndefOr[js.Function | Boolean] = js.undefined
  var theme: js.UndefOr[js.Object | String] = js.undefined
  var valueRenderer: js.UndefOr[
    js.Function3[
      /* displayValue */ String | Double, 
      /* rawValue */ js.UndefOr[String | Double | Boolean | Null], 
      /* repeated */ String | Double, 
      Element
    ]
  ] = js.undefined
}

object JSONTreeProps {
  @scala.inline
  def apply(
    data: js.Array[_] | js.Object,
    children: VdomNode = null,
    collectionLimit: Int | Double = null,
    getItemString: (/* type */ String, /* data */ js.Array[js.Any] | js.Object, /* itemType */ String, /* itemString */ String) => CallbackTo[Element] = null,
    hideRoot: js.UndefOr[Boolean] = js.undefined,
    invertTheme: js.UndefOr[Boolean] = js.undefined,
    isCustomNode: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    key: Key = null,
    keyPath: js.Array[String | Double] = null,
    labelRenderer: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => CallbackTo[Element] = null,
    postprocessValue: /* raw */ String => CallbackTo[Element] = null,
    ref: LegacyRef[JSONTreeComponent] = null,
    shouldExpandNode: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[js.Any] | js.Object, /* level */ Double) => CallbackTo[Boolean] = null,
    sortObjectKeys: js.Function | Boolean = null,
    theme: js.Object | String = null,
    valueRenderer: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => CallbackTo[Element] = null
  ): JSONTreeProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (collectionLimit != null) __obj.updateDynamic("collectionLimit")(collectionLimit.asInstanceOf[js.Any])
    if (getItemString != null) __obj.updateDynamic("getItemString")(js.Any.fromFunction4((t0: /* type */ java.lang.String, t1: /* data */ js.Array[js.Any] | js.Object, t2: /* itemType */ java.lang.String, t3: /* itemString */ java.lang.String) => getItemString(t0, t1, t2, t3).runNow()))
    if (!js.isUndefined(hideRoot)) __obj.updateDynamic("hideRoot")(hideRoot.asInstanceOf[js.Any])
    if (!js.isUndefined(invertTheme)) __obj.updateDynamic("invertTheme")(invertTheme.asInstanceOf[js.Any])
    isCustomNode.foreach(p => __obj.updateDynamic("isCustomNode")(p.toJsFn))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(js.Any.fromFunction4((t0: /* keyPath */ js.Array[java.lang.String], t1: /* nodeType */ js.UndefOr[java.lang.String], t2: /* expanded */ js.UndefOr[scala.Boolean], t3: /* expandable */ js.UndefOr[scala.Boolean]) => labelRenderer(t0, t1, t2, t3).runNow()))
    if (postprocessValue != null) __obj.updateDynamic("postprocessValue")(js.Any.fromFunction1((t0: /* raw */ java.lang.String) => postprocessValue(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (shouldExpandNode != null) __obj.updateDynamic("shouldExpandNode")(js.Any.fromFunction3((t0: /* keyPath */ js.Array[java.lang.String | scala.Double], t1: /* data */ js.Array[js.Any] | js.Object, t2: /* level */ scala.Double) => shouldExpandNode(t0, t1, t2).runNow()))
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueRenderer != null) __obj.updateDynamic("valueRenderer")(js.Any.fromFunction3((t0: /* displayValue */ java.lang.String | scala.Double, t1: /* rawValue */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null], t2: /* repeated */ java.lang.String | scala.Double) => valueRenderer(t0, t1, t2).runNow()))
    __obj.asInstanceOf[JSONTreeProps]
  }
}

