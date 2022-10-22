package typingsJapgolly.reactWidgets

import typingsJapgolly.reactWidgets.esmAccessorsMod.TextAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmFilterMod {
  
  @JSImport("react-widgets/esm/Filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object presets {
    
    @JSImport("react-widgets/esm/Filter", "presets")
    @js.native
    val ^ : js.Any = js.native
    
    inline def contains(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def eq_(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def startsWith(a: String, b: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startsWith")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  inline def useFilteredData[TDataItem](data: js.Array[TDataItem], filterer: Filter[TDataItem]): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  inline def useFilteredData[TDataItem](data: js.Array[TDataItem], filterer: Filter[TDataItem], searchTerm: String): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  inline def useFilteredData[TDataItem](
    data: js.Array[TDataItem],
    filterer: Filter[TDataItem],
    searchTerm: String,
    textAccessor: TextAccessor
  ): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any], textAccessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  inline def useFilteredData[TDataItem](
    data: js.Array[TDataItem],
    filterer: Filter[TDataItem],
    searchTerm: Unit,
    textAccessor: TextAccessor
  ): js.Array[TDataItem] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredData")(data.asInstanceOf[js.Any], filterer.asInstanceOf[js.Any], searchTerm.asInstanceOf[js.Any], textAccessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[TDataItem]]
  
  type Filter[TDataItem] = Boolean | FilterPreset | FilterFunction[TDataItem] | Null
  
  type FilterFunction[TDataItem] = js.Function3[/* item */ TDataItem, /* searchTerm */ String, /* idx */ js.UndefOr[Double], Boolean]
  
  /* keyof react-widgets.anon.Contains */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.eq
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.contains
    - typingsJapgolly.reactWidgets.reactWidgetsStrings.startsWith
  */
  trait FilterPreset extends StObject
}
