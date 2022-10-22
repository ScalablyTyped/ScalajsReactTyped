package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IButtonGroup
  extends StObject
     with typingsJapgolly.extjs.Ext.panel.IPanel {
  
  /** [Config Option] (Number) */
  var columns: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.undefined
  
  /** [Method] private
    * @param component Object
    */
  @JSName("onBeforeAdd")
  var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[Any], Unit]] = js.undefined
}
object IButtonGroup {
  
  inline def apply(): IButtonGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonGroup]
  }
  
  extension [Self <: IButtonGroup](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setDefaultButtonUI(value: java.lang.String): Self = StObject.set(x, "defaultButtonUI", value.asInstanceOf[js.Any])
    
    inline def setDefaultButtonUIUndefined: Self = StObject.set(x, "defaultButtonUI", js.undefined)
    
    inline def setOnBeforeAdd(value: /* component */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "onBeforeAdd", js.Any.fromFunction1((t0: /* component */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setOnBeforeAddUndefined: Self = StObject.set(x, "onBeforeAdd", js.undefined)
  }
}
