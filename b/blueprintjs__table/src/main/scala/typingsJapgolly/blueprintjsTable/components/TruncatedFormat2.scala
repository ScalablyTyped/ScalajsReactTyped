package typingsJapgolly.blueprintjsTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.ITrucatedFormateMeasureByApproximateOptions
import typingsJapgolly.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.ITruncatedFormatProps
import typingsJapgolly.blueprintjsTable.libEsmCellFormatsTruncatedFormatMod.TruncatedPopoverMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TruncatedFormat2 {
  
  @JSImport("@blueprintjs/table", "TruncatedFormat2")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.blueprintjsTable.mod.TruncatedFormat2] {
    
    inline def children(value: String): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def detectTruncation(value: Boolean): this.type = set("detectTruncation", value.asInstanceOf[js.Any])
    
    inline def measureByApproxOptions(value: ITrucatedFormateMeasureByApproximateOptions): this.type = set("measureByApproxOptions", value.asInstanceOf[js.Any])
    
    inline def parentCellHeight(value: Double): this.type = set("parentCellHeight", value.asInstanceOf[js.Any])
    
    inline def parentCellWidth(value: Double): this.type = set("parentCellWidth", value.asInstanceOf[js.Any])
    
    inline def preformatted(value: Boolean): this.type = set("preformatted", value.asInstanceOf[js.Any])
    
    inline def showPopover(value: TruncatedPopoverMode): this.type = set("showPopover", value.asInstanceOf[js.Any])
    
    inline def truncateLength(value: Double): this.type = set("truncateLength", value.asInstanceOf[js.Any])
    
    inline def truncationSuffix(value: String): this.type = set("truncationSuffix", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TruncatedFormat2.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ITruncatedFormatProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
