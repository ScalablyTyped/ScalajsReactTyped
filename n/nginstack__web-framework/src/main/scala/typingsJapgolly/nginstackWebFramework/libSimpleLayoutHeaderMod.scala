package typingsJapgolly.nginstackWebFramework

import typingsJapgolly.nginstackWebFramework.anon.Css
import typingsJapgolly.nginstackWebFramework.anon.CurrentPage
import typingsJapgolly.nginstackWebFramework.anon.Group
import typingsJapgolly.nginstackWebFramework.anon.NewLine
import typingsJapgolly.nginstackWebFramework.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutHeaderMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/Header", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Header
  @JSImport("@nginstack/web-framework/lib/simple-layout/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def groupFilters(filters: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("groupFilters")(filters.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  type Event = typingsJapgolly.nginstackEngine.libEventEventMod.^
  
  @js.native
  trait Header extends StObject {
    
    /* private */ var MAX_FILTER_VALUE_SIZE_ : Any = js.native
    
    var autoSanitize: Boolean = js.native
    
    var complement: String = js.native
    
    /* private */ var cssExtractor_ : Any = js.native
    
    var filtersDisplay: String = js.native
    
    def formatFiltersToHeader(filters: js.Array[Group], convertTagsToLiterals: Boolean, showAll: Boolean): String = js.native
    
    var mustIncludeCssFiles: Boolean = js.native
    
    var onAfterComplement: Event = js.native
    
    /* private */ var sanitize_ : Any = js.native
    
    var showDateTime: Boolean = js.native
    
    var showEnterpriseName: Boolean = js.native
    
    var showUserAndDatabaseName: Boolean = js.native
    
    var useTagsAsLiterals: Boolean = js.native
    
    var visible: Boolean = js.native
    
    def writeHtml(sender: SimpleLayout, outputObj: `0`): Unit = js.native
    def writeHtml(sender: SimpleLayout, outputObj: `0`, opt_options: Css): Unit = js.native
    def writeHtml(sender: Visualization, outputObj: `0`): Unit = js.native
    def writeHtml(sender: Visualization, outputObj: `0`, opt_options: Css): Unit = js.native
    
    def writePlain(sender: SimpleLayout, outputObj: NewLine, options: CurrentPage): Unit = js.native
  }
  
  type Mail = typingsJapgolly.nginstackEngine.libMailMailMod.^
  
  type SimpleLayout = typingsJapgolly.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^
  
  type Visualization = typingsJapgolly.nginstackWebFramework.libDsvVisualizationMod.^
}
