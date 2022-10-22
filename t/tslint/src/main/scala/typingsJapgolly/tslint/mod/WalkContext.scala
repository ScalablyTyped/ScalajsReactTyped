package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "WalkContext")
@js.native
open class WalkContext[T] protected ()
  extends typingsJapgolly.tslint.libLanguageWalkerMod.WalkContext[T] {
  def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
}
