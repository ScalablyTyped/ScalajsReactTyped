package typingsJapgolly.reactMdDialog

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDialogContentMod {
  
  @JSImport("@react-md/dialog/types/DialogContent", "DialogContent")
  @js.native
  val DialogContent: ForwardRefExoticComponent[DialogContentProps & RefAttributes[HTMLDivElement]] = js.native
  
  trait DialogContentProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * Boolean if the default padding for the content should be removed. This is
      * helpful when the child elements already have the required padding (such as
      * lists).  In all other cases, it is recommended to apply a custom className
      * with the padding overrides instead.
      */
    var disablePadding: js.UndefOr[Boolean] = js.undefined
  }
  object DialogContentProps {
    
    inline def apply(): DialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogContentProps]
    }
    
    extension [Self <: DialogContentProps](x: Self) {
      
      inline def setDisablePadding(value: Boolean): Self = StObject.set(x, "disablePadding", value.asInstanceOf[js.Any])
      
      inline def setDisablePaddingUndefined: Self = StObject.set(x, "disablePadding", js.undefined)
    }
  }
}
