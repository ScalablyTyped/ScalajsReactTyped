package typingsJapgolly.reactJsTableWithCsvDl.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactJsTableWithCsvDl.mod.TableViewerProps
import typingsJapgolly.reactJsTableWithCsvDl.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactJsTableWithCsvDl {
  
  inline def apply(content: js.Array[Any], headers: js.Array[String], maxHeight: Double, minHeight: Double): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TableViewerProps]))
  }
  
  @JSImport("react-js-table-with-csv-dl", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def activateDownloadButton(value: Boolean): this.type = set("activateDownloadButton", value.asInstanceOf[js.Any])
    
    inline def activePageBoxStyle(value: CSSProperties): this.type = set("activePageBoxStyle", value.asInstanceOf[js.Any])
    
    inline def bodyCss(value: CSSProperties): this.type = set("bodyCss", value.asInstanceOf[js.Any])
    
    inline def downloadButtonStyle(value: CSSProperties): this.type = set("downloadButtonStyle", value.asInstanceOf[js.Any])
    
    inline def encoding(value: String): this.type = set("encoding", value.asInstanceOf[js.Any])
    
    inline def errorColor(value: String): this.type = set("errorColor", value.asInstanceOf[js.Any])
    
    inline def filename(value: String): this.type = set("filename", value.asInstanceOf[js.Any])
    
    inline def headerCss(value: CSSProperties): this.type = set("headerCss", value.asInstanceOf[js.Any])
    
    inline def maxPagesToDisplay(value: Double): this.type = set("maxPagesToDisplay", value.asInstanceOf[js.Any])
    
    inline def pageBoxStyle(value: CSSProperties): this.type = set("pageBoxStyle", value.asInstanceOf[js.Any])
    
    inline def pagination(value: Double): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def renderLineNumber(value: Boolean): this.type = set("renderLineNumber", value.asInstanceOf[js.Any])
    
    inline def reverseLineNumber(value: Boolean): this.type = set("reverseLineNumber", value.asInstanceOf[js.Any])
    
    inline def sortColumn(value: String): this.type = set("sortColumn", value.asInstanceOf[js.Any])
    
    inline def successColor(value: String): this.type = set("successColor", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def topPaginator(value: Boolean): this.type = set("topPaginator", value.asInstanceOf[js.Any])
    
    inline def warningColor(value: String): this.type = set("warningColor", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TableViewerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
