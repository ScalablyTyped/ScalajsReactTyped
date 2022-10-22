package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITemplateColumn
  extends StObject
     with typingsJapgolly.extjs.Ext.grid.column.IColumn {
  
  /** [Method] When defined this will take precedence over the renderer config
    * @param value Object
    * @param meta Object
    * @param record Object
    */
  @JSName("defaultRenderer")
  var defaultRenderer_ITemplateColumn: js.UndefOr[
    js.Function3[
      /* value */ js.UndefOr[Any], 
      /* meta */ js.UndefOr[Any], 
      /* record */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
}
object ITemplateColumn {
  
  inline def apply(): ITemplateColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITemplateColumn]
  }
  
  extension [Self <: ITemplateColumn](x: Self) {
    
    inline def setDefaultRenderer(
      value: (/* value */ js.UndefOr[Any], /* meta */ js.UndefOr[Any], /* record */ js.UndefOr[Any]) => Callback
    ): Self = StObject.set(x, "defaultRenderer", js.Any.fromFunction3((t0: /* value */ js.UndefOr[Any], t1: /* meta */ js.UndefOr[Any], t2: /* record */ js.UndefOr[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setDefaultRendererUndefined: Self = StObject.set(x, "defaultRenderer", js.undefined)
  }
}
