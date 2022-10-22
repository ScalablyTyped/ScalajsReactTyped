package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.typescript.mod.Program
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "ProgramAwareRuleWalker")
@js.native
open class ProgramAwareRuleWalker protected ()
  extends typingsJapgolly.tslint.libLanguageWalkerMod.ProgramAwareRuleWalker {
  def this(sourceFile: SourceFile, options: IOptions, program: Program) = this()
}
