package typingsJapgolly.nginstackWebFramework

import typingsJapgolly.nginstackWebFramework.anon.CalculatedWidth
import typingsJapgolly.nginstackWebFramework.anon.Colspan
import typingsJapgolly.nginstackWebFramework.anon.Write
import typingsJapgolly.nginstackWebFramework.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutFooterMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/Footer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Footer
  @JSImport("@nginstack/web-framework/lib/simple-layout/Footer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait Footer extends StObject {
    
    var autoSanitize: Boolean = js.native
    
    var complement: String = js.native
    
    /* private */ var cssExtractor_ : Any = js.native
    
    var image: Double | Null = js.native
    
    var mustIncludeCssFiles: Boolean = js.native
    
    var showPath: Boolean = js.native
    
    var visible: Boolean = js.native
    
    def writeHtml(sender: SimpleLayout, outputObj: `0`): Unit = js.native
    def writeHtml(sender: SimpleLayout, outputObj: `0`, opt_options: Colspan): Unit = js.native
    def writeHtml(sender: Visualization, outputObj: `0`): Unit = js.native
    def writeHtml(sender: Visualization, outputObj: `0`, opt_options: Colspan): Unit = js.native
    
    def writePlain(outputObj: Write, options: CalculatedWidth): Unit = js.native
  }
  
  type Mail = typingsJapgolly.nginstackEngine.libMailMailMod.^
  
  type SimpleLayout = typingsJapgolly.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^
  
  type Visualization = typingsJapgolly.nginstackWebFramework.libDsvVisualizationMod.^
}
