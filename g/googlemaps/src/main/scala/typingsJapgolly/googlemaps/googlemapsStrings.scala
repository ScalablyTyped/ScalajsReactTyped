package typingsJapgolly.googlemaps

import typingsJapgolly.googlemaps.google.maps.DrawingMode
import typingsJapgolly.googlemaps.google.maps.GestureHandlingOptions
import typingsJapgolly.googlemaps.google.maps.MapTypeStyleElementType
import typingsJapgolly.googlemaps.google.maps.MapTypeStyleFeatureType
import typingsJapgolly.googlemaps.google.maps.MarkerChangeOptionEventNames
import typingsJapgolly.googlemaps.google.maps.MarkerMouseEventNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googlemapsStrings {
  @js.native
  sealed trait LineString extends DrawingMode
  
  @js.native
  sealed trait Point extends DrawingMode
  
  @js.native
  sealed trait Polygon extends DrawingMode
  
  @js.native
  sealed trait administrative extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDOTcountry extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDOTland_parcel extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDOTlocality extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDOTneighborhood extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait administrativeDOTprovince extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait all
    extends MapTypeStyleElementType
       with MapTypeStyleFeatureType
  
  @js.native
  sealed trait animation_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait auto extends GestureHandlingOptions
  
  @js.native
  sealed trait circle extends js.Object
  
  @js.native
  sealed trait click extends MarkerMouseEventNames
  
  @js.native
  sealed trait clickable_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait cooperative extends GestureHandlingOptions
  
  @js.native
  sealed trait cursor_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait dblclick extends MarkerMouseEventNames
  
  @js.native
  sealed trait drag extends MarkerMouseEventNames
  
  @js.native
  sealed trait dragend extends MarkerMouseEventNames
  
  @js.native
  sealed trait draggable_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait dragstart extends MarkerMouseEventNames
  
  @js.native
  sealed trait flat_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait geometry extends MapTypeStyleElementType
  
  @js.native
  sealed trait geometryDOTfill extends MapTypeStyleElementType
  
  @js.native
  sealed trait geometryDOTstroke extends MapTypeStyleElementType
  
  @js.native
  sealed trait greedy extends GestureHandlingOptions
  
  @js.native
  sealed trait html4 extends js.Object
  
  @js.native
  sealed trait html5 extends js.Object
  
  @js.native
  sealed trait icon_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait labels extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDOTicon extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDOTtext extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDOTtextDOTfill extends MapTypeStyleElementType
  
  @js.native
  sealed trait labelsDOTtextDOTstroke extends MapTypeStyleElementType
  
  @js.native
  sealed trait landscape extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDOTman_made extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDOTnatural extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDOTnaturalDOTlandcover extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait landscapeDOTnaturalDOTterrain extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait mousedown extends MarkerMouseEventNames
  
  @js.native
  sealed trait mouseout extends MarkerMouseEventNames
  
  @js.native
  sealed trait mouseover extends MarkerMouseEventNames
  
  @js.native
  sealed trait mouseup extends MarkerMouseEventNames
  
  @js.native
  sealed trait none extends GestureHandlingOptions
  
  @js.native
  sealed trait poi extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTattraction extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTbusiness extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTgovernment extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTmedical extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTpark extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTplace_of_worship extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTschool extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poiDOTsports_complex extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait poly extends js.Object
  
  @js.native
  sealed trait position_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait rect extends js.Object
  
  @js.native
  sealed trait rightclick extends MarkerMouseEventNames
  
  @js.native
  sealed trait road extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDOTarterial extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDOThighway extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDOThighwayDOTcontrolled_access extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait roadDOTlocal extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait shape_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait title_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait transit extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDOTline extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDOTstation extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDOTstationDOTairport extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDOTstationDOTbus extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait transitDOTstationDOTrail extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait visible_changed extends MarkerChangeOptionEventNames
  
  @js.native
  sealed trait water extends MapTypeStyleFeatureType
  
  @js.native
  sealed trait webgl extends js.Object
  
  @js.native
  sealed trait zindex_changed extends MarkerChangeOptionEventNames
  
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  @scala.inline
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
  @scala.inline
  def administrative: administrative = "administrative".asInstanceOf[administrative]
  @scala.inline
  def administrativeDOTcountry: administrativeDOTcountry = "administrative.country".asInstanceOf[administrativeDOTcountry]
  @scala.inline
  def administrativeDOTland_parcel: administrativeDOTland_parcel = "administrative.land_parcel".asInstanceOf[administrativeDOTland_parcel]
  @scala.inline
  def administrativeDOTlocality: administrativeDOTlocality = "administrative.locality".asInstanceOf[administrativeDOTlocality]
  @scala.inline
  def administrativeDOTneighborhood: administrativeDOTneighborhood = "administrative.neighborhood".asInstanceOf[administrativeDOTneighborhood]
  @scala.inline
  def administrativeDOTprovince: administrativeDOTprovince = "administrative.province".asInstanceOf[administrativeDOTprovince]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def animation_changed: animation_changed = "animation_changed".asInstanceOf[animation_changed]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def clickable_changed: clickable_changed = "clickable_changed".asInstanceOf[clickable_changed]
  @scala.inline
  def cooperative: cooperative = "cooperative".asInstanceOf[cooperative]
  @scala.inline
  def cursor_changed: cursor_changed = "cursor_changed".asInstanceOf[cursor_changed]
  @scala.inline
  def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  @scala.inline
  def dragend: dragend = "dragend".asInstanceOf[dragend]
  @scala.inline
  def draggable_changed: draggable_changed = "draggable_changed".asInstanceOf[draggable_changed]
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  @scala.inline
  def flat_changed: flat_changed = "flat_changed".asInstanceOf[flat_changed]
  @scala.inline
  def geometry: geometry = "geometry".asInstanceOf[geometry]
  @scala.inline
  def geometryDOTfill: geometryDOTfill = "geometry.fill".asInstanceOf[geometryDOTfill]
  @scala.inline
  def geometryDOTstroke: geometryDOTstroke = "geometry.stroke".asInstanceOf[geometryDOTstroke]
  @scala.inline
  def greedy: greedy = "greedy".asInstanceOf[greedy]
  @scala.inline
  def html4: html4 = "html4".asInstanceOf[html4]
  @scala.inline
  def html5: html5 = "html5".asInstanceOf[html5]
  @scala.inline
  def icon_changed: icon_changed = "icon_changed".asInstanceOf[icon_changed]
  @scala.inline
  def labels: labels = "labels".asInstanceOf[labels]
  @scala.inline
  def labelsDOTicon: labelsDOTicon = "labels.icon".asInstanceOf[labelsDOTicon]
  @scala.inline
  def labelsDOTtext: labelsDOTtext = "labels.text".asInstanceOf[labelsDOTtext]
  @scala.inline
  def labelsDOTtextDOTfill: labelsDOTtextDOTfill = "labels.text.fill".asInstanceOf[labelsDOTtextDOTfill]
  @scala.inline
  def labelsDOTtextDOTstroke: labelsDOTtextDOTstroke = "labels.text.stroke".asInstanceOf[labelsDOTtextDOTstroke]
  @scala.inline
  def landscape: landscape = "landscape".asInstanceOf[landscape]
  @scala.inline
  def landscapeDOTman_made: landscapeDOTman_made = "landscape.man_made".asInstanceOf[landscapeDOTman_made]
  @scala.inline
  def landscapeDOTnatural: landscapeDOTnatural = "landscape.natural".asInstanceOf[landscapeDOTnatural]
  @scala.inline
  def landscapeDOTnaturalDOTlandcover: landscapeDOTnaturalDOTlandcover = "landscape.natural.landcover".asInstanceOf[landscapeDOTnaturalDOTlandcover]
  @scala.inline
  def landscapeDOTnaturalDOTterrain: landscapeDOTnaturalDOTterrain = "landscape.natural.terrain".asInstanceOf[landscapeDOTnaturalDOTterrain]
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def poi: poi = "poi".asInstanceOf[poi]
  @scala.inline
  def poiDOTattraction: poiDOTattraction = "poi.attraction".asInstanceOf[poiDOTattraction]
  @scala.inline
  def poiDOTbusiness: poiDOTbusiness = "poi.business".asInstanceOf[poiDOTbusiness]
  @scala.inline
  def poiDOTgovernment: poiDOTgovernment = "poi.government".asInstanceOf[poiDOTgovernment]
  @scala.inline
  def poiDOTmedical: poiDOTmedical = "poi.medical".asInstanceOf[poiDOTmedical]
  @scala.inline
  def poiDOTpark: poiDOTpark = "poi.park".asInstanceOf[poiDOTpark]
  @scala.inline
  def poiDOTplace_of_worship: poiDOTplace_of_worship = "poi.place_of_worship".asInstanceOf[poiDOTplace_of_worship]
  @scala.inline
  def poiDOTschool: poiDOTschool = "poi.school".asInstanceOf[poiDOTschool]
  @scala.inline
  def poiDOTsports_complex: poiDOTsports_complex = "poi.sports_complex".asInstanceOf[poiDOTsports_complex]
  @scala.inline
  def poly: poly = "poly".asInstanceOf[poly]
  @scala.inline
  def position_changed: position_changed = "position_changed".asInstanceOf[position_changed]
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
  @scala.inline
  def rightclick: rightclick = "rightclick".asInstanceOf[rightclick]
  @scala.inline
  def road: road = "road".asInstanceOf[road]
  @scala.inline
  def roadDOTarterial: roadDOTarterial = "road.arterial".asInstanceOf[roadDOTarterial]
  @scala.inline
  def roadDOThighway: roadDOThighway = "road.highway".asInstanceOf[roadDOThighway]
  @scala.inline
  def roadDOThighwayDOTcontrolled_access: roadDOThighwayDOTcontrolled_access = "road.highway.controlled_access".asInstanceOf[roadDOThighwayDOTcontrolled_access]
  @scala.inline
  def roadDOTlocal: roadDOTlocal = "road.local".asInstanceOf[roadDOTlocal]
  @scala.inline
  def shape_changed: shape_changed = "shape_changed".asInstanceOf[shape_changed]
  @scala.inline
  def title_changed: title_changed = "title_changed".asInstanceOf[title_changed]
  @scala.inline
  def transit: transit = "transit".asInstanceOf[transit]
  @scala.inline
  def transitDOTline: transitDOTline = "transit.line".asInstanceOf[transitDOTline]
  @scala.inline
  def transitDOTstation: transitDOTstation = "transit.station".asInstanceOf[transitDOTstation]
  @scala.inline
  def transitDOTstationDOTairport: transitDOTstationDOTairport = "transit.station.airport".asInstanceOf[transitDOTstationDOTairport]
  @scala.inline
  def transitDOTstationDOTbus: transitDOTstationDOTbus = "transit.station.bus".asInstanceOf[transitDOTstationDOTbus]
  @scala.inline
  def transitDOTstationDOTrail: transitDOTstationDOTrail = "transit.station.rail".asInstanceOf[transitDOTstationDOTrail]
  @scala.inline
  def visible_changed: visible_changed = "visible_changed".asInstanceOf[visible_changed]
  @scala.inline
  def water: water = "water".asInstanceOf[water]
  @scala.inline
  def webgl: webgl = "webgl".asInstanceOf[webgl]
  @scala.inline
  def zindex_changed: zindex_changed = "zindex_changed".asInstanceOf[zindex_changed]
}

