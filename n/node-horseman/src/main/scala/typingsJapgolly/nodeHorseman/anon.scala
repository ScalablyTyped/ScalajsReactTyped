package typingsJapgolly.nodeHorseman

import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.A3
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.A4
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.A5
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.Legal
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.Letter
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.Tabloid
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.landscape
import typingsJapgolly.nodeHorseman.nodeHorsemanStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Format extends StObject {
    
    var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
    
    var margin: js.UndefOr[String] = js.undefined
    
    var orientation: js.UndefOr[portrait | landscape] = js.undefined
  }
  object Format {
    
    inline def apply(): Format = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: A3 | A4 | A5 | Legal | Letter | Tabloid): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOrientation(value: portrait | landscape): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
}
