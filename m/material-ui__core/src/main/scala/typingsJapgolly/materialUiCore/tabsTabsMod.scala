package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Arialabelledby
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/core/Tabs/Tabs", JSImport.Default)
  @js.native
  val default: OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]] = js.native
  
  trait TabsActions extends StObject {
    
    def updateIndicator(): Unit
    
    def updateScrollButtons(): Unit
  }
  object TabsActions {
    
    inline def apply(updateIndicator: Callback, updateScrollButtons: Callback): TabsActions = {
      val __obj = js.Dynamic.literal(updateIndicator = updateIndicator.toJsFn, updateScrollButtons = updateScrollButtons.toJsFn)
      __obj.asInstanceOf[TabsActions]
    }
    
    extension [Self <: TabsActions](x: Self) {
      
      inline def setUpdateIndicator(value: Callback): Self = StObject.set(x, "updateIndicator", value.toJsFn)
      
      inline def setUpdateScrollButtons(value: Callback): Self = StObject.set(x, "updateScrollButtons", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.flexContainer
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.scroller
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fixed
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollable
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.centered
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollButtons
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollButtonsDesktop
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.indicator
  */
  trait TabsClassKey extends StObject
  object TabsClassKey {
    
    inline def centered: typingsJapgolly.materialUiCore.materialUiCoreStrings.centered = "centered".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.centered]
    
    inline def fixed: typingsJapgolly.materialUiCore.materialUiCoreStrings.fixed = "fixed".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fixed]
    
    inline def flexContainer: typingsJapgolly.materialUiCore.materialUiCoreStrings.flexContainer = "flexContainer".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.flexContainer]
    
    inline def indicator: typingsJapgolly.materialUiCore.materialUiCoreStrings.indicator = "indicator".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.indicator]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def scrollButtons: typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollButtons = "scrollButtons".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollButtons]
    
    inline def scrollButtonsDesktop: typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollButtonsDesktop = "scrollButtonsDesktop".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollButtonsDesktop]
    
    inline def scrollable: typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollable = "scrollable".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.scrollable]
    
    inline def scroller: typingsJapgolly.materialUiCore.materialUiCoreStrings.scroller = "scroller".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.scroller]
  }
  
  type TabsProps[D /* <: ElementType */, P] = OverrideProps[TabsTypeMap[P, D], D]
  
  trait TabsTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: TabsClassKey
    
    var defaultComponent: D
    
    var props: P & Arialabelledby
  }
  object TabsTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: TabsClassKey, defaultComponent: D, props: P & Arialabelledby): TabsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsTypeMap[P, D]]
    }
    
    extension [Self <: TabsTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (TabsTypeMap[P, D])) {
      
      inline def setClassKey(value: TabsClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Arialabelledby): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]]
  
  /* This means you don't have to write `default`, but can instead just say `tabsTabsMod.foo` */
  override def _to: OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]] = default
}
