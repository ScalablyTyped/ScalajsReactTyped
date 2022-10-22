package typingsJapgolly.vegaLite.buildSrcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DataSourceType extends StObject
@JSImport("vega-lite/build/src/data", "DataSourceType")
@js.native
object DataSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataSourceType & Double] = js.native
  
  @js.native
  sealed trait Column
    extends StObject
       with DataSourceType
  /* 3 */ val Column: typingsJapgolly.vegaLite.buildSrcDataMod.DataSourceType.Column & Double = js.native
  
  @js.native
  sealed trait Lookup
    extends StObject
       with DataSourceType
  /* 4 */ val Lookup: typingsJapgolly.vegaLite.buildSrcDataMod.DataSourceType.Lookup & Double = js.native
  
  @js.native
  sealed trait Main
    extends StObject
       with DataSourceType
  /* 1 */ val Main: typingsJapgolly.vegaLite.buildSrcDataMod.DataSourceType.Main & Double = js.native
  
  @js.native
  sealed trait Raw
    extends StObject
       with DataSourceType
  /* 0 */ val Raw: typingsJapgolly.vegaLite.buildSrcDataMod.DataSourceType.Raw & Double = js.native
  
  @js.native
  sealed trait Row
    extends StObject
       with DataSourceType
  /* 2 */ val Row: typingsJapgolly.vegaLite.buildSrcDataMod.DataSourceType.Row & Double = js.native
}
