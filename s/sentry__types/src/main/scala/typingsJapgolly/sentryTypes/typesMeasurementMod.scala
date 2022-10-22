package typingsJapgolly.sentryTypes

import typingsJapgolly.sentryTypes.anon.Unit
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMeasurementMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.sentryTypesStrings.nanosecond
    - typingsJapgolly.sentryTypes.sentryTypesStrings.microsecond
    - typingsJapgolly.sentryTypes.sentryTypesStrings.millisecond
    - typingsJapgolly.sentryTypes.sentryTypesStrings.second
    - typingsJapgolly.sentryTypes.sentryTypesStrings.minute
    - typingsJapgolly.sentryTypes.sentryTypesStrings.hour
    - typingsJapgolly.sentryTypes.sentryTypesStrings.day
    - typingsJapgolly.sentryTypes.sentryTypesStrings.week
  */
  trait DurationUnit extends StObject
  object DurationUnit {
    
    inline def day: typingsJapgolly.sentryTypes.sentryTypesStrings.day = "day".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.day]
    
    inline def hour: typingsJapgolly.sentryTypes.sentryTypesStrings.hour = "hour".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.hour]
    
    inline def microsecond: typingsJapgolly.sentryTypes.sentryTypesStrings.microsecond = "microsecond".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.microsecond]
    
    inline def millisecond: typingsJapgolly.sentryTypes.sentryTypesStrings.millisecond = "millisecond".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.millisecond]
    
    inline def minute: typingsJapgolly.sentryTypes.sentryTypesStrings.minute = "minute".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.minute]
    
    inline def nanosecond: typingsJapgolly.sentryTypes.sentryTypesStrings.nanosecond = "nanosecond".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.nanosecond]
    
    inline def second: typingsJapgolly.sentryTypes.sentryTypesStrings.second = "second".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.second]
    
    inline def week: typingsJapgolly.sentryTypes.sentryTypesStrings.week = "week".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.week]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.sentryTypesStrings.ratio
    - typingsJapgolly.sentryTypes.sentryTypesStrings.percent
  */
  trait FractionUnit extends StObject
  object FractionUnit {
    
    inline def percent: typingsJapgolly.sentryTypes.sentryTypesStrings.percent = "percent".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.percent]
    
    inline def ratio: typingsJapgolly.sentryTypes.sentryTypesStrings.ratio = "ratio".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.ratio]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.sentryTypesStrings.bit
    - typingsJapgolly.sentryTypes.sentryTypesStrings.byte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.kilobyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.kibibyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.megabyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.mebibyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.gigabyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.terabyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.tebibyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.petabyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.exabyte
    - typingsJapgolly.sentryTypes.sentryTypesStrings.exbibyte
  */
  trait InformationUnit extends StObject
  object InformationUnit {
    
    inline def bit: typingsJapgolly.sentryTypes.sentryTypesStrings.bit = "bit".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.bit]
    
    inline def byte: typingsJapgolly.sentryTypes.sentryTypesStrings.byte = "byte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.byte]
    
    inline def exabyte: typingsJapgolly.sentryTypes.sentryTypesStrings.exabyte = "exabyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.exabyte]
    
    inline def exbibyte: typingsJapgolly.sentryTypes.sentryTypesStrings.exbibyte = "exbibyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.exbibyte]
    
    inline def gigabyte: typingsJapgolly.sentryTypes.sentryTypesStrings.gigabyte = "gigabyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.gigabyte]
    
    inline def kibibyte: typingsJapgolly.sentryTypes.sentryTypesStrings.kibibyte = "kibibyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.kibibyte]
    
    inline def kilobyte: typingsJapgolly.sentryTypes.sentryTypesStrings.kilobyte = "kilobyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.kilobyte]
    
    inline def mebibyte: typingsJapgolly.sentryTypes.sentryTypesStrings.mebibyte = "mebibyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.mebibyte]
    
    inline def megabyte: typingsJapgolly.sentryTypes.sentryTypesStrings.megabyte = "megabyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.megabyte]
    
    inline def petabyte: typingsJapgolly.sentryTypes.sentryTypesStrings.petabyte = "petabyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.petabyte]
    
    inline def tebibyte: typingsJapgolly.sentryTypes.sentryTypesStrings.tebibyte = "tebibyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.tebibyte]
    
    inline def terabyte: typingsJapgolly.sentryTypes.sentryTypesStrings.terabyte = "terabyte".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.terabyte]
  }
  
  type LiteralUnion[T /* <: String */] = T | (Omit[T, T])
  
  type MeasurementUnit = LiteralUnion[DurationUnit | InformationUnit | FractionUnit | NoneUnit]
  
  type Measurements = Record[String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sentryTypes.sentryTypesStrings._empty
    - typingsJapgolly.sentryTypes.sentryTypesStrings.none
  */
  trait NoneUnit extends StObject
  object NoneUnit {
    
    inline def _empty: typingsJapgolly.sentryTypes.sentryTypesStrings._empty = "".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings._empty]
    
    inline def none: typingsJapgolly.sentryTypes.sentryTypesStrings.none = "none".asInstanceOf[typingsJapgolly.sentryTypes.sentryTypesStrings.none]
  }
}
