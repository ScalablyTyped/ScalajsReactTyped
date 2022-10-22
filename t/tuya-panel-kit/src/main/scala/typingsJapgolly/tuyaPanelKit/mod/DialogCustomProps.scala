package typingsJapgolly.tuyaPanelKit.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogCustomProps
  extends StObject
     with DialogProps
     with DialogCancelProps {
  
  /**
    * @language zh-CN
    * @description 自定义 Dialog Content
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom Dialog Content
    * @defaultValue null
    */
  var content: js.UndefOr[Any] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义 Dialog Footer
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom Dialog Footer
    * @defaultValue null
    */
  var footer: js.UndefOr[ElementType | js.Function0[Node]] = js.undefined
  
  /**
    * @language zh-CN
    * @description 自定义 Dialog Header
    * @defaultValue null
    */
  /**
    * @language en-US
    * @description Custom Dialog Header
    * @defaultValue null
    */
  var header: js.UndefOr[ElementType | js.Function0[Node]] = js.undefined
}
object DialogCustomProps {
  
  inline def apply(title: String): DialogCustomProps = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCustomProps]
  }
  
  extension [Self <: DialogCustomProps](x: Self) {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFooter(value: ElementType | js.Function0[Node]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "footer", value.toJsFn)
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: ElementType | js.Function0[Node]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderCallbackTo(value: CallbackTo[Node]): Self = StObject.set(x, "header", value.toJsFn)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
