package typingsJapgolly.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bumper extends StObject {
  
  /**
    * The URL for the end bumper asset.
    */
  var EndUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The URL for the start bumper asset.
    */
  var StartUrl: js.UndefOr[string] = js.undefined
}
object Bumper {
  
  inline def apply(): Bumper = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bumper]
  }
  
  extension [Self <: Bumper](x: Self) {
    
    inline def setEndUrl(value: string): Self = StObject.set(x, "EndUrl", value.asInstanceOf[js.Any])
    
    inline def setEndUrlUndefined: Self = StObject.set(x, "EndUrl", js.undefined)
    
    inline def setStartUrl(value: string): Self = StObject.set(x, "StartUrl", value.asInstanceOf[js.Any])
    
    inline def setStartUrlUndefined: Self = StObject.set(x, "StartUrl", js.undefined)
  }
}
