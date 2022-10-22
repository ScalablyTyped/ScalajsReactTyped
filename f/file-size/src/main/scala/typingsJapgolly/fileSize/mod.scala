package typingsJapgolly.fileSize

import typingsJapgolly.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T /* <: Options */](bytes: Double): Required[T] & Result = ^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any]).asInstanceOf[Required[T] & Result]
  inline def apply[T /* <: Options */](bytes: Double, options: T): Required[T] & Result = (^.asInstanceOf[js.Dynamic].apply(bytes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Required[T] & Result]
  
  @JSImport("file-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Bits extends StObject {
    
    var fixed: String
    
    var result: Double
  }
  object Bits {
    
    inline def apply(fixed: String, result: Double): Bits = {
      val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bits]
    }
    
    extension [Self <: Bits](x: Self) {
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Calculated extends StObject {
    
    var bits: Bits
    
    var fixed: String
    
    var magnitude: Double
    
    var result: Double
    
    var suffix: String
  }
  object Calculated {
    
    inline def apply(bits: Bits, fixed: String, magnitude: Double, result: Double, suffix: String): Calculated = {
      val __obj = js.Dynamic.literal(bits = bits.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], magnitude = magnitude.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Calculated]
    }
    
    extension [Self <: Calculated](x: Self) {
      
      inline def setBits(value: Bits): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setMagnitude(value: Double): Self = StObject.set(x, "magnitude", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Double): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var fixed: js.UndefOr[Double] = js.undefined
    
    var spacer: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setFixed(value: Double): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setSpacer(value: String): Self = StObject.set(x, "spacer", value.asInstanceOf[js.Any])
      
      inline def setSpacerUndefined: Self = StObject.set(x, "spacer", js.undefined)
    }
  }
  
  @js.native
  trait Result extends StObject {
    
    def calculate(): Calculated = js.native
    def calculate(spec: Spec): Calculated = js.native
    
    def human(): String = js.native
    def human(spec: Spec): String = js.native
    
    def to(unit: Unit): String = js.native
    def to(unit: Unit, spec: Spec): String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fileSize.fileSizeStrings.si
    - typingsJapgolly.fileSize.fileSizeStrings.iec
    - typingsJapgolly.fileSize.fileSizeStrings.jedec
  */
  trait Spec extends StObject
  object Spec {
    
    inline def iec: typingsJapgolly.fileSize.fileSizeStrings.iec = "iec".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.iec]
    
    inline def jedec: typingsJapgolly.fileSize.fileSizeStrings.jedec = "jedec".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.jedec]
    
    inline def si: typingsJapgolly.fileSize.fileSizeStrings.si = "si".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.si]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.fileSize.fileSizeStrings.B
    - typingsJapgolly.fileSize.fileSizeStrings.KB
    - typingsJapgolly.fileSize.fileSizeStrings.MB
    - typingsJapgolly.fileSize.fileSizeStrings.GB
    - typingsJapgolly.fileSize.fileSizeStrings.TB
    - typingsJapgolly.fileSize.fileSizeStrings.PB
    - typingsJapgolly.fileSize.fileSizeStrings.EB
    - typingsJapgolly.fileSize.fileSizeStrings.ZB
    - typingsJapgolly.fileSize.fileSizeStrings.YB
  */
  trait Unit extends StObject
  object Unit {
    
    inline def B: typingsJapgolly.fileSize.fileSizeStrings.B = "B".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.B]
    
    inline def EB: typingsJapgolly.fileSize.fileSizeStrings.EB = "EB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.EB]
    
    inline def GB: typingsJapgolly.fileSize.fileSizeStrings.GB = "GB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.GB]
    
    inline def KB: typingsJapgolly.fileSize.fileSizeStrings.KB = "KB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.KB]
    
    inline def MB: typingsJapgolly.fileSize.fileSizeStrings.MB = "MB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.MB]
    
    inline def PB: typingsJapgolly.fileSize.fileSizeStrings.PB = "PB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.PB]
    
    inline def TB: typingsJapgolly.fileSize.fileSizeStrings.TB = "TB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.TB]
    
    inline def YB: typingsJapgolly.fileSize.fileSizeStrings.YB = "YB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.YB]
    
    inline def ZB: typingsJapgolly.fileSize.fileSizeStrings.ZB = "ZB".asInstanceOf[typingsJapgolly.fileSize.fileSizeStrings.ZB]
  }
}
