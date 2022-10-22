package typingsJapgolly.vegaLite.anon

import typingsJapgolly.vegaLite.buildSrcBinMod.BinParams
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.SecondaryFieldDef
import typingsJapgolly.vegaLite.buildSrcChanneldefMod.TypedFieldDef
import typingsJapgolly.vegaLite.buildSrcVegaDotschemaMod.VgValueRef
import typingsJapgolly.vegaLite.vegaLiteStrings.binned
import typingsJapgolly.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOrDatumDef2 extends StObject {
  
  var bandPosition: Double | SignalRef
  
  var fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  
  var fieldOrDatumDef2: js.UndefOr[SecondaryFieldDef[String]] = js.undefined
  
  var offset: Double | SignalRef | VgValueRef
  
  var scaleName: String
  
  var startSuffix: js.UndefOr[String] = js.undefined
}
object FieldOrDatumDef2 {
  
  inline def apply(
    bandPosition: Double | SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    offset: Double | SignalRef | VgValueRef,
    scaleName: String
  ): FieldOrDatumDef2 = {
    val __obj = js.Dynamic.literal(bandPosition = bandPosition.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], scaleName = scaleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrDatumDef2]
  }
  
  extension [Self <: FieldOrDatumDef2](x: Self) {
    
    inline def setBandPosition(value: Double | SignalRef): Self = StObject.set(x, "bandPosition", value.asInstanceOf[js.Any])
    
    inline def setFieldOrDatumDef(value: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    inline def setFieldOrDatumDef2(value: SecondaryFieldDef[String]): Self = StObject.set(x, "fieldOrDatumDef2", value.asInstanceOf[js.Any])
    
    inline def setFieldOrDatumDef2Undefined: Self = StObject.set(x, "fieldOrDatumDef2", js.undefined)
    
    inline def setOffset(value: Double | SignalRef | VgValueRef): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setScaleName(value: String): Self = StObject.set(x, "scaleName", value.asInstanceOf[js.Any])
    
    inline def setStartSuffix(value: String): Self = StObject.set(x, "startSuffix", value.asInstanceOf[js.Any])
    
    inline def setStartSuffixUndefined: Self = StObject.set(x, "startSuffix", js.undefined)
  }
}
