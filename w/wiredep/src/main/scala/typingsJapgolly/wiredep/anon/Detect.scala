package typingsJapgolly.wiredep.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detect extends StObject {
  
  /**
    * @example:
    *  /(([ \t]*)#\s*bower:*(\S*))(\n|\r|.)*?(#\s*endbower)/gi
    */
  var block: js.RegExp
  
  var detect: Css
  
  var replace: Js
}
object Detect {
  
  inline def apply(block: js.RegExp, detect: Css, replace: Js): Detect = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], detect = detect.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detect]
  }
  
  extension [Self <: Detect](x: Self) {
    
    inline def setBlock(value: js.RegExp): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setDetect(value: Css): Self = StObject.set(x, "detect", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Js): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
  }
}
