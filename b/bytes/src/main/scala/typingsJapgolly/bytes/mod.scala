package typingsJapgolly.bytes

import typingsJapgolly.bytes.bytesStrings.b_
import typingsJapgolly.bytes.bytesStrings.gb_
import typingsJapgolly.bytes.bytesStrings.kb_
import typingsJapgolly.bytes.bytesStrings.mb_
import typingsJapgolly.bytes.bytesStrings.pb_
import typingsJapgolly.bytes.bytesStrings.tb_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse string to an integer in bytes.
    */
  inline def apply(value: String): Double = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Double, options: BytesOptions): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("bytes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Format the given value in bytes into a string.
    *
    * If the value is negative, it is kept as such.
    * If it is a float, it is rounded.
    */
  inline def format(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(value: Double, options: BytesOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Parse the string value into an integer in bytes.
    *
    * If no unit is given, it is assumed the value is in bytes.
    */
  inline def parse(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parse(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait BytesOptions extends StObject {
    
    var decimalPlaces: js.UndefOr[Double] = js.undefined
    
    var fixedDecimals: js.UndefOr[Boolean] = js.undefined
    
    var thousandsSeparator: js.UndefOr[String] = js.undefined
    
    var unit: js.UndefOr[Unit] = js.undefined
    
    var unitSeparator: js.UndefOr[String] = js.undefined
  }
  object BytesOptions {
    
    inline def apply(): BytesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BytesOptions]
    }
    
    extension [Self <: BytesOptions](x: Self) {
      
      inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      inline def setFixedDecimals(value: Boolean): Self = StObject.set(x, "fixedDecimals", value.asInstanceOf[js.Any])
      
      inline def setFixedDecimalsUndefined: Self = StObject.set(x, "fixedDecimals", js.undefined)
      
      inline def setThousandsSeparator(value: String): Self = StObject.set(x, "thousandsSeparator", value.asInstanceOf[js.Any])
      
      inline def setThousandsSeparatorUndefined: Self = StObject.set(x, "thousandsSeparator", js.undefined)
      
      inline def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitSeparator(value: String): Self = StObject.set(x, "unitSeparator", value.asInstanceOf[js.Any])
      
      inline def setUnitSeparatorUndefined: Self = StObject.set(x, "unitSeparator", js.undefined)
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bytes.bytesStrings.b_
    - typingsJapgolly.bytes.bytesStrings.gb_
    - typingsJapgolly.bytes.bytesStrings.kb_
    - typingsJapgolly.bytes.bytesStrings.mb_
    - typingsJapgolly.bytes.bytesStrings.pb_
    - typingsJapgolly.bytes.bytesStrings.tb_
    - typingsJapgolly.bytes.bytesStrings.B
    - typingsJapgolly.bytes.bytesStrings.GB
    - typingsJapgolly.bytes.bytesStrings.KB
    - typingsJapgolly.bytes.bytesStrings.MB
    - typingsJapgolly.bytes.bytesStrings.PB
    - typingsJapgolly.bytes.bytesStrings.TB
  */
  trait Unit extends StObject
  object Unit {
    
    inline def B: typingsJapgolly.bytes.bytesStrings.B = "B".asInstanceOf[typingsJapgolly.bytes.bytesStrings.B]
    
    inline def GB: typingsJapgolly.bytes.bytesStrings.GB = "GB".asInstanceOf[typingsJapgolly.bytes.bytesStrings.GB]
    
    inline def KB: typingsJapgolly.bytes.bytesStrings.KB = "KB".asInstanceOf[typingsJapgolly.bytes.bytesStrings.KB]
    
    inline def MB: typingsJapgolly.bytes.bytesStrings.MB = "MB".asInstanceOf[typingsJapgolly.bytes.bytesStrings.MB]
    
    inline def PB: typingsJapgolly.bytes.bytesStrings.PB = "PB".asInstanceOf[typingsJapgolly.bytes.bytesStrings.PB]
    
    inline def TB: typingsJapgolly.bytes.bytesStrings.TB = "TB".asInstanceOf[typingsJapgolly.bytes.bytesStrings.TB]
    
    inline def b: b_ = "b".asInstanceOf[b_]
    
    inline def gb: gb_ = "gb".asInstanceOf[gb_]
    
    inline def kb: kb_ = "kb".asInstanceOf[kb_]
    
    inline def mb: mb_ = "mb".asInstanceOf[mb_]
    
    inline def pb: pb_ = "pb".asInstanceOf[pb_]
    
    inline def tb: tb_ = "tb".asInstanceOf[tb_]
  }
}
