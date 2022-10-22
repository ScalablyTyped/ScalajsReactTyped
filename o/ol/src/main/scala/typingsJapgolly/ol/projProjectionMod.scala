package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.projUnitsMod.Units
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projProjectionMod {
  
  @JSImport("ol/proj/Projection", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Projection {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def canWrapX(): Boolean = js.native
    
    /**
      * Get the axis orientation of this projection.
      * Example values are:
      * enu - the default easting, northing, elevation.
      * neu - northing, easting, up - useful for "lat/long" geographic coordinates,
      *     or south orientated transverse mercator.
      * wnu - westing, northing, up - some planetary coordinate systems have
      *     "west positive" coordinate systems
      */
    /* CompleteClass */
    override def getAxisOrientation(): String = js.native
    
    /**
      * Get the code for this projection, e.g. 'EPSG:4326'.
      */
    /* CompleteClass */
    override def getCode(): String = js.native
    
    /* CompleteClass */
    override def getDefaultTileGrid(): typingsJapgolly.ol.tilegridTileGridMod.default = js.native
    
    /**
      * Get the validity extent for this projection.
      */
    /* CompleteClass */
    override def getExtent(): Extent = js.native
    
    /**
      * Get the amount of meters per unit of this projection.  If the projection is
      * not configured with metersPerUnit or a units identifier, the return is
      * undefined.
      */
    /* CompleteClass */
    override def getMetersPerUnit(): js.UndefOr[Double] = js.native
    
    /**
      * Get the custom point resolution function for this projection (if set).
      */
    /* CompleteClass */
    override def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]] = js.native
    
    /**
      * Get the units of this projection.
      */
    /* CompleteClass */
    override def getUnits(): Units = js.native
    
    /**
      * Get the world extent for this projection.
      */
    /* CompleteClass */
    override def getWorldExtent(): Extent = js.native
    
    /**
      * Is this projection a global projection which spans the whole world?
      */
    /* CompleteClass */
    override def isGlobal(): Boolean = js.native
    
    /* CompleteClass */
    override def setDefaultTileGrid(tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default): Unit = js.native
    
    /**
      * Set the validity extent for this projection.
      */
    /* CompleteClass */
    override def setExtent(extent: Extent): Unit = js.native
    
    /**
      * Set the getPointResolution function (see {@link module:ol/proj~getPointResolution}
      * for this projection.
      */
    /* CompleteClass */
    override def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit = js.native
    
    /**
      * Set if the projection is a global projection which spans the whole world
      */
    /* CompleteClass */
    override def setGlobal(global: Boolean): Unit = js.native
    
    /**
      * Set the world extent for this projection.
      */
    /* CompleteClass */
    override def setWorldExtent(worldExtent: Extent): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var axisOrientation: js.UndefOr[String] = js.undefined
    
    var code: String
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var getPointResolution: js.UndefOr[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]] = js.undefined
    
    var global: js.UndefOr[Boolean] = js.undefined
    
    var metersPerUnit: js.UndefOr[Double] = js.undefined
    
    var units: js.UndefOr[Units | String] = js.undefined
    
    var worldExtent: js.UndefOr[Extent] = js.undefined
  }
  object Options {
    
    inline def apply(code: String): Options = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAxisOrientation(value: String): Self = StObject.set(x, "axisOrientation", value.asInstanceOf[js.Any])
      
      inline def setAxisOrientationUndefined: Self = StObject.set(x, "axisOrientation", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setGetPointResolution(value: (/* p0 */ Double, /* p1 */ Coordinate) => Double): Self = StObject.set(x, "getPointResolution", js.Any.fromFunction2(value))
      
      inline def setGetPointResolutionUndefined: Self = StObject.set(x, "getPointResolution", js.undefined)
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
      
      inline def setMetersPerUnit(value: Double): Self = StObject.set(x, "metersPerUnit", value.asInstanceOf[js.Any])
      
      inline def setMetersPerUnitUndefined: Self = StObject.set(x, "metersPerUnit", js.undefined)
      
      inline def setUnits(value: Units | String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      inline def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
      
      inline def setWorldExtent(value: Extent): Self = StObject.set(x, "worldExtent", value.asInstanceOf[js.Any])
      
      inline def setWorldExtentUndefined: Self = StObject.set(x, "worldExtent", js.undefined)
    }
  }
  
  trait Projection extends StObject {
    
    def canWrapX(): Boolean
    
    /**
      * Get the axis orientation of this projection.
      * Example values are:
      * enu - the default easting, northing, elevation.
      * neu - northing, easting, up - useful for "lat/long" geographic coordinates,
      *     or south orientated transverse mercator.
      * wnu - westing, northing, up - some planetary coordinate systems have
      *     "west positive" coordinate systems
      */
    def getAxisOrientation(): String
    
    /**
      * Get the code for this projection, e.g. 'EPSG:4326'.
      */
    def getCode(): String
    
    def getDefaultTileGrid(): typingsJapgolly.ol.tilegridTileGridMod.default
    
    /**
      * Get the validity extent for this projection.
      */
    def getExtent(): Extent
    
    /**
      * Get the amount of meters per unit of this projection.  If the projection is
      * not configured with metersPerUnit or a units identifier, the return is
      * undefined.
      */
    def getMetersPerUnit(): js.UndefOr[Double]
    
    /**
      * Get the custom point resolution function for this projection (if set).
      */
    def getPointResolutionFunc(): js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]]
    
    /**
      * Get the units of this projection.
      */
    def getUnits(): Units
    
    /**
      * Get the world extent for this projection.
      */
    def getWorldExtent(): Extent
    
    /**
      * Is this projection a global projection which spans the whole world?
      */
    def isGlobal(): Boolean
    
    def setDefaultTileGrid(tileGrid: typingsJapgolly.ol.tilegridTileGridMod.default): Unit
    
    /**
      * Set the validity extent for this projection.
      */
    def setExtent(extent: Extent): Unit
    
    /**
      * Set the getPointResolution function (see {@link module:ol/proj~getPointResolution}
      * for this projection.
      */
    def setGetPointResolution(func: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]): Unit
    
    /**
      * Set if the projection is a global projection which spans the whole world
      */
    def setGlobal(global: Boolean): Unit
    
    /**
      * Set the world extent for this projection.
      */
    def setWorldExtent(worldExtent: Extent): Unit
  }
  object Projection {
    
    inline def apply(
      canWrapX: CallbackTo[Boolean],
      getAxisOrientation: CallbackTo[String],
      getCode: CallbackTo[String],
      getDefaultTileGrid: CallbackTo[typingsJapgolly.ol.tilegridTileGridMod.default],
      getExtent: CallbackTo[Extent],
      getMetersPerUnit: CallbackTo[js.UndefOr[Double]],
      getPointResolutionFunc: CallbackTo[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]]],
      getUnits: CallbackTo[Units],
      getWorldExtent: CallbackTo[Extent],
      isGlobal: CallbackTo[Boolean],
      setDefaultTileGrid: typingsJapgolly.ol.tilegridTileGridMod.default => Callback,
      setExtent: Extent => Callback,
      setGetPointResolution: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Callback,
      setGlobal: Boolean => Callback,
      setWorldExtent: Extent => Callback
    ): Projection = {
      val __obj = js.Dynamic.literal(canWrapX = canWrapX.toJsFn, getAxisOrientation = getAxisOrientation.toJsFn, getCode = getCode.toJsFn, getDefaultTileGrid = getDefaultTileGrid.toJsFn, getExtent = getExtent.toJsFn, getMetersPerUnit = getMetersPerUnit.toJsFn, getPointResolutionFunc = getPointResolutionFunc.toJsFn, getUnits = getUnits.toJsFn, getWorldExtent = getWorldExtent.toJsFn, isGlobal = isGlobal.toJsFn, setDefaultTileGrid = js.Any.fromFunction1((t0: typingsJapgolly.ol.tilegridTileGridMod.default) => setDefaultTileGrid(t0).runNow()), setExtent = js.Any.fromFunction1((t0: Extent) => setExtent(t0).runNow()), setGetPointResolution = js.Any.fromFunction1((t0: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]) => setGetPointResolution(t0).runNow()), setGlobal = js.Any.fromFunction1((t0: Boolean) => setGlobal(t0).runNow()), setWorldExtent = js.Any.fromFunction1((t0: Extent) => setWorldExtent(t0).runNow()))
      __obj.asInstanceOf[Projection]
    }
    
    extension [Self <: Projection](x: Self) {
      
      inline def setCanWrapX(value: CallbackTo[Boolean]): Self = StObject.set(x, "canWrapX", value.toJsFn)
      
      inline def setGetAxisOrientation(value: CallbackTo[String]): Self = StObject.set(x, "getAxisOrientation", value.toJsFn)
      
      inline def setGetCode(value: CallbackTo[String]): Self = StObject.set(x, "getCode", value.toJsFn)
      
      inline def setGetDefaultTileGrid(value: CallbackTo[typingsJapgolly.ol.tilegridTileGridMod.default]): Self = StObject.set(x, "getDefaultTileGrid", value.toJsFn)
      
      inline def setGetExtent(value: CallbackTo[Extent]): Self = StObject.set(x, "getExtent", value.toJsFn)
      
      inline def setGetMetersPerUnit(value: CallbackTo[js.UndefOr[Double]]): Self = StObject.set(x, "getMetersPerUnit", value.toJsFn)
      
      inline def setGetPointResolutionFunc(value: CallbackTo[js.Function2[/* p0 */ Double, /* p1 */ Coordinate, js.UndefOr[Double]]]): Self = StObject.set(x, "getPointResolutionFunc", value.toJsFn)
      
      inline def setGetUnits(value: CallbackTo[Units]): Self = StObject.set(x, "getUnits", value.toJsFn)
      
      inline def setGetWorldExtent(value: CallbackTo[Extent]): Self = StObject.set(x, "getWorldExtent", value.toJsFn)
      
      inline def setIsGlobal(value: CallbackTo[Boolean]): Self = StObject.set(x, "isGlobal", value.toJsFn)
      
      inline def setSetDefaultTileGrid(value: typingsJapgolly.ol.tilegridTileGridMod.default => Callback): Self = StObject.set(x, "setDefaultTileGrid", js.Any.fromFunction1((t0: typingsJapgolly.ol.tilegridTileGridMod.default) => value(t0).runNow()))
      
      inline def setSetExtent(value: Extent => Callback): Self = StObject.set(x, "setExtent", js.Any.fromFunction1((t0: Extent) => value(t0).runNow()))
      
      inline def setSetGetPointResolution(value: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double] => Callback): Self = StObject.set(x, "setGetPointResolution", js.Any.fromFunction1((t0: js.Function2[/* p0 */ Double, /* p1 */ Coordinate, Double]) => value(t0).runNow()))
      
      inline def setSetGlobal(value: Boolean => Callback): Self = StObject.set(x, "setGlobal", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetWorldExtent(value: Extent => Callback): Self = StObject.set(x, "setWorldExtent", js.Any.fromFunction1((t0: Extent) => value(t0).runNow()))
    }
  }
}
