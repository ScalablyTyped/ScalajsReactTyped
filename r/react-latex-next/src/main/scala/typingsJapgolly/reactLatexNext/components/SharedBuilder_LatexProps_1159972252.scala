package typingsJapgolly.reactLatexNext.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactLatexNext.distRenderLatexMod.Macros
import typingsJapgolly.reactLatexNext.distTypesMod.Delimiter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_LatexProps_1159972252[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def delimiters(value: js.Array[Delimiter]): this.type = set("delimiters", value.asInstanceOf[js.Any])
  
  inline def delimitersVarargs(value: Delimiter*): this.type = set("delimiters", js.Array(value*))
  
  inline def macros(value: Macros): this.type = set("macros", value.asInstanceOf[js.Any])
  
  inline def strict(value: Boolean): this.type = set("strict", value.asInstanceOf[js.Any])
}
