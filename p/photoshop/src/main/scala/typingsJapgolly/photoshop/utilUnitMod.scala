package typingsJapgolly.photoshop

import typingsJapgolly.photoshop.photoshopStrings.angleUnit
import typingsJapgolly.photoshop.photoshopStrings.centimetersUnit
import typingsJapgolly.photoshop.photoshopStrings.densityUnit
import typingsJapgolly.photoshop.photoshopStrings.distanceUnit
import typingsJapgolly.photoshop.photoshopStrings.inchesUnit
import typingsJapgolly.photoshop.photoshopStrings.millimetersUnit
import typingsJapgolly.photoshop.photoshopStrings.percentUnit
import typingsJapgolly.photoshop.photoshopStrings.picasUnit
import typingsJapgolly.photoshop.photoshopStrings.pixelsUnit
import typingsJapgolly.photoshop.photoshopStrings.pointsUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilUnitMod {
  
  @JSImport("photoshop/util/unit", "angle")
  @js.native
  val angle: Any = js.native
  
  @JSImport("photoshop/util/unit", "centimeters")
  @js.native
  val centimeters: Any = js.native
  
  @JSImport("photoshop/util/unit", "cm")
  @js.native
  val cm: Any = js.native
  
  @JSImport("photoshop/util/unit", "degrees")
  @js.native
  val degrees: Any = js.native
  
  @JSImport("photoshop/util/unit", "density")
  @js.native
  val density: Any = js.native
  
  @JSImport("photoshop/util/unit", "distance")
  @js.native
  val distance: Any = js.native
  
  @JSImport("photoshop/util/unit", "inches")
  @js.native
  val inches: Any = js.native
  
  @JSImport("photoshop/util/unit", "millimeters")
  @js.native
  val millimeters: Any = js.native
  
  @JSImport("photoshop/util/unit", "mm")
  @js.native
  val mm: Any = js.native
  
  @JSImport("photoshop/util/unit", "number")
  @js.native
  val number: Any = js.native
  
  @JSImport("photoshop/util/unit", "percent")
  @js.native
  val percent: Any = js.native
  
  @JSImport("photoshop/util/unit", "picas")
  @js.native
  val picas: Any = js.native
  
  @JSImport("photoshop/util/unit", "pixels")
  @js.native
  val pixels: Any = js.native
  
  @JSImport("photoshop/util/unit", "points")
  @js.native
  val points: Any = js.native
  
  @JSImport("photoshop/util/unit", "pt")
  @js.native
  val pt: Any = js.native
  
  @JSImport("photoshop/util/unit", "px")
  @js.native
  val px: Any = js.native
  
  @JSImport("photoshop/util/unit", "seconds")
  @js.native
  val seconds: Any = js.native
  
  trait AngleValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_AngleValue: angleUnit
  }
  object AngleValue {
    
    inline def apply(_value: Double): AngleValue = {
      val __obj = js.Dynamic.literal(_unit = "angleUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AngleValue]
    }
    
    extension [Self <: AngleValue](x: Self) {
      
      inline def set_unit(value: angleUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait CentimeterValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_CentimeterValue: centimetersUnit
  }
  object CentimeterValue {
    
    inline def apply(_value: Double): CentimeterValue = {
      val __obj = js.Dynamic.literal(_unit = "centimetersUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CentimeterValue]
    }
    
    extension [Self <: CentimeterValue](x: Self) {
      
      inline def set_unit(value: centimetersUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait DensityValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_DensityValue: densityUnit
  }
  object DensityValue {
    
    inline def apply(_value: Double): DensityValue = {
      val __obj = js.Dynamic.literal(_unit = "densityUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DensityValue]
    }
    
    extension [Self <: DensityValue](x: Self) {
      
      inline def set_unit(value: densityUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistanceValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_DistanceValue: distanceUnit
  }
  object DistanceValue {
    
    inline def apply(_value: Double): DistanceValue = {
      val __obj = js.Dynamic.literal(_unit = "distanceUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistanceValue]
    }
    
    extension [Self <: DistanceValue](x: Self) {
      
      inline def set_unit(value: distanceUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait InchValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_InchValue: inchesUnit
  }
  object InchValue {
    
    inline def apply(_value: Double): InchValue = {
      val __obj = js.Dynamic.literal(_unit = "inchesUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InchValue]
    }
    
    extension [Self <: InchValue](x: Self) {
      
      inline def set_unit(value: inchesUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait MillimeterValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_MillimeterValue: millimetersUnit
  }
  object MillimeterValue {
    
    inline def apply(_value: Double): MillimeterValue = {
      val __obj = js.Dynamic.literal(_unit = "millimetersUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MillimeterValue]
    }
    
    extension [Self <: MillimeterValue](x: Self) {
      
      inline def set_unit(value: millimetersUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait PercentValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_PercentValue: percentUnit
  }
  object PercentValue {
    
    inline def apply(_value: Double): PercentValue = {
      val __obj = js.Dynamic.literal(_unit = "percentUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PercentValue]
    }
    
    extension [Self <: PercentValue](x: Self) {
      
      inline def set_unit(value: percentUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait PicaValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_PicaValue: picasUnit
  }
  object PicaValue {
    
    inline def apply(_value: Double): PicaValue = {
      val __obj = js.Dynamic.literal(_unit = "picasUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PicaValue]
    }
    
    extension [Self <: PicaValue](x: Self) {
      
      inline def set_unit(value: picasUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait PixelValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_PixelValue: pixelsUnit
  }
  object PixelValue {
    
    inline def apply(_value: Double): PixelValue = {
      val __obj = js.Dynamic.literal(_unit = "pixelsUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixelValue]
    }
    
    extension [Self <: PixelValue](x: Self) {
      
      inline def set_unit(value: pixelsUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  trait PointValue
    extends StObject
       with UnitValue {
    
    @JSName("_unit")
    var _unit_PointValue: pointsUnit
  }
  object PointValue {
    
    inline def apply(_value: Double): PointValue = {
      val __obj = js.Dynamic.literal(_unit = "pointsUnit", _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PointValue]
    }
    
    extension [Self <: PointValue](x: Self) {
      
      inline def set_unit(value: pointsUnit): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.photoshop.photoshopStrings.angleUnit
    - typingsJapgolly.photoshop.photoshopStrings.densityUnit
    - typingsJapgolly.photoshop.photoshopStrings.distanceUnit
    - typingsJapgolly.photoshop.photoshopStrings.percentUnit
    - typingsJapgolly.photoshop.photoshopStrings.pixelsUnit
    - typingsJapgolly.photoshop.photoshopStrings.pointsUnit
    - typingsJapgolly.photoshop.photoshopStrings.millimetersUnit
    - typingsJapgolly.photoshop.photoshopStrings.centimetersUnit
    - typingsJapgolly.photoshop.photoshopStrings.inchesUnit
    - typingsJapgolly.photoshop.photoshopStrings.picasUnit
  */
  trait UnitTypeEnum extends StObject
  object UnitTypeEnum {
    
    inline def angleUnit: typingsJapgolly.photoshop.photoshopStrings.angleUnit = "angleUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.angleUnit]
    
    inline def centimetersUnit: typingsJapgolly.photoshop.photoshopStrings.centimetersUnit = "centimetersUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.centimetersUnit]
    
    inline def densityUnit: typingsJapgolly.photoshop.photoshopStrings.densityUnit = "densityUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.densityUnit]
    
    inline def distanceUnit: typingsJapgolly.photoshop.photoshopStrings.distanceUnit = "distanceUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.distanceUnit]
    
    inline def inchesUnit: typingsJapgolly.photoshop.photoshopStrings.inchesUnit = "inchesUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.inchesUnit]
    
    inline def millimetersUnit: typingsJapgolly.photoshop.photoshopStrings.millimetersUnit = "millimetersUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.millimetersUnit]
    
    inline def percentUnit: typingsJapgolly.photoshop.photoshopStrings.percentUnit = "percentUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.percentUnit]
    
    inline def picasUnit: typingsJapgolly.photoshop.photoshopStrings.picasUnit = "picasUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.picasUnit]
    
    inline def pixelsUnit: typingsJapgolly.photoshop.photoshopStrings.pixelsUnit = "pixelsUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.pixelsUnit]
    
    inline def pointsUnit: typingsJapgolly.photoshop.photoshopStrings.pointsUnit = "pointsUnit".asInstanceOf[typingsJapgolly.photoshop.photoshopStrings.pointsUnit]
  }
  
  trait UnitValue extends StObject {
    
    var _unit: UnitTypeEnum
    
    var _value: Double
  }
  object UnitValue {
    
    inline def apply(_unit: UnitTypeEnum, _value: Double): UnitValue = {
      val __obj = js.Dynamic.literal(_unit = _unit.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnitValue]
    }
    
    extension [Self <: UnitValue](x: Self) {
      
      inline def set_unit(value: UnitTypeEnum): Self = StObject.set(x, "_unit", value.asInstanceOf[js.Any])
      
      inline def set_value(value: Double): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
