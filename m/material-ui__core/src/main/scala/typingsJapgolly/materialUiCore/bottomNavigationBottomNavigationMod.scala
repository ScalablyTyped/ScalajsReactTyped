package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.OnChange
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.materialUiCoreStrings.root
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationBottomNavigationMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigation API](https://mui.com/api/bottom-navigation/)
    */
  @JSImport("@material-ui/core/BottomNavigation/BottomNavigation", JSImport.Default)
  @js.native
  val default: OverridableComponent[BottomNavigationTypeMap[js.Object, div]] = js.native
  
  type BottomNavigationClassKey = root
  
  type BottomNavigationProps[D /* <: ElementType */, P] = OverrideProps[BottomNavigationTypeMap[P, D], D]
  
  trait BottomNavigationTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: BottomNavigationClassKey
    
    var defaultComponent: D
    
    var props: P & OnChange
  }
  object BottomNavigationTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: BottomNavigationClassKey, defaultComponent: D, props: P & OnChange): BottomNavigationTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BottomNavigationTypeMap[P, D]]
    }
    
    extension [Self <: BottomNavigationTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (BottomNavigationTypeMap[P, D])) {
      
      inline def setClassKey(value: BottomNavigationClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & OnChange): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[BottomNavigationTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationBottomNavigationMod.foo` */
  override def _to: OverridableComponent[BottomNavigationTypeMap[js.Object, div]] = default
}
