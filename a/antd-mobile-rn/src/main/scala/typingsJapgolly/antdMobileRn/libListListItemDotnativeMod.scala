package typingsJapgolly.antdMobileRn

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.anon.Arrow
import typingsJapgolly.antdMobileRn.anon.PartialListItemProps
import typingsJapgolly.antdMobileRn.anon.Styles
import typingsJapgolly.antdMobileRn.anon.TypeofBrief
import typingsJapgolly.antdMobileRn.libListPropsTypeMod.ListItemPropsType
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libListListItemDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
  @js.native
  open class default () extends Item
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "default.Brief")
    @js.native
    def Brief: TypeofBrief = js.native
    inline def Brief_=(x: TypeofBrief): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Brief")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "default.defaultProps")
    @js.native
    def defaultProps: PartialListItemProps = js.native
    inline def defaultProps_=(x: PartialListItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
  @js.native
  open class Brief protected () extends Component[BriefProps, Any, Any] {
    def this(props: BriefProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BriefProps, context: Any) = this()
  }
  /* static members */
  object Brief {
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief.defaultProps")
    @js.native
    def defaultProps: Styles = js.native
    inline def defaultProps_=(x: Styles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait BriefProps
    extends StObject
       with typingsJapgolly.antdMobileRn.libListPropsTypeMod.BriefProps {
    
    var styles: js.UndefOr[typingsJapgolly.antdMobileRn.anon.Brief] = js.undefined
  }
  object BriefProps {
    
    inline def apply(): BriefProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BriefProps]
    }
    
    extension [Self <: BriefProps](x: Self) {
      
      inline def setStyles(value: typingsJapgolly.antdMobileRn.anon.Brief): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait Item extends Component[ListItemProps, Any, Any]
  
  trait ListItemProps
    extends StObject
       with ListItemPropsType {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Arrow] = js.undefined
  }
  object ListItemProps {
    
    inline def apply(): ListItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemProps]
    }
    
    extension [Self <: ListItemProps](x: Self) {
      
      inline def setOnClick(value: Callback): Self = StObject.set(x, "onClick", value.toJsFn)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnPressIn(value: Callback): Self = StObject.set(x, "onPressIn", value.toJsFn)
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: Callback): Self = StObject.set(x, "onPressOut", value.toJsFn)
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Arrow): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
