package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.IComponent
import typingsJapgolly.extjs.Ext.form.field.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHidden
  extends StObject
     with IBase {
  
  /** [Method] Clear any invalid styles messages for this field  */
  @JSName("clearInvalid")
  var clearInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Display one or more error messages associated with this field using msgTarget to determine how to display the messag  */
  @JSName("markInvalid")
  var markInvalid_IHidden: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Sets the height of the component
    * @returns Ext.Component this
    */
  @JSName("setHeight")
  var setHeight_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the page XY position of the component
    * @returns Ext.Component this
    */
  @JSName("setPagePosition")
  var setPagePosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the left and top of the component
    * @returns Ext.Component this
    */
  @JSName("setPosition")
  var setPosition_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the width and height of this Component
    * @returns Ext.Component this
    */
  @JSName("setSize")
  var setSize_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
  
  /** [Method] Sets the width of the component
    * @returns Ext.Component this
    */
  @JSName("setWidth")
  var setWidth_IHidden: js.UndefOr[js.Function0[IComponent]] = js.undefined
}
object IHidden {
  
  inline def apply(): IHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHidden]
  }
  
  extension [Self <: IHidden](x: Self) {
    
    inline def setClearInvalid(value: Callback): Self = StObject.set(x, "clearInvalid", value.toJsFn)
    
    inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
    
    inline def setMarkInvalid(value: Callback): Self = StObject.set(x, "markInvalid", value.toJsFn)
    
    inline def setMarkInvalidUndefined: Self = StObject.set(x, "markInvalid", js.undefined)
    
    inline def setSetHeight(value: CallbackTo[IComponent]): Self = StObject.set(x, "setHeight", value.toJsFn)
    
    inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
    
    inline def setSetPagePosition(value: CallbackTo[IComponent]): Self = StObject.set(x, "setPagePosition", value.toJsFn)
    
    inline def setSetPagePositionUndefined: Self = StObject.set(x, "setPagePosition", js.undefined)
    
    inline def setSetPosition(value: CallbackTo[IComponent]): Self = StObject.set(x, "setPosition", value.toJsFn)
    
    inline def setSetPositionUndefined: Self = StObject.set(x, "setPosition", js.undefined)
    
    inline def setSetSize(value: CallbackTo[IComponent]): Self = StObject.set(x, "setSize", value.toJsFn)
    
    inline def setSetSizeUndefined: Self = StObject.set(x, "setSize", js.undefined)
    
    inline def setSetWidth(value: CallbackTo[IComponent]): Self = StObject.set(x, "setWidth", value.toJsFn)
    
    inline def setSetWidthUndefined: Self = StObject.set(x, "setWidth", js.undefined)
  }
}
