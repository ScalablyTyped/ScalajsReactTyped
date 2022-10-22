package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.libLanguageRuleRuleMod.IOptions
import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("tslint", "ScopeAwareRuleWalker")
@js.native
open class ScopeAwareRuleWalker[T] protected ()
  extends typingsJapgolly.tslint.libLanguageWalkerMod.ScopeAwareRuleWalker[T] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}
