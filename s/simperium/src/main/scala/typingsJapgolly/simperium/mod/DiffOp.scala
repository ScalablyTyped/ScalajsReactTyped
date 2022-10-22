package typingsJapgolly.simperium.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.simperium.anon.O[T]
  - typingsJapgolly.simperium.anon.`0`
  - typingsJapgolly.simperium.anon.V[T]
  - typingsJapgolly.simperium.anon.OV
  - typingsJapgolly.simperium.anon.`1`[T]
  - typingsJapgolly.simperium.anon.VJSONDiff[T]
  - typingsJapgolly.simperium.anon.VDMPDiff
*/
trait DiffOp[T] extends StObject
object DiffOp {
  
  inline def `0`(): typingsJapgolly.simperium.anon.`0` = {
    val __obj = js.Dynamic.literal(o = "-")
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.`0`]
  }
  
  inline def `1`[T](
    v: NumberDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: T extends std.Array<infer U> ? simperium.simperium.DiffOp<U> : never */ js.Any
    ]
  ): typingsJapgolly.simperium.anon.`1`[T] = {
    val __obj = js.Dynamic.literal(o = "L", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.`1`[T]]
  }
  
  inline def O[T](v: T): typingsJapgolly.simperium.anon.O[T] = {
    val __obj = js.Dynamic.literal(o = "+", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.O[T]]
  }
  
  inline def OV(v: Double): typingsJapgolly.simperium.anon.OV = {
    val __obj = js.Dynamic.literal(o = "I", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.OV]
  }
  
  inline def V[T](v: T): typingsJapgolly.simperium.anon.V[T] = {
    val __obj = js.Dynamic.literal(o = "r", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.V[T]]
  }
  
  inline def VDMPDiff(v: DMPDiff): typingsJapgolly.simperium.anon.VDMPDiff = {
    val __obj = js.Dynamic.literal(o = "d", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.VDMPDiff]
  }
  
  inline def VJSONDiff[T](v: JSONDiff[T]): typingsJapgolly.simperium.anon.VJSONDiff[T] = {
    val __obj = js.Dynamic.literal(o = "O", v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.simperium.anon.VJSONDiff[T]]
  }
}
