package typingsJapgolly.reactSizeReporter

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactSizeReporter.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-size-reporter", JSImport.Default)
  @js.native
  val default: FC[Children] = js.native
  
  type ReactSizeReporter = FC[Children]
  
  trait ReactSizeReporterRef extends StObject {
    
    // Use this if for any reason onSizeChange doesn't trigger anymore.
    def reattachResizeListener(): Unit
  }
  object ReactSizeReporterRef {
    
    inline def apply(reattachResizeListener: Callback): ReactSizeReporterRef = {
      val __obj = js.Dynamic.literal(reattachResizeListener = reattachResizeListener.toJsFn)
      __obj.asInstanceOf[ReactSizeReporterRef]
    }
    
    extension [Self <: ReactSizeReporterRef](x: Self) {
      
      inline def setReattachResizeListener(value: Callback): Self = StObject.set(x, "reattachResizeListener", value.toJsFn)
    }
  }
  
  type _To = FC[Children]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: FC[Children] = default
}
