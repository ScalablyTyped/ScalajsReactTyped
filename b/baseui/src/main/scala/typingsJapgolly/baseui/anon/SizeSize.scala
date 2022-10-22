package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeSize extends StObject {
  
  @JSName("$size")
  var $size: typingsJapgolly.baseui.inputTypesMod.Size
}
object SizeSize {
  
  inline def apply($size: typingsJapgolly.baseui.inputTypesMod.Size): SizeSize = {
    val __obj = js.Dynamic.literal($size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeSize]
  }
  
  extension [Self <: SizeSize](x: Self) {
    
    inline def set$size(value: typingsJapgolly.baseui.inputTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
