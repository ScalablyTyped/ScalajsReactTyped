package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoticeIconNoticeIconTabMod {
  
  @JSImport("ant-design-pro/lib/NoticeIcon/NoticeIconTab", JSImport.Default)
  @js.native
  open class default () extends Component[NoticeIconTabProps, Any, Any]
  
  trait NoticeIconData extends StObject {
    
    var avatar: js.UndefOr[String | Node] = js.undefined
    
    var datetime: js.UndefOr[Node] = js.undefined
    
    var description: js.UndefOr[Node] = js.undefined
    
    var extra: js.UndefOr[Node] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object NoticeIconData {
    
    inline def apply(): NoticeIconData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeIconData]
    }
    
    extension [Self <: NoticeIconData](x: Self) {
      
      inline def setAvatar(value: String | Node): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setAvatarVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "avatar", js.Array(value*))
      
      inline def setAvatarVdomElement(value: VdomElement): Self = StObject.set(x, "avatar", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDatetime(value: VdomNode): Self = StObject.set(x, "datetime", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDatetimeNull: Self = StObject.set(x, "datetime", null)
      
      inline def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      inline def setDatetimeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "datetime", js.Array(value*))
      
      inline def setDatetimeVdomElement(value: VdomElement): Self = StObject.set(x, "datetime", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDescription(value: VdomNode): Self = StObject.set(x, "description", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDescriptionVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setDescriptionVdomElement(value: VdomElement): Self = StObject.set(x, "description", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExtra(value: VdomNode): Self = StObject.set(x, "extra", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNull: Self = StObject.set(x, "extra", null)
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type NoticeIconTab = japgolly.scalajs.react.facade.React.Component[NoticeIconTabProps & js.Object, js.Object]
  
  trait NoticeIconTabProps extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var emptyImage: js.UndefOr[String] = js.undefined
    
    var emptyText: js.UndefOr[Node] = js.undefined
    
    var list: js.UndefOr[js.Array[NoticeIconData]] = js.undefined
    
    var locale: Any
    
    var name: js.UndefOr[String] = js.undefined
    
    def onClear(item: Any): Unit
    
    def onClick(item: Any): Unit
    
    def onViewMore(e: Any): Unit
    
    var showClear: js.UndefOr[Boolean] = js.undefined
    
    var showViewMore: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object NoticeIconTabProps {
    
    inline def apply(locale: Any, onClear: Any => Callback, onClick: Any => Callback, onViewMore: Any => Callback): NoticeIconTabProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onClear = js.Any.fromFunction1((t0: Any) => onClear(t0).runNow()), onClick = js.Any.fromFunction1((t0: Any) => onClick(t0).runNow()), onViewMore = js.Any.fromFunction1((t0: Any) => onViewMore(t0).runNow()))
      __obj.asInstanceOf[NoticeIconTabProps]
    }
    
    extension [Self <: NoticeIconTabProps](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEmptyImage(value: String): Self = StObject.set(x, "emptyImage", value.asInstanceOf[js.Any])
      
      inline def setEmptyImageUndefined: Self = StObject.set(x, "emptyImage", js.undefined)
      
      inline def setEmptyText(value: VdomNode): Self = StObject.set(x, "emptyText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEmptyTextNull: Self = StObject.set(x, "emptyText", null)
      
      inline def setEmptyTextUndefined: Self = StObject.set(x, "emptyText", js.undefined)
      
      inline def setEmptyTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyText", js.Array(value*))
      
      inline def setEmptyTextVdomElement(value: VdomElement): Self = StObject.set(x, "emptyText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setList(value: js.Array[NoticeIconData]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      inline def setListVarargs(value: NoticeIconData*): Self = StObject.set(x, "list", js.Array(value*))
      
      inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnClear(value: Any => Callback): Self = StObject.set(x, "onClear", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnClick(value: Any => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setOnViewMore(value: Any => Callback): Self = StObject.set(x, "onViewMore", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setShowClear(value: Boolean): Self = StObject.set(x, "showClear", value.asInstanceOf[js.Any])
      
      inline def setShowClearUndefined: Self = StObject.set(x, "showClear", js.undefined)
      
      inline def setShowViewMore(value: Boolean): Self = StObject.set(x, "showViewMore", value.asInstanceOf[js.Any])
      
      inline def setShowViewMoreUndefined: Self = StObject.set(x, "showViewMore", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
