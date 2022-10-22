package typingsJapgolly.wordpressComponents

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.wordpressComponents.anon.CreateErrorNotice
import typingsJapgolly.wordpressComponents.noticeListMod.NoticeList.Notice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object higherOrderWithNoticesMod {
  
  object default {
    
    // prettier-ignore
    inline def apply[T /* <: ComponentType[Any] */](wrapped: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'noticeList' | 'noticeOperations' | 'noticeUI'>> : never */ js.Any = ^.asInstanceOf[js.Dynamic].apply(wrapped.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends react.react.ComponentType<infer U> ? react.react.ComponentType<std.Omit<U, 'noticeList' | 'noticeOperations' | 'noticeUI'>> : never */ js.Any]
    
    @JSImport("@wordpress/components/higher-order/with-notices", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
  }
  
  object withNotices {
    
    trait Props extends StObject {
      
      var noticeList: js.Array[Notice]
      
      var noticeOperations: CreateErrorNotice
      
      var noticeUI: Node
    }
    object Props {
      
      inline def apply(noticeList: js.Array[Notice], noticeOperations: CreateErrorNotice): Props = {
        val __obj = js.Dynamic.literal(noticeList = noticeList.asInstanceOf[js.Any], noticeOperations = noticeOperations.asInstanceOf[js.Any], noticeUI = null)
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setNoticeList(value: js.Array[Notice]): Self = StObject.set(x, "noticeList", value.asInstanceOf[js.Any])
        
        inline def setNoticeListVarargs(value: Notice*): Self = StObject.set(x, "noticeList", js.Array(value*))
        
        inline def setNoticeOperations(value: CreateErrorNotice): Self = StObject.set(x, "noticeOperations", value.asInstanceOf[js.Any])
        
        inline def setNoticeUI(value: VdomNode): Self = StObject.set(x, "noticeUI", value.rawNode.asInstanceOf[js.Any])
        
        inline def setNoticeUINull: Self = StObject.set(x, "noticeUI", null)
        
        inline def setNoticeUIVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "noticeUI", js.Array(value*))
        
        inline def setNoticeUIVdomElement(value: VdomElement): Self = StObject.set(x, "noticeUI", value.rawElement.asInstanceOf[js.Any])
      }
    }
  }
}
