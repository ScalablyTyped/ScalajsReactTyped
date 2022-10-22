package typingsJapgolly.dxf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @js.native
  sealed trait UnitTypes extends StObject
  @JSImport("dxf/Common", "UnitTypes")
  @js.native
  object UnitTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UnitTypes & Double] = js.native
    
    @js.native
    sealed trait Angstroms
      extends StObject
         with UnitTypes
    /* 11 */ val Angstroms: typingsJapgolly.dxf.commonMod.UnitTypes.Angstroms & Double = js.native
    
    @js.native
    sealed trait AstronomicalUnits
      extends StObject
         with UnitTypes
    /* 18 */ val AstronomicalUnits: typingsJapgolly.dxf.commonMod.UnitTypes.AstronomicalUnits & Double = js.native
    
    @js.native
    sealed trait Centimeters
      extends StObject
         with UnitTypes
    /* 5 */ val Centimeters: typingsJapgolly.dxf.commonMod.UnitTypes.Centimeters & Double = js.native
    
    @js.native
    sealed trait Decameters
      extends StObject
         with UnitTypes
    /* 15 */ val Decameters: typingsJapgolly.dxf.commonMod.UnitTypes.Decameters & Double = js.native
    
    @js.native
    sealed trait Decimeters
      extends StObject
         with UnitTypes
    /* 14 */ val Decimeters: typingsJapgolly.dxf.commonMod.UnitTypes.Decimeters & Double = js.native
    
    @js.native
    sealed trait Feet
      extends StObject
         with UnitTypes
    /* 2 */ val Feet: typingsJapgolly.dxf.commonMod.UnitTypes.Feet & Double = js.native
    
    @js.native
    sealed trait Gigameters
      extends StObject
         with UnitTypes
    /* 17 */ val Gigameters: typingsJapgolly.dxf.commonMod.UnitTypes.Gigameters & Double = js.native
    
    @js.native
    sealed trait Hectometers
      extends StObject
         with UnitTypes
    /* 16 */ val Hectometers: typingsJapgolly.dxf.commonMod.UnitTypes.Hectometers & Double = js.native
    
    @js.native
    sealed trait Inches
      extends StObject
         with UnitTypes
    /* 1 */ val Inches: typingsJapgolly.dxf.commonMod.UnitTypes.Inches & Double = js.native
    
    @js.native
    sealed trait Kilometers
      extends StObject
         with UnitTypes
    /* 7 */ val Kilometers: typingsJapgolly.dxf.commonMod.UnitTypes.Kilometers & Double = js.native
    
    @js.native
    sealed trait LightYears
      extends StObject
         with UnitTypes
    /* 19 */ val LightYears: typingsJapgolly.dxf.commonMod.UnitTypes.LightYears & Double = js.native
    
    @js.native
    sealed trait Meters
      extends StObject
         with UnitTypes
    /* 6 */ val Meters: typingsJapgolly.dxf.commonMod.UnitTypes.Meters & Double = js.native
    
    @js.native
    sealed trait Microinches
      extends StObject
         with UnitTypes
    /* 8 */ val Microinches: typingsJapgolly.dxf.commonMod.UnitTypes.Microinches & Double = js.native
    
    @js.native
    sealed trait Microns
      extends StObject
         with UnitTypes
    /* 13 */ val Microns: typingsJapgolly.dxf.commonMod.UnitTypes.Microns & Double = js.native
    
    @js.native
    sealed trait Miles
      extends StObject
         with UnitTypes
    /* 3 */ val Miles: typingsJapgolly.dxf.commonMod.UnitTypes.Miles & Double = js.native
    
    @js.native
    sealed trait Millimeters
      extends StObject
         with UnitTypes
    /* 4 */ val Millimeters: typingsJapgolly.dxf.commonMod.UnitTypes.Millimeters & Double = js.native
    
    @js.native
    sealed trait Mils
      extends StObject
         with UnitTypes
    /* 9 */ val Mils: typingsJapgolly.dxf.commonMod.UnitTypes.Mils & Double = js.native
    
    @js.native
    sealed trait Nanometers
      extends StObject
         with UnitTypes
    /* 12 */ val Nanometers: typingsJapgolly.dxf.commonMod.UnitTypes.Nanometers & Double = js.native
    
    @js.native
    sealed trait Parsec
      extends StObject
         with UnitTypes
    /* 20 */ val Parsec: typingsJapgolly.dxf.commonMod.UnitTypes.Parsec & Double = js.native
    
    @js.native
    sealed trait Unitless
      extends StObject
         with UnitTypes
    /* 0 */ val Unitless: typingsJapgolly.dxf.commonMod.UnitTypes.Unitless & Double = js.native
    
    @js.native
    sealed trait Yards
      extends StObject
         with UnitTypes
    /* 10 */ val Yards: typingsJapgolly.dxf.commonMod.UnitTypes.Yards & Double = js.native
  }
  
  type ColorNumber = js.Tuple3[Double, Double, Double]
  
  type ColorNumbers = js.Array[ColorNumber]
  
  trait Point2D extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point2D {
    
    inline def apply(x: Double, y: Double): Point2D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point2D]
    }
    
    extension [Self <: Point2D](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point3D
    extends StObject
       with Point2D {
    
    var z: Double
  }
  object Point3D {
    
    inline def apply(x: Double, y: Double, z: Double): Point3D = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point3D]
    }
    
    extension [Self <: Point3D](x: Self) {
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
}
