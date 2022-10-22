package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.GPSCoordinates
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.UnmarshalledGPSCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGpspointdimensionMod {
  
  trait GPSPointDimension extends StObject {
    
    /**
      * Coordinate to measure distance from.
      */
    var Coordinates: js.UndefOr[GPSCoordinates] = js.undefined
    
    /**
      * Range in kilometers from the coordinate.
      */
    var RangeInKilometers: js.UndefOr[Double] = js.undefined
  }
  object GPSPointDimension {
    
    inline def apply(): GPSPointDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GPSPointDimension]
    }
    
    extension [Self <: GPSPointDimension](x: Self) {
      
      inline def setCoordinates(value: GPSCoordinates): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesUndefined: Self = StObject.set(x, "Coordinates", js.undefined)
      
      inline def setRangeInKilometers(value: Double): Self = StObject.set(x, "RangeInKilometers", value.asInstanceOf[js.Any])
      
      inline def setRangeInKilometersUndefined: Self = StObject.set(x, "RangeInKilometers", js.undefined)
    }
  }
  
  trait UnmarshalledGPSPointDimension
    extends StObject
       with GPSPointDimension {
    
    /**
      * Coordinate to measure distance from.
      */
    @JSName("Coordinates")
    var Coordinates_UnmarshalledGPSPointDimension: js.UndefOr[UnmarshalledGPSCoordinates] = js.undefined
  }
  object UnmarshalledGPSPointDimension {
    
    inline def apply(): UnmarshalledGPSPointDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGPSPointDimension]
    }
    
    extension [Self <: UnmarshalledGPSPointDimension](x: Self) {
      
      inline def setCoordinates(value: UnmarshalledGPSCoordinates): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesUndefined: Self = StObject.set(x, "Coordinates", js.undefined)
    }
  }
}
