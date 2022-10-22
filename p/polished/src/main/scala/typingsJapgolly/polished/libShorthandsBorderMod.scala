package typingsJapgolly.polished

import typingsJapgolly.polished.libTypesSideKeywordMod.SideKeyword
import typingsJapgolly.polished.libTypesStyleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShorthandsBorderMod {
  
  @JSImport("polished/lib/shorthands/border", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sideKeyword: String, values: (String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(sideKeyword.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  inline def default(sideKeyword: Double, values: (String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(sideKeyword.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
  inline def default(sideKeyword: SideKeyword, values: (String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(sideKeyword.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
}
