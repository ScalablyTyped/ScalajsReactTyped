package typingsJapgolly.stylelint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.stylelint.stylelintStrings.json
    - typingsJapgolly.stylelint.stylelintStrings.string
    - typingsJapgolly.stylelint.stylelintStrings.verbose
    - typingsJapgolly.stylelint.stylelintStrings.compact
    - typingsJapgolly.stylelint.stylelintStrings.unix
    - js.Function1[/ * results * / js.Array[typingsJapgolly.stylelint.mod.LintResult], java.lang.String]
  */
  type FormatterType = typingsJapgolly.stylelint.mod._FormatterType | (js.Function1[/* results */ js.Array[typingsJapgolly.stylelint.mod.LintResult], java.lang.String])
  type Plugin = js.Function2[
    /* primaryOption */ js.Any, 
    /* secondaryOptions */ js.UndefOr[js.Object], 
    js.Function2[
      /* root */ typingsJapgolly.postcss.mod.Root_, 
      /* result */ typingsJapgolly.postcss.mod.Result, 
      scala.Unit | js.Thenable[scala.Unit]
    ]
  ]
  type RuleMessageValue = java.lang.String | (js.Function1[/* repeated */ js.Any, java.lang.String])
}
