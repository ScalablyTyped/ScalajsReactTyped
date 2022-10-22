package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.es6ComponentsTableCellMod.TableCellExtendedProps
import typingsJapgolly.grommet.grommetStrings.`1Slash2`
import typingsJapgolly.grommet.grommetStrings.`1Slash3`
import typingsJapgolly.grommet.grommetStrings.`1Slash4`
import typingsJapgolly.grommet.grommetStrings.`2Slash3`
import typingsJapgolly.grommet.grommetStrings.`2Slash4`
import typingsJapgolly.grommet.grommetStrings.`3Slash4`
import typingsJapgolly.grommet.grommetStrings.auto
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.col
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.middle
import typingsJapgolly.grommet.grommetStrings.noPad
import typingsJapgolly.grommet.grommetStrings.row
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import typingsJapgolly.grommet.grommetStrings.xxsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableCell {
  
  @JSImport("grommet/es6", "TableCell")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def plain(value: Boolean | noPad): this.type = set("plain", value.asInstanceOf[js.Any])
    
    inline def scope(value: col | row): this.type = set("scope", value.asInstanceOf[js.Any])
    
    inline def size(
      value: xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | auto | String
    ): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def verticalAlign(value: top | middle | bottom): this.type = set("verticalAlign", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TableCell.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TableCellExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
