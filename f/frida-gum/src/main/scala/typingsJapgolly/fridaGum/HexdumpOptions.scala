package typingsJapgolly.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexdumpOptions extends StObject {
  
  /**
    * Whether ANSI colors should be used. Defaults to false.
    */
  var ansi: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether a header should be included. Defaults to true.
    */
  var header: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Limits how many bytes to dump.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies byte offset of where to start dumping. Defaults to 0.
    */
  var offset: js.UndefOr[Double] = js.undefined
}
object HexdumpOptions {
  
  inline def apply(): HexdumpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HexdumpOptions]
  }
  
  extension [Self <: HexdumpOptions](x: Self) {
    
    inline def setAnsi(value: Boolean): Self = StObject.set(x, "ansi", value.asInstanceOf[js.Any])
    
    inline def setAnsiUndefined: Self = StObject.set(x, "ansi", js.undefined)
    
    inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
