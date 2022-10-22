package typingsJapgolly.ajvKeywords

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ajv.distTypesMod.MacroKeywordDefinition
import typingsJapgolly.ajvKeywords.distDefinitionsTypesMod.GetDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDefinitionsAnyRequiredMod extends Shortcut {
  
  @JSImport("ajv-keywords/dist/definitions/anyRequired", JSImport.Default)
  @js.native
  val default: GetDefinition[MacroKeywordDefinition] = js.native
  
  type _To = GetDefinition[MacroKeywordDefinition]
  
  /* This means you don't have to write `default`, but can instead just say `distDefinitionsAnyRequiredMod.foo` */
  override def _to: GetDefinition[MacroKeywordDefinition] = default
}
