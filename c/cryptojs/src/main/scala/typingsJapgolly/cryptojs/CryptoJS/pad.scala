package typingsJapgolly.cryptojs.CryptoJS

import japgolly.scalajs.react.Callback
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pad {
  
  type AnsiX923 = IPaddingImpl
  
  trait IPaddingImpl extends StObject {
    
    def pad(data: WordArray, blockSize: Double): Unit
    
    def unpad(data: WordArray): Unit
  }
  object IPaddingImpl {
    
    inline def apply(pad: (WordArray, Double) => Callback, unpad: WordArray => Callback): IPaddingImpl = {
      val __obj = js.Dynamic.literal(pad = js.Any.fromFunction2((t0: WordArray, t1: Double) => (pad(t0, t1)).runNow()), unpad = js.Any.fromFunction1((t0: WordArray) => unpad(t0).runNow()))
      __obj.asInstanceOf[IPaddingImpl]
    }
    
    extension [Self <: IPaddingImpl](x: Self) {
      
      inline def setPad(value: (WordArray, Double) => Callback): Self = StObject.set(x, "pad", js.Any.fromFunction2((t0: WordArray, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setUnpad(value: WordArray => Callback): Self = StObject.set(x, "unpad", js.Any.fromFunction1((t0: WordArray) => value(t0).runNow()))
    }
  }
  
  type Iso10126 = IPaddingImpl
  
  type Iso97971 = IPaddingImpl
  
  type NoPadding = IPaddingImpl
  
  trait PadStatic extends StObject {
    
    var AnsiX923: typingsJapgolly.cryptojs.CryptoJS.pad.AnsiX923
    
    var Iso10126: typingsJapgolly.cryptojs.CryptoJS.pad.Iso10126
    
    var Iso97971: typingsJapgolly.cryptojs.CryptoJS.pad.Iso97971
    
    var NoPadding: typingsJapgolly.cryptojs.CryptoJS.pad.NoPadding
    
    var Pkcs7: typingsJapgolly.cryptojs.CryptoJS.pad.Pkcs7
    
    var ZeroPadding: typingsJapgolly.cryptojs.CryptoJS.pad.ZeroPadding
  }
  object PadStatic {
    
    inline def apply(
      AnsiX923: AnsiX923,
      Iso10126: Iso10126,
      Iso97971: Iso97971,
      NoPadding: NoPadding,
      Pkcs7: Pkcs7,
      ZeroPadding: ZeroPadding
    ): PadStatic = {
      val __obj = js.Dynamic.literal(AnsiX923 = AnsiX923.asInstanceOf[js.Any], Iso10126 = Iso10126.asInstanceOf[js.Any], Iso97971 = Iso97971.asInstanceOf[js.Any], NoPadding = NoPadding.asInstanceOf[js.Any], Pkcs7 = Pkcs7.asInstanceOf[js.Any], ZeroPadding = ZeroPadding.asInstanceOf[js.Any])
      __obj.asInstanceOf[PadStatic]
    }
    
    extension [Self <: PadStatic](x: Self) {
      
      inline def setAnsiX923(value: AnsiX923): Self = StObject.set(x, "AnsiX923", value.asInstanceOf[js.Any])
      
      inline def setIso10126(value: Iso10126): Self = StObject.set(x, "Iso10126", value.asInstanceOf[js.Any])
      
      inline def setIso97971(value: Iso97971): Self = StObject.set(x, "Iso97971", value.asInstanceOf[js.Any])
      
      inline def setNoPadding(value: NoPadding): Self = StObject.set(x, "NoPadding", value.asInstanceOf[js.Any])
      
      inline def setPkcs7(value: Pkcs7): Self = StObject.set(x, "Pkcs7", value.asInstanceOf[js.Any])
      
      inline def setZeroPadding(value: ZeroPadding): Self = StObject.set(x, "ZeroPadding", value.asInstanceOf[js.Any])
    }
  }
  
  type Pkcs7 = IPaddingImpl
  
  type ZeroPadding = IPaddingImpl
}
