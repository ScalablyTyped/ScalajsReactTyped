package typingsJapgolly.html2canvas

import typingsJapgolly.html2canvas.distTypesCssIpropertydescriptorMod.IPropertyIdentValueDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssPropertyDescriptorsLineBreakMod {
  
  @js.native
  sealed trait LINE_BREAK extends StObject
  @JSImport("html2canvas/dist/types/css/property-descriptors/line-break", "LINE_BREAK")
  @js.native
  object LINE_BREAK extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LINE_BREAK & String] = js.native
    
    @js.native
    sealed trait NORMAL
      extends StObject
         with LINE_BREAK
    /* "normal" */ val NORMAL: typingsJapgolly.html2canvas.distTypesCssPropertyDescriptorsLineBreakMod.LINE_BREAK.NORMAL & String = js.native
    
    @js.native
    sealed trait STRICT
      extends StObject
         with LINE_BREAK
    /* "strict" */ val STRICT: typingsJapgolly.html2canvas.distTypesCssPropertyDescriptorsLineBreakMod.LINE_BREAK.STRICT & String = js.native
  }
  
  @JSImport("html2canvas/dist/types/css/property-descriptors/line-break", "lineBreak")
  @js.native
  val lineBreak: IPropertyIdentValueDescriptor[LINE_BREAK] = js.native
}
