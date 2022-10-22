package typingsJapgolly.std.global

import typingsJapgolly.std.VBArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("VBArray")
@js.native
open class VBArray[T] protected ()
  extends StObject
     with typingsJapgolly.std.VBArray[T] {
  /* standard scripthost */
  def this(safeArray: typingsJapgolly.std.SafeArray[T]) = this()
}
object VBArray {
  
  inline def apply: VBArrayConstructor = js.Dynamic.global.selectDynamic("VBArray").asInstanceOf[VBArrayConstructor]
}
