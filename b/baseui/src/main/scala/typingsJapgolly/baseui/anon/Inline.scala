package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inline extends StObject {
  
  @JSName("$inline")
  var $inline: Boolean
  
  @JSName("$size")
  var $size: typingsJapgolly.baseui.progressBarTypesMod.Size
}
object Inline {
  
  inline def apply($inline: Boolean, $size: typingsJapgolly.baseui.progressBarTypesMod.Size): Inline = {
    val __obj = js.Dynamic.literal($inline = $inline.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
  
  extension [Self <: Inline](x: Self) {
    
    inline def set$inline(value: Boolean): Self = StObject.set(x, "$inline", value.asInstanceOf[js.Any])
    
    inline def set$size(value: typingsJapgolly.baseui.progressBarTypesMod.Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
