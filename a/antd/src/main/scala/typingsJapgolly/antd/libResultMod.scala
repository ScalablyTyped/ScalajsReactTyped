package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.antd.anon.PickAntdIconPropschildren
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libResultMod extends Shortcut {
  
  @JSImport("antd/lib/result", JSImport.Default)
  @js.native
  val default: ResultType = js.native
  
  object ExceptionMap {
    
    @JSImport("antd/lib/result", "ExceptionMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def `403`(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("403")().asInstanceOf[Element]
    
    inline def `404`(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("404")().asInstanceOf[Element]
    
    inline def `500`(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("500")().asInstanceOf[Element]
  }
  
  object IconMap {
    
    @JSImport("antd/lib/result", "IconMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/result", "IconMap.error")
    @js.native
    def error: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def error_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.info")
    @js.native
    def info: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def info_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.success")
    @js.native
    def success: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def success_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.warning")
    @js.native
    def warning: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    inline def warning_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdInts.`403`
    - typingsJapgolly.antd.antdInts.`404`
    - typingsJapgolly.antd.antdInts.`500`
    - typingsJapgolly.antd.antdStrings.`403`
    - typingsJapgolly.antd.antdStrings.`404`
    - typingsJapgolly.antd.antdStrings.`500`
  */
  trait ExceptionStatusType
    extends StObject
       with ResultStatusType
  object ExceptionStatusType {
    
    inline def `403`: typingsJapgolly.antd.antdInts.`403` = 403.asInstanceOf[typingsJapgolly.antd.antdInts.`403`]
    
    inline def `404`: typingsJapgolly.antd.antdInts.`404` = 404.asInstanceOf[typingsJapgolly.antd.antdInts.`404`]
    
    inline def `500`: typingsJapgolly.antd.antdInts.`500` = 500.asInstanceOf[typingsJapgolly.antd.antdInts.`500`]
  }
  
  trait ResultProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var extra: js.UndefOr[Node] = js.undefined
    
    var icon: js.UndefOr[Node] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[ResultStatusType] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[Node] = js.undefined
    
    var title: js.UndefOr[Node] = js.undefined
  }
  object ResultProps {
    
    inline def apply(): ResultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultProps]
    }
    
    extension [Self <: ResultProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExtra(value: VdomNode): Self = StObject.set(x, "extra", value.rawNode.asInstanceOf[js.Any])
      
      inline def setExtraNull: Self = StObject.set(x, "extra", null)
      
      inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      inline def setExtraVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "extra", js.Array(value*))
      
      inline def setExtraVdomElement(value: VdomElement): Self = StObject.set(x, "extra", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIcon(value: VdomNode): Self = StObject.set(x, "icon", value.rawNode.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "icon", js.Array(value*))
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStatus(value: ResultStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubTitle(value: VdomNode): Self = StObject.set(x, "subTitle", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSubTitleNull: Self = StObject.set(x, "subTitle", null)
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setSubTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "subTitle", js.Array(value*))
      
      inline def setSubTitleVdomElement(value: VdomElement): Self = StObject.set(x, "subTitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.libResultMod.ExceptionStatusType
    - typingsJapgolly.antd.antdStrings.success
    - typingsJapgolly.antd.antdStrings.error
    - typingsJapgolly.antd.antdStrings.info
    - typingsJapgolly.antd.antdStrings.warning
  */
  trait ResultStatusType extends StObject
  
  @js.native
  trait ResultType
    extends StObject
       with FunctionComponent[ResultProps] {
    
    var PRESENTED_IMAGE_403: FC[js.Object] = js.native
    
    var PRESENTED_IMAGE_404: FC[js.Object] = js.native
    
    var PRESENTED_IMAGE_500: FC[js.Object] = js.native
  }
  
  type _To = ResultType
  
  /* This means you don't have to write `default`, but can instead just say `libResultMod.foo` */
  override def _to: ResultType = default
}
