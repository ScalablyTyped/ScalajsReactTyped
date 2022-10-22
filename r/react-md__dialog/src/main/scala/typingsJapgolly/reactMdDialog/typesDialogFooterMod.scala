package typingsJapgolly.reactMdDialog

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDialogFooterMod {
  
  @JSImport("@react-md/dialog/types/DialogFooter", "DialogFooter")
  @js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactMdDialog.reactMdDialogStrings.none
    - typingsJapgolly.reactMdDialog.reactMdDialogStrings.start
    - typingsJapgolly.reactMdDialog.reactMdDialogStrings.end
    - typingsJapgolly.reactMdDialog.reactMdDialogStrings.between
    - typingsJapgolly.reactMdDialog.reactMdDialogStrings.`stacked-start`
    - typingsJapgolly.reactMdDialog.reactMdDialogStrings.`stacked-end`
  */
  trait DialogFooterAlignment extends StObject
  object DialogFooterAlignment {
    
    inline def between: typingsJapgolly.reactMdDialog.reactMdDialogStrings.between = "between".asInstanceOf[typingsJapgolly.reactMdDialog.reactMdDialogStrings.between]
    
    inline def end: typingsJapgolly.reactMdDialog.reactMdDialogStrings.end = "end".asInstanceOf[typingsJapgolly.reactMdDialog.reactMdDialogStrings.end]
    
    inline def none: typingsJapgolly.reactMdDialog.reactMdDialogStrings.none = "none".asInstanceOf[typingsJapgolly.reactMdDialog.reactMdDialogStrings.none]
    
    inline def `stacked-end`: typingsJapgolly.reactMdDialog.reactMdDialogStrings.`stacked-end` = "stacked-end".asInstanceOf[typingsJapgolly.reactMdDialog.reactMdDialogStrings.`stacked-end`]
    
    inline def `stacked-start`: typingsJapgolly.reactMdDialog.reactMdDialogStrings.`stacked-start` = "stacked-start".asInstanceOf[typingsJapgolly.reactMdDialog.reactMdDialogStrings.`stacked-start`]
    
    inline def start: typingsJapgolly.reactMdDialog.reactMdDialogStrings.start = "start".asInstanceOf[typingsJapgolly.reactMdDialog.reactMdDialogStrings.start]
  }
  
  trait DialogFooterProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /** {@inheritDoc DialogFooterAlignment} */
    var align: js.UndefOr[DialogFooterAlignment] = js.undefined
  }
  object DialogFooterProps {
    
    inline def apply(): DialogFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogFooterProps]
    }
    
    extension [Self <: DialogFooterProps](x: Self) {
      
      inline def setAlign(value: DialogFooterAlignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
}
