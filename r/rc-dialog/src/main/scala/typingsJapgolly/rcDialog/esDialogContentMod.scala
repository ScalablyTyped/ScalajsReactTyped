package typingsJapgolly.rcDialog

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcDialog.anon.motionNamestringariaIdstr
import typingsJapgolly.rcDialog.esDialogContentPanelMod.PanelProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esDialogContentMod extends Shortcut {
  
  @JSImport("rc-dialog/es/Dialog/Content", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[motionNamestringariaIdstr] = js.native
  
  trait ContentProps
    extends StObject
       with PanelProps {
    
    @JSName("ariaId")
    var ariaId_ContentProps: String
    
    var motionName: String
    
    def onVisibleChanged(visible: Boolean): Unit
  }
  object ContentProps {
    
    inline def apply(ariaId: String, motionName: String, onVisibleChanged: Boolean => Callback, prefixCls: String): ContentProps = {
      val __obj = js.Dynamic.literal(ariaId = ariaId.asInstanceOf[js.Any], motionName = motionName.asInstanceOf[js.Any], onVisibleChanged = js.Any.fromFunction1((t0: Boolean) => onVisibleChanged(t0).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentProps]
    }
    
    extension [Self <: ContentProps](x: Self) {
      
      inline def setAriaId(value: String): Self = StObject.set(x, "ariaId", value.asInstanceOf[js.Any])
      
      inline def setMotionName(value: String): Self = StObject.set(x, "motionName", value.asInstanceOf[js.Any])
      
      inline def setOnVisibleChanged(value: Boolean => Callback): Self = StObject.set(x, "onVisibleChanged", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  type _To = ForwardRefExoticComponent[motionNamestringariaIdstr]
  
  /* This means you don't have to write `default`, but can instead just say `esDialogContentMod.foo` */
  override def _to: ForwardRefExoticComponent[motionNamestringariaIdstr] = default
}
