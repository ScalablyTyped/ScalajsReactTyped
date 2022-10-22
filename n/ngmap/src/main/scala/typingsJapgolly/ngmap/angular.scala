package typingsJapgolly.ngmap

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.PositionOptions
import typingsJapgolly.angular.mod.IPromise
import typingsJapgolly.googleMaps.google.maps.LatLng
import typingsJapgolly.googleMaps.google.maps.Map
import typingsJapgolly.ngmap.anon.AnchorPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object angular {
  
  object map {
    
    trait IGetMapOptions extends StObject {
      
      var id: js.UndefOr[String] = js.undefined
      
      var timeout: js.UndefOr[Double] = js.undefined
    }
    object IGetMapOptions {
      
      inline def apply(): IGetMapOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGetMapOptions]
      }
      
      extension [Self <: IGetMapOptions](x: Self) {
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    @js.native
    trait INgMap extends StObject {
      
      def addMap(mapCtrl: js.Array[Any]): Unit = js.native
      /**
        * Add map to pool
        * @param {Function | any[]} mapCtrl Map controller
        */
      def addMap(mapCtrl: js.Function): Unit = js.native
      
      /**
        * Delete map from pool
        * @param {Function | any[]} mapCtrl Map controller optional. Defaults to last
        * controller in pool
        */
      def deleteMap(): Unit = js.native
      def deleteMap(mapCtrl: js.Array[Any]): Unit = js.native
      def deleteMap(mapCtrl: js.Function): Unit = js.native
      
      /**
        * Get map coordinates from address.
        * @param  {string}                               address Use 'current' to get users location
        * @param  {PositionOptions}                      options optional
        * @return {angular.IPromise<google.maps.LatLng>}         Latitude ang longitude of the address
        */
      def getGeoLocation(address: String): IPromise[LatLng] = js.native
      def getGeoLocation(address: String, options: PositionOptions): IPromise[LatLng] = js.native
      
      /**
        * Get map from the pool of all shown maps.
        * @param  {IGetMapOptions}                    options optional
        * @return {angular.IPromise<google.maps.Map>}         promise
        */
      def getMap(): IPromise[Map] = js.native
      def getMap(options: IGetMapOptions): IPromise[Map] = js.native
      
      /**
        * Initialize map from mapId or the current first shown map
        * @param  {string}          mapId id of the map. default 0
        * @return {google.maps.Map}       map
        */
      def initMap(): Map = js.native
      def initMap(mapId: String): Map = js.native
      
      /**
        * Observe attribute
        * @param  {string}             attrName attribute name
        * @param  {Object}             object   a Google maps object to be changed
        * @return {IObserveAndSetFunc}          attribute obvserve function
        */
      def observeAndSet(attrName: String, `object`: js.Object): IObserveAndSetFunc = js.native
      
      /**
        * Set display, width, height of map container element
        * @param {HTMLElement} el map container element
        */
      def setStyle(el: HTMLElement): Unit = js.native
    }
    
    trait INgMapOptions extends StObject {
      
      var marker: AnchorPoint
    }
    object INgMapOptions {
      
      inline def apply(marker: AnchorPoint): INgMapOptions = {
        val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
        __obj.asInstanceOf[INgMapOptions]
      }
      
      extension [Self <: INgMapOptions](x: Self) {
        
        inline def setMarker(value: AnchorPoint): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      }
    }
    
    trait INgMapProvider extends StObject {
      
      /**
        * @param {Hash} options
        * @example
        *  app.config(function(NgMapProvider) {
        *    NgMapProvider.setDefaultOptions({
        *      marker: {
        *        optimized: false
        *      }
        *    });
        *  });
        */
      def setDefaultOptions(options: INgMapOptions): Unit
    }
    object INgMapProvider {
      
      inline def apply(setDefaultOptions: INgMapOptions => Callback): INgMapProvider = {
        val __obj = js.Dynamic.literal(setDefaultOptions = js.Any.fromFunction1((t0: INgMapOptions) => setDefaultOptions(t0).runNow()))
        __obj.asInstanceOf[INgMapProvider]
      }
      
      extension [Self <: INgMapProvider](x: Self) {
        
        inline def setSetDefaultOptions(value: INgMapOptions => Callback): Self = StObject.set(x, "setDefaultOptions", js.Any.fromFunction1((t0: INgMapOptions) => value(t0).runNow()))
      }
    }
    
    type IObserveAndSetFunc = js.Function1[/* val */ Any, Unit]
  }
}
