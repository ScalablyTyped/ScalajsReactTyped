package typingsJapgolly.baseui

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.baseui.baseuiNumbers.`7`
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Array<react.react.ReactNode>> */
trait ReadonlyArrayReactNode extends js.Object {
  val concat: js.Function1[/* repeated */ js.Array[Node], js.Array[Node]]
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type]
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, Node]]]
  val every: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], _], 
    Boolean
  ]
  val fill: js.Function1[/* value */ Node, this.type]
  val filter: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ Node, 
      /* index */ Double, 
      /* array */ js.Array[Node], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.Array[Node]
  ]
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Node, 
      /* index */ Double, 
      /* obj */ js.Array[Node], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.UndefOr[Node]
  ]
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ Node, /* index */ Double, /* obj */ js.Array[Node], _], 
    Double
  ]
  val flat: js.ThisFunction1[
    /* this */ js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[_]]]]]]]], 
    `7`, 
    js.Array[_]
  ]
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ Node, 
      /* index */ Double, 
      /* array */ js.Array[Node], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ]
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], Unit], 
    Unit
  ]
  val includes: js.Function1[/* searchElement */ Node, Boolean]
  val indexOf: js.Function1[/* searchElement */ Node, Double]
  val join: js.Function0[String]
  val keys: js.Function0[IterableIterator[Double]]
  val lastIndexOf: js.Function1[/* searchElement */ Node, Double]
  val length: Double
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], _], 
    js.Array[_]
  ]
  val pop: js.Function0[js.UndefOr[Node]]
  val push: js.Function1[/* repeated */ Node, Double]
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Node, 
      /* currentValue */ Node, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Node], 
      Node
    ], 
    Node
  ]
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ Node, 
      /* currentValue */ Node, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Node], 
      Node
    ], 
    Node
  ]
  val reverse: js.Function0[js.Array[Node]]
  val shift: js.Function0[js.UndefOr[Node]]
  val slice: js.Function0[js.Array[Node]]
  val some: js.Function1[
    /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], _], 
    Boolean
  ]
  val sort: js.Function0[this.type]
  val splice: js.Function1[/* start */ Double, js.Array[Node]]
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArrayReactNode: js.Function0[String]
  @JSName("toString")
  val toString_FReadonlyArrayReactNode: js.Function0[String]
  val unshift: js.Function1[/* repeated */ Node, Double]
  val values: js.Function0[IterableIterator[Node]]
}

object ReadonlyArrayReactNode {
  @scala.inline
  def apply(
    concat: /* repeated */ js.Array[Node] => CallbackTo[js.Array[Node]],
    copyWithin: (/* target */ Double, /* start */ Double) => CallbackTo[ReadonlyArrayReactNode],
    entries: CallbackTo[IterableIterator[js.Tuple2[Double, Node]]],
    every: /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], js.Any] => CallbackTo[Boolean],
    fill: /* value */ Node => CallbackTo[ReadonlyArrayReactNode],
    filter: /* callbackfn */ js.Function3[
      /* value */ Node, 
      /* index */ Double, 
      /* array */ js.Array[Node], 
      /* is react.react.ReactNode */ Boolean
    ] => CallbackTo[js.Array[Node]],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ Node, 
      /* index */ Double, 
      /* obj */ js.Array[Node], 
      /* is react.react.ReactNode */ Boolean
    ] => CallbackTo[js.UndefOr[Node]],
    findIndex: /* predicate */ js.Function3[/* value */ Node, /* index */ Double, /* obj */ js.Array[Node], js.Any] => CallbackTo[Double],
    flat: js.ThisFunction1[
      /* this */ js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[_]]]]]]]], 
      `7`, 
      js.Array[_]
    ],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ Node, 
      /* index */ Double, 
      /* array */ js.Array[Node], 
      js.Any | js.Array[js.Any]
    ] => CallbackTo[js.Array[js.Any]],
    forEach: /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], Unit] => Callback,
    includes: /* searchElement */ Node => CallbackTo[Boolean],
    indexOf: /* searchElement */ Node => CallbackTo[Double],
    join: CallbackTo[String],
    keys: CallbackTo[IterableIterator[Double]],
    lastIndexOf: /* searchElement */ Node => CallbackTo[Double],
    length: Double,
    map: /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], js.Any] => CallbackTo[js.Array[js.Any]],
    pop: CallbackTo[js.UndefOr[Node]],
    push: /* repeated */ Node => CallbackTo[Double],
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ Node, 
      /* currentValue */ Node, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Node], 
      Node
    ] => CallbackTo[Node],
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ Node, 
      /* currentValue */ Node, 
      /* currentIndex */ Double, 
      /* array */ js.Array[Node], 
      Node
    ] => CallbackTo[Node],
    reverse: CallbackTo[js.Array[Node]],
    shift: CallbackTo[js.UndefOr[Node]],
    slice: CallbackTo[js.Array[Node]],
    some: /* callbackfn */ js.Function3[/* value */ Node, /* index */ Double, /* array */ js.Array[Node], js.Any] => CallbackTo[Boolean],
    sort: CallbackTo[ReadonlyArrayReactNode],
    splice: /* start */ Double => CallbackTo[js.Array[Node]],
    toLocaleString: CallbackTo[String],
    toString: CallbackTo[String],
    unshift: /* repeated */ Node => CallbackTo[Double],
    values: CallbackTo[IterableIterator[Node]]
  ): ReadonlyArrayReactNode = {
    val __obj = js.Dynamic.literal(flat = flat.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("concat")(js.Any.fromFunction1((t0: /* repeated */ js.Array[japgolly.scalajs.react.raw.React.Node]) => concat(t0).runNow()))
    __obj.updateDynamic("copyWithin")(js.Any.fromFunction2((t0: /* target */ scala.Double, t1: /* start */ scala.Double) => copyWithin(t0, t1).runNow()))
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("every")(js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  js.Any]) => every(t0).runNow()))
    __obj.updateDynamic("fill")(js.Any.fromFunction1((t0: /* value */ japgolly.scalajs.react.raw.React.Node) => fill(t0).runNow()))
    __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  /* is react.react.ReactNode */ scala.Boolean]) => filter(t0).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: /* predicate */ js.ThisFunction3[
  /* this */ scala.Unit, 
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* obj */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  /* is react.react.ReactNode */ scala.Boolean]) => find(t0).runNow()))
    __obj.updateDynamic("findIndex")(js.Any.fromFunction1((t0: /* predicate */ js.Function3[
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* obj */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  js.Any]) => findIndex(t0).runNow()))
    __obj.updateDynamic("flatMap")(js.Any.fromFunction1((t0: /* callback */ js.ThisFunction3[
  /* this */ js.UndefOr[scala.Nothing], 
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  js.Any | js.Array[js.Any]]) => flatMap(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("includes")(js.Any.fromFunction1((t0: /* searchElement */ japgolly.scalajs.react.raw.React.Node) => includes(t0).runNow()))
    __obj.updateDynamic("indexOf")(js.Any.fromFunction1((t0: /* searchElement */ japgolly.scalajs.react.raw.React.Node) => indexOf(t0).runNow()))
    __obj.updateDynamic("join")(join.toJsFn)
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("lastIndexOf")(js.Any.fromFunction1((t0: /* searchElement */ japgolly.scalajs.react.raw.React.Node) => lastIndexOf(t0).runNow()))
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  js.Any]) => map(t0).runNow()))
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* repeated */ japgolly.scalajs.react.raw.React.Node) => push(t0).runNow()))
    __obj.updateDynamic("reduce")(js.Any.fromFunction1((t0: /* callbackfn */ js.Function4[
  /* previousValue */ japgolly.scalajs.react.raw.React.Node, 
  /* currentValue */ japgolly.scalajs.react.raw.React.Node, 
  /* currentIndex */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  japgolly.scalajs.react.raw.React.Node]) => reduce(t0).runNow()))
    __obj.updateDynamic("reduceRight")(js.Any.fromFunction1((t0: /* callbackfn */ js.Function4[
  /* previousValue */ japgolly.scalajs.react.raw.React.Node, 
  /* currentValue */ japgolly.scalajs.react.raw.React.Node, 
  /* currentIndex */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  japgolly.scalajs.react.raw.React.Node]) => reduceRight(t0).runNow()))
    __obj.updateDynamic("reverse")(reverse.toJsFn)
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.updateDynamic("slice")(slice.toJsFn)
    __obj.updateDynamic("some")(js.Any.fromFunction1((t0: /* callbackfn */ js.Function3[
  /* value */ japgolly.scalajs.react.raw.React.Node, 
  /* index */ scala.Double, 
  /* array */ js.Array[japgolly.scalajs.react.raw.React.Node], 
  js.Any]) => some(t0).runNow()))
    __obj.updateDynamic("sort")(sort.toJsFn)
    __obj.updateDynamic("splice")(js.Any.fromFunction1((t0: /* start */ scala.Double) => splice(t0).runNow()))
    __obj.updateDynamic("toLocaleString")(toLocaleString.toJsFn)
    __obj.updateDynamic("toString")(toString.toJsFn)
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: /* repeated */ japgolly.scalajs.react.raw.React.Node) => unshift(t0).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[ReadonlyArrayReactNode]
  }
}

