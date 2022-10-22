package typingsJapgolly.antdMobile

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.antdMobile.anon.PartialCheckListProps
import typingsJapgolly.antdMobile.anon.WeakValidationMapCheckLis
import typingsJapgolly.antdMobile.esComponentsCheckListCheckListItemMod.CheckListItemProps
import typingsJapgolly.antdMobile.esComponentsCheckListCheckListMod.CheckListProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCheckListMod {
  
  /* Inlined react.react.FC<antd-mobile.antd-mobile/es/components/check-list/check-list.CheckListProps> & {  Item :react.react.FC<antd-mobile.antd-mobile/es/components/check-list/check-list-item.CheckListItemProps>} */
  object default {
    
    inline def apply(props: CheckListProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: CheckListProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd-mobile/es/components/check-list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/check-list", "default.Item")
    @js.native
    def Item: FC[CheckListItemProps] = js.native
    inline def Item_=(x: FC[CheckListItemProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialCheckListProps] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialCheckListProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/check-list", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapCheckLis] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapCheckLis]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
