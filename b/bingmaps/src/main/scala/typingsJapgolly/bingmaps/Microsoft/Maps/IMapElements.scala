package typingsJapgolly.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMapElements extends js.Object {
  /** Admin1, state, province, etc. */
  var adminDistrict: js.UndefOr[IBorderedMapElementStyle] = js.undefined
  /** Icon representing the capital of a state/province. */
  var adminDistrictCapital: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of land encompassing an airport. */
  var airport: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of land use, not to be confused with Structure */
  var area: js.UndefOr[IMapElementStyle] = js.undefined
  /** An arterial road is a high-capacity urban road. Its primary function is to deliver traffic from collector roads to freeways or expressways, and between urban centers efficiently. */
  var arterialRoad: js.UndefOr[IMapElementStyle] = js.undefined
  /** A structure such as a house, store, factory. */
  var building: js.UndefOr[IMapElementStyle] = js.undefined
  /** Restaurant, hospital, school, etc. */
  var business: js.UndefOr[IMapElementStyle] = js.undefined
  /** Icon representing the capital populated place. */
  var capital: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of a cemetery */
  var cemetery: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of a whole continent */
  var continent: js.UndefOr[IMapElementStyle] = js.undefined
  /** A controlled-access highway is a type of road which has been designed for high-speed vehicular traffic, with all traffic flow and ingress/egress regulated. Also known as a highway, freeway, motorway, expressway, interstate, parkway. */
  var controlledAccessHighway: js.UndefOr[IMapElementStyle] = js.undefined
  /** A country or independent sovereign state. */
  var countryRegion: js.UndefOr[IBorderedMapElementStyle] = js.undefined
  /** Icon representing the capital of a country/region. */
  var countryRegionCapital: js.UndefOr[IMapElementStyle] = js.undefined
  /** Admin2, county, etc. */
  var district: js.UndefOr[IBorderedMapElementStyle] = js.undefined
  /** An area of land used for educational purposes such as a school campus. */
  var education: js.UndefOr[IMapElementStyle] = js.undefined
  /** A school or other educational building. */
  var educationBuilding: js.UndefOr[IMapElementStyle] = js.undefined
  /** Restaurant, caf�, etc. */
  var foodPoint: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of forest land. */
  var forest: js.UndefOr[IMapElementStyle] = js.undefined
  /** An area of land where the game of golf is played. */
  var golfCourse: js.UndefOr[IMapElementStyle] = js.undefined
  /** Lines representing ramps typically alongside ControlledAccessHighways */
  var highSpeedRamp: js.UndefOr[IMapElementStyle] = js.undefined
  /** A highway. */
  var highway: js.UndefOr[IMapElementStyle] = js.undefined
  /** An area of land reserved for Indigenous people. */
  var indigenousPeoplesReserve: js.UndefOr[IMapElementStyle] = js.undefined
  /** Labeling of area of an island.  */
  var island: js.UndefOr[IMapElementStyle] = js.undefined
  /** Major roads. */
  var majorRoad: js.UndefOr[IMapElementStyle] = js.undefined
  /** The base map element in which all other map elements inherit from. */
  var mapElement: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of land used for medical purposes. Generally, hospital campuses. */
  var medical: js.UndefOr[IMapElementStyle] = js.undefined
  /** A building which provides medical services. */
  var medicalBuilding: js.UndefOr[IMapElementStyle] = js.undefined
  /** A military area. */
  var military: js.UndefOr[IMapElementStyle] = js.undefined
  /** A natural point of interest. */
  var naturalPoint: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of land used for nautical purposes. */
  var nautical: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area defined as a neighborhood. Labels only. */
  var neighborhood: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of any kind of park. */
  var park: js.UndefOr[IMapElementStyle] = js.undefined
  /** Icon representing the peak of a mountain. */
  var peak: js.UndefOr[IMapElementStyle] = js.undefined
  /** Extracted pitches such as a baseball field or tennis court. */
  var playingField: js.UndefOr[IMapElementStyle] = js.undefined
  /** All point features that are rendered with an icon of some sort */
  var point: js.UndefOr[IMapElementStyle] = js.undefined
  /** Restaurant, hospital, school, marina, ski area, etc. */
  var pointOfInterest: js.UndefOr[IMapElementStyle] = js.undefined
  /** A political border. */
  var political: js.UndefOr[IBorderedMapElementStyle] = js.undefined
  /** Icon representing size of populated place (city, town, etc). */
  var populatedPlace: js.UndefOr[IMapElementStyle] = js.undefined
  /** Railway lines */
  var railway: js.UndefOr[IMapElementStyle] = js.undefined
  /** Line representing the connecting entrance/exit to a highway. */
  var ramp: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of nature reserve. */
  var reserve: js.UndefOr[IMapElementStyle] = js.undefined
  /** River, stream, or other passage. Note that this may be a line or polygon and may connect to non-river water bodies. */
  var river: js.UndefOr[IMapElementStyle] = js.undefined
  /** Lines that represent all roads */
  var road: js.UndefOr[IMapElementStyle] = js.undefined
  /** Icon representing the exit, typically from a controlled access highway. */
  var roadExit: js.UndefOr[IMapElementStyle] = js.undefined
  /** Sign representing a compact name for a road. For example, I-5. */
  //roadShield?: IMapElementStyle;
  /** Land area covered by a runway. See also Airport for the land area of the whole airport. */
  var runway: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area generally used for beaches, but could be used for sandy areas/golf bunkers in the future. */
  var sand: js.UndefOr[IMapElementStyle] = js.undefined
  /** A shopping center or mall. */
  var shoppingCenter: js.UndefOr[IMapElementStyle] = js.undefined
  /** Area of a stadium. */
  var stadium: js.UndefOr[IMapElementStyle] = js.undefined
  /** A street. */
  var street: js.UndefOr[IMapElementStyle] = js.undefined
  /** Buildings and other building-like structures */
  var structure: js.UndefOr[IMapElementStyle] = js.undefined
  /** A toll road. */
  var tollRoad: js.UndefOr[IMapElementStyle] = js.undefined
  /** Walking trail, either through park or hiking trail */
  var trail: js.UndefOr[IMapElementStyle] = js.undefined
  /** Icon representing a bus stop, train stop, airport, etc. */
  var transit: js.UndefOr[IMapElementStyle] = js.undefined
  /** A transit building. */
  var transitBuilding: js.UndefOr[IMapElementStyle] = js.undefined
  /** Lines that are part of the transportation network (roads, trains, ferries, etc) */
  var transportation: js.UndefOr[IMapElementStyle] = js.undefined
  /** An unpaved street. */
  var unpavedStreet: js.UndefOr[IMapElementStyle] = js.undefined
  /** Forests, grassy areas, etc. */
  var vegetation: js.UndefOr[IMapElementStyle] = js.undefined
  /** Icon representing the peak of a volcano. */
  var volcanicPeak: js.UndefOr[IMapElementStyle] = js.undefined
  /** Anything that looks like water */
  var water: js.UndefOr[IMapElementStyle] = js.undefined
  /** Icon representing a water feature location such as a waterfall. */
  var waterPoint: js.UndefOr[IMapElementStyle] = js.undefined
  /** Ferry route lines */
  var waterRoute: js.UndefOr[IMapElementStyle] = js.undefined
}

object IMapElements {
  @scala.inline
  def apply(
    adminDistrict: IBorderedMapElementStyle = null,
    adminDistrictCapital: IMapElementStyle = null,
    airport: IMapElementStyle = null,
    area: IMapElementStyle = null,
    arterialRoad: IMapElementStyle = null,
    building: IMapElementStyle = null,
    business: IMapElementStyle = null,
    capital: IMapElementStyle = null,
    cemetery: IMapElementStyle = null,
    continent: IMapElementStyle = null,
    controlledAccessHighway: IMapElementStyle = null,
    countryRegion: IBorderedMapElementStyle = null,
    countryRegionCapital: IMapElementStyle = null,
    district: IBorderedMapElementStyle = null,
    education: IMapElementStyle = null,
    educationBuilding: IMapElementStyle = null,
    foodPoint: IMapElementStyle = null,
    forest: IMapElementStyle = null,
    golfCourse: IMapElementStyle = null,
    highSpeedRamp: IMapElementStyle = null,
    highway: IMapElementStyle = null,
    indigenousPeoplesReserve: IMapElementStyle = null,
    island: IMapElementStyle = null,
    majorRoad: IMapElementStyle = null,
    mapElement: IMapElementStyle = null,
    medical: IMapElementStyle = null,
    medicalBuilding: IMapElementStyle = null,
    military: IMapElementStyle = null,
    naturalPoint: IMapElementStyle = null,
    nautical: IMapElementStyle = null,
    neighborhood: IMapElementStyle = null,
    park: IMapElementStyle = null,
    peak: IMapElementStyle = null,
    playingField: IMapElementStyle = null,
    point: IMapElementStyle = null,
    pointOfInterest: IMapElementStyle = null,
    political: IBorderedMapElementStyle = null,
    populatedPlace: IMapElementStyle = null,
    railway: IMapElementStyle = null,
    ramp: IMapElementStyle = null,
    reserve: IMapElementStyle = null,
    river: IMapElementStyle = null,
    road: IMapElementStyle = null,
    roadExit: IMapElementStyle = null,
    runway: IMapElementStyle = null,
    sand: IMapElementStyle = null,
    shoppingCenter: IMapElementStyle = null,
    stadium: IMapElementStyle = null,
    street: IMapElementStyle = null,
    structure: IMapElementStyle = null,
    tollRoad: IMapElementStyle = null,
    trail: IMapElementStyle = null,
    transit: IMapElementStyle = null,
    transitBuilding: IMapElementStyle = null,
    transportation: IMapElementStyle = null,
    unpavedStreet: IMapElementStyle = null,
    vegetation: IMapElementStyle = null,
    volcanicPeak: IMapElementStyle = null,
    water: IMapElementStyle = null,
    waterPoint: IMapElementStyle = null,
    waterRoute: IMapElementStyle = null
  ): IMapElements = {
    val __obj = js.Dynamic.literal()
    if (adminDistrict != null) __obj.updateDynamic("adminDistrict")(adminDistrict.asInstanceOf[js.Any])
    if (adminDistrictCapital != null) __obj.updateDynamic("adminDistrictCapital")(adminDistrictCapital.asInstanceOf[js.Any])
    if (airport != null) __obj.updateDynamic("airport")(airport.asInstanceOf[js.Any])
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (arterialRoad != null) __obj.updateDynamic("arterialRoad")(arterialRoad.asInstanceOf[js.Any])
    if (building != null) __obj.updateDynamic("building")(building.asInstanceOf[js.Any])
    if (business != null) __obj.updateDynamic("business")(business.asInstanceOf[js.Any])
    if (capital != null) __obj.updateDynamic("capital")(capital.asInstanceOf[js.Any])
    if (cemetery != null) __obj.updateDynamic("cemetery")(cemetery.asInstanceOf[js.Any])
    if (continent != null) __obj.updateDynamic("continent")(continent.asInstanceOf[js.Any])
    if (controlledAccessHighway != null) __obj.updateDynamic("controlledAccessHighway")(controlledAccessHighway.asInstanceOf[js.Any])
    if (countryRegion != null) __obj.updateDynamic("countryRegion")(countryRegion.asInstanceOf[js.Any])
    if (countryRegionCapital != null) __obj.updateDynamic("countryRegionCapital")(countryRegionCapital.asInstanceOf[js.Any])
    if (district != null) __obj.updateDynamic("district")(district.asInstanceOf[js.Any])
    if (education != null) __obj.updateDynamic("education")(education.asInstanceOf[js.Any])
    if (educationBuilding != null) __obj.updateDynamic("educationBuilding")(educationBuilding.asInstanceOf[js.Any])
    if (foodPoint != null) __obj.updateDynamic("foodPoint")(foodPoint.asInstanceOf[js.Any])
    if (forest != null) __obj.updateDynamic("forest")(forest.asInstanceOf[js.Any])
    if (golfCourse != null) __obj.updateDynamic("golfCourse")(golfCourse.asInstanceOf[js.Any])
    if (highSpeedRamp != null) __obj.updateDynamic("highSpeedRamp")(highSpeedRamp.asInstanceOf[js.Any])
    if (highway != null) __obj.updateDynamic("highway")(highway.asInstanceOf[js.Any])
    if (indigenousPeoplesReserve != null) __obj.updateDynamic("indigenousPeoplesReserve")(indigenousPeoplesReserve.asInstanceOf[js.Any])
    if (island != null) __obj.updateDynamic("island")(island.asInstanceOf[js.Any])
    if (majorRoad != null) __obj.updateDynamic("majorRoad")(majorRoad.asInstanceOf[js.Any])
    if (mapElement != null) __obj.updateDynamic("mapElement")(mapElement.asInstanceOf[js.Any])
    if (medical != null) __obj.updateDynamic("medical")(medical.asInstanceOf[js.Any])
    if (medicalBuilding != null) __obj.updateDynamic("medicalBuilding")(medicalBuilding.asInstanceOf[js.Any])
    if (military != null) __obj.updateDynamic("military")(military.asInstanceOf[js.Any])
    if (naturalPoint != null) __obj.updateDynamic("naturalPoint")(naturalPoint.asInstanceOf[js.Any])
    if (nautical != null) __obj.updateDynamic("nautical")(nautical.asInstanceOf[js.Any])
    if (neighborhood != null) __obj.updateDynamic("neighborhood")(neighborhood.asInstanceOf[js.Any])
    if (park != null) __obj.updateDynamic("park")(park.asInstanceOf[js.Any])
    if (peak != null) __obj.updateDynamic("peak")(peak.asInstanceOf[js.Any])
    if (playingField != null) __obj.updateDynamic("playingField")(playingField.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (pointOfInterest != null) __obj.updateDynamic("pointOfInterest")(pointOfInterest.asInstanceOf[js.Any])
    if (political != null) __obj.updateDynamic("political")(political.asInstanceOf[js.Any])
    if (populatedPlace != null) __obj.updateDynamic("populatedPlace")(populatedPlace.asInstanceOf[js.Any])
    if (railway != null) __obj.updateDynamic("railway")(railway.asInstanceOf[js.Any])
    if (ramp != null) __obj.updateDynamic("ramp")(ramp.asInstanceOf[js.Any])
    if (reserve != null) __obj.updateDynamic("reserve")(reserve.asInstanceOf[js.Any])
    if (river != null) __obj.updateDynamic("river")(river.asInstanceOf[js.Any])
    if (road != null) __obj.updateDynamic("road")(road.asInstanceOf[js.Any])
    if (roadExit != null) __obj.updateDynamic("roadExit")(roadExit.asInstanceOf[js.Any])
    if (runway != null) __obj.updateDynamic("runway")(runway.asInstanceOf[js.Any])
    if (sand != null) __obj.updateDynamic("sand")(sand.asInstanceOf[js.Any])
    if (shoppingCenter != null) __obj.updateDynamic("shoppingCenter")(shoppingCenter.asInstanceOf[js.Any])
    if (stadium != null) __obj.updateDynamic("stadium")(stadium.asInstanceOf[js.Any])
    if (street != null) __obj.updateDynamic("street")(street.asInstanceOf[js.Any])
    if (structure != null) __obj.updateDynamic("structure")(structure.asInstanceOf[js.Any])
    if (tollRoad != null) __obj.updateDynamic("tollRoad")(tollRoad.asInstanceOf[js.Any])
    if (trail != null) __obj.updateDynamic("trail")(trail.asInstanceOf[js.Any])
    if (transit != null) __obj.updateDynamic("transit")(transit.asInstanceOf[js.Any])
    if (transitBuilding != null) __obj.updateDynamic("transitBuilding")(transitBuilding.asInstanceOf[js.Any])
    if (transportation != null) __obj.updateDynamic("transportation")(transportation.asInstanceOf[js.Any])
    if (unpavedStreet != null) __obj.updateDynamic("unpavedStreet")(unpavedStreet.asInstanceOf[js.Any])
    if (vegetation != null) __obj.updateDynamic("vegetation")(vegetation.asInstanceOf[js.Any])
    if (volcanicPeak != null) __obj.updateDynamic("volcanicPeak")(volcanicPeak.asInstanceOf[js.Any])
    if (water != null) __obj.updateDynamic("water")(water.asInstanceOf[js.Any])
    if (waterPoint != null) __obj.updateDynamic("waterPoint")(waterPoint.asInstanceOf[js.Any])
    if (waterRoute != null) __obj.updateDynamic("waterRoute")(waterRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapElements]
  }
}

