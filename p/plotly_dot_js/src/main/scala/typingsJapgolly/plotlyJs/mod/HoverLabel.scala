package typingsJapgolly.plotlyJs.mod

import typingsJapgolly.plotlyJs.anon.PartialFont
import typingsJapgolly.plotlyJs.plotlyJsStrings.auto
import typingsJapgolly.plotlyJs.plotlyJsStrings.left
import typingsJapgolly.plotlyJs.plotlyJsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoverLabel
  extends StObject
     with Label {
  
  /**
    * Sets the horizontal alignment of the text content within hover label box.
    * @default "auto"
    */
  var align: left | right | auto
  
  /**
    * Sets the default length (in number of characters) of the trace name
    * in the hover labels for all traces.
    * -1 shows the whole name regardless of length.
    * @default 15
    */
  var namelength: Double
}
object HoverLabel {
  
  inline def apply(
    align: left | right | auto,
    bgcolor: String,
    bordercolor: String,
    font: PartialFont,
    namelength: Double
  ): HoverLabel = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], namelength = namelength.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoverLabel]
  }
  
  extension [Self <: HoverLabel](x: Self) {
    
    inline def setAlign(value: left | right | auto): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setNamelength(value: Double): Self = StObject.set(x, "namelength", value.asInstanceOf[js.Any])
  }
}
