package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ExpandText
import typingsJapgolly.materialUiCore.materialUiCoreStrings.nav
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object breadcrumbsBreadcrumbsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    *
    * API:
    *
    * - [Breadcrumbs API](https://mui.com/api/breadcrumbs/)
    */
  @JSImport("@material-ui/core/Breadcrumbs/Breadcrumbs", JSImport.Default)
  @js.native
  val default: OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.ol
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.li
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.separator
  */
  trait BreadcrumbsClassKey extends StObject
  object BreadcrumbsClassKey {
    
    inline def li: typingsJapgolly.materialUiCore.materialUiCoreStrings.li = "li".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.li]
    
    inline def ol: typingsJapgolly.materialUiCore.materialUiCoreStrings.ol = "ol".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.ol]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def separator: typingsJapgolly.materialUiCore.materialUiCoreStrings.separator = "separator".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.separator]
  }
  
  type BreadcrumbsProps[D /* <: ElementType */, P] = OverrideProps[BreadcrumbsTypeMap[P, D], D]
  
  trait BreadcrumbsTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: BreadcrumbsClassKey
    
    var defaultComponent: D
    
    var props: P & ExpandText
  }
  object BreadcrumbsTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: BreadcrumbsClassKey, defaultComponent: D, props: P & ExpandText): BreadcrumbsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsTypeMap[P, D]]
    }
    
    extension [Self <: BreadcrumbsTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (BreadcrumbsTypeMap[P, D])) {
      
      inline def setClassKey(value: BreadcrumbsClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & ExpandText): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]]
  
  /* This means you don't have to write `default`, but can instead just say `breadcrumbsBreadcrumbsMod.foo` */
  override def _to: OverridableComponent[BreadcrumbsTypeMap[js.Object, nav]] = default
}
