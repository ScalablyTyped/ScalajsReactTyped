package typingsJapgolly.extjs.Ext.layout.container

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAbsolute
  extends StObject
     with IAnchor {
  
  /** [Config Option] (Boolean) */
  var ignoreOnContentChange: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] This method is called when a child item changes in some way
    * @returns Boolean True if this layout has handled the content change.
    */
  @JSName("onContentChange")
  var onContentChange_IAbsolute: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object IAbsolute {
  
  inline def apply(): IAbsolute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAbsolute]
  }
  
  extension [Self <: IAbsolute](x: Self) {
    
    inline def setIgnoreOnContentChange(value: Boolean): Self = StObject.set(x, "ignoreOnContentChange", value.asInstanceOf[js.Any])
    
    inline def setIgnoreOnContentChangeUndefined: Self = StObject.set(x, "ignoreOnContentChange", js.undefined)
    
    inline def setOnContentChange(value: CallbackTo[Boolean]): Self = StObject.set(x, "onContentChange", value.toJsFn)
    
    inline def setOnContentChangeUndefined: Self = StObject.set(x, "onContentChange", js.undefined)
  }
}
