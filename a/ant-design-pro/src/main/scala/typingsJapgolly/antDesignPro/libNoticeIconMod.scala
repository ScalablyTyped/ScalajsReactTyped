package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.MouseEvent
import typingsJapgolly.antDesignPro.anon.Dictkey
import typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.NoticeIconData
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoticeIconMod {
  
  @JSImport("ant-design-pro/lib/NoticeIcon", JSImport.Default)
  @js.native
  open class default () extends Component[NoticeIconProps, Any, Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/NoticeIcon", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/NoticeIcon", "default.Tab")
    @js.native
    def Tab: Instantiable0[typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.default] = js.native
    inline def Tab_=(x: Instantiable0[typingsJapgolly.antDesignPro.libNoticeIconNoticeIconTabMod.default]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tab")(x.asInstanceOf[js.Any])
  }
  
  type NoticeIcon = japgolly.scalajs.react.facade.React.Component[NoticeIconProps & js.Object, js.Object]
  
  trait NoticeIconProps extends StObject {
    
    var bell: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearClose: js.UndefOr[Boolean] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[Dictkey] = js.undefined
    
    var onClear: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.undefined
    
    var onItemClick: js.UndefOr[js.Function2[/* item */ NoticeIconData, /* tabProps */ this.type, Unit]] = js.undefined
    
    var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onTabChange: js.UndefOr[js.Function1[/* tabTile */ String, Unit]] = js.undefined
    
    var onViewMore: js.UndefOr[js.Function2[/* tabProps */ this.type, /* e */ MouseEvent, Unit]] = js.undefined
    
    var popupVisible: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object NoticeIconProps {
    
    inline def apply(): NoticeIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoticeIconProps]
    }
    
    extension [Self <: NoticeIconProps](x: Self) {
      
      inline def setBell(value: VdomNode): Self = StObject.set(x, "bell", value.rawNode.asInstanceOf[js.Any])
      
      inline def setBellNull: Self = StObject.set(x, "bell", null)
      
      inline def setBellUndefined: Self = StObject.set(x, "bell", js.undefined)
      
      inline def setBellVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "bell", js.Array(value*))
      
      inline def setBellVdomElement(value: VdomElement): Self = StObject.set(x, "bell", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearClose(value: Boolean): Self = StObject.set(x, "clearClose", value.asInstanceOf[js.Any])
      
      inline def setClearCloseUndefined: Self = StObject.set(x, "clearClose", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLocale(value: Dictkey): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOnClear(value: /* tabName */ String => Callback): Self = StObject.set(x, "onClear", js.Any.fromFunction1((t0: /* tabName */ String) => value(t0).runNow()))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnItemClick(value: (/* item */ NoticeIconData, NoticeIconProps) => Callback): Self = StObject.set(x, "onItemClick", js.Any.fromFunction2((t0: /* item */ NoticeIconData, t1: NoticeIconProps) => (value(t0, t1)).runNow()))
      
      inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
      
      inline def setOnPopupVisibleChange(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onPopupVisibleChange", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnPopupVisibleChangeUndefined: Self = StObject.set(x, "onPopupVisibleChange", js.undefined)
      
      inline def setOnTabChange(value: /* tabTile */ String => Callback): Self = StObject.set(x, "onTabChange", js.Any.fromFunction1((t0: /* tabTile */ String) => value(t0).runNow()))
      
      inline def setOnTabChangeUndefined: Self = StObject.set(x, "onTabChange", js.undefined)
      
      inline def setOnViewMore(value: (NoticeIconProps, /* e */ MouseEvent) => Callback): Self = StObject.set(x, "onViewMore", js.Any.fromFunction2((t0: NoticeIconProps, t1: /* e */ MouseEvent) => (value(t0, t1)).runNow()))
      
      inline def setOnViewMoreUndefined: Self = StObject.set(x, "onViewMore", js.undefined)
      
      inline def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      inline def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
