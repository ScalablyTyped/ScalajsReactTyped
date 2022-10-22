package typingsJapgolly.std.global

import typingsJapgolly.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DOMMatrix")
@js.native
/* standard dom */
open class DOMMatrix ()
  extends StObject
     with typingsJapgolly.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
object DOMMatrix {
  
  @JSGlobal("DOMMatrix")
  @js.native
  val ^ : js.Any = js.native
  
  /* standard dom */
  inline def fromFloat32Array(array32: js.typedarray.Float32Array): typingsJapgolly.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat32Array")(array32.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.std.DOMMatrix]
  
  /* standard dom */
  inline def fromFloat64Array(array64: js.typedarray.Float64Array): typingsJapgolly.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFloat64Array")(array64.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.std.DOMMatrix]
  
  /* standard dom */
  inline def fromMatrix(): typingsJapgolly.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")().asInstanceOf[typingsJapgolly.std.DOMMatrix]
  inline def fromMatrix(other: DOMMatrixInit): typingsJapgolly.std.DOMMatrix = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMatrix")(other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.std.DOMMatrix]
}
