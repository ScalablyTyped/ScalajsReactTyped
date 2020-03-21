package typingsJapgolly.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  type Rule[S /* <: typingsJapgolly.markdownIt.stateCoreMod.^ */] = js.Function2[/* state */ S, /* silent */ js.UndefOr[scala.Boolean], scala.Boolean | scala.Unit]
  type RuleBlock = typingsJapgolly.markdownIt.libMod.Rule[typingsJapgolly.markdownIt.stateBlockMod.^]
  type RuleInline = typingsJapgolly.markdownIt.libMod.Rule[typingsJapgolly.markdownIt.stateInlineMod.^]
  type RulerBlock = typingsJapgolly.markdownIt.rulerMod.Ruler[typingsJapgolly.markdownIt.stateBlockMod.^]
  type RulerInline = typingsJapgolly.markdownIt.rulerMod.Ruler[typingsJapgolly.markdownIt.stateInlineMod.^]
  type TokenRender = js.Function5[
    /* tokens */ js.Array[typingsJapgolly.markdownIt.tokenMod.^], 
    /* index */ scala.Double, 
    /* options */ js.Any, 
    /* env */ js.Any, 
    /* self */ typingsJapgolly.markdownIt.rendererMod.^, 
    java.lang.String
  ]
}
