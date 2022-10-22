package typingsJapgolly.yandexMaps.anon

import typingsJapgolly.yandexMaps.mod.IClassConstructor
import typingsJapgolly.yandexMaps.mod.IGeocodeProvider
import typingsJapgolly.yandexMaps.mod.ILayout
import typingsJapgolly.yandexMaps.mod.ISearchControlLayout
import typingsJapgolly.yandexMaps.yandexMapsStrings.auto
import typingsJapgolly.yandexMaps.yandexMapsStrings.district
import typingsJapgolly.yandexMaps.yandexMapsStrings.house
import typingsJapgolly.yandexMaps.yandexMapsStrings.large
import typingsJapgolly.yandexMaps.yandexMapsStrings.latlong
import typingsJapgolly.yandexMaps.yandexMapsStrings.left
import typingsJapgolly.yandexMaps.yandexMapsStrings.locality
import typingsJapgolly.yandexMaps.yandexMapsStrings.longlat
import typingsJapgolly.yandexMaps.yandexMapsStrings.medium
import typingsJapgolly.yandexMaps.yandexMapsStrings.metro
import typingsJapgolly.yandexMaps.yandexMapsStrings.none
import typingsJapgolly.yandexMaps.yandexMapsStrings.right
import typingsJapgolly.yandexMaps.yandexMapsStrings.small
import typingsJapgolly.yandexMaps.yandexMapsStrings.street
import typingsJapgolly.yandexMaps.yandexMapsStrings.yandexNumbersignmap
import typingsJapgolly.yandexMaps.yandexMapsStrings.yandexNumbersignsearch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitMaxWidth extends StObject {
  
  var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
  
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var fitMaxWidth: js.UndefOr[Boolean] = js.undefined
  
  var float: js.UndefOr[none | left | right] = js.undefined
  
  var floatIndex: js.UndefOr[Double] = js.undefined
  
  var formLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var kind: js.UndefOr[house | street | metro | district | locality] = js.undefined
  
  var layout: js.UndefOr[String | IClassConstructor[ISearchControlLayout]] = js.undefined
  
  var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
  
  var noCentering: js.UndefOr[Boolean] = js.undefined
  
  var noPlacemark: js.UndefOr[Boolean] = js.undefined
  
  var noPopup: js.UndefOr[Boolean] = js.undefined
  
  var noSelect: js.UndefOr[Boolean] = js.undefined
  
  var noSuggestPanel: js.UndefOr[Boolean] = js.undefined
  
  var placeholderContent: js.UndefOr[String] = js.undefined
  
  var popupItemLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var popupLayout: js.UndefOr[String | IClassConstructor[ILayout]] = js.undefined
  
  var position: js.UndefOr[Bottom] = js.undefined
  
  var provider: js.UndefOr[IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch] = js.undefined
  
  var searchCoordOrder: js.UndefOr[latlong | longlat] = js.undefined
  
  var size: js.UndefOr[auto | small | medium | large] = js.undefined
  
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  
  var suppressYandexSearch: js.UndefOr[Boolean] = js.undefined
  
  var useMapBounds: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var zoomMargin: js.UndefOr[Double] = js.undefined
}
object FitMaxWidth {
  
  inline def apply(): FitMaxWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitMaxWidth]
  }
  
  extension [Self <: FitMaxWidth](x: Self) {
    
    inline def setAdjustMapMargin(value: Boolean): Self = StObject.set(x, "adjustMapMargin", value.asInstanceOf[js.Any])
    
    inline def setAdjustMapMarginUndefined: Self = StObject.set(x, "adjustMapMargin", js.undefined)
    
    inline def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    inline def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    inline def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value*))
    
    inline def setFitMaxWidth(value: Boolean): Self = StObject.set(x, "fitMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setFitMaxWidthUndefined: Self = StObject.set(x, "fitMaxWidth", js.undefined)
    
    inline def setFloat(value: none | left | right): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setFloatIndex(value: Double): Self = StObject.set(x, "floatIndex", value.asInstanceOf[js.Any])
    
    inline def setFloatIndexUndefined: Self = StObject.set(x, "floatIndex", js.undefined)
    
    inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
    
    inline def setFormLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "formLayout", value.asInstanceOf[js.Any])
    
    inline def setFormLayoutUndefined: Self = StObject.set(x, "formLayout", js.undefined)
    
    inline def setKind(value: house | street | metro | district | locality): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayout(value: String | IClassConstructor[ISearchControlLayout]): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxWidth(value: (js.Array[js.Array[Double] | Double]) | Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaxWidthVarargs(value: (js.Array[Double] | Double)*): Self = StObject.set(x, "maxWidth", js.Array(value*))
    
    inline def setNoCentering(value: Boolean): Self = StObject.set(x, "noCentering", value.asInstanceOf[js.Any])
    
    inline def setNoCenteringUndefined: Self = StObject.set(x, "noCentering", js.undefined)
    
    inline def setNoPlacemark(value: Boolean): Self = StObject.set(x, "noPlacemark", value.asInstanceOf[js.Any])
    
    inline def setNoPlacemarkUndefined: Self = StObject.set(x, "noPlacemark", js.undefined)
    
    inline def setNoPopup(value: Boolean): Self = StObject.set(x, "noPopup", value.asInstanceOf[js.Any])
    
    inline def setNoPopupUndefined: Self = StObject.set(x, "noPopup", js.undefined)
    
    inline def setNoSelect(value: Boolean): Self = StObject.set(x, "noSelect", value.asInstanceOf[js.Any])
    
    inline def setNoSelectUndefined: Self = StObject.set(x, "noSelect", js.undefined)
    
    inline def setNoSuggestPanel(value: Boolean): Self = StObject.set(x, "noSuggestPanel", value.asInstanceOf[js.Any])
    
    inline def setNoSuggestPanelUndefined: Self = StObject.set(x, "noSuggestPanel", js.undefined)
    
    inline def setPlaceholderContent(value: String): Self = StObject.set(x, "placeholderContent", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderContentUndefined: Self = StObject.set(x, "placeholderContent", js.undefined)
    
    inline def setPopupItemLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "popupItemLayout", value.asInstanceOf[js.Any])
    
    inline def setPopupItemLayoutUndefined: Self = StObject.set(x, "popupItemLayout", js.undefined)
    
    inline def setPopupLayout(value: String | IClassConstructor[ILayout]): Self = StObject.set(x, "popupLayout", value.asInstanceOf[js.Any])
    
    inline def setPopupLayoutUndefined: Self = StObject.set(x, "popupLayout", js.undefined)
    
    inline def setPosition(value: Bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setProvider(value: IGeocodeProvider | yandexNumbersignmap | yandexNumbersignsearch): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setSearchCoordOrder(value: latlong | longlat): Self = StObject.set(x, "searchCoordOrder", value.asInstanceOf[js.Any])
    
    inline def setSearchCoordOrderUndefined: Self = StObject.set(x, "searchCoordOrder", js.undefined)
    
    inline def setSize(value: auto | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
    
    inline def setSuppressYandexSearch(value: Boolean): Self = StObject.set(x, "suppressYandexSearch", value.asInstanceOf[js.Any])
    
    inline def setSuppressYandexSearchUndefined: Self = StObject.set(x, "suppressYandexSearch", js.undefined)
    
    inline def setUseMapBounds(value: Boolean): Self = StObject.set(x, "useMapBounds", value.asInstanceOf[js.Any])
    
    inline def setUseMapBoundsUndefined: Self = StObject.set(x, "useMapBounds", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setZoomMargin(value: Double): Self = StObject.set(x, "zoomMargin", value.asInstanceOf[js.Any])
    
    inline def setZoomMarginUndefined: Self = StObject.set(x, "zoomMargin", js.undefined)
  }
}
