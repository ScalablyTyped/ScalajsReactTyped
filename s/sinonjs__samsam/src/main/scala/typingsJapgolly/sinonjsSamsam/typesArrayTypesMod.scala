package typingsJapgolly.sinonjsSamsam

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.std.ArrayConstructor
import typingsJapgolly.std.Int8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesArrayTypesMod extends Shortcut {
  
  @JSImport("@sinonjs/samsam/types/array-types", JSImport.Namespace)
  @js.native
  val ^ : js.Array[ArrayConstructor | Int8ArrayConstructor] = js.native
  
  type _To = js.Array[ArrayConstructor | Int8ArrayConstructor]
  
  /* This means you don't have to write `^`, but can instead just say `typesArrayTypesMod.foo` */
  override def _to: js.Array[ArrayConstructor | Int8ArrayConstructor] = ^
}
