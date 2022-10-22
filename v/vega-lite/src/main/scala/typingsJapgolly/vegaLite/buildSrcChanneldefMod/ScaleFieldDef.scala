package typingsJapgolly.vegaLite.buildSrcChanneldefMod

import typingsJapgolly.vegaLite.buildSrcBinMod.Bin
import typingsJapgolly.vegaLite.buildSrcTypeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleFieldDef[F /* <: Field */, T /* <: Type */, B /* <: Bin */]
  extends StObject
     with SortableFieldDef[F, T, B]
     with ScaleMixins
object ScaleFieldDef {
  
  inline def apply[F /* <: Field */, T /* <: Type */, B /* <: Bin */](): ScaleFieldDef[F, T, B] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleFieldDef[F, T, B]]
  }
}
