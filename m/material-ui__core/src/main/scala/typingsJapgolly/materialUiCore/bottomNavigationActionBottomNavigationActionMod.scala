package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ClassKeyDefaultComponent
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bottomNavigationActionBottomNavigationActionMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
    *
    * API:
    *
    * - [BottomNavigationAction API](https://mui.com/api/bottom-navigation-action/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/BottomNavigationAction/BottomNavigationAction", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, button]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.selected
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.iconOnly
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapper
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.label
  */
  trait BottomNavigationActionClassKey extends StObject
  object BottomNavigationActionClassKey {
    
    inline def iconOnly: typingsJapgolly.materialUiCore.materialUiCoreStrings.iconOnly = "iconOnly".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.iconOnly]
    
    inline def label: typingsJapgolly.materialUiCore.materialUiCoreStrings.label = "label".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.label]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def selected: typingsJapgolly.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.selected]
    
    inline def wrapper: typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapper = "wrapper".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.wrapper]
  }
  
  type BottomNavigationActionProps[D /* <: ElementType */, P] = OverrideProps[BottomNavigationActionTypeMap[P, D], D]
  
  type BottomNavigationActionTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[ClassKeyDefaultComponent[P, D]]
  
  type _To = ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, button]]
  
  /* This means you don't have to write `default`, but can instead just say `bottomNavigationActionBottomNavigationActionMod.foo` */
  override def _to: ExtendButtonBase[BottomNavigationActionTypeMap[js.Object, button]] = default
}
