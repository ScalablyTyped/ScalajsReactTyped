package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.OmitPopoverPropscontentac
import typingsJapgolly.antdMobile.anon.PartialdefaultVisiblebool
import typingsJapgolly.antdMobile.anon.WeakValidationMapdefaultV
import typingsJapgolly.antdMobile.anon.defaultVisiblebooleanunde
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsPopoverMod {
  
  /* Inlined react.react.ForwardRefExoticComponent<{  defaultVisible :boolean | undefined,   visible :boolean | undefined,   onVisibleChange :(visible : boolean): void | undefined,   getContainer :antd-mobile.antd-mobile/es/utils/render-to-container.GetContainer | undefined,   destroyOnHide :boolean | undefined,   children :react.react.ReactElement,   mode :'dark' | 'light' | undefined,   trigger :'click' | undefined,   placement :antd-mobile.antd-mobile/es/components/popover.DeprecatedPlacement | antd-mobile.antd-mobile/es/components/popover.Placement | undefined,   stopPropagation :std.Array<'click'> | undefined,   content :react.react.ReactNode,   className :string | undefined,   style :react.react.CSSProperties & std.Partial<std.Record<'--z-index', string>> | undefined,   tabIndex :number | undefined} & react.react.AriaAttributes & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/popover/popover.PopoverRef>> & {  Menu :react.react.ForwardRefExoticComponent<std.Omit<antd-mobile.antd-mobile/es/components/popover/popover.PopoverProps, 'content'> & {  actions :std.Array<antd-mobile.antd-mobile/es/components/popover/popover-menu.Action>,   onAction :(item : antd-mobile.antd-mobile/es/components/popover/popover-menu.Action): void | undefined} & react.react.RefAttributes<antd-mobile.antd-mobile/es/components/popover/popover.PopoverRef>>} */
  object default {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    inline def apply(props: defaultVisiblebooleanunde): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/popover", "default.Menu")
    @js.native
    def Menu: ForwardRefExoticComponent[OmitPopoverPropscontentac] = js.native
    inline def Menu_=(x: ForwardRefExoticComponent[OmitPopoverPropscontentac]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialdefaultVisiblebool] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialdefaultVisiblebool]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapdefaultV] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapdefaultV]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/popover", "default.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antdMobile.antdMobileStrings.topLeft
    - typingsJapgolly.antdMobile.antdMobileStrings.topRight
    - typingsJapgolly.antdMobile.antdMobileStrings.bottomLeft
    - typingsJapgolly.antdMobile.antdMobileStrings.bottomRight
    - typingsJapgolly.antdMobile.antdMobileStrings.leftTop
    - typingsJapgolly.antdMobile.antdMobileStrings.leftBottom
    - typingsJapgolly.antdMobile.antdMobileStrings.rightTop
    - typingsJapgolly.antdMobile.antdMobileStrings.rightBottom
  */
  trait DeprecatedPlacement extends StObject
  object DeprecatedPlacement {
    
    inline def bottomLeft: typingsJapgolly.antdMobile.antdMobileStrings.bottomLeft = "bottomLeft".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.bottomLeft]
    
    inline def bottomRight: typingsJapgolly.antdMobile.antdMobileStrings.bottomRight = "bottomRight".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.bottomRight]
    
    inline def leftBottom: typingsJapgolly.antdMobile.antdMobileStrings.leftBottom = "leftBottom".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.leftBottom]
    
    inline def leftTop: typingsJapgolly.antdMobile.antdMobileStrings.leftTop = "leftTop".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.leftTop]
    
    inline def rightBottom: typingsJapgolly.antdMobile.antdMobileStrings.rightBottom = "rightBottom".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.rightBottom]
    
    inline def rightTop: typingsJapgolly.antdMobile.antdMobileStrings.rightTop = "rightTop".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.rightTop]
    
    inline def topLeft: typingsJapgolly.antdMobile.antdMobileStrings.topLeft = "topLeft".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.topLeft]
    
    inline def topRight: typingsJapgolly.antdMobile.antdMobileStrings.topRight = "topRight".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antdMobile.antdMobileStrings.top
    - typingsJapgolly.antdMobile.antdMobileStrings.`top-start`
    - typingsJapgolly.antdMobile.antdMobileStrings.`top-end`
    - typingsJapgolly.antdMobile.antdMobileStrings.right
    - typingsJapgolly.antdMobile.antdMobileStrings.`right-start`
    - typingsJapgolly.antdMobile.antdMobileStrings.`right-end`
    - typingsJapgolly.antdMobile.antdMobileStrings.bottom
    - typingsJapgolly.antdMobile.antdMobileStrings.`bottom-start`
    - typingsJapgolly.antdMobile.antdMobileStrings.`bottom-end`
    - typingsJapgolly.antdMobile.antdMobileStrings.left
    - typingsJapgolly.antdMobile.antdMobileStrings.`left-start`
    - typingsJapgolly.antdMobile.antdMobileStrings.`left-end`
  */
  trait Placement extends StObject
  object Placement {
    
    inline def bottom: typingsJapgolly.antdMobile.antdMobileStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.bottom]
    
    inline def `bottom-end`: typingsJapgolly.antdMobile.antdMobileStrings.`bottom-end` = "bottom-end".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`bottom-end`]
    
    inline def `bottom-start`: typingsJapgolly.antdMobile.antdMobileStrings.`bottom-start` = "bottom-start".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`bottom-start`]
    
    inline def left: typingsJapgolly.antdMobile.antdMobileStrings.left = "left".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.left]
    
    inline def `left-end`: typingsJapgolly.antdMobile.antdMobileStrings.`left-end` = "left-end".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`left-end`]
    
    inline def `left-start`: typingsJapgolly.antdMobile.antdMobileStrings.`left-start` = "left-start".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`left-start`]
    
    inline def right: typingsJapgolly.antdMobile.antdMobileStrings.right = "right".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.right]
    
    inline def `right-end`: typingsJapgolly.antdMobile.antdMobileStrings.`right-end` = "right-end".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`right-end`]
    
    inline def `right-start`: typingsJapgolly.antdMobile.antdMobileStrings.`right-start` = "right-start".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`right-start`]
    
    inline def top: typingsJapgolly.antdMobile.antdMobileStrings.top = "top".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.top]
    
    inline def `top-end`: typingsJapgolly.antdMobile.antdMobileStrings.`top-end` = "top-end".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`top-end`]
    
    inline def `top-start`: typingsJapgolly.antdMobile.antdMobileStrings.`top-start` = "top-start".asInstanceOf[typingsJapgolly.antdMobile.antdMobileStrings.`top-start`]
  }
}
