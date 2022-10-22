package typingsJapgolly.materialUiLab

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Arialabelledby
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.materialUiCore.tabsTabsMod.TabsClassKey
import typingsJapgolly.materialUiLab.materialUiLabStrings.button
import typingsJapgolly.materialUiLab.materialUiLabStrings.value
import typingsJapgolly.materialUiTypes.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabListTabListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://mui.com/api/tab-list/)
    * - inherits [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab/TabList/TabList", JSImport.Default)
  @js.native
  val default: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = js.native
  
  type TabListClassKey = TabsClassKey
  
  type TabListProps[D /* <: ElementType */, P] = OverrideProps[TabListTypeMap[P, D], D]
  
  trait TabListTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: TabListClassKey
    
    var defaultComponent: D
    
    var props: P & (Omit[js.Object & Arialabelledby, value])
  }
  object TabListTypeMap {
    
    inline def apply[P, D /* <: ElementType */](
      classKey: TabListClassKey,
      defaultComponent: D,
      props: P & (Omit[js.Object & Arialabelledby, value])
    ): TabListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabListTypeMap[P, D]]
    }
    
    extension [Self <: TabListTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (TabListTypeMap[P, D])) {
      
      inline def setClassKey(value: TabListClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & (Omit[js.Object & Arialabelledby, value])): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tabListTabListMod.foo` */
  override def _to: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = default
}
