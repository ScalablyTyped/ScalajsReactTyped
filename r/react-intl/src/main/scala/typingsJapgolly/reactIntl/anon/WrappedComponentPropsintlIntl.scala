package typingsJapgolly.reactIntl.anon

import typingsJapgolly.reactIntl.srcTypesMod.IntlShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-intl.react-intl/src/components/injectIntl.WrappedComponentProps<'intl'> */
trait WrappedComponentPropsintlIntl extends StObject {
  
  var intl: IntlShape
}
object WrappedComponentPropsintlIntl {
  
  inline def apply(intl: IntlShape): WrappedComponentPropsintlIntl = {
    val __obj = js.Dynamic.literal(intl = intl.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedComponentPropsintlIntl]
  }
  
  extension [Self <: WrappedComponentPropsintlIntl](x: Self) {
    
    inline def setIntl(value: IntlShape): Self = StObject.set(x, "intl", value.asInstanceOf[js.Any])
  }
}
