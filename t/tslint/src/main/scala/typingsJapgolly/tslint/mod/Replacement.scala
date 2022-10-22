package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.libLanguageRuleRuleMod.Fix
import typingsJapgolly.typescript.mod.Node
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "Replacement")
@js.native
open class Replacement protected ()
  extends typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement {
  def this(start: Double, length: Double, text: String) = this()
}
/* static members */
object Replacement {
  
  @JSImport("tslint", "Replacement")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendText(start: Double, text: String): typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("appendText")(start.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement]
  
  inline def applyAll(content: String, replacements: js.Array[typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyAll")(content.asInstanceOf[js.Any], replacements.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def applyFixes(content: String, fixes: js.Array[Fix]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("applyFixes")(content.asInstanceOf[js.Any], fixes.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def deleteFromTo(start: Double, end: Double): typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteFromTo")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement]
  
  inline def deleteText(start: Double, length: Double): typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteText")(start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement]
  
  inline def replaceFromTo(start: Double, end: Double, text: String): typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceFromTo")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement]
  
  inline def replaceNode(node: Node, text: String): typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement]
  inline def replaceNode(node: Node, text: String, sourceFile: SourceFile): typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceNode")(node.asInstanceOf[js.Any], text.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.tslint.libLanguageRuleRuleMod.Replacement]
}
