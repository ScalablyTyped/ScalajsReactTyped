package typingsJapgolly.yandexMaps.mod

import typingsJapgolly.std.GlobalEventHandlersEventMap
import typingsJapgolly.yandexMaps.mod.^
import typingsJapgolly.yandexMaps.mod.geometry.Point
import typingsJapgolly.yandexMaps.yandexMapsStrings.islandsNumbersigngeolocationIcon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Processes geocoding requests. The request result can be provided in JSON format or as a GeoObjectCollection object.
  * @param request The address for which coordinates need to be obtained (forward geocoding), or the coordinates for which the address needs to be determined (reverse geocoding).
  * @param options Options.
  */
inline def geocode(request: String): js.Promise[IGeocodeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: String, options: IGeocodeOptions): js.Promise[IGeocodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: js.Array[Double]): js.Promise[IGeocodeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IGeocodeResult]]
inline def geocode(request: js.Array[Double], options: IGeocodeOptions): js.Promise[IGeocodeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("geocode")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IGeocodeResult]]

inline def ready(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")().asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: js.Function0[Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(
  successCallback: js.Function0[Any | IReadyObject],
  errorCallback: js.Function0[Any],
  context: js.Object
): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: js.Function0[Any | IReadyObject], errorCallback: Unit, context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: js.Function0[Any]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: js.Function0[Any], context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def ready(successCallback: Unit, errorCallback: Unit, context: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("ready")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

/**
  * Processes requests for search suggestions.
  * Returns a promise object that is either rejected with an error,
  * or confirmed by an array of objects in the format { displayName: "Mitishi, Moscow region", value: "Russia, Moscow region, Mitishi " }.
  * The displayName field represents the toponym in a user-friendly way,
  * and the value field represents the value which should be inserted into the search field after the user selects the suggestion.
  * @param request Request string.
  * @param options Options.
  */
inline def suggest(request: String): js.Promise[js.Array[ISuggestResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(request.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ISuggestResult]]]
inline def suggest(request: String, options: ISuggestOptions): js.Promise[js.Array[ISuggestResult]] = (^.asInstanceOf[js.Dynamic].applyDynamic("suggest")(request.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[ISuggestResult]]]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yandexMaps.yandexMapsStrings.clusterNumbersignballoonTwoColumnsItemContent
  - typingsJapgolly.yandexMaps.yandexMapsStrings.clusterNumbersignballoonCarouselItemContent
  - typingsJapgolly.yandexMaps.yandexMapsStrings.clusterNumbersignballoonAccordionItemContent
  - java.lang.String
*/
type ClusterContentLayoutKey = _ClusterContentLayoutKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yandexMaps.yandexMapsStrings.clusterNumbersignballoonTwoColumns
  - typingsJapgolly.yandexMaps.yandexMapsStrings.clusterNumbersignballoonCarousel
  - typingsJapgolly.yandexMaps.yandexMapsStrings.clusterNumbersignballoonAccordion
  - java.lang.String
*/
type ClusterLayoutKey = _ClusterLayoutKey | String

type EventMap = GlobalEventHandlersEventMap

type IChildOnMap = IChild[IControlParent]

type IControl = IChildOnMap

type ICopyrightsAccessor = ICopyrightsProvider

type IDomEventEmitter = IEventEmitter

type IExpandableControlLayout = ILayout

type IGeometryEditorRootModel = IGeometryEditorModel

type IHintManager[T] = IPopupManager[T]

type IMultiRouteReferencePoint = String | js.Array[Double] | Point

type ISearchControlLayout = IExpandableControlLayout

type ISelectableControlLayout = ILayout

//option.presetStorage
//[number, number]
//[[number, number], [number, number]]
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignimage
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignimageWithContent
  - java.lang.String
*/
type IconLayoutKey = _IconLayoutKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignopaque
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersigngeoObject
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignlayer
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersigntransparent
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignsilent
  - java.lang.String
*/
type InteractivityModelKey = _InteractivityModelKey | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignplacemark
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignpin
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersigncircle
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignrectangle
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignpolyline
  - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignpolygon
  - typingsJapgolly.yandexMaps.yandexMapsStrings.hotspotNumbersignplacemark
  - typingsJapgolly.yandexMaps.yandexMapsStrings.hotspotNumbersigncircle
  - typingsJapgolly.yandexMaps.yandexMapsStrings.hotspotNumbersignrectangle
  - typingsJapgolly.yandexMaps.yandexMapsStrings.hotspotNumbersignpolyline
  - typingsJapgolly.yandexMaps.yandexMapsStrings.hotspotNumbersignpolygon
  - typingsJapgolly.yandexMaps.yandexMapsStrings.htmlNumbersignballoon
  - typingsJapgolly.yandexMaps.yandexMapsStrings.htmlNumbersignhint
  - typingsJapgolly.yandexMaps.yandexMapsStrings.htmlNumbersignplacemark
  - typingsJapgolly.yandexMaps.yandexMapsStrings.htmlNumbersignrectangle
  - java.lang.String
  - typingsJapgolly.yandexMaps.mod.IClassConstructor[typingsJapgolly.yandexMaps.mod.IOverlay]
  - js.Function3[
/ * geometry * / typingsJapgolly.yandexMaps.mod.IPixelLineStringGeometry, 
/ * data * / typingsJapgolly.yandexMaps.mod.IDataManager | js.Object, 
/ * options * / js.Object, 
js.Promise[
  java.lang.String | typingsJapgolly.yandexMaps.mod.IClassConstructor[typingsJapgolly.yandexMaps.mod.IOverlay]
]]
*/
type OverlayKey = _OverlayKey | IClassConstructor[IOverlay] | (js.Function3[
/* geometry */ IPixelLineStringGeometry, 
/* data */ IDataManager | js.Object, 
/* options */ js.Object, 
js.Promise[String | IClassConstructor[IOverlay]]]) | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.yandexMaps.mod.PresetWithTextKey
  - typingsJapgolly.yandexMaps.mod.PresetWithTextStretchyKey
  - typingsJapgolly.yandexMaps.mod.PresetDotKey
  - typingsJapgolly.yandexMaps.mod.PresetCircleKey
  - typingsJapgolly.yandexMaps.mod.PresetCircleDotKey
  - typingsJapgolly.yandexMaps.mod.PresetWithIconKey
  - typingsJapgolly.yandexMaps.mod.PresetWithIconCircleKey
  - typingsJapgolly.yandexMaps.mod.PresetPictogramKey
  - typingsJapgolly.yandexMaps.mod.PresetClusterKey
  - java.lang.String
*/
type PresetKey = _PresetKey | PresetPictogramKey | String

type PresetPictogramKey = islandsNumbersigngeolocationIcon
