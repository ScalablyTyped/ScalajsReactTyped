package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateColumn
  extends StObject
     with typingsJapgolly.extjs.Ext.grid.column.IColumn {
  
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_IDateColumn: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
}
object IDateColumn {
  
  inline def apply(): IDateColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateColumn]
  }
  
  extension [Self <: IDateColumn](x: Self) {
    
    inline def setDefaultRenderer(value: /* value */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
