package typingsJapgolly.reactBootstrapTable.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactBootstrapTable.anon.GetElement
import typingsJapgolly.reactBootstrapTable.mod.CSVFieldType
import typingsJapgolly.reactBootstrapTable.mod.CustomAttrs
import typingsJapgolly.reactBootstrapTable.mod.CustomEditor
import typingsJapgolly.reactBootstrapTable.mod.DataAlignType
import typingsJapgolly.reactBootstrapTable.mod.EditValidatorObject
import typingsJapgolly.reactBootstrapTable.mod.Editable
import typingsJapgolly.reactBootstrapTable.mod.Filter
import typingsJapgolly.reactBootstrapTable.mod.SortOrder
import typingsJapgolly.reactBootstrapTable.mod.TableHeaderColumnProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableHeaderColumn {
  
  @JSImport("react-bootstrap-table", "TableHeaderColumn")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactBootstrapTable.mod.TableHeaderColumn] {
    
    inline def autoValue(value: Boolean | js.Function0[Any]): this.type = set("autoValue", value.asInstanceOf[js.Any])
    
    inline def autoValueCallbackTo(value: CallbackTo[Any]): this.type = set("autoValue", value.toJsFn)
    
    inline def caretRender(value: (/* direction */ SortOrder | Null, /* fieldName */ String) => String | Element): this.type = set("caretRender", js.Any.fromFunction2(value))
    
    inline def className(
      value: String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double, String])
    ): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameFunction4(value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => String): this.type = set("className", js.Any.fromFunction4(value))
    
    inline def colSpan(value: Double): this.type = set("colSpan", value.asInstanceOf[js.Any])
    
    inline def columnClassName(
      value: String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double, String])
    ): this.type = set("columnClassName", value.asInstanceOf[js.Any])
    
    inline def columnClassNameFunction4(value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => String): this.type = set("columnClassName", js.Any.fromFunction4(value))
    
    inline def columnTitle(
      value: Boolean | String | (js.Function4[/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* colIndex */ Double, String])
    ): this.type = set("columnTitle", value.asInstanceOf[js.Any])
    
    inline def columnTitleFunction4(value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* colIndex */ Double) => String): this.type = set("columnTitle", js.Any.fromFunction4(value))
    
    inline def csvFieldType(value: CSVFieldType): this.type = set("csvFieldType", value.asInstanceOf[js.Any])
    
    inline def csvFormat(value: (/* cell */ Any, /* row */ Any) => String): this.type = set("csvFormat", js.Any.fromFunction2(value))
    
    inline def csvFormatExtraData(value: Any): this.type = set("csvFormatExtraData", value.asInstanceOf[js.Any])
    
    inline def csvHeader(value: String): this.type = set("csvHeader", value.asInstanceOf[js.Any])
    
    inline def customEditor(value: CustomEditor[Any, Any]): this.type = set("customEditor", value.asInstanceOf[js.Any])
    
    inline def customInsertEditor(value: GetElement): this.type = set("customInsertEditor", value.asInstanceOf[js.Any])
    
    inline def dataAlign(value: DataAlignType): this.type = set("dataAlign", value.asInstanceOf[js.Any])
    
    inline def dataField(value: String): this.type = set("dataField", value.asInstanceOf[js.Any])
    
    inline def dataFormat(
      value: (/* cell */ Any, /* row */ Any, /* formatExtraData */ Any, /* rowIndex */ Double) => String | Element
    ): this.type = set("dataFormat", js.Any.fromFunction4(value))
    
    inline def dataSort(value: Boolean): this.type = set("dataSort", value.asInstanceOf[js.Any])
    
    inline def defaultASC(value: Boolean): this.type = set("defaultASC", value.asInstanceOf[js.Any])
    
    inline def editColumnClassName(value: String | (js.Function2[/* cell */ Any, /* row */ Any, String])): this.type = set("editColumnClassName", value.asInstanceOf[js.Any])
    
    inline def editColumnClassNameFunction2(value: (/* cell */ Any, /* row */ Any) => String): this.type = set("editColumnClassName", js.Any.fromFunction2(value))
    
    inline def editTdAttr(value: CustomAttrs): this.type = set("editTdAttr", value.asInstanceOf[js.Any])
    
    inline def editable(
      value: Boolean | (Editable[Any, Any]) | (js.Function4[
          /* cell */ Any, 
          /* row */ Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          Boolean | String | EditValidatorObject
        ])
    ): this.type = set("editable", value.asInstanceOf[js.Any])
    
    inline def editableFunction4(
      value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => Boolean | String | EditValidatorObject
    ): this.type = set("editable", js.Any.fromFunction4(value))
    
    inline def expandable(value: Boolean): this.type = set("expandable", value.asInstanceOf[js.Any])
    
    inline def `export`(value: Boolean): this.type = set("export", value.asInstanceOf[js.Any])
    
    inline def filter(value: Filter): this.type = set("filter", value.asInstanceOf[js.Any])
    
    inline def filterFormatted(value: Boolean): this.type = set("filterFormatted", value.asInstanceOf[js.Any])
    
    inline def filterValue(value: (/* cell */ Any, /* row */ Any) => Any): this.type = set("filterValue", js.Any.fromFunction2(value))
    
    inline def formatExtraData(value: Any): this.type = set("formatExtraData", value.asInstanceOf[js.Any])
    
    inline def headerAlign(value: DataAlignType): this.type = set("headerAlign", value.asInstanceOf[js.Any])
    
    inline def headerText(value: String): this.type = set("headerText", value.asInstanceOf[js.Any])
    
    inline def headerTitle(value: Boolean): this.type = set("headerTitle", value.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def hiddenOnInsert(value: Boolean): this.type = set("hiddenOnInsert", value.asInstanceOf[js.Any])
    
    inline def invalidEditColumnClassName(value: String | (js.Function2[/* cell */ Any, /* row */ Any, String])): this.type = set("invalidEditColumnClassName", value.asInstanceOf[js.Any])
    
    inline def invalidEditColumnClassNameFunction2(value: (/* cell */ Any, /* row */ Any) => String): this.type = set("invalidEditColumnClassName", js.Any.fromFunction2(value))
    
    inline def isKey(value: Boolean): this.type = set("isKey", value.asInstanceOf[js.Any])
    
    inline def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    inline def rowSpan(value: Double): this.type = set("rowSpan", value.asInstanceOf[js.Any])
    
    inline def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
    
    inline def sortFunc(
      value: (/* a */ js.Object, /* b */ js.Object, /* order */ SortOrder, /* keyof object */ /* sortField */ String, /* extraData */ Any) => Double
    ): this.type = set("sortFunc", js.Any.fromFunction5(value))
    
    inline def sortFuncExtraData(value: Any): this.type = set("sortFuncExtraData", value.asInstanceOf[js.Any])
    
    inline def sortHeaderColumnClassName(value: String | (js.Function2[/* order */ SortOrder, /* dataField */ String, String])): this.type = set("sortHeaderColumnClassName", value.asInstanceOf[js.Any])
    
    inline def sortHeaderColumnClassNameFunction2(value: (/* order */ SortOrder, /* dataField */ String) => String): this.type = set("sortHeaderColumnClassName", js.Any.fromFunction2(value))
    
    inline def tdAttr(value: CustomAttrs): this.type = set("tdAttr", value.asInstanceOf[js.Any])
    
    inline def tdStyle(
      value: CSSProperties | (js.Function4[
          /* cell */ Any, 
          /* row */ Any, 
          /* rowIndex */ Double, 
          /* columnIndex */ Double, 
          CSSProperties
        ])
    ): this.type = set("tdStyle", value.asInstanceOf[js.Any])
    
    inline def tdStyleFunction4(
      value: (/* cell */ Any, /* row */ Any, /* rowIndex */ Double, /* columnIndex */ Double) => CSSProperties
    ): this.type = set("tdStyle", js.Any.fromFunction4(value))
    
    inline def thStyle(value: CSSProperties): this.type = set("thStyle", value.asInstanceOf[js.Any])
    
    inline def width(value: String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableHeaderColumn.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableHeaderColumnProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
