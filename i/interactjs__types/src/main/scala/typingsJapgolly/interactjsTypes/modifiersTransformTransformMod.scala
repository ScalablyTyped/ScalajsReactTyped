package typingsJapgolly.interactjsTypes

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.interactjsTypes.interactjsTypesStrings.noop
import typingsJapgolly.interactjsTypes.modifiersTypesMod.ModifierFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersTransformTransformMod extends Shortcut {
  
  @JSImport("@interactjs/modifiers/transform/transform", JSImport.Default)
  @js.native
  val default: ModifierFunction[Any, Any, noop] = js.native
  
  type _To = ModifierFunction[Any, Any, noop]
  
  /* This means you don't have to write `default`, but can instead just say `modifiersTransformTransformMod.foo` */
  override def _to: ModifierFunction[Any, Any, noop] = default
}
