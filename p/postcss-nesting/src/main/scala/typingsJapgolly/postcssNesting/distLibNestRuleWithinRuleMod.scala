package typingsJapgolly.postcssNesting

import typingsJapgolly.postcss.mod.AtRule_
import typingsJapgolly.postcss.mod.Rule_
import typingsJapgolly.postcssNesting.distLibOptionsMod.options
import typingsJapgolly.postcssNesting.distLibWalkFuncMod.walkFunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibNestRuleWithinRuleMod {
  
  @JSImport("postcss-nesting/dist/lib/nest-rule-within-rule", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(node: AtRule_, parent: Rule_, walk: walkFunc, opts: options): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], walk.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isValidNestRuleWithinRule(node: AtRule_): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidNestRuleWithinRule")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
