package typingsJapgolly.webgme

import typingsJapgolly.webgme.Global_.GmeLogger
import typingsJapgolly.webgme.GmePanel.Layout
import typingsJapgolly.webgme.GmePanel.Options
import typingsJapgolly.webgme.GmePanel.PanelBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsPanelBasePanelBaseMod {
  
  @JSImport("js/PanelBase/PanelBase", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PanelBase {
    def this(options: Options) = this()
    
    /* CompleteClass */
    var OPTIONS: Options = js.native
    
    /* CompleteClass */
    override def afterAppend(): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var control: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def isReadOnly(): Boolean = js.native
    
    /* CompleteClass */
    var logger: GmeLogger = js.native
    
    /* CompleteClass */
    override def onReadOnlyChanged(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def onResize(width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    override def setContainerUpdateFn(currentLayout: Layout, sizeUpdateFn: js.Function1[/* layout */ Layout, Double]): Unit = js.native
    
    /* CompleteClass */
    override def setReadOnly(isReadOnly: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def setSize(width: Double, height: Double): Unit = js.native
  }
}
