package typingsJapgolly.eslint.mod.Rule

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.estree.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ T in eslint.eslint.Rule.NodeTypes ]:? (node : estree.estree.Node): void} */ trait RuleListener
  extends /* key */ StringDictionary[
      js.UndefOr[
        (js.Function2[(/* codePath */ CodePath) | (/* segment */ CodePathSegment), /* node */ Node, Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ Node, 
          Unit
        ]) | (js.Function1[/* node */ Node, Unit])
      ]
    ] {
  var onCodePathEnd: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.undefined
  var onCodePathSegmentEnd: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.undefined
  var onCodePathSegmentLoop: js.UndefOr[
    js.Function3[
      /* fromSegment */ CodePathSegment, 
      /* toSegment */ CodePathSegment, 
      /* node */ Node, 
      Unit
    ]
  ] = js.undefined
  var onCodePathSegmentStart: js.UndefOr[js.Function2[/* segment */ CodePathSegment, /* node */ Node, Unit]] = js.undefined
  var onCodePathStart: js.UndefOr[js.Function2[/* codePath */ CodePath, /* node */ Node, Unit]] = js.undefined
}

object RuleListener {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[
      js.UndefOr[
        (js.Function2[(/* codePath */ CodePath) | (/* segment */ CodePathSegment), /* node */ Node, Unit]) | (js.Function3[
          /* fromSegment */ CodePathSegment, 
          /* toSegment */ CodePathSegment, 
          /* node */ Node, 
          Unit
        ]) | (js.Function1[/* node */ Node, Unit])
      ]
    ] = null,
    onCodePathEnd: (/* codePath */ CodePath, /* node */ Node) => Callback = null,
    onCodePathSegmentEnd: (/* segment */ CodePathSegment, /* node */ Node) => Callback = null,
    onCodePathSegmentLoop: (/* fromSegment */ CodePathSegment, /* toSegment */ CodePathSegment, /* node */ Node) => Callback = null,
    onCodePathSegmentStart: (/* segment */ CodePathSegment, /* node */ Node) => Callback = null,
    onCodePathStart: (/* codePath */ CodePath, /* node */ Node) => Callback = null
  ): RuleListener = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onCodePathEnd != null) __obj.updateDynamic("onCodePathEnd")(js.Any.fromFunction2((t0: /* codePath */ typingsJapgolly.eslint.mod.Rule.CodePath, t1: /* node */ typingsJapgolly.estree.mod.Node) => onCodePathEnd(t0, t1).runNow()))
    if (onCodePathSegmentEnd != null) __obj.updateDynamic("onCodePathSegmentEnd")(js.Any.fromFunction2((t0: /* segment */ typingsJapgolly.eslint.mod.Rule.CodePathSegment, t1: /* node */ typingsJapgolly.estree.mod.Node) => onCodePathSegmentEnd(t0, t1).runNow()))
    if (onCodePathSegmentLoop != null) __obj.updateDynamic("onCodePathSegmentLoop")(js.Any.fromFunction3((t0: /* fromSegment */ typingsJapgolly.eslint.mod.Rule.CodePathSegment, t1: /* toSegment */ typingsJapgolly.eslint.mod.Rule.CodePathSegment, t2: /* node */ typingsJapgolly.estree.mod.Node) => onCodePathSegmentLoop(t0, t1, t2).runNow()))
    if (onCodePathSegmentStart != null) __obj.updateDynamic("onCodePathSegmentStart")(js.Any.fromFunction2((t0: /* segment */ typingsJapgolly.eslint.mod.Rule.CodePathSegment, t1: /* node */ typingsJapgolly.estree.mod.Node) => onCodePathSegmentStart(t0, t1).runNow()))
    if (onCodePathStart != null) __obj.updateDynamic("onCodePathStart")(js.Any.fromFunction2((t0: /* codePath */ typingsJapgolly.eslint.mod.Rule.CodePath, t1: /* node */ typingsJapgolly.estree.mod.Node) => onCodePathStart(t0, t1).runNow()))
    __obj.asInstanceOf[RuleListener]
  }
}

