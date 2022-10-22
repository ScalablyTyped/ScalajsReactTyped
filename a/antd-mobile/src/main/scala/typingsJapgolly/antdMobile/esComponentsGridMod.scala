package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialGridProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapGridProp
import typingsJapgolly.antdMobile.esComponentsGridGridMod.GridItemProps
import typingsJapgolly.antdMobile.esComponentsGridGridMod.GridProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsGridMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/grid/grid.GridProps> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/grid/grid.GridItemProps>} */
  object default {
    
    inline def apply(props: GridProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: GridProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/grid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/grid", "default.Item")
    @js.native
    def Item: FC[GridItemProps] = js.native
    inline def Item_=(x: FC[GridItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/grid", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/grid", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialGridProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialGridProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/grid", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/grid", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapGridProp] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapGridProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
