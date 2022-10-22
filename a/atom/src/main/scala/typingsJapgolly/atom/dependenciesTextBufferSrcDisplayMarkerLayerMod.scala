package typingsJapgolly.atom

import typingsJapgolly.atom.anon.ClipDirection
import typingsJapgolly.atom.anon.Exclusive
import typingsJapgolly.atom.anon.ExclusiveInvalidate
import typingsJapgolly.atom.anon.Invalidate
import typingsJapgolly.atom.dependenciesTextBufferSrcDisplayMarkerMod.DisplayMarker
import typingsJapgolly.atom.dependenciesTextBufferSrcMarkerMod.Marker
import typingsJapgolly.atom.dependenciesTextBufferSrcPointMod.PointCompatible
import typingsJapgolly.atom.dependenciesTextBufferSrcRangeMod.RangeCompatible
import typingsJapgolly.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesTextBufferSrcDisplayMarkerLayerMod {
  
  @js.native
  trait DisplayMarkerLayer extends StObject {
    
    /** Destroy all markers in this layer. */
    def clear(): Unit = js.native
    
    // Lifecycle
    /** Destroy this layer. */
    def destroy(): Unit = js.native
    
    /**
      *  Find markers in the layer conforming to the given parameters.
      *
      *  This method finds markers based on the given properties. Markers can be associated
      *  with custom properties that will be compared with basic equality. In addition,
      *  there are several special properties that will be compared with the range of the
      *  markers rather than their properties.
      */
    def findMarkers(properties: FindDisplayMarkerOptions): js.Array[DisplayMarker] = js.native
    
    // Querying
    /** Get an existing marker by its id. */
    def getMarker(id: Double): DisplayMarker = js.native
    
    /** Get the number of markers in the marker layer. */
    def getMarkerCount(): Double = js.native
    
    /** Get all markers in the layer. */
    def getMarkers(): js.Array[DisplayMarker] = js.native
    
    /** The identifier for the underlying MarkerLayer. */
    val id: String = js.native
    
    /** Determine whether this layer has been destroyed. */
    def isDestroyed(): Boolean = js.native
    
    /**
      *  Create a marker on this layer with its head at the given buffer position
      *  and no tail.
      */
    def markBufferPosition(bufferPosition: PointCompatible): DisplayMarker = js.native
    def markBufferPosition(bufferPosition: PointCompatible, options: ExclusiveInvalidate): DisplayMarker = js.native
    
    /** Create a marker with the given buffer range. */
    def markBufferRange(range: RangeCompatible): DisplayMarker = js.native
    def markBufferRange(range: RangeCompatible, options: Invalidate): DisplayMarker = js.native
    
    /**
      *  Create a marker on this layer with its head at the given screen position
      *  and no tail.
      */
    def markScreenPosition(screenPosition: PointCompatible): DisplayMarker = js.native
    def markScreenPosition(screenPosition: PointCompatible, options: Exclusive): DisplayMarker = js.native
    
    // Marker creation
    /** Create a marker with the given screen range. */
    def markScreenRange(range: RangeCompatible): DisplayMarker = js.native
    def markScreenRange(range: RangeCompatible, options: ClipDirection): DisplayMarker = js.native
    
    /**
      *  Subscribe to be notified synchronously whenever markers are created on this
      *  layer. Avoid this method for optimal performance when interacting with layers
      *  that could contain large numbers of markers.
      */
    def onDidCreateMarker(callback: js.Function1[/* marker */ DisplayMarker | Marker, Unit]): Disposable = js.native
    
    // Event Subscription
    /** Subscribe to be notified synchronously when this layer is destroyed. */
    def onDidDestroy(callback: js.Function0[Unit]): Disposable = js.native
    
    /**
      *  Subscribe to be notified asynchronously whenever markers are created, updated,
      *  or destroyed on this layer. Prefer this method for optimal performance when
      *  interacting with layers that could contain large numbers of markers.
      */
    def onDidUpdate(callback: js.Function0[Unit]): Disposable = js.native
  }
  
  trait FindDisplayMarkerOptions extends StObject {
    
    /** Only include markers contained in this Range in buffer coordinates. */
    var containedInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers contained in this Range in screen coordinates. */
    var containedInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers containing this Point in buffer coordinates. */
    var containsBufferPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers containing this Range in buffer coordinates. */
    var containsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers ending at this Point in buffer coordinates. */
    var endBufferPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers ending at this row in buffer coordinates. */
    var endBufferRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers ending at this Point in screen coordinates. */
    var endScreenPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers ending at this row in screen coordinates. */
    var endScreenRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers ending inside this Range in buffer coordinates. */
    var endsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers ending inside this Range in screen coordinates. */
    var endsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers intersecting this Range in buffer coordinates. */
    var intersectsBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /**
      *  Only include markers intersecting this Array of [startRow, endRow] in
      *  buffer coordinates.
      */
    var intersectsBufferRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /** Only include markers intersecting this Range in screen coordinates. */
    var intersectsScreenRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /**
      *  Only include markers intersecting this Array of [startRow, endRow] in
      *  screen coordinates.
      */
    var intersectsScreenRowRange: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    /** Only include markers starting at this Point in buffer coordinates. */
    var startBufferPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers starting at this row in buffer coordinates. */
    var startBufferRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers starting at this Point in screen coordinates. */
    var startScreenPosition: js.UndefOr[PointCompatible] = js.undefined
    
    /** Only include markers starting at this row in screen coordinates. */
    var startScreenRow: js.UndefOr[Double] = js.undefined
    
    /** Only include markers starting inside this Range in buffer coordinates. */
    var startsInBufferRange: js.UndefOr[RangeCompatible] = js.undefined
    
    /** Only include markers starting inside this Range in screen coordinates. */
    var startsInScreenRange: js.UndefOr[RangeCompatible] = js.undefined
  }
  object FindDisplayMarkerOptions {
    
    inline def apply(): FindDisplayMarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FindDisplayMarkerOptions]
    }
    
    extension [Self <: FindDisplayMarkerOptions](x: Self) {
      
      inline def setContainedInBufferRange(value: RangeCompatible): Self = StObject.set(x, "containedInBufferRange", value.asInstanceOf[js.Any])
      
      inline def setContainedInBufferRangeUndefined: Self = StObject.set(x, "containedInBufferRange", js.undefined)
      
      inline def setContainedInScreenRange(value: RangeCompatible): Self = StObject.set(x, "containedInScreenRange", value.asInstanceOf[js.Any])
      
      inline def setContainedInScreenRangeUndefined: Self = StObject.set(x, "containedInScreenRange", js.undefined)
      
      inline def setContainsBufferPosition(value: PointCompatible): Self = StObject.set(x, "containsBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setContainsBufferPositionUndefined: Self = StObject.set(x, "containsBufferPosition", js.undefined)
      
      inline def setContainsBufferRange(value: RangeCompatible): Self = StObject.set(x, "containsBufferRange", value.asInstanceOf[js.Any])
      
      inline def setContainsBufferRangeUndefined: Self = StObject.set(x, "containsBufferRange", js.undefined)
      
      inline def setEndBufferPosition(value: PointCompatible): Self = StObject.set(x, "endBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setEndBufferPositionUndefined: Self = StObject.set(x, "endBufferPosition", js.undefined)
      
      inline def setEndBufferRow(value: Double): Self = StObject.set(x, "endBufferRow", value.asInstanceOf[js.Any])
      
      inline def setEndBufferRowUndefined: Self = StObject.set(x, "endBufferRow", js.undefined)
      
      inline def setEndScreenPosition(value: PointCompatible): Self = StObject.set(x, "endScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setEndScreenPositionUndefined: Self = StObject.set(x, "endScreenPosition", js.undefined)
      
      inline def setEndScreenRow(value: Double): Self = StObject.set(x, "endScreenRow", value.asInstanceOf[js.Any])
      
      inline def setEndScreenRowUndefined: Self = StObject.set(x, "endScreenRow", js.undefined)
      
      inline def setEndsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "endsInBufferRange", value.asInstanceOf[js.Any])
      
      inline def setEndsInBufferRangeUndefined: Self = StObject.set(x, "endsInBufferRange", js.undefined)
      
      inline def setEndsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "endsInScreenRange", value.asInstanceOf[js.Any])
      
      inline def setEndsInScreenRangeUndefined: Self = StObject.set(x, "endsInScreenRange", js.undefined)
      
      inline def setIntersectsBufferRange(value: RangeCompatible): Self = StObject.set(x, "intersectsBufferRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsBufferRangeUndefined: Self = StObject.set(x, "intersectsBufferRange", js.undefined)
      
      inline def setIntersectsBufferRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsBufferRowRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsBufferRowRangeUndefined: Self = StObject.set(x, "intersectsBufferRowRange", js.undefined)
      
      inline def setIntersectsScreenRange(value: RangeCompatible): Self = StObject.set(x, "intersectsScreenRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsScreenRangeUndefined: Self = StObject.set(x, "intersectsScreenRange", js.undefined)
      
      inline def setIntersectsScreenRowRange(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "intersectsScreenRowRange", value.asInstanceOf[js.Any])
      
      inline def setIntersectsScreenRowRangeUndefined: Self = StObject.set(x, "intersectsScreenRowRange", js.undefined)
      
      inline def setStartBufferPosition(value: PointCompatible): Self = StObject.set(x, "startBufferPosition", value.asInstanceOf[js.Any])
      
      inline def setStartBufferPositionUndefined: Self = StObject.set(x, "startBufferPosition", js.undefined)
      
      inline def setStartBufferRow(value: Double): Self = StObject.set(x, "startBufferRow", value.asInstanceOf[js.Any])
      
      inline def setStartBufferRowUndefined: Self = StObject.set(x, "startBufferRow", js.undefined)
      
      inline def setStartScreenPosition(value: PointCompatible): Self = StObject.set(x, "startScreenPosition", value.asInstanceOf[js.Any])
      
      inline def setStartScreenPositionUndefined: Self = StObject.set(x, "startScreenPosition", js.undefined)
      
      inline def setStartScreenRow(value: Double): Self = StObject.set(x, "startScreenRow", value.asInstanceOf[js.Any])
      
      inline def setStartScreenRowUndefined: Self = StObject.set(x, "startScreenRow", js.undefined)
      
      inline def setStartsInBufferRange(value: RangeCompatible): Self = StObject.set(x, "startsInBufferRange", value.asInstanceOf[js.Any])
      
      inline def setStartsInBufferRangeUndefined: Self = StObject.set(x, "startsInBufferRange", js.undefined)
      
      inline def setStartsInScreenRange(value: RangeCompatible): Self = StObject.set(x, "startsInScreenRange", value.asInstanceOf[js.Any])
      
      inline def setStartsInScreenRangeUndefined: Self = StObject.set(x, "startsInScreenRange", js.undefined)
    }
  }
}
