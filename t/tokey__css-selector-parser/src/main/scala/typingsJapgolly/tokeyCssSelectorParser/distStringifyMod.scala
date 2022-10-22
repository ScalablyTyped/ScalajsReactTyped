package typingsJapgolly.tokeyCssSelectorParser

import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableNthSelectorList
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorList
import typingsJapgolly.tokeyCssSelectorParser.distAstTypesMod.ImmutableSelectorNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStringifyMod {
  
  @JSImport("@tokey/css-selector-parser/dist/stringify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringifySelectorAst(value: ImmutableNthSelectorList | ImmutableSelectorList | ImmutableSelectorNode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifySelectorAst")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
