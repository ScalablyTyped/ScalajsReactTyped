package typingsJapgolly.oracleOraclejet.ojdiagramMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.oracleOraclejet.anon.Opacity
import typingsJapgolly.oracleOraclejet.anon.`6`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.connected
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.disjoint
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdiagram.ojDiagramNodeSettableProperties> */
trait ojDiagramNodeSettablePropertiesLenient
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var categories: js.UndefOr[js.Array[String]] = js.undefined
  
  var descendantsConnectivity: js.UndefOr[connected | disjoint | unknown] = js.undefined
  
  var icon: js.UndefOr[Opacity] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelStyle: js.UndefOr[js.Object | Null] = js.undefined
  
  var overview: js.UndefOr[`6`] = js.undefined
  
  var selectable: js.UndefOr[auto | off] = js.undefined
  
  var shortDesc: js.UndefOr[String] = js.undefined
  
  var showDisclosure: js.UndefOr[on | off] = js.undefined
}
object ojDiagramNodeSettablePropertiesLenient {
  
  inline def apply(): ojDiagramNodeSettablePropertiesLenient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ojDiagramNodeSettablePropertiesLenient]
  }
  
  extension [Self <: ojDiagramNodeSettablePropertiesLenient](x: Self) {
    
    inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDescendantsConnectivity(value: connected | disjoint | unknown): Self = StObject.set(x, "descendantsConnectivity", value.asInstanceOf[js.Any])
    
    inline def setDescendantsConnectivityUndefined: Self = StObject.set(x, "descendantsConnectivity", js.undefined)
    
    inline def setIcon(value: Opacity): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
    
    inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOverview(value: `6`): Self = StObject.set(x, "overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "overview", js.undefined)
    
    inline def setSelectable(value: auto | off): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShortDesc(value: String): Self = StObject.set(x, "shortDesc", value.asInstanceOf[js.Any])
    
    inline def setShortDescUndefined: Self = StObject.set(x, "shortDesc", js.undefined)
    
    inline def setShowDisclosure(value: on | off): Self = StObject.set(x, "showDisclosure", value.asInstanceOf[js.Any])
    
    inline def setShowDisclosureUndefined: Self = StObject.set(x, "showDisclosure", js.undefined)
  }
}
