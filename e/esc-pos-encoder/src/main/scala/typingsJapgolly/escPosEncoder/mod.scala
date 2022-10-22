package typingsJapgolly.escPosEncoder

import typingsJapgolly.escPosEncoder.escPosEncoderInts.`1`
import typingsJapgolly.escPosEncoder.escPosEncoderInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("esc-pos-encoder", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EscPosEncoder
  
  @js.native
  trait EscPosEncoder extends StObject {
    
    def align(value: alignType): EscPosEncoder = js.native
    
    def barcode(value: String, symbology: symbologyType, height: Double): EscPosEncoder = js.native
    
    def bold(): EscPosEncoder = js.native
    def bold(value: Boolean): EscPosEncoder = js.native
    
    def codepage(value: codepageType): EscPosEncoder = js.native
    
    def cut(): EscPosEncoder = js.native
    def cut(value: cutType): EscPosEncoder = js.native
    
    def encode(): js.typedarray.Uint8Array = js.native
    
    def image(element: Any, width: Double, height: Double): EscPosEncoder = js.native
    def image(element: Any, width: Double, height: Double, algorithm: Unit, threshold: Double): EscPosEncoder = js.native
    def image(element: Any, width: Double, height: Double, algorithm: imgAlgType): EscPosEncoder = js.native
    def image(element: Any, width: Double, height: Double, algorithm: imgAlgType, threshold: Double): EscPosEncoder = js.native
    
    def initialize(): EscPosEncoder = js.native
    
    def italic(): EscPosEncoder = js.native
    def italic(value: Boolean): EscPosEncoder = js.native
    
    def line(value: String): EscPosEncoder = js.native
    def line(value: String, wrap: Double): EscPosEncoder = js.native
    
    def newline(): EscPosEncoder = js.native
    
    def qrcode(value: String): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`, size: Unit, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`, size: qrSizeType): EscPosEncoder = js.native
    def qrcode(value: String, model: `1` | `2`, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    def qrcode(value: String, model: Unit, size: Unit, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    def qrcode(value: String, model: Unit, size: qrSizeType): EscPosEncoder = js.native
    def qrcode(value: String, model: Unit, size: qrSizeType, errorLevel: qrErrorLevelType): EscPosEncoder = js.native
    
    def raw(data: js.Array[Double]): EscPosEncoder = js.native
    def raw(data: js.typedarray.Uint8Array): EscPosEncoder = js.native
    
    def size(value: sizeType): EscPosEncoder = js.native
    
    def text(value: String): EscPosEncoder = js.native
    def text(value: String, wrap: Double): EscPosEncoder = js.native
    
    def underline(): EscPosEncoder = js.native
    def underline(value: Boolean): EscPosEncoder = js.native
    @JSName("underline")
    def underline_2(value: `2`): EscPosEncoder = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.left
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.center
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.right
  */
  trait alignType extends StObject
  object alignType {
    
    inline def center: typingsJapgolly.escPosEncoder.escPosEncoderStrings.center = "center".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.center]
    
    inline def left: typingsJapgolly.escPosEncoder.escPosEncoderStrings.left = "left".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.left]
    
    inline def right: typingsJapgolly.escPosEncoder.escPosEncoderStrings.right = "right".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp437
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp737
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp850
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp775
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp852
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp855
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp857
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp858
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp860
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp861
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp862
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp863
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp864
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp865
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp866
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp869
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp936
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp949
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp950
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp1252
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.iso88596
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.shiftjis
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1250
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1251
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1252
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1253
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1254
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1255
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1256
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1257
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1258
  */
  trait codepageType extends StObject
  object codepageType {
    
    inline def cp1252: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp1252 = "cp1252".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp1252]
    
    inline def cp437: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp437 = "cp437".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp437]
    
    inline def cp737: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp737 = "cp737".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp737]
    
    inline def cp775: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp775 = "cp775".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp775]
    
    inline def cp850: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp850 = "cp850".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp850]
    
    inline def cp852: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp852 = "cp852".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp852]
    
    inline def cp855: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp855 = "cp855".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp855]
    
    inline def cp857: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp857 = "cp857".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp857]
    
    inline def cp858: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp858 = "cp858".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp858]
    
    inline def cp860: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp860 = "cp860".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp860]
    
    inline def cp861: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp861 = "cp861".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp861]
    
    inline def cp862: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp862 = "cp862".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp862]
    
    inline def cp863: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp863 = "cp863".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp863]
    
    inline def cp864: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp864 = "cp864".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp864]
    
    inline def cp865: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp865 = "cp865".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp865]
    
    inline def cp866: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp866 = "cp866".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp866]
    
    inline def cp869: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp869 = "cp869".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp869]
    
    inline def cp936: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp936 = "cp936".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp936]
    
    inline def cp949: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp949 = "cp949".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp949]
    
    inline def cp950: typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp950 = "cp950".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.cp950]
    
    inline def iso88596: typingsJapgolly.escPosEncoder.escPosEncoderStrings.iso88596 = "iso88596".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.iso88596]
    
    inline def shiftjis: typingsJapgolly.escPosEncoder.escPosEncoderStrings.shiftjis = "shiftjis".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.shiftjis]
    
    inline def windows1250: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1250 = "windows1250".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1250]
    
    inline def windows1251: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1251 = "windows1251".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1251]
    
    inline def windows1252: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1252 = "windows1252".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1252]
    
    inline def windows1253: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1253 = "windows1253".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1253]
    
    inline def windows1254: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1254 = "windows1254".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1254]
    
    inline def windows1255: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1255 = "windows1255".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1255]
    
    inline def windows1256: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1256 = "windows1256".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1256]
    
    inline def windows1257: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1257 = "windows1257".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1257]
    
    inline def windows1258: typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1258 = "windows1258".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.windows1258]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.full
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.partial
  */
  trait cutType extends StObject
  object cutType {
    
    inline def full: typingsJapgolly.escPosEncoder.escPosEncoderStrings.full = "full".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.full]
    
    inline def partial: typingsJapgolly.escPosEncoder.escPosEncoderStrings.partial = "partial".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.partial]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.threshold
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.bayer
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.floydsteinberg
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.atkinson
  */
  trait imgAlgType extends StObject
  object imgAlgType {
    
    inline def atkinson: typingsJapgolly.escPosEncoder.escPosEncoderStrings.atkinson = "atkinson".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.atkinson]
    
    inline def bayer: typingsJapgolly.escPosEncoder.escPosEncoderStrings.bayer = "bayer".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.bayer]
    
    inline def floydsteinberg: typingsJapgolly.escPosEncoder.escPosEncoderStrings.floydsteinberg = "floydsteinberg".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.floydsteinberg]
    
    inline def threshold: typingsJapgolly.escPosEncoder.escPosEncoderStrings.threshold = "threshold".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.threshold]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.l
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.m
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.q
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.h
  */
  trait qrErrorLevelType extends StObject
  object qrErrorLevelType {
    
    inline def h: typingsJapgolly.escPosEncoder.escPosEncoderStrings.h = "h".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.h]
    
    inline def l: typingsJapgolly.escPosEncoder.escPosEncoderStrings.l = "l".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.l]
    
    inline def m: typingsJapgolly.escPosEncoder.escPosEncoderStrings.m = "m".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.m]
    
    inline def q: typingsJapgolly.escPosEncoder.escPosEncoderStrings.q = "q".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.q]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`1`
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`2`
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`3`
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`4`
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`5`
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`6`
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`7`
    - typingsJapgolly.escPosEncoder.escPosEncoderInts.`8`
  */
  trait qrSizeType extends StObject
  object qrSizeType {
    
    inline def `1`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`1` = 1.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`1`]
    
    inline def `2`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`2` = 2.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`2`]
    
    inline def `3`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`3` = 3.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`3`]
    
    inline def `4`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`4` = 4.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`4`]
    
    inline def `5`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`5` = 5.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`5`]
    
    inline def `6`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`6` = 6.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`6`]
    
    inline def `7`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`7` = 7.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`7`]
    
    inline def `8`: typingsJapgolly.escPosEncoder.escPosEncoderInts.`8` = 8.asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderInts.`8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.small
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.normal
  */
  trait sizeType extends StObject
  object sizeType {
    
    inline def normal: typingsJapgolly.escPosEncoder.escPosEncoderStrings.normal = "normal".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.normal]
    
    inline def small: typingsJapgolly.escPosEncoder.escPosEncoderStrings.small = "small".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.upca
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.upce
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean13
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean8
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.coda39
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.itf
    - typingsJapgolly.escPosEncoder.escPosEncoderStrings.codabar
  */
  trait symbologyType extends StObject
  object symbologyType {
    
    inline def coda39: typingsJapgolly.escPosEncoder.escPosEncoderStrings.coda39 = "coda39".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.coda39]
    
    inline def codabar: typingsJapgolly.escPosEncoder.escPosEncoderStrings.codabar = "codabar".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.codabar]
    
    inline def ean13: typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean13 = "ean13".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean13]
    
    inline def ean8: typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean8 = "ean8".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.ean8]
    
    inline def itf: typingsJapgolly.escPosEncoder.escPosEncoderStrings.itf = "itf".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.itf]
    
    inline def upca: typingsJapgolly.escPosEncoder.escPosEncoderStrings.upca = "upca".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.upca]
    
    inline def upce: typingsJapgolly.escPosEncoder.escPosEncoderStrings.upce = "upce".asInstanceOf[typingsJapgolly.escPosEncoder.escPosEncoderStrings.upce]
  }
}
