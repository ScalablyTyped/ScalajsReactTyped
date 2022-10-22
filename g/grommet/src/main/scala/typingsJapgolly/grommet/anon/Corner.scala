package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6UtilsMod._RoundType
import typingsJapgolly.grommet.grommetStrings.`bottom-left`
import typingsJapgolly.grommet.grommetStrings.`bottom-right`
import typingsJapgolly.grommet.grommetStrings.`top-left`
import typingsJapgolly.grommet.grommetStrings.`top-right`
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.right
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.grommet.grommetStrings.xsmall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corner
  extends StObject
     with _RoundType {
  
  var corner: js.UndefOr[
    top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.undefined
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
}
object Corner {
  
  inline def apply(): Corner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Corner]
  }
  
  extension [Self <: Corner](x: Self) {
    
    inline def setCorner(value: top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = StObject.set(x, "corner", value.asInstanceOf[js.Any])
    
    inline def setCornerUndefined: Self = StObject.set(x, "corner", js.undefined)
    
    inline def setSize(value: xsmall | small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
