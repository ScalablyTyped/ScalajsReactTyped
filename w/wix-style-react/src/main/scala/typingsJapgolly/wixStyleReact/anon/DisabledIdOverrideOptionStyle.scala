package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.std.Partial
import typingsJapgolly.wixStyleReact.distTypesListItemActionMod.ListItemActionProps
import typingsJapgolly.wixStyleReact.wixStyleReactBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledIdOverrideOptionStyle extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var id: String | Double
  
  var overrideOptionStyle: `true`
  
  def value(props: Partial[ListItemActionProps]): Node
}
object DisabledIdOverrideOptionStyle {
  
  inline def apply(id: String | Double, value: Partial[ListItemActionProps] => Node): DisabledIdOverrideOptionStyle = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], overrideOptionStyle = true, value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[DisabledIdOverrideOptionStyle]
  }
  
  extension [Self <: DisabledIdOverrideOptionStyle](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOverrideOptionStyle(value: `true`): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Partial[ListItemActionProps] => Node): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
