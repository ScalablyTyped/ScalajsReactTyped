package typingsJapgolly.ipfsCoreTypes.distSrcRootMod

import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typingsJapgolly.ipfsCoreTypes.distSrcUtilsMod.PreloadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatOptions
  extends StObject
     with AbortOptions
     with PreloadOptions {
  
  /**
    * An optional max length to read from the file
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * An offset to start reading the file from
    */
  var offset: js.UndefOr[Double] = js.undefined
}
object CatOptions {
  
  inline def apply(): CatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatOptions]
  }
  
  extension [Self <: CatOptions](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
