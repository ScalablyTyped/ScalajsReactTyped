package typingsJapgolly.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IChildOnMap = typingsJapgolly.yandexMaps.mod.IChild[typingsJapgolly.yandexMaps.mod.IControlParent]
  type IControl = typingsJapgolly.yandexMaps.mod.IChildOnMap
  type ICopyrightsAccessor = typingsJapgolly.yandexMaps.mod.ICopyrightsProvider
  type IDomEventEmitter = typingsJapgolly.yandexMaps.mod.IEventEmitter
  type IExpandableControlLayout = typingsJapgolly.yandexMaps.mod.ILayout
  type IGeometryEditorRootModel = typingsJapgolly.yandexMaps.mod.IGeometryEditorModel
  type IHintManager[T] = typingsJapgolly.yandexMaps.mod.IPopupManager[T]
  type IMultiRouteReferencePoint = java.lang.String | js.Array[scala.Double] | typingsJapgolly.yandexMaps.mod.geometry.Point
  type ISearchControlLayout = typingsJapgolly.yandexMaps.mod.IExpandableControlLayout
  type ISelectableControlLayout = typingsJapgolly.yandexMaps.mod.ILayout
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignopaque
    - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersigngeoObject
    - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignlayer
    - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersigntransparent
    - typingsJapgolly.yandexMaps.yandexMapsStrings.defaultNumbersignsilent
    - java.lang.String
  */
  type InteractivityModelKey = typingsJapgolly.yandexMaps.mod._InteractivityModelKey | java.lang.String
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
  type OverlayKey = typingsJapgolly.yandexMaps.mod._OverlayKey | typingsJapgolly.yandexMaps.mod.IClassConstructor[typingsJapgolly.yandexMaps.mod.IOverlay] | (js.Function3[
    /* geometry */ typingsJapgolly.yandexMaps.mod.IPixelLineStringGeometry, 
    /* data */ typingsJapgolly.yandexMaps.mod.IDataManager | js.Object, 
    /* options */ js.Object, 
    js.Promise[
      java.lang.String | typingsJapgolly.yandexMaps.mod.IClassConstructor[typingsJapgolly.yandexMaps.mod.IOverlay]
    ]
  ]) | java.lang.String
  type PresetKey = java.lang.String
}
