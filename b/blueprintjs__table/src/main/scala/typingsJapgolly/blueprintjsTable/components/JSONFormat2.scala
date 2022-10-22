package typingsJapgolly.blueprintjsTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCellFormatsJsonFormatMod.IJSONFormatProps
import typingsJapgolly.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.ITrucatedFormateMeasureByApproximateOptions
import typingsJapgolly.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JSONFormat2 {
  
  @JSImport("@blueprintjs/table", "JSONFormat2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.JSONFormat2] {
    
    inline def children(value: Any): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def detectTruncation(value: Boolean): this.type = set("detectTruncation", value.asInstanceOf[js.Any])
    
    inline def measureByApproxOptions(value: ITrucatedFormateMeasureByApproximateOptions): this.type = set("measureByApproxOptions", value.asInstanceOf[js.Any])
    
    inline def omitQuotesOnStrings(value: Boolean): this.type = set("omitQuotesOnStrings", value.asInstanceOf[js.Any])
    
    inline def parentCellHeight(value: Double): this.type = set("parentCellHeight", value.asInstanceOf[js.Any])
    
    inline def parentCellWidth(value: Double): this.type = set("parentCellWidth", value.asInstanceOf[js.Any])
    
    inline def preformatted(value: Boolean): this.type = set("preformatted", value.asInstanceOf[js.Any])
    
    inline def showPopover(value: TruncatedPopoverMode): this.type = set("showPopover", value.asInstanceOf[js.Any])
    
    inline def stringify(value: /* obj */ Any => String): this.type = set("stringify", js.Any.fromFunction1(value))
    
    inline def truncateLength(value: Double): this.type = set("truncateLength", value.asInstanceOf[js.Any])
    
    inline def truncationSuffix(value: String): this.type = set("truncationSuffix", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: JSONFormat2.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IJSONFormatProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
