package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("tslint", "AbstractWalker")
@js.native
open class AbstractWalker[T] protected ()
  extends typingsJapgolly.tslint.libLanguageWalkerMod.AbstractWalker[T] {
  def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
}
