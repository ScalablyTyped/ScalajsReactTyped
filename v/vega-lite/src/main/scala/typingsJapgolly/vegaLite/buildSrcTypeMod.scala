package typingsJapgolly.vegaLite

import typingsJapgolly.vegaLite.vegaLiteStrings.geojson
import typingsJapgolly.vegaLite.vegaLiteStrings.nominal
import typingsJapgolly.vegaLite.vegaLiteStrings.ordinal
import typingsJapgolly.vegaLite.vegaLiteStrings.quantitative
import typingsJapgolly.vegaLite.vegaLiteStrings.temporal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTypeMod {
  
  @JSImport("vega-lite/build/src/type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/type", "GEOJSON")
  @js.native
  val GEOJSON: geojson = js.native
  
  @JSImport("vega-lite/build/src/type", "NOMINAL")
  @js.native
  val NOMINAL: nominal = js.native
  
  @JSImport("vega-lite/build/src/type", "ORDINAL")
  @js.native
  val ORDINAL: ordinal = js.native
  
  @JSImport("vega-lite/build/src/type", "QUANTITATIVE")
  @js.native
  val QUANTITATIVE: quantitative = js.native
  
  @JSImport("vega-lite/build/src/type", "TEMPORAL")
  @js.native
  val TEMPORAL: temporal = js.native
  
  @JSImport("vega-lite/build/src/type", "TYPES")
  @js.native
  val TYPES: js.Array[ordinal | geojson | quantitative | temporal | nominal] = js.native
  
  /* keyof vega-lite.anon.Geojson */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.quantitative
    - typingsJapgolly.vegaLite.vegaLiteStrings.ordinal
    - typingsJapgolly.vegaLite.vegaLiteStrings.temporal
    - typingsJapgolly.vegaLite.vegaLiteStrings.nominal
    - typingsJapgolly.vegaLite.vegaLiteStrings.geojson
  */
  trait Type extends StObject
  object Type {
    
    @JSImport("vega-lite/build/src/type", "Type.geojson")
    @js.native
    val geojson: typingsJapgolly.vegaLite.vegaLiteStrings.geojson = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.nominal")
    @js.native
    val nominal: typingsJapgolly.vegaLite.vegaLiteStrings.nominal = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.ordinal")
    @js.native
    val ordinal: typingsJapgolly.vegaLite.vegaLiteStrings.ordinal = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.quantitative")
    @js.native
    val quantitative: typingsJapgolly.vegaLite.vegaLiteStrings.quantitative = js.native
    
    @JSImport("vega-lite/build/src/type", "Type.temporal")
    @js.native
    val temporal: typingsJapgolly.vegaLite.vegaLiteStrings.temporal = js.native
  }
  
  inline def getFullName(`type`: String): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullName")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]
  inline def getFullName(`type`: Type): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullName")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]
  
  inline def isContinuous(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinuous")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDiscrete(`type`: Type): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isType(t: Any): /* is vega-lite.vega-lite/build/src/type.Type */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isType")(t.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/type.Type */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.vegaLite.vegaLiteStrings.quantitative
    - typingsJapgolly.vegaLite.vegaLiteStrings.ordinal
    - typingsJapgolly.vegaLite.vegaLiteStrings.temporal
    - typingsJapgolly.vegaLite.vegaLiteStrings.nominal
  */
  trait StandardType extends StObject
  object StandardType {
    
    inline def nominal: typingsJapgolly.vegaLite.vegaLiteStrings.nominal = "nominal".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.nominal]
    
    inline def ordinal: typingsJapgolly.vegaLite.vegaLiteStrings.ordinal = "ordinal".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.ordinal]
    
    inline def quantitative: typingsJapgolly.vegaLite.vegaLiteStrings.quantitative = "quantitative".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.quantitative]
    
    inline def temporal: typingsJapgolly.vegaLite.vegaLiteStrings.temporal = "temporal".asInstanceOf[typingsJapgolly.vegaLite.vegaLiteStrings.temporal]
  }
}
