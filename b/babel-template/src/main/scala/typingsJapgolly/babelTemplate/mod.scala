package typingsJapgolly.babelTemplate

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.babylon.mod.BabylonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(code: String): UseTemplate = ^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any]).asInstanceOf[UseTemplate]
  inline def apply(code: String, opts: BabylonOptions): UseTemplate = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[UseTemplate]
  
  @JSImport("babel-template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Node = typingsJapgolly.babelTypes.mod.Node
  
  type UseTemplate = js.Function1[/* nodes */ js.UndefOr[StringDictionary[Node]], Node]
}
