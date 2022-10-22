package typingsJapgolly.flowdoc.Flow

import typingsJapgolly.flowdoc.flowdocStrings.DIAMOND
import typingsJapgolly.flowdoc.flowdocStrings.DOCUMENT
import typingsJapgolly.flowdoc.flowdocStrings.ELLIPSE
import typingsJapgolly.flowdoc.flowdocStrings.HOTSPOT
import typingsJapgolly.flowdoc.flowdocStrings.IMAGE
import typingsJapgolly.flowdoc.flowdocStrings.LAYER
import typingsJapgolly.flowdoc.flowdocStrings.PAGE
import typingsJapgolly.flowdoc.flowdocStrings.RECT
import typingsJapgolly.flowdoc.flowdocStrings.SCREEN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Types extends StObject {
  
  var DIAMOND: typingsJapgolly.flowdoc.flowdocStrings.DIAMOND
  
  var DOCUMENT: typingsJapgolly.flowdoc.flowdocStrings.DOCUMENT
  
  var ELLIPSE: typingsJapgolly.flowdoc.flowdocStrings.ELLIPSE
  
  var HOTSPOT: typingsJapgolly.flowdoc.flowdocStrings.HOTSPOT
  
  var IMAGE: typingsJapgolly.flowdoc.flowdocStrings.IMAGE
  
  var LAYER: typingsJapgolly.flowdoc.flowdocStrings.LAYER
  
  var PAGE: typingsJapgolly.flowdoc.flowdocStrings.PAGE
  
  var RECTANGLE: RECT
  
  var SCREEN: typingsJapgolly.flowdoc.flowdocStrings.SCREEN
}
object Types {
  
  inline def apply(): Types = {
    val __obj = js.Dynamic.literal(DIAMOND = "DIAMOND", DOCUMENT = "DOCUMENT", ELLIPSE = "ELLIPSE", HOTSPOT = "HOTSPOT", IMAGE = "IMAGE", LAYER = "LAYER", PAGE = "PAGE", RECTANGLE = "RECT", SCREEN = "SCREEN")
    __obj.asInstanceOf[Types]
  }
  
  extension [Self <: Types](x: Self) {
    
    inline def setDIAMOND(value: DIAMOND): Self = StObject.set(x, "DIAMOND", value.asInstanceOf[js.Any])
    
    inline def setDOCUMENT(value: DOCUMENT): Self = StObject.set(x, "DOCUMENT", value.asInstanceOf[js.Any])
    
    inline def setELLIPSE(value: ELLIPSE): Self = StObject.set(x, "ELLIPSE", value.asInstanceOf[js.Any])
    
    inline def setHOTSPOT(value: HOTSPOT): Self = StObject.set(x, "HOTSPOT", value.asInstanceOf[js.Any])
    
    inline def setIMAGE(value: IMAGE): Self = StObject.set(x, "IMAGE", value.asInstanceOf[js.Any])
    
    inline def setLAYER(value: LAYER): Self = StObject.set(x, "LAYER", value.asInstanceOf[js.Any])
    
    inline def setPAGE(value: PAGE): Self = StObject.set(x, "PAGE", value.asInstanceOf[js.Any])
    
    inline def setRECTANGLE(value: RECT): Self = StObject.set(x, "RECTANGLE", value.asInstanceOf[js.Any])
    
    inline def setSCREEN(value: SCREEN): Self = StObject.set(x, "SCREEN", value.asInstanceOf[js.Any])
  }
}
