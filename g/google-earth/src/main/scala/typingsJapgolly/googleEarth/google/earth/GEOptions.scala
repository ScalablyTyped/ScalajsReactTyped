package typingsJapgolly.googleEarth.google.earth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GEOptions extends StObject {
  
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  def getAtmosphereVisibility(): Boolean
  
  /**
    * Whether automatic ground level view is enabled.
    */
  def getAutoGroundLevelViewEnabled(): Boolean
  
  /**
    * Returns true if building highlighting is enabled.
    */
  def getBuildingHighlightingEnabled(): Boolean
  
  /**
    * Whether or not building selection is enabled.
    */
  def getBuildingSelectionEnabled(): Boolean
  
  /**
    * Returns true if the animation of features as they are added or removed from the globe has been enabled.
    */
  def getFadeInOutEnabled(): Boolean
  
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  def getFlyToSpeed(): Double
  
  /**
    * Show or hide the grid. Disabled by default.
    */
  def getGridVisibility(): Boolean
  
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  def getMouseNavigationEnabled(): Boolean
  
  /**
    * Show or hide the overview map. Disabled by default.
    */
  def getOverviewMapVisibility(): Boolean
  
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  def getScaleLegendVisibility(): Boolean
  
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  def getScrollWheelZoomSpeed(): Double
  
  /**
    * Show or hide the status bar. Disabled by default.
    */
  def getStatusBarVisibility(): Boolean
  
  /**
    * Returns the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    */
  def getTerrainExaggeration(): Double
  
  /**
    * Returns true if display units are set to imperial units (feet and miles).
    * False denotes metric units (meters and kilometers).
    */
  def getUnitsFeetMiles(): Boolean
  
  /**
    * Show or hide the blue atmosphere that appears around the perimeter of the Earth.
    * On by default.
    */
  def setAtmosphereVisibility(atmosphereVisibility: Boolean): Unit
  
  /**
    * When enabled, the view will change to 'ground level view' when the camera reaches ground level.
    * This view provides pan and lookAt controls, but no zoom slider.
    * The tilt will be set to 90, or parallel with level ground.
    */
  def setAutoGroundLevelViewEnabled(autoGroundLevelViewEnabled: Boolean): Unit
  
  /**
    * Enables or disables building highlighting.
    * When enabled, buildings will be highlighted when they are moused over.
    */
  def setBuildingHighlightingEnabled(buildingHighlightingEnabled: Boolean): Unit
  
  /**
    * Enables or disables building selection.
    * If enabled, clicking a building will pop a feature balloon containing information from the Google 3D Warehouse database.
    */
  def setBuildingSelectionEnabled(buildingSelectionEnabled: Boolean): Unit
  
  /**
    * Enable or disable the animation of a feature when it is added or removed from the Google Earth plugin.
    * The animation consists of a slight change of scale. Default is true.
    */
  def setFadeInOutEnabled(fadeInOutEnabled: Boolean): Unit
  
  /**
    * Specifies the speed at which the camera moves (0 to 5.0).
    * Set to SPEED_TELEPORT to immediately appear at selected destination.
    *
    * See also:
    *
    * * GEPlugin.SPEED_TELEPORT
    */
  def setFlyToSpeed(flyToSpeed: Double): Unit
  
  /**
    * Show or hide the grid. Disabled by default.
    */
  def setGridVisibility(gridVisibility: Boolean): Unit
  
  /**
    * Sets the map type to Earth or sky mode.
    */
  def setMapType(`type`: GEMapTypeEnum): Unit
  
  /**
    * Enable or disable user panning and zooming of the map. Enabled by default.
    *
    * Note: This also enables and disables keyboard navigation (arrow keys, page-up/page-down, etc).
    */
  def setMouseNavigationEnabled(mouseNavigationEnabled: Boolean): Unit
  
  /**
    * Show or hide the overview map. Disabled by default.
    */
  def setOverviewMapVisibility(overviewMapVisibility: Boolean): Unit
  
  /**
    * Show or hide the scale legend. Disabled by default.
    */
  def setScaleLegendVisibility(scaleLegendVisibility: Boolean): Unit
  
  /**
    * Speed of zoom when user rolls the mouse wheel. Default is 1.
    * Set to a negative number to reverse the zoom direction.
    */
  def setScrollWheelZoomSpeed(scrollWheelZoomSpeed: Double): Unit
  
  /**
    * Show or hide the status bar. Disabled by default.
    */
  def setStatusBarVisibility(statusBarVisibility: Boolean): Unit
  
  /**
    * Set the terrain exaggeration value. Valid values are in the range of 1.0 through 3.0.
    * Attempting to set outside of this range will result in the value being clamped.
    */
  def setTerrainExaggeration(terrainExaggeration: Double): Unit
  
  /**
    * Set display units to imperial (feet and miles) or metric (meters and kilometers).
    * This setting affects only the values displayed in the status bar and the scale bar.
    * The values passed and returned with an object's getters and setters are always metric.
    */
  def setUnitsFeetMiles(unitsFeetMiles: Boolean): Unit
}
object GEOptions {
  
  inline def apply(
    getAtmosphereVisibility: CallbackTo[Boolean],
    getAutoGroundLevelViewEnabled: CallbackTo[Boolean],
    getBuildingHighlightingEnabled: CallbackTo[Boolean],
    getBuildingSelectionEnabled: CallbackTo[Boolean],
    getFadeInOutEnabled: CallbackTo[Boolean],
    getFlyToSpeed: CallbackTo[Double],
    getGridVisibility: CallbackTo[Boolean],
    getMouseNavigationEnabled: CallbackTo[Boolean],
    getOverviewMapVisibility: CallbackTo[Boolean],
    getScaleLegendVisibility: CallbackTo[Boolean],
    getScrollWheelZoomSpeed: CallbackTo[Double],
    getStatusBarVisibility: CallbackTo[Boolean],
    getTerrainExaggeration: CallbackTo[Double],
    getUnitsFeetMiles: CallbackTo[Boolean],
    setAtmosphereVisibility: Boolean => Callback,
    setAutoGroundLevelViewEnabled: Boolean => Callback,
    setBuildingHighlightingEnabled: Boolean => Callback,
    setBuildingSelectionEnabled: Boolean => Callback,
    setFadeInOutEnabled: Boolean => Callback,
    setFlyToSpeed: Double => Callback,
    setGridVisibility: Boolean => Callback,
    setMapType: GEMapTypeEnum => Callback,
    setMouseNavigationEnabled: Boolean => Callback,
    setOverviewMapVisibility: Boolean => Callback,
    setScaleLegendVisibility: Boolean => Callback,
    setScrollWheelZoomSpeed: Double => Callback,
    setStatusBarVisibility: Boolean => Callback,
    setTerrainExaggeration: Double => Callback,
    setUnitsFeetMiles: Boolean => Callback
  ): GEOptions = {
    val __obj = js.Dynamic.literal(getAtmosphereVisibility = getAtmosphereVisibility.toJsFn, getAutoGroundLevelViewEnabled = getAutoGroundLevelViewEnabled.toJsFn, getBuildingHighlightingEnabled = getBuildingHighlightingEnabled.toJsFn, getBuildingSelectionEnabled = getBuildingSelectionEnabled.toJsFn, getFadeInOutEnabled = getFadeInOutEnabled.toJsFn, getFlyToSpeed = getFlyToSpeed.toJsFn, getGridVisibility = getGridVisibility.toJsFn, getMouseNavigationEnabled = getMouseNavigationEnabled.toJsFn, getOverviewMapVisibility = getOverviewMapVisibility.toJsFn, getScaleLegendVisibility = getScaleLegendVisibility.toJsFn, getScrollWheelZoomSpeed = getScrollWheelZoomSpeed.toJsFn, getStatusBarVisibility = getStatusBarVisibility.toJsFn, getTerrainExaggeration = getTerrainExaggeration.toJsFn, getUnitsFeetMiles = getUnitsFeetMiles.toJsFn, setAtmosphereVisibility = js.Any.fromFunction1((t0: Boolean) => setAtmosphereVisibility(t0).runNow()), setAutoGroundLevelViewEnabled = js.Any.fromFunction1((t0: Boolean) => setAutoGroundLevelViewEnabled(t0).runNow()), setBuildingHighlightingEnabled = js.Any.fromFunction1((t0: Boolean) => setBuildingHighlightingEnabled(t0).runNow()), setBuildingSelectionEnabled = js.Any.fromFunction1((t0: Boolean) => setBuildingSelectionEnabled(t0).runNow()), setFadeInOutEnabled = js.Any.fromFunction1((t0: Boolean) => setFadeInOutEnabled(t0).runNow()), setFlyToSpeed = js.Any.fromFunction1((t0: Double) => setFlyToSpeed(t0).runNow()), setGridVisibility = js.Any.fromFunction1((t0: Boolean) => setGridVisibility(t0).runNow()), setMapType = js.Any.fromFunction1((t0: GEMapTypeEnum) => setMapType(t0).runNow()), setMouseNavigationEnabled = js.Any.fromFunction1((t0: Boolean) => setMouseNavigationEnabled(t0).runNow()), setOverviewMapVisibility = js.Any.fromFunction1((t0: Boolean) => setOverviewMapVisibility(t0).runNow()), setScaleLegendVisibility = js.Any.fromFunction1((t0: Boolean) => setScaleLegendVisibility(t0).runNow()), setScrollWheelZoomSpeed = js.Any.fromFunction1((t0: Double) => setScrollWheelZoomSpeed(t0).runNow()), setStatusBarVisibility = js.Any.fromFunction1((t0: Boolean) => setStatusBarVisibility(t0).runNow()), setTerrainExaggeration = js.Any.fromFunction1((t0: Double) => setTerrainExaggeration(t0).runNow()), setUnitsFeetMiles = js.Any.fromFunction1((t0: Boolean) => setUnitsFeetMiles(t0).runNow()))
    __obj.asInstanceOf[GEOptions]
  }
  
  extension [Self <: GEOptions](x: Self) {
    
    inline def setGetAtmosphereVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAtmosphereVisibility", value.toJsFn)
    
    inline def setGetAutoGroundLevelViewEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoGroundLevelViewEnabled", value.toJsFn)
    
    inline def setGetBuildingHighlightingEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBuildingHighlightingEnabled", value.toJsFn)
    
    inline def setGetBuildingSelectionEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getBuildingSelectionEnabled", value.toJsFn)
    
    inline def setGetFadeInOutEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getFadeInOutEnabled", value.toJsFn)
    
    inline def setGetFlyToSpeed(value: CallbackTo[Double]): Self = StObject.set(x, "getFlyToSpeed", value.toJsFn)
    
    inline def setGetGridVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getGridVisibility", value.toJsFn)
    
    inline def setGetMouseNavigationEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getMouseNavigationEnabled", value.toJsFn)
    
    inline def setGetOverviewMapVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getOverviewMapVisibility", value.toJsFn)
    
    inline def setGetScaleLegendVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getScaleLegendVisibility", value.toJsFn)
    
    inline def setGetScrollWheelZoomSpeed(value: CallbackTo[Double]): Self = StObject.set(x, "getScrollWheelZoomSpeed", value.toJsFn)
    
    inline def setGetStatusBarVisibility(value: CallbackTo[Boolean]): Self = StObject.set(x, "getStatusBarVisibility", value.toJsFn)
    
    inline def setGetTerrainExaggeration(value: CallbackTo[Double]): Self = StObject.set(x, "getTerrainExaggeration", value.toJsFn)
    
    inline def setGetUnitsFeetMiles(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUnitsFeetMiles", value.toJsFn)
    
    inline def setSetAtmosphereVisibility(value: Boolean => Callback): Self = StObject.set(x, "setAtmosphereVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetAutoGroundLevelViewEnabled(value: Boolean => Callback): Self = StObject.set(x, "setAutoGroundLevelViewEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetBuildingHighlightingEnabled(value: Boolean => Callback): Self = StObject.set(x, "setBuildingHighlightingEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetBuildingSelectionEnabled(value: Boolean => Callback): Self = StObject.set(x, "setBuildingSelectionEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetFadeInOutEnabled(value: Boolean => Callback): Self = StObject.set(x, "setFadeInOutEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetFlyToSpeed(value: Double => Callback): Self = StObject.set(x, "setFlyToSpeed", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetGridVisibility(value: Boolean => Callback): Self = StObject.set(x, "setGridVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetMapType(value: GEMapTypeEnum => Callback): Self = StObject.set(x, "setMapType", js.Any.fromFunction1((t0: GEMapTypeEnum) => value(t0).runNow()))
    
    inline def setSetMouseNavigationEnabled(value: Boolean => Callback): Self = StObject.set(x, "setMouseNavigationEnabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetOverviewMapVisibility(value: Boolean => Callback): Self = StObject.set(x, "setOverviewMapVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetScaleLegendVisibility(value: Boolean => Callback): Self = StObject.set(x, "setScaleLegendVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetScrollWheelZoomSpeed(value: Double => Callback): Self = StObject.set(x, "setScrollWheelZoomSpeed", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetStatusBarVisibility(value: Boolean => Callback): Self = StObject.set(x, "setStatusBarVisibility", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetTerrainExaggeration(value: Double => Callback): Self = StObject.set(x, "setTerrainExaggeration", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetUnitsFeetMiles(value: Boolean => Callback): Self = StObject.set(x, "setUnitsFeetMiles", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
