package typingsJapgolly.vegaLite.buildSrcChanneldefMod

import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcTypeMod.StandardType
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringFieldDef[F /* <: Field */]
  extends StObject
     with TypedFieldDef[F, StandardType, Boolean | BinParams | binned | Null]
     with FormatMixins
object StringFieldDef {
  
  inline def apply[F /* <: Field */](): StringFieldDef[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFieldDef[F]]
  }
}
